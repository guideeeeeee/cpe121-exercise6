import java.util.Scanner;
public class ex6_5{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    int x,i=0;
    double[] num = new double[5];
    double[] sort = new double[5];
    for(i = 0;i<num.length;i++){
      System.out.print("Read a number :");
      num[i] = sn.nextDouble();
    }
    i = 0;
    while(i<5){
      x = (int)(Math.random()*5);
      if(num[x]!=0){
        sort[i]=num[x];
        num[x] =0;
        i++;
      }
      else{
        x = (int)(Math.random()*5);
      }
    }
    for(i = 0;i<5;i++){  
    System.out.println(sort[i]);
    }
  }
  }