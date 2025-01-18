# Java 21 Virtual Threads
Difference in Time between Virtual Threads and Real Threads in Java 21

## One Thread 
```text
[+] Test Started
[+] Test Ended
[+] Time: 3ms
[+] Final Atomic Long Value: 100000
[+] Threads: 100000
```

## Real Threads 

```text
[+] Test Started
[+] Test Ended
[+] Time: 4265ms
[+] Final Atomic Long Value: 100000
[+] Threads: 100000
```

## Virtual Threads

```text
[+] Test Started
[+] Test Ended
[+] Time: 124ms
[+] Final Atomic Long Value: 100000
[+] Threads: 100000
```

## Linux 'time' Tool - Summarize System Resource Usage

```text
$ time java -cp virtual.thread-1.0.jar MainThread
[+] Test Started
[+] Test Ended
[+] Time: 2ms
[+] Final Atomic Long Value: 100000
[+] Threads: 100000

real	0m0.048s
user	0m0.027s
sys	0m0.023s
```

```text
$ time java -cp virtual.thread-1.0.jar RealThreads
[+] Test Started
[+] Test Ended
[+] Time: 4079ms
[+] Final Atomic Long Value: 100000
[+] Threads: 100000

real	0m4.122s
user	0m4.538s
sys	0m4.262s
```

```text
$ time java -cp virtual.thread-1.0.jar VirtualThreads
[+] Test Started
[+] Test Ended
[+] Time: 99ms
[+] Final Atomic Long Value: 100000
[+] Threads: 100000

real	0m0.145s
user	0m0.882s
sys	0m0.043s
```

## Buy me a Coffee: 
BTC: bc1q2kqvggm552h0csyr0awa2zepdapxdqnacw0z5w

![BTC](https://raw.githubusercontent.com/lcsig/API-Hooking/refs/heads/master/img/btc.png)
