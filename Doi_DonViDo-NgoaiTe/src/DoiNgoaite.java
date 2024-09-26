/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class DoiNgoaite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        // Tỷ giá giả định (tính đến thời điểm hiện tại)
        double usdToVnd = 24000.0;
        double eurToVnd = 26000.0;

        // Nhập số tiền cần quy đổi
        System.out.println("Nhập số tiền cần đổi(Vnđ):");
        double amount = scanner.nextDouble();

        // Chọn loại ngoại tệ
        System.out.println("Chọn loại ngoại tệ cần quy đổi:");
        System.out.println("1. USD (Đô la Mỹ)");
        System.out.println("2. EUR (Euro)");
        
        int choice = scanner.nextInt();
        double convertedAmount = 0.0;

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToVnd;
                System.out.println(amount + " USD tương đương " + convertedAmount + " VND.");
                break;
            case 2:
                convertedAmount = amount * eurToVnd;
                System.out.println(amount + " EUR tương đương " + convertedAmount + " VND.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }

	}

}
