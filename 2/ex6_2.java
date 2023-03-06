import java.util.Scanner;
public class ex6_2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of array size:"); 
        int number = sn.nextInt();
        int[] x = new int[number];
        int count=0;
        int max =0;
        for(int i =0; i<x.length;i++){
            x[i] = (int)(Math.random()*9);
        }
        for(int j = 1; j<=4;j++){
            System.out.print("Your number "+j+":");
            int num = sn.nextInt();
            for(int i =0; i<number;i++){
              
                if (x[i] == num)
                    count++;
                if (count>max){
                  max = count;
                  count =0;
                }
            }  
        }
        System.out.print("Your array {");
        for(int i =0; i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.print("}");
        System.out.print("\nMaxFrequency "+max);
    }
}
