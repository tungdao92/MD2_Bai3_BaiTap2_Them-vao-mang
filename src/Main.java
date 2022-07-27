import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số phần tử của mảng: ");
//        int n = scanner.nextInt();
//        // khởi tạo arr
//        int [] arr = new int [n];
//        System.out.print("Nhập các phần tử của mảng: \n");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("a[%d] = ", i);
//            arr[i] = scanner.nextInt();
//        }
//        System.out.print("Nhập phần tử k = ");
//        int k = scanner.nextInt();
//        System.out.printf("\nChèn phần tử %d vào mảng.", k);
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Nhập giá trị muốn thêm");
        int x = sc.nextInt();
        System.out.println("Vị trí thêm");
        int i = sc.nextInt();
        if (i <= -1 || i >= array.length - 1) {
            System.out.println("Không thể thêm");
        } else {
            array[i] = x;
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
        }
    }
}