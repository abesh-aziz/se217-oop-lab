import java.util.Scanner;
public class Vid19p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter Your Number: ");
        x = input.nextInt();
        divis(x);
    }
    static void divis(int x){
        System.out.println("Divisable by");
        for (int i=1; i<=x; i++){
            if(x%i==0){
                System.out.println(i);
            }
        }
    }
}
