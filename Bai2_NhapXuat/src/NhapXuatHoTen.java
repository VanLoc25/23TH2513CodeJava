/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class NhapXuatHoTen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Khai báo các biến chứa dữ liệu nhập vào
		String hoTen;
		int tuoi;
		double chieuCao;
		double canNang;
		// Tạo đối tượng của lớp Scanner đẻ nhập dữ liệu
		Scanner banPhim;
		banPhim = new Scanner(System.in);
		// Lấy Chuỗi
		//In ra đường dẫn cho User biết
		System.out.print("Họ tên?");
		hoTen = banPhim.nextLine();
		System.out.print("Bao Nhiêu tuổi?");
		tuoi= banPhim.nextInt();
		System.out.print("Cao bao nhiêu?");
		chieuCao= banPhim.nextDouble();
		System.out.print("cân nặng?");
		canNang= banPhim.nextDouble();
		
		//Xuất thông tin
		System.out.println("Name: " + hoTen);
		System.out.println("Age: " + tuoi);
		System.out.println("Weight: " + chieuCao +"m");
		System.out.println("Height: " + canNang + "Kg");
		
		
		
		
		
	}

}
