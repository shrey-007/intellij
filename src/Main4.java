import java.util.Scanner;
public class Main4 {
    static String func(String s,char oldc,char newc){
        return s.replace(oldc,newc);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println("Enter Character to be replaced");
        String s2=sc.next();
        char ch=s2.charAt(0);
        System.out.println("Enter Character to be replaced with");
        String s3=sc.next();
        char ch2=s3.charAt(0);
        System.out.println(func(s,ch,ch2));


    }
}
