import java.util.Scanner;
public class Vid19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter value of x: ");
        x = input.nextInt();
        call();
        math(x);

    }
    static void call(){
        System.out.println("Hello");
    }
    static void math(int x){
        if(x%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
            
        }
    }
}
