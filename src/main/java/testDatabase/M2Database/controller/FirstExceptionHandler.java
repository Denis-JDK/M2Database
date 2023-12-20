package testDatabase.M2Database.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import testDatabase.M2Database.exception.FirstNotFoundException;
import testDatabase.M2Database.model.ErrorDto;

@Slf4j
@RestControllerAdvice
public class FirstExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(FirstNotFoundException.class)
    public ErrorDto handleFirstNotFoundException(FirstNotFoundException e) {
        log.error("ERROR!", e);
        return ErrorDto.builder()
                .status(HttpStatus.NOT_FOUND.name())
                .message(e.getMessage())
                .build();
    }
}
