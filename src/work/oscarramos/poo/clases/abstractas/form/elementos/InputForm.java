package work.oscarramos.poo.clases.abstractas.form.elementos;

public class InputForm extends ElementoForm {
    private String type = "text";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InputForm(String name) {
        super(name);
    }

    public InputForm(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public String writeHtml() {
        return "<input type=\""+this.type
                +"\" name=\""+this.name
                +"\" value=\""+this.value+"\">";
    }
}
