class keisan2{
 public static void main(String args[])
 {
//2‚Â‚Ì”š‚ğ“ü—Í
System.out.println("”š¨ŒvZ‹L†¨”š‚Ì‡”Ô‚ÅŒvZ®‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
int in0 = new java.util.Scanner(System.in).nextInt();
String kig = new java.util.Scanner(System.in).nextLine();
int in1 = new java.util.Scanner(System.in).nextInt();
System.out.println(in0+kig+in1);

//ˆ— ‘«‚µZ
int add = in0+in1;
//ˆ— ˆø‚«Z
int sub = in0-in1;
//ˆ— Š|‚¯Z
int mul = in0*in1;
//ˆ— Š„‚èZ
int div = in0/in1;
//ˆ— ‚ ‚Ü‚è
int mod = in0%in1;
//ŒvZŒ‹‰Ê
if(kig.equals("+")){
     System.out.println("“š‚¦‚Í" + add + "‚Å‚·");
}else if((kig.equals("-"))){
               System.out.println("“š‚¦‚Í" + sub + "‚Å‚·");
          }else if(kig.equals("*")){
               System.out.println("“š‚¦‚Í" + mul + "‚Å‚·");
          }else if(kig.equals("/")){
               System.out.println("“š‚¦‚Í" + div + "A—]‚è‚Í" + mod + "‚Å‚·");
          }else if(kig.equals("%")){
               System.out.println("“š‚¦‚Í" + mod + "‚Å‚·");
          }else{
               System.out.println("2‰ñ–Ú‚ÉŒvZ‹L†‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
          }

}
          }
