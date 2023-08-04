
public class Armstrong1To1000{
    public static void main(String[] args) {
        System.out.println("Armstrong nums between 1 and 1000:");
        for (int num = 1; num <= 1000; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalnum = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num != 0) {
            int remainder = num % 10;
            result += Math.pow(remainder, n);
            num /= 10;
        }

        return result == originalnum;
    }
}
