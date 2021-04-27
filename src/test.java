import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sumNum=0;
        System.out.println("please enter the amount of numbers");
        int totalNUM = scanner.nextInt();
        int[] arr = new int[totalNUM];
        for(int i=0;i<totalNUM;i++)
        {
            arr[i]= scanner.nextInt();
            sumNum=sumNum+arr[i];
        }
        sumNum=sumNum/totalNUM;
        for(int i=0;i<totalNUM;i++)
        {
            if(arr[i]>sumNum)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
