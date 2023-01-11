import { Department } from './department';

export class Employee {
  visitId: number = 0;
  cust_name: String = '';
  contact_person: string = '';
  contact_no: number = 0;
  interest_product: string = '';
  visit_subject: string = '';
  description: string = '';
  is_disabled: boolean;
  is_deleted: boolean;
  emp_id: number = 0;
}
/*private Integer pd_id;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String pd_order_no;
	
	private Integer ad_id;
	
	@ManyToOne
	@JoinColumn(name = "ad_id", insertable = false, updatable = false)
	private AssetDefinition assetDefination;
	
	private Integer at_id;
	
	@ManyToOne
	@JoinColumn(name = "at_id", insertable = false, updatable = false)
	private AssetType assetType;
	
	private Integer pd_qty;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime pd_date;
	
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime pd_ddate;
	
	private Integer po_status_id;
	
	@ManyToOne
	@JoinColumn(name = "po_status_id", insertable = false, updatable = false)
	private PurchaseOrderStatus purchaseOrderStatus;
	
	private Integer vd_id;
	
	@ManyToOne
	@JoinColumn(name = "vd_id", insertable = false, updatable = false)
	private Vendor vendor;*/
