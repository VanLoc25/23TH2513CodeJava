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
        
        
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner banPhim = new Scanner(System.in);
        
        // Nhập tên
        System.out.print("Nhập tên: ");
        String hoTen = banPhim.nextLine();
        
        // Nhập cân nặng
        System.out.print("Nhập cân nặng của bạn (kg): ");
        double canNang = banPhim.nextDouble();
        
        // Nhập chiều cao
        System.out.print("Nhập chiều cao của bạn (m): ");
        double chieuCao = banPhim.nextDouble();
        
        // Tính chỉ số BMI
        double bmi = canNang / (chieuCao * chieuCao);
        
        // Xuất kết quả BMI
        System.out.println("Bạn " + hoTen);
		System.out.println("Có chỉ số BMI = " + bmi);
        
       
        
        // Đánh giá theo chỉ số BMI
String thongBao;
if (bmi < 18.5) 
		thongBao = "Thiếu cân.";
	else if (bmi >= 18.5 && bmi < 24.9) 
		thongBao = "Cân nặng bình thường.";
	else if (bmi >= 25 && bmi < 29.9) 
		thongBao = "Thừa cân.";
	else 
		thongBao = "Bị béo phì.";
		System.out.println(thongBao);
	}

}
