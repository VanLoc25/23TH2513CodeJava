/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai1_PhuongTrinhBacNhat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo đối tượng Scanner để nhận nhập từ người dùng  
        @SuppressWarnings("resource")
		Scanner banPhim = new Scanner(System.in);  
        
        // Nhập các hệ số a và b  
        System.out.print("Nhập hệ số a: ");  
        double a = banPhim.nextDouble();  
        
        System.out.print("Nhập hệ số b: ");  
        double b = banPhim.nextDouble();  
        
        // Kiểm tra giá trị của a  
        if (a == 0) {  
            if (b == 0) {  
                // Trường hợp vô số nghiệm  
                System.out.println("Phương trình có vô số nghiệm.");  
            } else {  
                // Trường hợp vô nghiệm  
                System.out.println("Phương trình vô nghiệm.");  
            }  
        } else {  
            // Trường hợp có nghiệm  
        	double x = -b / a;  
            System.out.println("Nghiệm của phương trình là: x = " + x);  
        } 
	}

}
