import java.util.*;
public class Assign{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //  Question 1
        System.out.println("Welcome TO BridgeLabz!");

        //Question 2 Add two number
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Sum of two number = "+(num1+num2));


        //Question 3 Celsius to Fahrenheit Conversion
        System.out.println("Enter Temperature in celcius");
        int temp=sc.nextInt();
        int fehrenheit=(temp*(9/5))+32;
        System.out.println("Temperature in Fehrenheit="+fehrenheit);

       //  question 4 Area of Circle
        int radius=sc.nextInt();
        double area=Math.PI*radius*radius;
        System.out.println("Area of Circle is ="+area);


        //Q5 Volume of a cylinder
        int radius=sc.nextInt();
        int height=sc.nextInt();
        double vol=Math.PI*radius*radius*height;

        System.out.println("Volume of a Cylinder ="+ vol);

        //Self Problems
        //  6  Calculate simple Interest

        
        int principle=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();

        int si=(principle*rate*time)/100;

        System.out.println(si);

       // Q 7  Perimeter of a rectangle
        int length=sc.nextInt();
        int width=sc.nextInt();

        int per_of_Rect=2*(length+width);
        System.out.println(per_of_Rect);

        // Q8  power calculation
        int a=sc.nextInt();
        int b=sc.nextInt();

        double pow=Math.pow(a,b);

        System.out.println(pow);

      // Q9 Average of three Numbers
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        double avg=(num1+num2+num3)/3;
        System.out.println("Average of Three Numbers "+avg);

        //  Q10  convert kilometer to meals
        int km=sc.nextInt();
         double Miles=km*0.621371;

         System.out.println(Miles);

    }
}
