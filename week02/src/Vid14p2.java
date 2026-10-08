public class Vid14p2 {
    public static void main(String[] args) {
        int arr[][]={{11, 22, 33}, {2, 5, 7}};
        int sum=0, count=0;
        float avg;
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                sum=sum+arr[i][j];
                count++;
            }
        }

    avg=(float)sum/count;
    //java reads right to left without typecasting avg would be an int since the array is int
    System.out.println("Average is: "+avg);    

    }
}
