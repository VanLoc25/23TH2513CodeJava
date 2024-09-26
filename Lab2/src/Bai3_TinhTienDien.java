/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai3_TinhTienDien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Tạo đối tượng Scanner để đọc dữ liệu từ người dùng  
        @SuppressWarnings("resource")
		Scanner banPhim = new Scanner(System.in);  
        
        // Nhập số điện sử dụng  
        System.out.print("Nhập số điện sử dụng trong tháng: ");  
        double soDien = banPhim.nextDouble();  
        
        double tien = 0; 

        // Tính tiền điện theo quy tắc lũy tiến  
        if (soDien < 0) {  
            System.out.println("Số điện sử dụng không hợp lệ.");  
        } else if (soDien <= 200) {  
            tien = soDien * 2167; // Tính tiền cho số điện từ 101 đến 200
        } else {  
            tien = 200 * 2167 + (soDien - 200) * 1200; // Tính tiền cho số điện vượt 200  
        }  

        // In ra kết quả  



if (soDien >= 0) {  
            System.out.println("Tiền điện phải trả là: " + tien + " VNĐ");  
        }  
	}

}
