package testDatabase.M2Database.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Builder;
import lombok.Data;
import testDatabase.M2Database.validation.Country;
import testDatabase.M2Database.validation.Create;
import testDatabase.M2Database.validation.Update;

@Builder
@Data
public class FirstDto {

    @Null(groups = Create.class ) ////при создании Get id не должен быть проверка валидации, а id один!! разделяем по groups
    @NotNull(groups = Update.class) //при обновлении Get id должен быть проверка валидации
    private Integer id;
    @NotBlank(message = "Not blanr fild name")
    private String name;
    @Country
    private String country;
}
