import java.util.Scanner;

public class AddValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,5,6,8,2,0,0};
        int x = scanner.nextInt();
        int index = scanner.nextInt();
        if (index <=1 || index >= array.length-1){
            System.out.println("Can't add value in array");
        }
        else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i-1];
            }
            array[index]=x;


            }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ",");
        }

    }
}
