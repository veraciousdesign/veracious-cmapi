package design.veracious.cmapi.utils;

import java.net.URI;

import org.apache.http.client.methods.HttpPost;

/**
 * Workaround for the DELETE requests since HttpDelete doesn't support payload.
 * 
 * @see org.apache.http.client.methods.HttpDelete
 */
public class HttpDelete extends HttpPost {

	public HttpDelete() {
		super();
	}

	public HttpDelete(String s) {
		super(s);
	}

	public HttpDelete(URI uri) {
		super(uri);
	}

	@Override
	public String getMethod() {
		return "DELETE";
	}

}
