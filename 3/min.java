import java.util.Arrays;
class min{
public static int indexOfSmallestElement(double[] array){
  double min = array[0];
  double comp = array[0];
  int n=0;
  for(int  i = 0;i<array.length;i++){
    comp = array[i];
    if(min>comp){
      min = comp;
      n = i;
    }
  }
  return n;
}
}