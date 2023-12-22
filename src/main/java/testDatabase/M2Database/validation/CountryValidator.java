package testDatabase.M2Database.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Set;

public class CountryValidator implements ConstraintValidator<Country, String> {

    private static final Set<String> COUNTRY = Set.of("Russia", "Belarus", "Ukraina", "Gavai");
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return COUNTRY.contains(value);


    }
}
