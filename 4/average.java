class average{
  public static int average(int[]array){
    int aver=0;
    for(int i =0;i<array.length;i++){
      aver+=array[i];
    }
    return aver/array.length;
  }
  public static double average(double[]array){
    double aver=0;
    for(int i =0;i<array.length;i++){
      aver+=array[i];
    }
    return aver/array.length;

  }
}