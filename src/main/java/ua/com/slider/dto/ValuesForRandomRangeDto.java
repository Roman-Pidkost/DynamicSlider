package ua.com.slider.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ValuesForRandomRangeDto {
    private int minValue;
    private int maxValue;
}
