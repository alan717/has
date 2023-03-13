


CXXFILE= main.cpp mg.pb.cc 
LDFLAGS=-L/home/lela/gnu/pb-2.4.1-arm-linux/lib -lprotobuf-lite -pthread -lpthread -static
CFLAGS=-pthread -I/home/lela/gnu/pb-2.4.1-arm-linux/include -O
CXX=arm-linux-gnueabi-g++ -std=c++98
CC=arm-linux-gnueabi-gcc
all: $(CXXFILE) printf_syscall.elf hasme.elf hook.elf
	$(CXX) $(CXXFILE) $(CFLAGS)  $(LDFLAGS) -o bin/prog.elf

hook.elf :  hook.c
	$(CC) -Wl,--script=./map.ld -Os -nostdlib -nodefaultlibs -fPIC -Wl,-shared $^ -o bin/$@

printf_syscall.elf :printf_syscall.c
	@echo "test syscall build........"
	$(CC) -Wl,--script=./map.ld -s -Os -static -fPIC -nostartfiles -e t__printf $^ -o bin/$@ 

hasme.elf : hasme.c
	$(CC) -lm $^ -o bin/$@

.PHONY: clean
	@echo "ok"

clean:
	@echo "clean ................"
	rm -f *.o 
	rm -f bin/*.elf
