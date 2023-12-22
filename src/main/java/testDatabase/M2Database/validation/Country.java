package testDatabase.M2Database.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import testDatabase.M2Database.model.FirstDto;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = CountryValidator.class)
public @interface Country {

    String message() default "Некорректная страна"; // ключ ValidationMessages.properties
    Class<?>[] groups() default {}; //группа проверки
    Class<? extends Payload>[] payload() default {}; //полезная нагрузка

}
