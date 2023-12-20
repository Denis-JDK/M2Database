package testDatabase.M2Database.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FirstDto {

    private Integer id;
    private String name;
    private String country;
}
