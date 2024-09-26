/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class DoiNgoaite {
	// Tỷ giá chuyển đổi (có thể thay đổi)  
    private static final double USD_TO_EUR_RATE = 0.85; // 1 USD = 0.85 EUR  
    private static final double EUR_TO_USD_RATE = 1.18; // 1 EUR = 1.18 USD  

    public static double convertUsdToEur(double amount) {  
        return amount * USD_TO_EUR_RATE;  
    }  

    public static double convertEurToUsd(double amount) {  
        return amount * EUR_TO_USD_RATE;  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub



Scanner banPhim = new Scanner(System.in);  

	        System.out.println("Chương trình đổi ngoại tệ.");  
	        System.out.println("1. Đổi USD sang EUR");  
	        System.out.println("2. Đổi EUR sang USD");  
	        System.out.print("Chọn loại chuyển đổi (1 hoặc 2): ");  
	        int choice = banPhim.nextInt();  

	        switch (choice) {  
	            case 1:  
	                System.out.print("Nhập số tiền USD: ");  
	                double usd = banPhim.nextDouble();  
	                double eur = convertUsdToEur(usd);  
	                System.out.println(usd + " USD = " + eur + " EUR");  
	                break;  
	            case 2:  
	                System.out.print("Nhập số tiền EUR: ");  
	                double euro = banPhim.nextDouble();  
	                double dollar = convertEurToUsd(euro);  
	                System.out.println(euro + " EUR = " + dollar + " USD");  
	                break;  
	            default:  
	                System.out.println("Lựa chọn không hợp lệ.");  
	                break;  
	        }  
	}

}
