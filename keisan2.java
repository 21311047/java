class keisan2{
 public static void main(String args[])
 {
//2つの数字を入力
System.out.println("数字→計算記号→数字の順番で計算式を入力してください");
int in0 = new java.util.Scanner(System.in).nextInt();
String kig = new java.util.Scanner(System.in).nextLine();
int in1 = new java.util.Scanner(System.in).nextInt();
System.out.println(in0+kig+in1);

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
if(kig.equals("+")){
     System.out.println("答えは" + add + "です");
}else if((kig.equals("-"))){
               System.out.println("答えは" + sub + "です");
          }else if(kig.equals("*")){
               System.out.println("答えは" + mul + "です");
          }else if(kig.equals("/")){
               System.out.println("答えは" + div + "、余りは" + mod + "です");
          }else if(kig.equals("%")){
               System.out.println("答えは" + mod + "です");
          }else{
               System.out.println("2回目に計算記号を入力してください");
          }

}
          }
