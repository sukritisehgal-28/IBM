

import java.io.File;

public class FileDemo {
	
	
	
	public static void main(String[] args) throws Exception {
		String path= "C:\\Users\\Administrator\\Desktop\\ibm";
		File file = new File(path);
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getCanonicalPath());
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
