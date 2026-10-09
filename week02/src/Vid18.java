import java.util.Scanner;
public class Vid18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, sum;
        System.out.println("Enter first int: ");
        x = input.nextInt();
        System.out.println("Enter second int: ");
        y = input.nextInt();
        sum= sum(x, y);
        System.out.println("Sum is: "+sum);
    }
    static int sum(int x, int y){
        int sum=x+y;
        return sum;

    }
}
