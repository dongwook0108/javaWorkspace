package chap_12.clean;

public class CleanThread extends Thread {

    @Override
    public void run() {
        System.out.println("직원 청소 시작");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("직원 " + i + "번 방 청소중");
        }
        System.out.println("직원 청소끝");
    }
}
