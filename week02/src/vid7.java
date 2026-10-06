public class vid7 {
    public static void main(String[] args) {
        char ch='b';
        switch(ch){//float can't be switch's parameters and neither can variables it must be something constant
            case 'b':
                System.out.println("Bangladesh");
                break;//without break for one true condition all become true
            case 'c'://no two cases can be the same
                System.out.println("China");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
