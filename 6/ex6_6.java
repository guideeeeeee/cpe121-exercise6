import java.util.Scanner;
public class ex6_6{
  public static void main(String[]args){
    int i,j;
    double[][] a = new double[3][3];
    double[][] b = new double[3][3];
    double[][] c = new double[3][3];
    Scanner sn = new Scanner(System.in);
    System.out.print("Ente matrix1:");
    for(i = 0;i<3;i++){
      for(j = 0;j<3;j++){
        a[i][j]=sn.nextDouble();
      }
    }
    System.out.print("Ente matrix2:");
    for(i = 0;i<3;i++){
      for(j = 0;j<3;j++){
        b[i][j]=sn.nextDouble();
      }
    }
    multiplyMatrix m = new multiplyMatrix();
    c = m.multiplyMatrix(a,b);
    for(i = 0;i<3;i++){
      for(j = 0;j<3;j++){
        System.out.print(a[i][j]+" ");
      }
      if(i==1)
        System.out.print("  *  ");
      else
        System.out.print("     ");
      for(j = 0;j<3;j++){
        System.out.print(b[i][j]+" ");
      }
      if(i==1)
        System.out.print("  =  ");
      else
        System.out.print("     ");
      for(j = 0;j<3;j++){
        System.out.printf("%.2f\t ",c[i][j]);
      }
      System.out.println();
    }
  }
}