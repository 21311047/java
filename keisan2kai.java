class keisan2kai{
 public static void main(String args[])
 {
 //�����̒l
 int kotae=0;
//���́A���l1�A�L���A���l2�̏��Ԃŏo��
System.out.println("���l1=");
int in0 = new java.util.Scanner(System.in).nextInt();
System.out.println("�����Z(+)�A�����Z(-)�A�|���Z(*)�A����Z(/)�A�]��(%)�̂ǂꂩ");
String kigou = new java.util.Scanner(System.in).nextLine();
System.out.println("����2=");
int in1 = new java.util.Scanner(System.in).nextInt();
System.out.println(in0+kigou+in1"=");

//���� �����Z
int add = in0+in1;
//���� �����Z
int sub = in0-in1;
//���� �|���Z
int mul = in0*in1;
//���� ����Z
int div = in0/in1;
//���� ���܂�
int mod = in0%in1;
//�v�Z����
if(kigou.equals("+")){
     System.out.println("������" + add + "�ł�");
}
else if((kigou.equals("-"))){
               System.out.println("������" + sub + "�ł�");
          }
		  else if(kigou.equals("*")){
               System.out.println("������" + mul + "�ł�");
          }
		  else if(kigou.equals("/")){
               System.out.println("������" + div + "�A�]���" + mod + "�ł�");
          }
		  else if(kigou.equals("%")){
               System.out.println("������" + mod + "�ł�");
          }
		  else{
               System.out.println("2��ڂɌv�Z�L������͂��Ă�������");
          }

}
          }
