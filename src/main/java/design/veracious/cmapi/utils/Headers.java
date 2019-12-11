package design.veracious.cmapi.utils;

/**
 * A Collection of all the custom headers used by the API
 */
public abstract class Headers {

	/**
	 * Stores the amount of requests the API already recieved in the current day
	 */
	public static final String REQUEST_COUNT = "X-Request-Limit-Count";

	/**
	 * Stores the amount of requests the current user is able to submit in the
	 * current day
	 */
	public static final String REQUEST_MAX = "X-Request-Limit-Max";

}
