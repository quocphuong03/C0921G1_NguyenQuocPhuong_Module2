package ss4_class_object_in_java.bai_tap.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        for(int i=0;i<100000;i++){
            System.out.println(i);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime()+" milisecond");
    }
}
