package design.veracious.cmapi.requests;

import java.util.ArrayList;
import java.util.List;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.entities.xml.Article;
import design.veracious.cmapi.entities.xml.ArticleRequest;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.requests.base.Request;
import design.veracious.cmapi.responses.StockChangeResponse;

/**
 * Implementation of the request for the /stock/increase & /stock/decrease
 * endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Stock_Quantity
 */
public class StockChangeRequest extends AbstractRequestImpl<StockChangeResponse> {

	private String dir = "increase";

	List<Article> articles;

	public StockChangeRequest(CMApi api) {
		super(StockChangeResponse.class, api);
		this.articles = new ArrayList<>();
	}

	public void setDirection(String dir) {
		this.dir = "decrease".equals(dir) ? "decrease" : "increase";
	}

	public void addArticle(Article article) {
		articles.add(article);
	}

	@Override
	public Request<StockChangeResponse> submit() {
		String xml = createXML(new ArticleRequest(articles));
		api.request("PUT", "/stock/" + dir, xml);
		return this;
	}

}
