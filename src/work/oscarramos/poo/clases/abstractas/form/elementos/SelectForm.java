package work.oscarramos.poo.clases.abstractas.form.elementos;

import work.oscarramos.poo.clases.abstractas.form.elementos.estructures.Options;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{
    private List<Options> options;

    public SelectForm(String name) {
        super(name);
        this.options = new ArrayList<>();
    }

    public SelectForm(String name, List<Options> options) {
        super(name);
        this.options = options;
    }

    public SelectForm addOption(Options option){
        this.options.add(option);
        return this;
    }

    @Override
    public String writeHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name=\"")
                .append(this.name)
                .append("\">");
        options.forEach(option -> {
            sb.append("\n<option value=\"")
                    .append(option.getValue())
                    .append("\"");
            if (option.isSelected()) sb.append(" selected");
            sb.append(">")
                    .append(option.getName())
                    .append("</option>");
        });
        sb.append("</select>");

        return sb.toString();
    }
}
