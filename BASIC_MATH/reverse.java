public class reverse {
    public static void main(String[] args) {
        int num =123;
        int rev=0;
        while (num>0) {
            int rem = num%10;//for finding last digit
            rev=rev*10+rem; 
             num=num/10;       //dec the number 
        }
         System.out.println(rev);
        
    }
    
}
