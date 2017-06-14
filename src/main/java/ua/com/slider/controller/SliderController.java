package ua.com.slider.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.com.slider.dto.ValuesForRandomRangeDto;

@Controller
@RequestMapping(SliderController.URL)
public class SliderController {

    public static final String URL = "/";

    public static final String GET_RANDOM_NUMBER_URL = "/getNumber";

    @GetMapping
    public String getView() {
        return "index";
    }

    @ResponseBody
    @PostMapping(value = GET_RANDOM_NUMBER_URL, produces = "text/html")
    public ResponseEntity getNumber(@RequestBody ValuesForRandomRangeDto values) {
        Long rand = rand(values.getMinValue(), values.getMaxValue());
        return ResponseEntity.ok(rand.toString());
    }

    private long rand(int min, int max) {
        return Math.round(min - 0.5 + Math.random() * (max - min + 1));
    }
}

