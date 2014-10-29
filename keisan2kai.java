class keisan2kai{
 public static void main(String args[])
 {
 //答えの値
 int kotae=0;
//入力、数値1、記号、数値2の順番で出力
System.out.println("数値1=");
int in0 = new java.util.Scanner(System.in).nextInt();
System.out.println("足し算(+)、引き算(-)、掛け算(*)、割り算(/)、余り(%)のどれか");
String kigou = new java.util.Scanner(System.in).nextLine();
System.out.println("数字2=");
int in1 = new java.util.Scanner(System.in).nextInt();
System.out.println(in0+kigou+in1"=");

//処理 足し算
int add = in0+in1;
//処理 引き算
int sub = in0-in1;
//処理 掛け算
int mul = in0*in1;
//処理 割り算
int div = in0/in1;
//処理 あまり
int mod = in0%in1;
//計算結果
if(kigou.equals("+")){
     System.out.println("答えは" + add + "です");
}
else if((kigou.equals("-"))){
               System.out.println("答えは" + sub + "です");
          }
		  else if(kigou.equals("*")){
               System.out.println("答えは" + mul + "です");
          }
		  else if(kigou.equals("/")){
               System.out.println("答えは" + div + "、余りは" + mod + "です");
          }
		  else if(kigou.equals("%")){
               System.out.println("答えは" + mod + "です");
          }
		  else{
               System.out.println("2回目に計算記号を入力してください");
          }

}
          }
