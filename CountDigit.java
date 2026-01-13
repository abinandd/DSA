
public class CountDigit {

    public static int countDigit(int num) {
        //handling 0 digits input
        if (num == 0) {
            return 0;
        }
        //handling minus values into +
        num = Math.abs(num);
        int count = 0;
        //loop runs until it becomes 0 and division removes the last number 
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 123456789;
        int result = countDigit(num);
        System.out.println("Count of the digits " + result);
    }
}
