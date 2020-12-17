package design.veracious.cmapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticleEditEntity {

	private boolean success;

	private ArticleEntity idArticle;

	private ArticleEntity tried;
	private String error;

	public ArticleEditEntity() {

	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ArticleEntity getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(ArticleEntity idArticle) {
		this.idArticle = idArticle;
	}

	public ArticleEntity getTried() {
		return tried;
	}

	public void setTried(ArticleEntity tried) {
		this.tried = tried;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
