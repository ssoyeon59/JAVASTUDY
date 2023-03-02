import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt(); 
        int num;
        int min = input.nextInt();
        int max = min;
        for (int i=1; i<size; i++){
            num = input.nextInt(); 
            if(max < num) 
                max = num;
            else if(min > num)
                min = num;
        }
        System.out.printf("%d %d", min, max);
    }
}