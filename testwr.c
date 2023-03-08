
#include <syscall.h>
#define STDOUT_FILENO 1
int
main(int argc, char *argv[]) {

    //测试不用标准call。用syscall。
/* 4 is the system call number for write() */
const char msg[] = "Hello World!\n";
syscall(4, STDOUT_FILENO, msg, sizeof(msg)-1);

return 0;
}