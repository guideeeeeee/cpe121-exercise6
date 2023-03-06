public class ex6_4{
  public static void main(String[]args){
    int[] array1 = {1,2,3,4,5,6};
    double[] array2 = {6.0,4.4,1.9,2.9,3.4,3.5};
    average a1 = new average();
    System.out.println("The average value as integer is "+a1.average(array1));
    average a2 = new average();
    System.out.println("The average value as double is "+a2.average(array2));
  }
}