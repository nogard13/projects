import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int w = sc.nextInt();
        if (w%2==0 && w>2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
