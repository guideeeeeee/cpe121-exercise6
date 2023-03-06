import java.util.Scanner;
public class ex6_1{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of arrray size:");
        int number = sn.nextInt();
        System.out.print("Your array: \n{");
        sn.close();
        int[] x = new int[number];
        int score = 0 ;
            for (int i = 0 ; i<number ; i++){
                x[i] = (int)(Math.random()*99);
                if (x[i]%7 == 0 && x[i]!=0)
                    score +=2;
                else if(x[i]%10 ==4 || x[i]%10 == 9)
                    score++;
                System.out.print(x[i]+" ");
            }
            System.out.println("}");
            System.out.print("Your array scores: "+score);

    }
}