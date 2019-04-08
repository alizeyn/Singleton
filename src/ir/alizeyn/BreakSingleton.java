package ir.alizeyn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BreakSingleton {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5000);


        for(int i = 0; i < 5000; i++) {
            threadPool.execute(MySingleton::getInstance);
//            threadPool.execute(() -> {
//                MySingleton2 mySingleton2 = MySingleton2.INSTANCE;
//            });
        }

    }
}
