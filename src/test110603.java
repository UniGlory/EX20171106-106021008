import java.util.Scanner;

public class test110603 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=0;
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                b=b+1;
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
