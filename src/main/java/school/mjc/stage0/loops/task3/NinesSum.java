package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int num = 9;
        for (int i = 0; i <= lengthOfLastNumber; i++){
            num += Math.pow(10, i);
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
