package co.com.colombia.api.model.commons;

import lombok.Getter;

public class OrchestratorException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    @Getter
    private String code;

    public OrchestratorException(String message) {
        super(message);
    }

    public OrchestratorException(String message, String code) {
        super(message);
        this.code = code;
    }

}
