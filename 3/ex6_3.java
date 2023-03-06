import java.util.Arrays;
import java.util.Scanner;
public class ex6_3{
  public static void main(String[]args){
    double[] a = new double[10];
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter ten numbers:");
    for(int i = 0;i<a.length;i++){
      a[i]=sn.nextDouble();
  }
    min m = new min();
    System.out.print("The index of the min is "+m.indexOfSmallestElement(a));
}
}