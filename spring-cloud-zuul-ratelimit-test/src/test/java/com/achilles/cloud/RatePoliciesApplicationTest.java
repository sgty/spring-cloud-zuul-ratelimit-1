package com.achilles.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.http.HttpMethod.GET;

/**
 * @author zhangtao
 * @date 2017/7/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RateLimitApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RatePoliciesApplicationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testRateLmit() {
        for (int i = 0; i < 10; i++) {
            final ResponseEntity<String> response = this.restTemplate.exchange("/serviceA", GET, null, String.class);

        }
    }
}
