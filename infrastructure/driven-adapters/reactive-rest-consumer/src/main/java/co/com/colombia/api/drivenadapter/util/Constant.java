package co.com.colombia.api.drivenadapter.util;

public class Constant {

    public static final String CLIENT_ID = "X-IBM-Client-Id";
    public static final String CLIENT_SECRET = "X-IBM-Client-Secret";
    public static final String SOURCE_CHANNEL = "sourceChannel";


    public static final String TARJETA_CIVICA = "Tarjeta Civica";
    public static final String DOCUMENT_TYPE = "documentType";
    public static final String DOCUMENT_NUMBER = "documentNumber";
    public static final String APP = "APP_PERSONAS";
    public static final String CONTENT_TYPE = "content-type";
    public static final String CLIENTIP = "clientip";
    public static final String DATETIMEAPPLICATIONORIGIN = "dateTimeApplicationOrigin";
    public static final Integer CONNECTION_TIMEOUT = 3000;


    private Constant(){
        throw new IllegalStateException("Utility class");
    }

}
