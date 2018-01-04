package util;

/**
 * Created by jonnehirvi on 2018-01-04.
 */
public class Environment {

    public static final String BASE_URL = System.getProperty("baseUrl", "http://petstore.swagger.io/v2");
    public static final String API_KEY = System.getProperty("apiKey", "special-key");
}
