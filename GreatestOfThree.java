//Back-end complete function Template for Java
import java.util.*;

public class GreatestOfThree {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        // Your code here
        System.out.println((a>b&&a>c)?a:((b>a&&b>c)?b:c));
    }
}
