package co.com.colombia.api.model.prueba.commons;

import lombok.Getter;

public class RechargesException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    @Getter
    private String code;

    public RechargesException(String message) {
        super(message);
    }

    public RechargesException(String message, String code) {
        super(message);
        this.code = code;
    }

}
