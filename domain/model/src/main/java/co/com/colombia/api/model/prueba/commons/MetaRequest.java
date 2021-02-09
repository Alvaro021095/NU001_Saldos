package co.com.colombia.api.model.prueba.commons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class MetaRequest {

	private String _messageId;
	private String _applicationId;

}
