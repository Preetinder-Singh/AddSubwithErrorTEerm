/*
 * 
 *@author Preetinder Singh
   date: 06/03/18
**/
import java.util.Scanner;

public class AddET
{
              
public static void main(String[] args)
{

double v1, v2, sum, diff, et1, et2,  ets, etd;

Scanner java= new Scanner(System.in);  //to take the value from the console


System.out.println("value of v1:");  //enter the first value
v1 = java.nextDouble();
System.out.print("Enter the error term of fist value:");  //enter the first error term
et1 = java.nextDouble();
 
System.out.println("value of v2:");   //enter the second term
v2= java.nextDouble();
System.out.print("Enter the error term of second value:");  //enter the second error term
et2= java.nextDouble();

java.close();

sum = v1+v2;
ets=et1+et2;
diff= v1-v2;
etd=et1-et2;



System.out.println("---> Addition <---");
System.out.println("");

System.out.println(sum + "±" + ets);
System.out.println("");

System.out.println("---> Subtraction <---");
System.out.println("");

System.out.println(diff+ "±" +etd);

}

}
