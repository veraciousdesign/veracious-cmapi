package design.veracious.cmapi.responses;

import java.util.List;

import design.veracious.cmapi.entities.ArticleEntity;
import design.veracious.cmapi.responses.base.AbstractResponseImpl;

/**
 * Implementation of the response for the /stock endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Stock
 */
public class StockGetResponse extends AbstractResponseImpl<List<ArticleEntity>> {

	public List<ArticleEntity> getArticle() {
		return getData();
	}

	public void setArticle(List<ArticleEntity> inserted) {
		setData(inserted);
	}

}
