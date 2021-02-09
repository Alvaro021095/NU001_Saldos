package co.com.colombia.api.helpersutil;

public class HelpersContants {
    public static final String CATEGORIES_AND_SERVICES = "0800";
    public static final String DETAIL = "0801";
    public static final String BALANCE = "0802";
    public static final String COST_RECHARGE = "0803";
    public static final String RECHARGE = "0820";

    //// HTTP
    public static final String BAD_REQUEST_MESSAGE = "400 Bad Request";
    public static final String HTTP_CODE_400 = "400";
    public static final String HTTP_CODE_401 = "401";
    public static final String HEADER_NOT_FOUND_MESSAGE = "La cabeceras no estan completas";
    public static final String HTTP_CODE_500 = "500";
    public static final String HTTP_CODE_405 = "405";
    public static final String HTTP_CODE_408 = "408";
    public static final String ERROR_TIME_OUT_MESSAGE = "TIMEOUT";
    public static final String SERVICE_DISABLE_MESSAGE = "Servicio no disponible por el momento";

    ////
    public static final String PARSE_ERROR_MESSAGEE = "error al obetener cuerpo de respuesta [HelpersUtil] ";
    public static final String STATUS_TITLE = "status";
    public static final String MESSAGE_TITLE = "message";

    public static final String TRANSACTION_TRACKER = "Transaction-Tracker";
    public static final String SESSION_TRACKER = "Session-Tracker";
    public static final String CANAL = "Channel";
    public static final String IP = "Ip";
    public static final String PAGE_SIZE = "page_size";
    public static final String PAGE_NUMBER = "page_number";
    public static final String DATE = "Date";
    public static final String DATE_TIME = "DateTime";
    public static final String PRODUCT_ID = "ProductId";
    public static final String TRANSACTION_CODE = "TransactionCode";
    public static final String HEADER_PASS_SAVE_REDIS = "PASS";
    public static final String PASS_SAVE_REDIS_VALUE = "cgcredis";

    public static final String ERROR_MESSAGE_LOG = "errorMessage";
    public static final String ERROR_TRACE_LOG = "stackTrace";
    public static final String PROPERTY_MESSAGE_LOG = "message";
    public static final String SECRET_NAME = "nu0014001-lifecoach-capa-gestion-qa-api-keys-secret-cgc";

    // Constant Redis Error
    public static final String ERROR_CODE_TIMEOUT_REDIS = "REC901";
    public static final String ERROR_MESSAGE_TIMEOUT_REDIS = "Can't Get a Rensponse from redis connection";
    public static final String ERROR_CODE_SERIALIZE_REDIS = "REC902";
    public static final String ERROR_MESSAGE_SERIALIZE_REDIS = "Error when, trying to serialize object";

}
