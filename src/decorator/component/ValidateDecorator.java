package decorator.component;

public class ValidateDecorator implements Validator {
    Validator validator;

    @Override
    public void description() {
        validator.description();
    }

    @Override
    public void validate() {
        validator.validate();
    }
}
