package ua.com.slider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import ua.com.slider.controller.SliderController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(SliderController.class)
@AutoConfigureMockMvc
public class MvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnView() throws Exception {
        this.mockMvc.perform(get(SliderController.URL)).andDo(print()).andExpect(status().isOk())
                .andExpect(view().name("index"));
    }
}
