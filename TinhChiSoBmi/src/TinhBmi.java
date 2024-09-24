/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class TinhBmi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khai báo biến cho cân nặng và chiều cao
        double canNang, chieuCao, bmi;
        
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập cân nặng
        System.out.print("Nhập cân nặng của bạn (kg): ");
        canNang = scanner.nextDouble();
        
        // Nhập chiều cao
        System.out.print("Nhập chiều cao của bạn (m): ");
        chieuCao = scanner.nextDouble();
        
        // Tính chỉ số BMI
        bmi = canNang / (chieuCao * chieuCao);
        
        // Xuất kết quả BMI
        System.out.printf("Chỉ số BMI của bạn là: %.2f%n", bmi);
        
        // Đóng Scanner sau khi sử dụng
        scanner.close();
        
        // Đánh giá theo chỉ số BMI

if (bmi < 18.5) {
            System.out.println("Thiếu cân.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Cân nặng bình thường.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Đang thừa cân.");
        } else {
            System.out.println("Bị béo phì.");
        }
	}

}
