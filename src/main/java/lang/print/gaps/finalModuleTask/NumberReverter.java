package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int newNum = (((number%10) * 10)  + (number / 10 % 10)) * 10 + number / 100;
        System.out.println(newNum);
    }
}
