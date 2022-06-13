package java_advanced.concurrency;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class DownLoader {

    @SneakyThrows
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(80);
        long start =  System.currentTimeMillis();
        var tasks = IntStream.range(0,50000).parallel().mapToObj( i -> new DownloadTask()).toList();

        var results = service.invokeAll(tasks);

        for(var result : results){
            System.out.println(result.get());
        }

        service.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("Time taken: "+ (end-start)+ " milliseconds");

    }
}
