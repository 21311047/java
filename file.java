import java.util.Random;
import java.io.*;

class file{
public static void main(String args[])
{
Random b = new Random();
//変数ransu.txtにファイル出力する
try{
File file = new File("tensu.csv");
FileWriter fw = new FileWriter(file); 
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter pw = new PrintWriter(bw);
//乱数を生成
for(int i=1; i<=100; i++)
{
int a = b.nextInt(101);
//ファイルに値を書き込む
pw.print(a+",");
}
//ファイルを閉じる
pw.close();
}catch(Exception e)
{
System.out.println(e.toString());
}
}
}

