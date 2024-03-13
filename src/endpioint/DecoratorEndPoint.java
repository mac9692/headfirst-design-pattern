package endpioint;

import decorator.component.EventValidator;
import decorator.component.OptionalValueValidator;
import decorator.component.RequiredValueValidator;
import decorator.component.Validator;

public class DecoratorEndPoint {
    public static void main(String[] args) {
        Validator requiredValueValidator = new RequiredValueValidator();
        requiredValueValidator = new EventValidator(requiredValueValidator);
        requiredValueValidator = new EventValidator(requiredValueValidator);
        requiredValueValidator.description();
        requiredValueValidator.validate();

        Validator optionalValidator = new OptionalValueValidator();
        optionalValidator = new EventValidator(optionalValidator);
        optionalValidator = new EventValidator(optionalValidator);
        optionalValidator = new EventValidator(optionalValidator);
        optionalValidator.description();
        optionalValidator.validate();
    }
}
