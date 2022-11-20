package work.oscarramos.poo.clases.abstractas.form.validators;

abstract public class Validator {
    protected String msj;
    abstract public void setMsj(String msj);
    abstract public String getMsj();
    abstract  public boolean isValid(String value);
}
