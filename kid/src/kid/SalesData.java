package kid;

/**
 * SalesData is a class to demonstrates the sales
 * 
 * @author PavaN
 * 
 */
public class SalesData {
     /**
      * 
      */
	 private int departmentId;
	 /**
	  * 
	  */	 
	 private String departmentName;
	 /**
	  * 
	  */
	 private double salesData;
	 
	 
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public double getSalesData() {
		return salesData;
	}
	public void setSalesData(double salesData) {
		this.salesData = salesData;
	}

}