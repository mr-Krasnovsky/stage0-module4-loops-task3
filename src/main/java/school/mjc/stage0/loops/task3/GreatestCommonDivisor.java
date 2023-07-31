package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        while (second !=0) {
            int tmp = first % second;
            first = second;
            second = tmp;
        }
        System.out.println(first);
    }
}