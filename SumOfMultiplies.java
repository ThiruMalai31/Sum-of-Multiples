import java.util.HashSet;
import java.util.Scanner;

public class SumOfMultiplies {
    public static int calculateSumOfMultiplies(int level,int[] base){
        HashSet<Integer> multiplesNumber = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < base.length; i++) {
            for (int j = base[i]; j < level; j += base[i]) {
                multiplesNumber.add(j);
            }
        }
        for (int i: multiplesNumber) {
            ans += i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the level");
        int level=scanner.nextInt();

        System.out.println("Enter the number pf base values");
        int baseValue=scanner.nextInt();

        int[] base=new int[baseValue];
        System.out.println("Enter the Base Values");

        for(int i=0;i<baseValue;i++){
            base[i]=scanner.nextInt();
        }

        System.out.println("The Player Earns "+calculateSumOfMultiplies(level,base)+" Energy Points");
    }
}
