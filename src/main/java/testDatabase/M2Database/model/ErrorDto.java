package testDatabase.M2Database.model;

import lombok.*;

@Data
@Builder
public class ErrorDto {

    private String status;
    private String message;
}
