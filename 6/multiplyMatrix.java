class multiplyMatrix{
  public static double[][] multiplyMatrix(double[][]a, double[][]b){
    int i,j;
    double[][] c = new double[3][3];
    for(i = 0;i<3;i++){
      for(j = 0;j<3;j++){
        c[i][j]=(a[i][0]*b[0][j])+(a[i][1]*b[1][j])+(a[i][2]*b[2][j]);
      }
    }
    return c;
    //print Matrix
  }
}