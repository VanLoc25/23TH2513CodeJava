/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai4_Menu_ChucNang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;  
        Scanner banPhim = new Scanner(System.in);  

        do {  
            choice = menu(); // Hiện thị menu và nhận lựa chọn của người dùng  
            switch (choice) {  
                case 1:  
                    giaiPTB1();  
                    break;  
                case 2:  
                    giaiPTB2();  
                    break;  
                case 3:  
                    tinhTienDien();  
                    break;  
                case 4:  
                    System.out.println("Kết thúc chương trình.");  
                    break;  
                default:  
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");  
            }  
        } while (choice != 4); // Lặp lại cho đến khi người dùng chọn thoát  

        banPhim.close();  
    }  

    // Phương thức hiển thị menu và nhận lựa chọn của người dùng  
    public static int menu() {  
        System.out.println("+---------------------------------------------------+");  
        System.out.println("1. Giải phương trình bậc nhất");  
        System.out.println("2. Giải phương trình bậc hai");  
        System.out.println("3. Tính tiền điện");  
        System.out.println("4. Kết thúc");  
        System.out.println("+---------------------------------------------------+");  
        System.out.print("Chọn chức năng: ");  
        @SuppressWarnings("resource")
		Scanner banPhim = new Scanner(System.in);  
        return banPhim.nextInt(); // Trả về giá trị người dùng nhập  
    }  
    
    
//=================================================================================================
    
    // Phương thức giải phương trình bậc nhất  
    public static void giaiPTB1() {  
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

    
  //=================================================================================================
    
    // Phương thức giải phương trình bậc hai  
    public static void giaiPTB2() {  
    	@SuppressWarnings("resource")
		Scanner banPhim = new Scanner(System.in);  
        
        // Nhập các hệ số a, b và c  
        System.out.print("Nhập hệ số a: ");  
        double a = banPhim.nextDouble();  
        
        System.out.print("Nhập hệ số b: ");  
        double b = banPhim.nextDouble();  
        
        System.out.print("Nhập hệ số c: ");  
        double c = banPhim.nextDouble();  
        
        // Xét giá trị của a  
        if (a == 0) {  
            // Nếu a = 0, giải phương trình bậc nhất bx + c = 0  
            if (b == 0) {  
                if (c == 0) {  
                    System.out.println("Phương trình có vô số nghiệm.");  
                } else {  
                    System.out.println("Phương trình vô nghiệm.");  
                }  
            } else {  
                double x = -c / b;  
                System.out.println("Nghiệm của phương trình bậc nhất là: x = " + x);  
            }  
        } else {  
            // Nếu a != 0, tính delta  
            double delta = b * b - 4 * a * c;  
            System.out.println("Giá trị delta = " + delta);  
            
            

if (delta < 0) {  
                System.out.println("Phương trình vô nghiệm.");  
            } else if (delta == 0) {  
                double x = -b / (2 * a);  
                System.out.println("Phương trình có nghiệm kép: x = " + x);  
            } else {  
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);  
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);  
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);  
            }  
        }  
    }  
    
  //=================================================================================================
    
    // Phương thức tính tiền điện  
    public static void tinhTienDien() {  
        @SuppressWarnings("resource")
		Scanner banPhim = new Scanner(System.in);  
        System.out.print("Nhập số điện sử dụng trong tháng (kWh): ");  
        double soDien = banPhim.nextDouble();  
        
        double tien = 0;  

        if (soDien < 0) {  
            System.out.println("Số điện sử dụng không hợp lệ.");  
        } else if (soDien <= 200) {  
            tien = soDien * 2167; // Tính tiền cho số điện từ 101 đến 200 kWh  
        } else {  
            tien = 200 * 2167 + (soDien - 200) * 1200; // Tính tiền cho số điện vượt 200 kWh  
}  

        if (soDien >= 0) {  
            System.out.println("Tiền điện phải trả là: " + String.format("%.2f", tien) + " VNĐ");  
        }  
	}

}
