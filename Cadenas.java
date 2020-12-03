import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cadenas {

	public Cadenas() {
		// TODO Auto-generated constructor stub
	}
	
	public static String convierteMayusculas(String cadena) {
		return cadena.toUpperCase();
	}
	
	public static String convierteMinusculas(String cadena) {
		return cadena.toLowerCase();
	}
	
	public static String convierteHash(String cadena) {
		return getMD5(cadena);
	}
	
	public static String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashtext = number.toString(16);

			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		}
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void imprimir(double d) {
		System.out.println(d);
	}

	public static void imprimir(String d) {
		System.out.println(d);
	}
	

}
