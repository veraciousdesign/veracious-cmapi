package de.artality.cmapi.utils;

import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Implementations of useful PHP functions
 */
public class PHPUtils {
	/**
	 * copy from http_build_query() in php
	 * 
	 * @see https://www.php.net/manual/de/function.http-build-query.php
	 * 
	 * @param parameters Parameters
	 */
	public static final String buildQuery(Map<String, String> parameters) {
		return parameters.entrySet()
				.stream()
				.map(p -> PHPUtils.rawurlencode(p.getKey()) + "=" + PHPUtils.rawurlencode(p.getValue()))
				.reduce((p1, p2) -> p1 + "&" + p2)
				.orElse("");
	}

	/**
	 * copy from hash_hmac() in php using the "SHA1" algorithm
	 * 
	 * @see https://www.php.net/manual/en/function.hash-hmac.php
	 * 
	 * @param s          String
	 * @param signingKey Key
	 */
	public static final byte[] hmacSHA1(String s, String signingKey) {
		try {
			Mac mac = Mac.getInstance("HmacSHA1");
			SecretKeySpec secret = new SecretKeySpec(signingKey.getBytes(), mac.getAlgorithm());
			mac.init(secret);
			return mac.doFinal(s.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * copy of rawurlencode() in php
	 * 
	 * @see https://www.php.net/manual/en/function.rawurlencode.php
	 * 
	 * @param s String
	 */
	public static final String rawurlencode(String s) {
		try {
			return URLEncoder.encode(s.replaceAll(" ", "+"), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/***
	 * copy of time() in php
	 * 
	 * @see https://www.php.net/manual/de/function.time.php
	 */
	public static final long time() {
		return System.currentTimeMillis() / 1000;
	}

	/**
	 * copy from uniqid() in php
	 * 
	 * @see http://php.net/manual/en/function.uniqid.php
	 * 
	 * @param prefix       (default = "")
	 * @param more_entropy (default = false)
	 */
	public static final String uniqid(String prefix, boolean more_entropy) {

		long time = System.currentTimeMillis();
		String uniqid = "";

		if (!more_entropy) {
			uniqid = String.format("%s%08x%05x", prefix, time / 1000, time);
		} else {

			SecureRandom sec = new SecureRandom();
			byte[] sbuf = sec.generateSeed(8);
			ByteBuffer bb = ByteBuffer.wrap(sbuf);

			uniqid = String.format("%s%08x%05x", prefix, time / 1000, time);
			uniqid += "." + String.format("%.8s", "" + bb.getLong() * -1);
		}
		return uniqid;
	}

	/**
	 * copy from uniqid() in php uses more_entropy = false
	 * 
	 * @see http://php.net/manual/en/function.uniqid.php
	 * 
	 * @param prefix
	 */
	public static final String uniqid(String prefix) {
		return uniqid(prefix, false);
	}

	/**
	 * copy from uniqid() in php uses prefix = "" & more_entropy = false
	 * 
	 * @see http://php.net/manual/en/function.uniqid.php
	 */
	public static final String uniqid() {
		return uniqid("", false);
	}

}
