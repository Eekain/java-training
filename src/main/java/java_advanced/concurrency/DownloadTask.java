package java_advanced.concurrency;

import java.util.concurrent.Callable;

public class DownloadTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " start download");
        Thread.sleep((int)(Math.random()*10));
        System.out.println("Download has ended");
        return 200;
    }
}
