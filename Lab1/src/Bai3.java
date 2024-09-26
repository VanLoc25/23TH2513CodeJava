/**
 * 
 */


import java.util.Scanner;

public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo đối tượng Scanner để nhận nhập từ người dùng  
        Scanner banPhim = new Scanner(System.in);  
        
        // Nhập cạnh của khối lập phương  
        System.out.print("Nhập cạnh của khối lập phương: ");  
        double canh = banPhim.nextDouble();  
        
        // Tính thể tích  
        double theTich = Math.pow(canh, 3);  
        
        // Xuất thể tích  
        System.out.println("Thể tích của khối lập phương là: " + theTich);  
       


	}

}
