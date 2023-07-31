package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber > 0) {
            int sum = 9;
            int num = 9;
            for (int i = 1; i < lengthOfLastNumber; i++) {
                num += 9 * Math.pow(10, i);
                sum = sum + num;
            }
            System.out.println(sum);
        } else {
            System.out.println(0);
        }
    }
}
