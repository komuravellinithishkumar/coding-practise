#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

5 int main(int argc, char *argv[]) {
6 printf("hello world (pid:%d)\n", (int) getpid());
7 int rc = fork();
8 if (rc < 0) {
9 // fork failed
10 fprintf(stderr, "fork failed\n");
11 exit(1);
12 } else if (rc == 0) {
13 // child (new process)
14 printf("hello, I am child (pid:%d)\n", (int) getpid());
15 } else {
16 // parent goes down this path (main)
17 printf("hello, I am parent of %d (pid:%d)\n",
18 rc, (int) getpid());
19 }
20 return 0;
21 }
