package dto;

import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = -4274700572038677000L;
	
		
	private String productId;
	private String pname;
	private Integer unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long UnitsInStock;
	private String condition;
	private String filename; 
	
	public Product() {
		super();
	}
	public Product(String productId,String pname, Integer unitPrice) {
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}
	public String getProductId() {
		return productId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitsInstock() {
		return UnitsInStock;
	}
	public void setUnitsInstock(long UnitsInStock) {
		this.UnitsInStock = UnitsInStock;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setDescription(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	public long getUnitsInStock() {
		return UnitsInStock;
	}
	public void setUnitsInStock(long unitsInStock) {
		UnitsInStock = unitsInStock;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
}