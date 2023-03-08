


CXXFILE= main.cpp mg.pb.cc 
LDFLAGS=-L/home/lela/gnu/pb-2.4.1-arm-linux/lib -lprotobuf-lite -pthread -lpthread -static
CFLAGS=-pthread -I/home/lela/gnu/pb-2.4.1-arm-linux/include -O
CXX=arm-linux-gnueabi-g++ -std=c++98
all: $(CXXFILE)
	$(CXX) $(CXXFILE) $(CFLAGS)  $(LDFLAGS) -o prog.elf

.PHONY: clean
	@echo "ok"

clean:
	rm -f prog.elf *.o
	rm -f prog *.o
