class keisan2{
 public static void main(String args[])
 {
//2�̐��������
System.out.println("�������v�Z�L���������̏��ԂŌv�Z������͂��Ă�������");
int in0 = new java.util.Scanner(System.in).nextInt();
String kig = new java.util.Scanner(System.in).nextLine();
int in1 = new java.util.Scanner(System.in).nextInt();
System.out.println(in0+kig+in1);

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
if(kig.equals("+")){
     System.out.println("������" + add + "�ł�");
}else if((kig.equals("-"))){
               System.out.println("������" + sub + "�ł�");
          }else if(kig.equals("*")){
               System.out.println("������" + mul + "�ł�");
          }else if(kig.equals("/")){
               System.out.println("������" + div + "�A�]���" + mod + "�ł�");
          }else if(kig.equals("%")){
               System.out.println("������" + mod + "�ł�");
          }else{
               System.out.println("2��ڂɌv�Z�L������͂��Ă�������");
          }

}
          }
