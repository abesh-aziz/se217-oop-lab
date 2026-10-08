public class Vid15 {
    public static void main(String[] args) {
        String s1= "unemployed";
        String s2 = new String("I am");//string object
        int len= s1.length(); //string function
        System.out.println(s2+ " "+s1);
        System.out.println("S1 length: "+len);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.charAt(9));

        if(s1.equals(s2)){
            System.out.println("Same String");
        }
        else{
            System.out.println("Different String");
        }
    }
}
