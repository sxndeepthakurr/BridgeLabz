import java.util.*;
public class Pq4 { 

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        if(n>0){
            System.out.println("this number is natural number");
            int sum=n*(n-1)/2;
            System.out.println("and sum of n natural number"+sum);
        }

    }
}
