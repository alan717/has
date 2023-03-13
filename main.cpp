


#include <syscall.h>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/io/coded_stream.h>

#include<unistd.h>
#include <fcntl.h>
#include <iostream>
#include <sstream>
#include <stdio.h>



#include "mg.pb.h"
#include "MAGIC_CODE_RESPONSE.pb.h"
 
using namespace google::protobuf::io;


void testpb();
void Hexdump(void *ptr, int buflen);


int
main(int argc, char *argv[]) {

    //测试不用标准call。用syscall。
    const char msg[] = "Hello World!\n";
    write(STDOUT_FILENO, msg, sizeof(msg)-1);

    testpb();
    return 0;
}
void testpb()
{
    GOOGLE_PROTOBUF_VERIFY_VERSION;
    MAGIC_CODE msg;
    msg.set_key(1111);
    msg.set_macaddress(2222);
    msg.set_serilnumber(3333);
    msg.set_mgaction(MAGIC_CODE_MagicCodeAction_VERIFYMAGICCODE);
    msg.set_featureindex(4444);
    msg.set_softwareversion(5555);
    msg.set_machinepowerontime(6666);
//    msg.SerializeWithCachedSizes();
    int fd = open("myfile", O_WRONLY|O_CREAT,0600);
    if(fd<0){
        printf("fd error\n");
        return;
    }
    std::string ss;
    int sz=msg.ByteSize();
    void* buffer=malloc(sz);
    msg.SerializeToArray(buffer,sz);
    Hexdump(buffer, sz) ;




    CodedInputStream* inputStream=new CodedInputStream(reinterpret_cast<const google::protobuf::uint8 *>(buffer),
                                                      sz);


    MAGIC_CODE rev;
    rev.MergePartialFromCodedStream(inputStream);
//    rev.ParseFromArray(buffer,sz);
    printf("%d\n",rev.macaddress());
    printf("%d\n",rev.softwareversion());
    printf("%lld\n",rev.machinepowerontime());


    MAGIC_CODE_RESPONSE* mg_resp=new MAGIC_CODE_RESPONSE();
    mg_resp->set_psudorandomnumber(1L);
    mg_resp->set_featureunlock_(false);
    mg_resp->set_machineunlock_(false);
    mg_resp->set_magictype_(4);
    mg_resp->set_dayspurchased_(5);
    mg_resp->set_spindlemaxspeed_(6);
    mg_resp->set_maxmemory_(7);
    mg_resp->set_ltspindlemaxspeed_(8);
    mg_resp->set_subspindlemaxspeed_(9);
    mg_resp->set_duplicatevalues_(10);

    

    delete mg_resp;



}


void Hexdump(void *ptr, int buflen) {
    unsigned char* buf = reinterpret_cast<unsigned char*>(ptr);
    int i, j;
    char temp[100];
    std::ostringstream oss;

    for (i=0; i<buflen; i+=16) {
        sprintf(temp,"%06x: ", i);

        for (j=0; j<16; j++)
            if (i+j < buflen)
                sprintf(temp,"%02x ", buf[i+j]);
            else
                sprintf(temp,"   ");
        printf(" ");
        for (j=0; j<16; j++)
            if (i+j < buflen)
                printf("%c", isprint(buf[i+j]) ? buf[i+j] : '.');
        printf("\n");
    }
}
