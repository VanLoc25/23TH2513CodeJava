/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai3_TTDien_TheoBac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")  
	    Scanner banPhim = new Scanner(System.in);  
	    System.out.print("Nhập số điện sử dụng trong tháng (kWh): ");  
	    double soDien = banPhim.nextDouble();  
	    
	    double tien = 0;  

	    if (soDien < 0) {  
	        System.out.println("Số điện sử dụng không hợp lệ.");  
	     // Tính tiền cho số điện từ 0 đến 50 kWh 
	    } else if (soDien <= 50) {  
	        tien = soDien * 1806; 
	    }  
	     // Tính tiền cho số điện từ 51 đến 100 kWh
	     else if (soDien <= 100) {  
	        tien = 50 * 1806 + (soDien - 50) * 1866;   
	    }    
	     // Tính tiền cho số điện từ 101 đến 200 kWh  
	     else if (soDien <= 200) {  
	        tien = 50 * 1806 + 50 * 1866 + (soDien - 100) * 2167; 
	    }    
	     // Tính tiền cho số điện từ 201 đến 300 kWh 
	     else if (soDien <= 300) {  
	        tien = 50 * 1806 + 50 * 1866 + 100 * 2167 + (soDien - 200) * 2729;  
	    }    
	     // Tính tiền cho số điện từ 301 đến 400 kWh
	     else if (soDien <= 400) {  
	        tien = 50 * 1806 + 50 * 1866 + 100 * 2167 + 100 * 2729 + (soDien - 300) * 3050;   
	    }    
	     // Tính tiền cho số điện từ 401 kWh trở lên
	     else {  
	        tien = 50 * 1806 + 50 * 1866 + 100 * 2167 + 100 * 2729 + 100 * 3050 + (soDien - 400) * 3151;      
	    }  

	    if (soDien >= 0) {  
	    	System.out.println("Tiền điện phải trả là: " + tien + " VNĐ");  
	    }  
	}

}
