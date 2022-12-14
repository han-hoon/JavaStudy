package multiThread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {

    public static void main(String[] args) throws Exception {
        // ExecutorService 인터페이스 구현객체 Executors 정적메서드를 통해 최대 스레드 개수가 2인 스레드 풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

                    int poolSize = threadPoolExecutor.getPoolSize(); //스레드 풀 사이즈 얻기
                    String threadName = Thread.currentThread().getName(); //스레드 풀에 있는 해당 스레드 이름 얻기
                    System.out.println("[총 스레드 개수 : " + poolSize + " ] 작업 스레드 이름 : " + threadName);

                    // 예외 발생
                    int value = Integer.parseInt("삼");
                }
            };
            //스레드풀에게 작업 처리 요청
            executorService.execute(runnable);
            //executorService.submit(runnable);

            //콘솔 출력 시간을 주기 위해 메인스레드 0.01초 sleep을 걸어둠.
            Thread.sleep(10);
        }
        //스레드풀 종료
        executorService.shutdown();
    }

}
