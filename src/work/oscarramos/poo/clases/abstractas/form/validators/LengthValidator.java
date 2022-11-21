package work.oscarramos.poo.clases.abstractas.form.validators;

import work.oscarramos.poo.clases.abstractas.form.ImplementForm;

public class LengthValidator extends Validator{
    protected String msj = "El campo %s debe tener un minimo %d caracteres y un maximo %d caracteres";
    private int min;
    protected int max = Integer.MAX_VALUE;

    public LengthValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public LengthValidator() {
    }

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
        this.msj = String.format(this.msj, this.min,this.max);
        if(value == null){
            return true;
        }

        int length = value.length();

        return (length >= min && length <= max);
    }
}
