import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int soPhanTuBanDau = arr.length;
        int[] newarr = new int [soPhanTuBanDau + 1];

        System.out.println("trước khi Thêm");
        for (int i = 0; i < soPhanTuBanDau; i++) {
            System.out.print(arr[i] + "\t");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần thêm: ");
        int add = scanner.nextInt();

        System.out.print("Nhập vị trí cần thêm: ");
        int index = scanner.nextInt();

        newarr[index] = add;

        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        for (int i = index + 1, j = index; i < newarr.length && j < arr.length; i++, j++ ){
            if (index < 1 && index > soPhanTuBanDau - 1) {
                System.out.println("Không chèn được phần tử vào mảng");
            } else {
                newarr[i] = arr[j];
                System.out.println(newarr[i]);
            }
        }

        System.out.println("Sau khi thêm:");
        for (int value: newarr) {
            System.out.print(value + "\t");
        }
    }
}
