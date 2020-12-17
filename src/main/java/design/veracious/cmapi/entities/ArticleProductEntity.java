package design.veracious.cmapi.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticleProductEntity {
	
	private long idProduct;
	private long idMetaproduct;

	private int countReprints;

	private String enName;
	private String locName;

	private List<LocalizationEntity> localization;

	private CategoryEntity category;

	private String website;
	private String image;
	private String gameName;
	private String categoryName;
	private String idGame;
	private String number;
	private String rarity;

	private String expansion;

	private PriceGuideEntity priceGuide;

	private List<ReprintEntity> reprint;

	private int countArticles;
	private int countFoils;

	private List<LinkEntity> links;

	public ArticleProductEntity() {
	}

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}

	public long getIdMetaproduct() {
		return idMetaproduct;
	}

	public void setIdMetaproduct(long idMetaproduct) {
		this.idMetaproduct = idMetaproduct;
	}

	public int getCountReprints() {
		return countReprints;
	}

	public void setCountReprints(int countReprints) {
		this.countReprints = countReprints;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public List<LocalizationEntity> getLocalization() {
		return localization;
	}

	public void setLocalization(List<LocalizationEntity> localization) {
		this.localization = localization;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getIdGame() {
		return idGame;
	}

	public void setIdGame(String idGame) {
		this.idGame = idGame;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public String getExpansion() {
		return expansion;
	}

	public void setExpansion(String expansion) {
		this.expansion = expansion;
	}

	public PriceGuideEntity getPriceGuide() {
		return priceGuide;
	}

	public void setPriceGuide(PriceGuideEntity priceGuide) {
		this.priceGuide = priceGuide;
	}

	public List<ReprintEntity> getReprint() {
		return reprint;
	}

	public void setReprint(List<ReprintEntity> reprint) {
		this.reprint = reprint;
	}

	public int getCountArticles() {
		return countArticles;
	}

	public void setCountArticles(int countArticles) {
		this.countArticles = countArticles;
	}

	public int getCountFoils() {
		return countFoils;
	}

	public void setCountFoils(int countFoils) {
		this.countFoils = countFoils;
	}

	public List<LinkEntity> getLinks() {
		return links;
	}

	public void setLinks(List<LinkEntity> links) {
		this.links = links;
	}

}
