//リュカ数列 オーバーフロー java→BigIntegerなるキーワード発見→java BigInteger 使い方　で検索
import java.math.*;

class suuretulucas{
public static void main(String args[])
{
BigInteger luca =  new BigInteger("0");
BigInteger [] hai = new BigInteger[101];
hai[0] = new BigInteger("2");
hai[1] = new BigInteger("1");
luca  = luca.add(hai[1]);
for (int i=2 ; i<=100 ; i++){
hai[i] = hai[i-1].add(hai[i-2]);
luca  = luca.add(hai[i]);
System.out.println(luca);
}
}
}
