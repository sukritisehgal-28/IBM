import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.MobileDao;
import com.ibm.entity.Mobile;

public class TestMobile {
	
	
	public static MobileDao dao;
	@BeforeAll
	public static void setup() {
		dao = new MobileDao();
	}
	
	@Test
	public void testSave() {
		Mobile m = new Mobile(11,"hh","hh",8.8);
		
	}

}
