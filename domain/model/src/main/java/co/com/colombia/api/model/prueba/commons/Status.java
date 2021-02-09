package co.com.colombia.api.model.prueba.commons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Status {

//	private String status;
	private String code;
	private String title;
	private String detail;
	private String severity;
	
}
