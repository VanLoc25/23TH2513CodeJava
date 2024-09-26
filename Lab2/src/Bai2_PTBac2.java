/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai2_PTBac2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
            
            // Biện luận theo delta  



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

}
