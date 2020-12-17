package design.veracious.cmapi.requests;

import java.util.ArrayList;
import java.util.List;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.entities.xml.Article;
import design.veracious.cmapi.entities.xml.ArticleRequest;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.StockGetResponse;

/**
 * Implementation of the request for the /stock endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Stock
 */
public class StockPostRequest extends AbstractRequestImpl<StockGetResponse> {

	List<Article> articles;
	
	public StockPostRequest(CMApi api) {
		super(StockGetResponse.class, api);
		this.articles = new ArrayList<>();
	}
	
	public void addArticle(Article article) {
		articles.add(article);
	}

	@Override
	public StockPostRequest submit() {
		String xml = createXML(new ArticleRequest(articles));
		api.request("POST", "/stock", xml);
		return this;
	}

}
