import java.util.Arrays;
import java.util.Scanner;
public class ex6_3sec{
  public static void main(String[]args){
    double[] a = new double[10];
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter ten numbers:");
    for(int i = 0;i<a.length;i++){
      a[i]=sn.nextDouble();
    }/*
    System.out.print("old array :");
    for(int i = 0;i<a.length;i++){
      System.out.print(+a[i]+" ");
    }
    min m = new min();
     double []b = new double[10];
     b = a;
    System.out.print("\n b array :");
    for(int i = 0;i<b.length;i++){
      System.out.print(b[i]+" ");
    }
    double smallest = m.indexOfSmallestElement(a);
    System.out.print("\n b array :");
    for(int i = 0;i<b.length;i++){
      System.out.print(b[i]+" ");
    }
    System.out.print("\n print array :");
    for(int i = 0;i<b.length;i++){
      System.out.print(b[i]+" ");
      if (b[i] == 11){
        System.out.print("\nThe index of the min is "+i);
        break;
      }
    }
   */ 
  }
}