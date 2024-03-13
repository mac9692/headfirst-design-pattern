package decorator.component;

public class RequiredValueValidator implements Validator {
    @Override
    public void description() {
        System.out.println("필수 값 검증기");
    }

    @Override
    public void validate() {
        System.out.println("필수 값 검증");
    }
}
