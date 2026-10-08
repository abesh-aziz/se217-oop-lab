public class Vid16 {
    public static void main(String[] args) {
        String str = "I am unemployed";
        String[] a = str.split(" ");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        String str2= "Unemployment     isn't my         fear it        is my      destiny";
        String[] s= str2.split("\\s+");
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}
