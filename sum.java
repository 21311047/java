import java.util.Random;
import java.io.*;

class sum{
public static void main(String args[])
{
Random b = new Random();
//ransu.csv�t�@�C����ǂݍ���
try{
File file = new File("tensu.csv");
FileReader fr = new FileReader(file); 
BufferedReader br = new BufferedReader(fr);
//�ǂݍ��񂾃f�[�^���R���}�ŕ�������
String datas =br.readLine();
String[] str1Ary = datas.split(",");
int [] idatas = new int[str1Ary.length];
//�������ꂽ������̕\��
for (int i=0; i<str1Ary.length; i++) {
//idates[i]�ɁAstr1Ary[i]��int�^�ɃL���X�g���đ��
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

