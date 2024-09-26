/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class km_to_m_and_Byte_to_bit {
	 // Phương thức đổi km sang m  
    public static double kmToM(double km) {  
        return km * 1000;  
    } 
 // Phương thức đổi byte sang bit  
    public static long byteToBit(long byteValue) {  
        return byteValue * 8;  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("resource")
		Scanner banPhim = new Scanner(System.in);  

	        // Đổi km sang m  
	        System.out.print("Nhập số km: ");  
	        double km = banPhim.nextDouble();  
	        double m = kmToM(km);  
	        System.out.println(km + " km = " + m + " m");  

	        // Đổi byte sang bit  

System.out.print("Nhập số byte: ");  
	        long byteValue = banPhim.nextLong();  
	        long bit = byteToBit(byteValue);  
	        System.out.println(byteValue + " byte = " + bit + " bit");  

	}

}
