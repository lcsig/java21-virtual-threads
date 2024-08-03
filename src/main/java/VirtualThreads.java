import java.util.concurrent.atomic.AtomicLong;

public class VirtualThreads {

    public static final AtomicLong ATOMIC_LONG = new AtomicLong(0);
    public static final int FINAL_VAL = 100_000;


    public static void main(String[] args) {
        System.out.println("[+] Test Started");
        long start = System.currentTimeMillis();
        for (int i = 0; i < FINAL_VAL; i++) {
            Thread.startVirtualThread(() -> ATOMIC_LONG.incrementAndGet());
        }
        while (ATOMIC_LONG.get() != FINAL_VAL);
        long end = System.currentTimeMillis();
        System.out.println("[+] Test Ended");
        System.out.println("[+] Time: " + (end - start) + "ms");
        System.out.println("[+] Final Atomic Long Value: " + ATOMIC_LONG.get());
        System.out.println("[+] Threads: " + FINAL_VAL);
    }
}
