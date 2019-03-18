package pl.oskarpolak.calorie.models;


import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Data
public class MacroForm {
    @Max(10000)
    @Min(0)
    private int weight;
    private String macroType;
    private LocalDate eatDate;
}
