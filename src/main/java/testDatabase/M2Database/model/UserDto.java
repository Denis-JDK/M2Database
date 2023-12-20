package testDatabase.M2Database.model;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class UserDto {

    private Integer id;
    private String names;
    private String email;
}
