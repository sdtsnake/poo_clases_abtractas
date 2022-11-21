package work.oscarramos.poo.clases.abstractas.form.elementos;

public class TextAreaForm extends ElementForm {
    private int rows;
    private int cols;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public TextAreaForm(String name) {
        super(name);
    }

    public TextAreaForm(String name, int rows, int columns) {
        super(name);
        this.rows = rows;
        this.cols = columns;
    }

    @Override
    public String writeHtml() {
        return "<textarea name=\""+this.name
                +"\" cols=\""+this.cols
                +"\" rows=\""+this.rows
                +"\">"+this.value
                +"</textarea>";
    }
}
