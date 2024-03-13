package decorator.component;

public class OptionalValueValidator implements Validator {
    @Override
    public void description() {
        System.out.println("선택 값 검증기");
    }

    @Override
    public void validate() {
        System.out.println("선택 값 검증");
    }
}
