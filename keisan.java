class keisan{
 public static void main(String args[])
 {
//2�̐��������
int in0 = new java.util.Scanner(System.in).nextInt();
int in1 = new java.util.Scanner(System.in).nextInt();
System.out.println(in0+","+in1);

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
System.out.println("�����Z"+add);
System.out.println("�����Z"+sub);
System.out.println("�|���Z"+mul);
System.out.println("����Z"+div);
System.out.println("���܂�"+mod);

}
          }
