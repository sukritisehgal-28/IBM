import java.io.FileInputStream;

public class BinaryReadDemo {
	
	public static void main(String[] args) {
		String path ="";
		
		FileInputStream istream = null;
		try {
			istream = new FileInputStream(path);
			
		}
		
		byte[] content = new byte{istream.available()];
		istream.read(content);
		System.out.println(new String(content));
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				istream.close();
				
			} catch 
		}
		
	}
	
	
	
	

}
