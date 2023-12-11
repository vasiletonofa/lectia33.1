import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {


//        Thread thread = new Thread(() -> {
//            try {
////                Thread.sleep(1000);
//                String a = null;
//                a.toLowerCase();
//
//                System.out.println("Afisare din thread " + Thread.currentThread().getName());
//            } catch (Exception  e) {}
//
//        });
//        thread.start(); // start -> 1000 -> Afisare din thread..
//
//        Thread thread2 = new Thread(() -> {
//            try {
//                String a = null;
//                a.toLowerCase();
////                Thread.sleep(500);
//                System.out.println("Afisare din thread " + Thread.currentThread().getName());
//            } catch (Exception  e) {}
//
//        });
//        thread2.start(); // start -> 1000 -> Afisare din thread..
//
//        System.out.println("Hello world! din thread " + Thread.currentThread().getName());


//        ExecutorService executorService = null;
//
//        try {
//           executorService = Executors.newFixedThreadPool(3);
//           executorService.execute(() -> {
//                try {
//                    Thread.sleep(1000);
//                }catch (Exception e) {
//
//                }
//
//               System.out.println("Afisare din  1 " + Thread.currentThread().getName());
//           } );
//           executorService.execute(() -> {
//               try {
//                   Thread.sleep(1000);
//               }catch (Exception e) {
//
//               }
//               System.out.println("Afisare din  2 " + Thread.currentThread().getName());
//           } );
//           executorService.execute(() ->{
//               try {
//                   Thread.sleep(1000);
//                   System.out.println("Afisare din  3" + Thread.currentThread().getName() );
//               }catch (Exception e) {
//
//               }
//           } );
//        } finally {
//            if(executorService != null) executorService.shutdownNow();
//        }


//
//        ExecutorService executorService = null;
//        try {
//            executorService = Executors.newFixedThreadPool(3);
//            Future<Integer> future = executorService.submit(() -> {
//                try {
//                    Thread.sleep(500000000);
//                } catch (Exception e) {}
//                return 4;
//            });
//
////            if (!future.isDone()) {
////                future.cancel(true);
////            }
////            System.out.println(future.isCancelled());
//
//
////            Future<Integer> future1 =  executorService.submit(() -> 5);
////            Future<Integer> future2 = executorService.submit(() -> 6);
//
////            List<Callable<Integer>> callableList = new ArrayList<>();
////            callableList.add(() -> 7);
////            callableList.add(() -> 8);
////            callableList.add(() -> 9);
////
////            List<Future<Integer>> futureList =  executorService.invokeAll(callableList);
////
////            for (Future<Integer> f: futureList) {
////                try {
////                    System.out.println(f.get());
////                } catch (Exception e) {}
////
////            }
//
////            List<Future<Integer>> futures = new ArrayList<>();
////            for (int i = 0; i < 3; i++) {
////                int finalI = i;
////                futures.add(executorService.submit(() -> finalI));
////            }
////
////            for (Future<Integer> f: futures) {
////                try {
////                    System.out.println(f.get());
////                } catch (Exception e) {}
////
////            }
//
//
//
//
//
////            try {
////                System.out.println(future.get(1000, TimeUnit.MILLISECONDS) + " From thread " + Thread.currentThread().getName()); // 2000
////                System.out.println(future1.get() + " From thread " + Thread.currentThread().getName());
////                System.out.println(future2.get() + " From thread " + Thread.currentThread().getName());
////            } catch (Exception e) {
////                System.out.println("Eroare!!! " + e.getCause() + " Prinsa din thread " + Thread.currentThread().getName());
////                future.cancel(true);
////            }
//
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            executorService.awaitTermination(5000, TimeUnit.MILLISECONDS); // SLEEP 5000
//            executorService.shutdownNow();
//            executorService.shutdown();
//            System.out.println(executorService.isTerminated());
//            System.out.println(executorService.isShutdown());
//            if (executorService != null) executorService.shutdown();
//        }


//        ScheduledExecutorService executorService = null;
//        try {
//            executorService = Executors.newScheduledThreadPool(3);
//            executorService.schedule(() -> System.out.println("Hello World"), 500, TimeUnit.MILLISECONDS);
//
//            ScheduledFuture<Integer> scheduledFuture = executorService.schedule(() -> {
//                throw new Exception("Eroare din thread " + Thread.currentThread().getName());
//            }, 1000, TimeUnit.MILLISECONDS);
//
//            System.out.println(scheduledFuture.get());
//            System.out.println("Am ajuns aici");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            if(executorService != null) executorService.shutdown(); // NullPointerException
//        }

//        try {
//            System.out.println(scheduledFuture.get());
//        } catch (Exception e) { }


        System.out.println("Inainte de executor Service");
        ScheduledExecutorService executorService = null;
        try {
            executorService = Executors.newScheduledThreadPool(3);
            executorService.scheduleWithFixedDelay(() -> System.out.println("Task at fixed rate"), 100, 5000, TimeUnit.MILLISECONDS);
        } finally {
//            if (executorService != null) executorService.shutdown();
        }

        System.out.println("Dupa executor Service");

    }




}