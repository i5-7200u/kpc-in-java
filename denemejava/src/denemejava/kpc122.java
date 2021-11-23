public class qwe {
public static void main(String[] args)
{
System.out.println("KCS Password Creator 1.2.2 (Java)");
java.util.Random qweh = new java.util.Random();
String hoh = "qwertyuiopasdfghjkl;'zxcvbnm,./1234567890";
java.util.Scanner ehj = new java.util.Scanner(System.in);
System.out.println("Write the to be generated length of random chars:");
int ewqd = ehj.nextInt();
if (ewqd == 0)
{
    ewqd = 50;
}
System.out.println("Write the to be generated characters of random chars, If you write nothing then generated random chars with default chars:");
ehj.nextLine();
String charsw = ehj.nextLine();
String charreplaced = charsw.replace(" ","");
if (charreplaced != "")
{
    hoh = charreplaced;
}
String hauh = "";
for(int h = 0; h < ewqd; h++)
{
hauh = hauh + hoh.charAt(qweh.nextInt(hoh.length()));
}
System.out.println(hauh);
}
}