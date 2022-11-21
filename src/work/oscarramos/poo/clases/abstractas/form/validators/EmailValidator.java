package work.oscarramos.poo.clases.abstractas.form.validators;

public class EmailValidator extends Validator{
   protected String msj = "El campo %s tiene un formato de correo no valido";
   private final static String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public void setMsj(String msj) {
        this.msj = msj;
    }

    @Override
    public String getMsj() {
        return msj;
    }

    @Override
    public boolean isValid(String value) {
        return value.matches(EMAIL_REGEX);
    }
}
