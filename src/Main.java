import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]array= {1,3,5,7,9,11};

        System.out.print("Nhập phần tử cần xoá: ");
        int X = sc.nextInt();
        int index_del =-1 ;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == X){
                index_del=i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Không tìm thấy phần tử cần xoá trong mảng.");
        } else {
            for(int i =index_del; i< array.length-1 ;i++){
                array[i] = array [i+1];
            }
            System.out.print("Mảng sau khi xoá "+X + "là : ");
            System.out.println (Arrays.toString(Arrays.copyOf(array, array.length - 1)));

        }
        sc.close();



    }
}