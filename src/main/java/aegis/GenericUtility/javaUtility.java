package aegis.GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class javaUtility {
	
	public String localDate() {
		return LocalDate.now().toString().replace("-", "");
	}
	
	public String localdateTime() {
		return LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "");
	}

}
