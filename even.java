import java.util.Scanner;

public class even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.print("Even");
            }
else{
    System.out.print("Odd");
}
sc.close();
        }
        
    }
    


