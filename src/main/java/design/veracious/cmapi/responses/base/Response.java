package design.veracious.cmapi.responses.base;

import java.util.List;

import design.veracious.cmapi.entities.LinkEntity;

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
