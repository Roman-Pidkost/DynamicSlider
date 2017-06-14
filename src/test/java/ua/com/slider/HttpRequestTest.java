package ua.com.slider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.com.slider.controller.SliderController;
import ua.com.slider.dto.ValuesForRandomRangeDto;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturn() throws Exception {
        assertThat(this.restTemplate
                .postForObject("http://localhost:" + port + SliderController.GET_RANDOM_NUMBER_URL,
                                ValuesForRandomRangeDto.builder().minValue(0).maxValue(100).build(), HttpEntity.class)).isNotNull();
    }
}
