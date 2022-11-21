package work.oscarramos.poo.clases.abstractas.form.validators;

public class NotNullValidator extends Validator{
    protected String msj = "El campo %s no puede ser nulo";

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
        return (value != null);
    }
}
