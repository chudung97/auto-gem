
package automation.constant;

import org.openqa.selenium.By;

public class CT_Common {
	 
	public static final String DB = "10.58.71.214";
	public static final String SID = "dbora";
	public static final String USERNAME = "BCCS_SALE";
	public static final String PASSWORD = "sale";
	public static final String DBIM = "10.58.71.167";
	public static final String SIDIM = "bccs";
	public static final String USERNAMEIM = "BCCS_IM";
	public static final String PASSIM = "bccs_im";
	public static final String USER_ADMIN = "automation_admin";
	public static final String PASS_ADMIN = "654321a@";
	public static final String STAFF_ADMIN_ID = "437725";
	public static final String SHOP_ADMIN_ID = "204901";
	public static final String SHOP_CODE_ADMIN = "CH_VTT";
	
	//---------------------------message-----------------------
	public static final String ELEMENT_MESSAGE_ERROR = "//*[contains(@class,'ui-messages-error-detail') and contains(text(), '${message}')]";
	public static final String ELEMENT_MESSAGE_SUCCESS = "//*[contains(@class,'ui-messages-info-detail') and contains(text(), '${message}')]";
	public static final String MESSAGE_SUMMARY_HOT_CHARGE_ACCOUNT_LOG = "Tổng hợp cước nóng cho hợp đồng ${accountId} với số ti�?n ${amount}";
	public static final String MESSAGE_SUMMARY_HOT_CHARGE_SUB_LOG = "Tổng hợp cước nóng cho thuê bao ${isdn} với số ti�?n ${amount}";
	//--------------------------confirm------------------------
	public static final String ELEMENT_CONFIRM_TITLE = "//*[contains(@id,'${dglId}') or contains(@class,'${dglId}')]//*[contains(@id, 'title') or contains(@class,'title') and text()='${title}']";
	public static final String ELEMENT_CONFIRM_CONTENT = "//*[contains(@id,'${dglId}') or contains(@class,'${dglId}')]//*[contains(@class, '${iconClass}')]/following-sibling::*[contains(text(), '${message}')]";
	
