import java.util.Random;
import java.io.*;

class sum{
public static void main(String args[])
{
Random b = new Random();
//ransu.csvファイルを読み込む
try{
File file = new File("tensu.csv");
FileReader fr = new FileReader(file); 
BufferedReader br = new BufferedReader(fr);
//読み込んだデータをコンマで分割する
String datas =br.readLine();
String[] str1Ary = datas.split(",");
int [] idatas = new int[str1Ary.length];
//分割された文字列の表示
for (int i=0; i<str1Ary.length; i++) {
//idates[i]に、str1Ary[i]をint型にキャストして代入
idatas[i]=Integer.valueOf(str1Ary[i]).intValue();}
int sum  = 0;
for (int i=1 ; i<=100 ; i++){
sum = idatas[1] + idatas[i];}
System.out.println(sum);


br.close();
}catch(Exception e)
{
System.out.println(e.toString());
}
}
}

