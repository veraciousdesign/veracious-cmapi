package design.veracious.cmapi.entities.xml;

public class Article {

	private Integer idProduct;
	private Integer idArticle;

//  1 - English
//  2 - French
//  3 - German
//  4 - Spanish
//  5 - Italian
//  6 - Simplified Chinese
//  7 - Japanese
//  8 - Portuguese
//  9 - Russian
//  10 - Korean
//  11 - Traditional Chinese
	private Integer idLanguage;

	private String comments;

	private Integer count;
	private Double price;

	private String condition;

	private Boolean isFoil;
	private Boolean isSigned;
	private Boolean isPlayset;
	private Boolean isFirstEd;

	public Article() {

	}
	
	

	public Integer getIdProduct() {
		return idProduct;
	}



	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}



	public Integer getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}

	public Integer getIdLanguage() {
		return idLanguage;
	}

	public void setIdLanguage(Integer idLanguage) {
		this.idLanguage = idLanguage;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Boolean getIsFoil() {
		return isFoil;
	}

	public void setIsFoil(Boolean isFoil) {
		this.isFoil = isFoil;
	}

	public Boolean getIsSigned() {
		return isSigned;
	}

	public void setIsSigned(Boolean isSigned) {
		this.isSigned = isSigned;
	}

	public Boolean getIsPlayset() {
		return isPlayset;
	}

	public void setIsPlayset(Boolean isPlayset) {
		this.isPlayset = isPlayset;
	}

	public Boolean getIsFirstEd() {
		return isFirstEd;
	}

	public void setIsFirstEd(Boolean isFirstEd) {
		this.isFirstEd = isFirstEd;
	}
	
	


}