	//--------------------------sql----------------------------
	public static final String SQL_SELECT_ACTION_AUDIT = "select * from action_audit a, action_detail b where a.action_audit_id = b.action_audit_id(+) "
			+ "and a.action_code = ${action_code} and a.pk_id = ${pkId} and a.issue_datetime >= to_date('${date}', 'dd/mm/yyyy HH24:MI:SS') "
			+ "and a.issue_datetime = b.issue_datetime(+) order by b.table_name, b.col_name";
	public static final String SQL_SELECT_EXCHANGE_LOG = "select * from exchange_log where pk_id = '${pkId}' and action_code = '${action_code}' and create_datetime >= to_date('${date}', 'dd/mm/yyyy HH24:MI:SS')";
	public static final String SQL_SELECT_SALE_TRANS = "select a.*, b.*, c.stock_model_id stock_id_detail, c.from_serial, c.to_serial, c.quantity detail_quantity"
			+ " from sale_trans a, sale_trans_detail b, sale_trans_serial c "
			+ "where a.sale_trans_id = b.sale_trans_id and b.sale_trans_detail_id = c.sale_trans_detail_id(+) " 
			+ "and  a.staff_id = '${staffId}' and a.create_staff_id = '${staffId}' and a.shop_id = '${shopId}' and a.sale_trans_type = '${transType}' "  
			+ "and a.sale_trans_date >= to_date('${date}', 'dd/mm/yyyy HH24:MI:SS') " 
			+ "and b.sale_trans_date >= to_date('${date}', 'dd/mm/yyyy HH24:MI:SS') "
			+ "and b.sale_trans_date = c.sale_trans_date(+)"
			+ "order by b.stock_model_id";
	public static final String SQL_SELECT_SMS =  "select * from send_sms where isdn ='${isdn}' and create_date >= to_date('${date}', 'dd/mm/yyyy HH24:MI:SS')";
	public static final String SQL_SELECT_SUB_FROM_ISDN = "select * from subscriber where isdn = '${isdn}' and status = '2'";
	public static final String SQL_SELECT_SUB_FROM_ISDN_UPDATE = "select * from subscriber where isdn = '${isdn}' and status = '2' and update_datetime >= to_date('${date}', 'dd/mm/yyyy HH24:MI:SS')";
	public static final String SQL_SELECT_IMSI_FROM_SERIAL = "select * from stock_sim where serial = '${serial}'";
	public static final String SQL_SELECT_PARAM_SALE_SERVICE_NOT_GOODS = "select * from sale_services a, sale_services_price b where a.sale_services_id = b.sale_services_id and a.status = '1' "
			+ "and b.status = '1' and a.code = '${code}'";
	public static final String SQL_SELECT_PARAM_SALE_SERVICE_HAS_GOODS = "select a.sale_services_id, b.sale_services_price_id price_id_service, b.price price_service, b.vat vat_service,"
			+ "c.stock_model_id, c.price_id price_id_stock, d.price price_stock, d.vat vat_stock from sale_services a, sale_services_price b, sale_services_detail c, price d"
			+ " where a.sale_services_id = b.sale_services_id"
			+ " and a.sale_services_id = c.sale_services_id (+)"
			+ " and c.price_id = d.price_id (+)"
			+ " and a.status = 1"
			+ " and b.status = 1"
			+ " and c.status = 1"
			+ " and c.status = d.status (+)"
			+ " and a.code = '${code}'"
			+ " and c.stock_model_id in (${stockId})"
			+ " order by c.stock_model_id";
	public static final String SQL_SELECT_SUB_SIM = "select * from sub_sim where sub_id = '${sub_id}' and (end_datetime is null or end_datetime >=  to_date('${date}', 'dd/mm/yyyy HH24:MI:SS')) order by sta_datetime";
	public static final String SQL_SELECT_SUB_FROM_ACCOUNT = "select * from account where account_id in (select account_id from subscriber where isdn = '${isdn}' and status = '2')";
	public static final String SQL_SELECT_PARAM_SUB_SIM = "select * from sub_sim where sub_id = '${sub_id}' and serial = '${serial}'";
	public static final String SQL_SELECT_SYSDATE = "select sysdate from dual";
	public static final String SQL_SELECT_SALE_SERVICE = "select sale_service_code from mapping where reason_id = '${reasonId}' and tel_service_id = '${telecomService}' and status = '1'";
	
//	/* Nhudt add -------- element common ------ */
//	public static final String ELEMENT_STAFF_INPUT = "//*[contains(@id,'cbxShopStaff_input')]";
//	public static final String ELEMENT_STAFF_ITEM ="//*[contains(@id,'cbxShopStaff_panel')]//*[text()='${option}']";
//	
//	public static final String ELEMENT_PRODUCT_INPUT = "//*[contains(@id,'txtProductNameid_input')]";
//	public static final String ELEMENT_PRODUCT_ITEM = "//*[contains(@id,'txtProductNameid_panel')]//*[text()='${option}']";
//	
//	public static final String ELEMENT_HTHM_INPUT = "//*[contains(@id,'reasonTypeid2_input')]";
//	public static final String ELEMENT_HTHM_ITEM = "//*[contains(@id,'reasonTypeid2_panel')]//*[text()='${option}']";
//	
//	public static final String ELEMENT_SERIAL_INPUT = "//*[contains(@id,'txtSerialSimMobile_input')]";
//	public static final String ELEMENT_SERIAL_ITEM = "//*[contains(@id,'txtSerialSimMobile_panel')]//*[text()='${option}']";
//
//	/* Nhudt add end */
	
	//---------------------view exchange---------------------
	public static final By ELEMENT_DGL_VIEW_EXCHANGE_TITLE = By.xpath("//*[contains(@id, 'title') and text()='Thông tin tổng đài']");
	public static final By ELEMENT_SEND_REQUEST_INFO = By.xpath("//*[text()='Thông tin gửi lên tổng đài']/../following-sibling::div//label");
	public static final By ELEMENT_RECEIVE_INFO = By.xpath("//*[text()='Thông tin tổng đài trả v�?']/../following-sibling::div//label");
}
