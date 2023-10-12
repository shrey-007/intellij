import java.util.Scanner;
public class Main {
    static char getIndex(String s,int index){
        if(index>=s.length() || index<0){
            System.out.println("enter valid index");
            return '0';}
        else {
            return s.charAt(index);
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String");
       String s=sc.next();
       System.out.println("Enter index");
       int index=sc.nextInt();
        System.out.println(getIndex(s,index));

    }
}