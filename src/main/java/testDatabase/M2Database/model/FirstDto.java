package testDatabase.M2Database.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Builder;
import lombok.Data;
import testDatabase.M2Database.validation.Country;

@Builder
@Data
public class FirstDto {

    @Null
    private Integer id;
    @NotBlank(message = "Not blanr fild name")
    private String name;
    @Country
    private String country;
}
