package de.artality.cmapi.responses;

import java.util.List;

import de.artality.cmapi.models.entities.LinkEntity;

/**
 * Basic abstraction of the responses that the cardmarket api returns.
 *
 * @param <T> type of the data the response returns
 */
public interface Response<T> {

	/**
	 * returns the data of the response
	 * 
	 * @return <b>T</b>
	 */
	public T getData();

	/**
	 * returns the links of the response
	 * 
	 * @return <b>List[LinkEntity]</b>
	 */
	public List<LinkEntity> getLinks();

}
