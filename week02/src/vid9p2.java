public class vid9p2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=30; i<=120; i++){
            if(i%3!=0 || i%5!=0){
                continue;
            }
            sum=sum+i;
        }
        System.out.println("Sum of numbers between 30 and 120 which are divisble by 3 and 5 is: "+sum);
    }
}
