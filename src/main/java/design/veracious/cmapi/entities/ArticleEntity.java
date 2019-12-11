package de.artality.cmapi.entities;

import java.sql.Date;
import java.util.List;

public class ArticleEntity {

	private int idArticle;
	private int idProduct;

	private int count;

	private double price;
	private String condition;
	private LanguageEntity language;

	private boolean isFoil;
	private boolean isSigned;
	private boolean isAltered;
	private boolean isPlayset;
	private boolean isFirstEd;

	private String comments;

	private boolean inShoppingCard;

	private ProductEntity product;
	private UserEntity seller;

	private Date lastEdited;

	private List<LinkEntity> links;

	public ArticleEntity() {
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public LanguageEntity getLanguage() {
		return language;
	}

	public void setLanguage(LanguageEntity language) {
		this.language = language;
	}

	public boolean isFoil() {
		return isFoil;
	}

	public void setFoil(boolean isFoil) {
		this.isFoil = isFoil;
	}

	public boolean isSigned() {
		return isSigned;
	}

	public void setSigned(boolean isSigned) {
		this.isSigned = isSigned;
	}

	public boolean isAltered() {
		return isAltered;
	}

	public void setAltered(boolean isAltered) {
		this.isAltered = isAltered;
	}

	public boolean isPlayset() {
		return isPlayset;
	}

	public void setPlayset(boolean isPlayset) {
		this.isPlayset = isPlayset;
	}

	public boolean isFirstEd() {
		return isFirstEd;
	}

	public void setFirstEd(boolean isFirstEd) {
		this.isFirstEd = isFirstEd;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public boolean isInShoppingCard() {
		return inShoppingCard;
	}

	public void setInShoppingCard(boolean inShoppingCard) {
		this.inShoppingCard = inShoppingCard;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public UserEntity getSeller() {
		return seller;
	}

	public void setSeller(UserEntity seller) {
		this.seller = seller;
	}

	public Date getLastEdited() {
		return lastEdited;
	}

	public void setLastEdited(Date lastEdited) {
		this.lastEdited = lastEdited;
	}

	public List<LinkEntity> getLinks() {
		return links;
	}

	public void setLinks(List<LinkEntity> links) {
		this.links = links;
	}

}
