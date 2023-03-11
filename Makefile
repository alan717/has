


CXXFILE= main.cpp mg.pb.cc 
LDFLAGS=-L/home/lela/gnu/pb-2.4.1-arm-linux/lib -lprotobuf-lite -pthread -lpthread -static
CFLAGS=-pthread -I/home/lela/gnu/pb-2.4.1-arm-linux/include -O
CXX=arm-linux-gnueabi-g++ -std=c++98
CC=arm-linux-gnueabi-gcc
all: $(CXXFILE) t_syscall.elf hasme.elf
	# $(CXX) $(CXXFILE) $(CFLAGS)  $(LDFLAGS) -o prog.elf

t_syscall.elf :testsyscall.c
	@echo "test syscall build........"
	$(CC) -s -static -nostartfiles -e t__printf $^ -o $@ 

hasme.elf : hasme.c
	$(CC) -lm $^ -o $@

.PHONY: clean
	@echo "ok"

clean:
	@echo "clean ................"
	rm -f *.o 
	rm -f *.elf
