package practice.client.Util;

import org.springframework.web.client.*;

import java.util.*;

public class RestUtil {
    static final RestTemplate restTemplate = new RestTemplate();
    public static <T> T getDTO(String url, Class<T> clazz) {
        return restTemplate.getForObject(url, clazz);
    }
}
