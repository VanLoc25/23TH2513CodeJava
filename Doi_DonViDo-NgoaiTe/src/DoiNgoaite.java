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
		 @SuppressWarnings("resource")
		Scanner banPhim = new Scanner(System.in);  

	        System.out.println("Chương trình đổi ngoại tệ");  
	        System.out.println("1. USD sang VND");  
	        System.out.println("2. VND sang USD");  
	        System.out.print("Chọn loại chuyển đổi (1 hoặc 2): ");  
	        int choice = banPhim.nextInt();  
	        
	        double USDToVND = 23000; // Tỉ giá USD sang VND  
	        double VNDToUSD = 1 / USDToVND; // Tỉ giá VND sang USD  
	        
	        System.out.print("Nhập số tiền cần đổi: ");  
	        double Tien = banPhim.nextDouble();  
	        double chuyenDoi;  

	        if (choice == 1) {  
	        	chuyenDoi = Tien * USDToVND;  
	            System.out.printf("Số tiền sau khi đổi:"+ chuyenDoi + " VND");  
	        } else if (choice == 2) {  
	        	chuyenDoi = Tien * VNDToUSD;  
	            System.out.printf("Số tiền sau khi đổi:"+ chuyenDoi +"USD");  
	        } else {  
	            System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");  
	        }  

	}

}
