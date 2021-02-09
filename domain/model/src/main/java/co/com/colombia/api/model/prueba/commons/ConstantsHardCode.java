package co.com.colombia.api.model.prueba.commons;

public class ConstantsHardCode {

	/* Category and Services */
	// Service
	public static final String SERVICECODE = "10";
	public static final String SERVICENAME = "Recarga Civica";
	public static final boolean SERVICESTATUS = true;
	
	// Service Supplier
	public static final String SERVICESUPPLIERCODE = "012";
	public static final String SERVICESUPPLIERNAME = "Metro";
	public static final boolean SERVICESUPPLIERSTATUS = true;
	
	// CategoryInfo
	public static final String CATEGORYCODE = "001";
	public static final String CATEGORYNAME = "Transporte";
	public static final Boolean CATEGORYINFORMATION = true;
//	public static final Boolean CATEGORYSTATUS = true;
	
	//Status
	public static final String CODE = "000";
	public static final String TITLE = "TRANSACCION EXITOSA";
	public static final String DETAIL = "TRANSACCION EXITOSA";
	public static final String SEVERITY = "INFO";
	public static final String STATUS = "200";
	
	// Error
	public static final String ERROR_STATUS = "404";
	public static final String ERROR_CODE = "202";
	public static final String ERROR_TITLE = "Cliente no existe";
	public static final String ERROR_DETAIL = "Cliente no existe";
	public static final String ERROR_SEVERITY = "ERROR";
	
	/* Details */
	
	// References
	public static final String DATAILDESCRIPTION = "Valor de la recarga";
	public static final String TYPE  = "float";
	public static final String REFERENCE_REQUESTFIELD = "rechargeAmount";

	// rechargeInputInfo
	public static final String AMOUNT = "Valor de la recarga";
	public static final String INPUTTYPE = "float";
	public static final String REQUESTFIELD = "rechargeAmount";
	
	// additionalProp1 - 2 - 3
	public static final String KEYDOCUMENT = "CC";
	public static final String LABELDOCUMENT = "Cedula Ciudadana";
	
	// documentTypes
	public static final String DESCRIPTION = "Numero Documento";
	public static final String DOCUMENTTYPE_REQUESTFIELD = "rechargeAmount";
	
	// documentNumber
	public static final String DOCUMENTNUMBER_DESCRIPTION = "NUmero Documento";
	public static final String DOCUMENTNUMBER_DATATYPE = "string";
	public static final String DOCUMENTNUMBER_MINLENGTH = "string";
	public static final String DOCUMENTNUMBER_MAXLENGTH = "string";
	public static final String DOCUMENTNUMBER_REQUESTFIELD = "rechargeAmount";

	
	// ServicesDetail
	public static final String SERVICESDETAIL_SERVICECODE = "S0001";
	public static final String SERVICESDETAIL_SERVICENAME = "civica";
	public static final String SERVICESDETAIL_SERVICEDESCRIPTION = "Servicio de recargas c�vica";
	public static final String SERVICESDETAIL_CATEGORYCODE = "C0001";
	public static final String SERVICESDETAIL_SUPPLIERCODE = "P0001";
	public static final Integer SERVICESDETAIL_MINRECHARGEVALUE = 1000;
	public static final Integer SERVICESDETAIL_MAXRECHARGEVALUE = 100000;

	//Servicios de Consulta Costo
	public static final String COST_SUPPLIERSERVICECODE = "P001";
	public static final String COST_SERVICECODE = "S001";
	public static final String COST_CATEGORYCODECOST = "C001";
	public static  final double COST = 0.0;
	public  static  final  String COST_DESCRIPTION = "Costo generado para civica";

}
