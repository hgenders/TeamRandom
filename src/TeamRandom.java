import java.util.*;

public class TeamRandom {
    public static void main( String [] args){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int num1,num2,count=0,num3;
        String temp;
        System.out.println("Enter number of players: ");
        int nump = in.nextInt();
        System.out.println("Enter number of teams: ");
        int numt = in.nextInt();
        String[]arr = new String[nump];
        num3=nump/numt;
        for(int i = 0; i<arr.length;i++){
            System.out.println("Enter player " + (i+1) + ":");
            arr[i]=in.next();
        }
        for(int i = 0; i<1000000;i++){
            num1 = rand.nextInt(nump);
            num2 = rand.nextInt(nump);
            temp = arr[num1];
            arr[num1]=arr[num2];
            arr[num2]=temp;
        }
        System.out.println();
        for(int i = 0; i<arr.length;i++){
            if(count != num3){
                System.out.println(arr[i]);
                count++;
            }
            else if(count == num3){
                count = 0;
                i--;
                System.out.println();
            }
        }
    }
}
