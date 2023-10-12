import java.util.Scanner;
public class Main5 {
    static String func(String s,String olds,String news){
        return s.replace(olds,news);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println("Enter Character to be replaced");
        String s2=sc.next();
        System.out.println("Enter Character to be replaced with");
        String s3=sc.next();
        System.out.println(func(s,s2,s3));


    }
}
