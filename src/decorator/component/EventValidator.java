package decorator.component;

public class EventValidator extends ValidateDecorator {

    public EventValidator(Validator validator) {
        this.validator = validator;
    }

    public void description() {
        validator.description();
        System.out.println("이벤트 검증기");
    }

    public void validate() {
        validator.validate();
        System.out.println("이벤트 검증");
    }
}
