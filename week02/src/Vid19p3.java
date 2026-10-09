import java.util.Scanner;
public class Vid19p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x, y, result;
        System.out.println("Enter first number: ");
        x = input.nextFloat();
        System.out.println("Enter second number: ");
        y = input.nextFloat();
        boolean choice=true;
        int option;
        while(choice){
            System.out.println("Enter Your Choice");
            System.out.println("Press 1 to add");
            System.out.println("Press 2 to sub");
            System.out.println("Press 3 to mul");
            System.out.println("Press 4 to div");
            System.out.println("Press 5 to exit");
            option = input.nextInt();

            switch(option){
                case 1:
                    result = add(x, y);
                    System.out.println("Addition is : "+result);
                    break;
                case 2:
                    result = sub(x, y);
                    System.out.println("Subtraction is : "+result); 
                    break;
                case 3:
                    result = mul(x, y);
                    System.out.println("Multiplication is : "+result);
                    break;
                case 4:
                    result = div(x, y);
                    System.out.println("Divition is : "+result);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        input.close();
    }

    static float add(float x, float y){
        float sum= x+y;
        return sum;
    }

    static float sub(float x, float y){
        float sub= x-y;
        return sub;
    }

    static float mul(float x, float y){
        float mul=x*y;
        return mul;
    }

    static float div(float x, float y){
        float div= x/y;
        return div;
    }
}
