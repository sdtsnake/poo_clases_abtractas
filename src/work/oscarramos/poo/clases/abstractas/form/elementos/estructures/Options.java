package work.oscarramos.poo.clases.abstractas.form.elementos.estructures;

public class Options {
    private String value;
    private String name;
    private boolean selected;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Options(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public Options() {
    }
}
