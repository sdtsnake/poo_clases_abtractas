package work.oscarramos.poo.clases.abstractas.form.validators;

public class NumberValidator extends Validator{
    protected String msj = "el campo %s debe ser un numero";

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
        try{
            Integer.parseInt(value);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
