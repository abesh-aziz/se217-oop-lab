import java.util.Scanner;
public class Vid17 {
    public static void main(String[] args) {
        Scanner inputobject = new Scanner(System.in);//parameter for where it will read input from
        double num;
        System.out.println("Enter a double: ");
        num = inputobject.nextDouble();
        inputobject.nextLine();
        String line;
        System.out.println("Enter something: ");
        line = inputobject.nextLine();
        String line2;
        System.out.println("Enter Something Again: ");
        line2 = inputobject.nextLine();
        System.out.println("Input has been received. Input: "+num+ ", "+line + ", "+line2);
        inputobject.close();
    }
}
