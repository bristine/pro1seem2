
import java.util.Scanner;


public class Practice1 {
    public static void main(String[] args) {
        System.out.print("   2 ");
        int count = 1;
        int i = 3;
        while (count <= 49){
            int check = 0;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    check++;
                }
                
            }
            if (check == 0) {
                System.out.printf("%4d ",i);
                count++;
                if (count % 10 == 0){
                System.out.println("");
        }
            }
            
            i++;
        
        
        
        
}
    }

}


