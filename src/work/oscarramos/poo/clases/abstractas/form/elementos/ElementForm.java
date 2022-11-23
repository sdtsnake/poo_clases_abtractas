package work.oscarramos.poo.clases.abstractas.form.elementos;


import work.oscarramos.poo.clases.abstractas.form.validators.Validator;
import work.oscarramos.poo.clases.abstractas.form.validators.message.MesaageFormat;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementForm {
    protected String value;
    protected String name;
    private List<Validator> validators;
    private List<String> errors;
    public ElementForm() {
        this.validators = new ArrayList<>();
        this.errors =new ArrayList<>();
    }
    public ElementForm(String name) {
        this();
        this.name = name;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public ElementForm addValidator(Validator validator){
        this.validators.add(validator);
        return this;
    }
    public List<String> getErrors() {
        return errors;
    }

    public boolean isValid(){
         for(Validator val: validators){
            if(!val.isValid(this.value)){
                if(val instanceof MesaageFormat) {
                    this.errors.add(((MesaageFormat) val).getMesaageFormat(value));
                }
                else{
                    this.errors.add(String.format(val.getMsj(), name));
                }

            }

         }
        return this.errors.isEmpty();
    }
    abstract public String writeHtml();
}
