package de.artality.cmapi.responses.base;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.artality.cmapi.entities.LinkEntity;

/**
 * Abstract implementation of the response interface that contains all the
 * common functionality of all possible responses.
 *
 * @param <T> type of the data the response returns
 */
public abstract class AbstractResponseImpl<T> implements Response<T> {

	protected T _data;
	protected List<LinkEntity> _links;

	@Override
	public T getData() {
		return _data;
	}

	/**
	 * sets the data of the response
	 * 
	 * @param data
	 */
	public void setData(T data) {
		this._data = data;
	}

	@Override
	public List<LinkEntity> getLinks() {
		return _links;
	}

	/**
	 * sets the links of the response
	 * 
	 * @param links
	 */
	public void setLinks(List<LinkEntity> links) {
		this._links = links;
	}

	@Override
	public String toString() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.writeValueAsString(this);
		} catch (IOException e) {
			return super.toString();
		}
	}

}
