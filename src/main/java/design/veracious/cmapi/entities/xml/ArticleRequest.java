package design.veracious.cmapi.entities.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "request")
public class ArticleRequest {

	@XmlElement(name = "article")
	private List<Article> articles;

	public ArticleRequest(List<Article> articles) {
		this.articles = articles;
	}

	public ArticleRequest() {

	}

	@XmlTransient
	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public void addArticle(Article article) {
		if (articles == null) {
			articles = new ArrayList<>();
		}
		articles.add(article);
	}

}
