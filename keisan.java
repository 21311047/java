class keisan{
 public static void main(String args[])
 {
//2つの数字を入力
int in0 = new java.util.Scanner(System.in).nextInt();
int in1 = new java.util.Scanner(System.in).nextInt();
System.out.println(in0+","+in1);

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
System.out.println("足し算"+add);
System.out.println("引き算"+sub);
System.out.println("掛け算"+mul);
System.out.println("割り算"+div);
System.out.println("あまり"+mod);

}
          }
