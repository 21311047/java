//リュカ数列 オーバーフロー java→BigIntegerなるキーワード発見→java BigInteger 使い方　で検索
class suuretulucas{
public static void main(String args[])
{
double luca = 0;
double [] hai = new double[101];
hai[0] = 2;
hai[1] = 1;
System.out.println(hai[0]);
System.out.println(hai[1]);
for (int i=2 ; i<=100 ; i++){
hai[i] = hai[i-1] + hai[i-2];
luca  = luca + hai[i];
System.out.println(luca);
}
}
}
