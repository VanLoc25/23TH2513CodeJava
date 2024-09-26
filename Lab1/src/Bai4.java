/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo đối tượng Scanner để nhận nhập từ người dùng  
        Scanner banPhim = new Scanner(System.in);  
        
        // Nhập các hệ số a, b, c  
        System.out.print("Nhập hệ số a: ");  
        double a = banPhim.nextDouble();  
        
        System.out.print("Nhập hệ số b: ");  
        double b = banPhim.nextDouble();  
        
        System.out.print("Nhập hệ số c: ");  
        double c = banPhim.nextDouble();  
        
        // Tính delta  
        double delta = Math.pow(b, 2) - 4 * a * c;  
        
        // Kiểm tra delta có lớn hơn hoặc bằng 0 trước khi tính căn delta  
        if (delta >= 0) {  
            double canDelta = Math.sqrt(delta);  
            // Xuất kết quả căn delta  

System.out.println("Căn delta là: " + canDelta);  
        } else {  
            System.out.println("Delta nhỏ hơn 0, không thể tính căn delta (căn bậc hai của số âm).");  
        }  
     
	}

}
