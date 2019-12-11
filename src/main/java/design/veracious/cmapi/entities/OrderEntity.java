package design.veracious.cmapi.entities;

import java.util.List;

public class OrderEntity {

	private int idOrder;

	private boolean isBuyer;

	private UserEntity seller;
	private UserEntity buyer;

	private boolean isPresale;
	private OrderStateEntity state;
	private EvaluationEntity evaluation;
	private String note;

	private ShippingMethodEntity shippingMethod;
	private AddressEntity shippingAddress;
	private String trackingNumber;

	private int articleCount;
	private List<ArticleEntity> article;

	private double articleValue;
	private double serviceFeeValue;
	private double totalValue;

	public OrderEntity() {
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public boolean isBuyer() {
		return isBuyer;
	}

	public void setBuyer(boolean isBuyer) {
		this.isBuyer = isBuyer;
	}

	public UserEntity getSeller() {
		return seller;
	}

	public void setSeller(UserEntity seller) {
		this.seller = seller;
	}

	public UserEntity getBuyer() {
		return buyer;
	}

	public void setBuyer(UserEntity buyer) {
		this.buyer = buyer;
	}

	public boolean isPresale() {
		return isPresale;
	}

	public void setPresale(boolean isPresale) {
		this.isPresale = isPresale;
	}

	public OrderStateEntity getState() {
		return state;
	}

	public void setState(OrderStateEntity state) {
		this.state = state;
	}

	public EvaluationEntity getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationEntity evaluation) {
		this.evaluation = evaluation;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public ShippingMethodEntity getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(ShippingMethodEntity shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public AddressEntity getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressEntity shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public int getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}

	public List<ArticleEntity> getArticle() {
		return article;
	}

	public void setArticle(List<ArticleEntity> article) {
		this.article = article;
	}

	public double getArticleValue() {
		return articleValue;
	}

	public void setArticleValue(double articleValue) {
		this.articleValue = articleValue;
	}

	public double getServiceFeeValue() {
		return serviceFeeValue;
	}

	public void setServiceFeeValue(double serviceFeeValue) {
		this.serviceFeeValue = serviceFeeValue;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

}
