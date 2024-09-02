
/**
 * Practice for Unit 5
 *
 * @author (Rachit Jha)
 * @version (12/12/23)
 */
public class Demo
{
    public static void integerParse(int n){
       /* String str=n + "";
        for(int i=str.length(); i>0; i--){
            System.out.print(str.substring(i-1, i));
        }
        */
       int i;
       if(n==0) System.out.println(0);
       while(n>0){
           i= n%10;
           n/=10;
           System.out.println(i);
           
       }
        
    }
    public static void main(String[]args){
        integerParse(0);
    }
}