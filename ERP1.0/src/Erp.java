import java.io.Serializable;

/**
 * Git服务器测试实体类
 * 
 * 
 * @author shengchen
 * 
 */
public class Erp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer erpId;
	private String erpName;

	public Integer getErpId() {
		return erpId;
	}

	public void setErpId(Integer erpId) {
		this.erpId = erpId;
	}

	public String getErpName() {
		return erpName;
	}

	public void setErpName(String erpName) {
		this.erpName = erpName;
	}

	public Erp() {
		super();
	}

	@Override
	public String toString() {
		return "Erp [erpId=" + erpId + ", erpName=" + erpName + "]";
	}

}
