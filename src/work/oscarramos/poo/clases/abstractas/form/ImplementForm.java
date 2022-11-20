package work.oscarramos.poo.clases.abstractas.form;

import work.oscarramos.poo.clases.abstractas.form.elementos.ElementoForm;
import work.oscarramos.poo.clases.abstractas.form.elementos.InputForm;
import work.oscarramos.poo.clases.abstractas.form.elementos.SelectForm;
import work.oscarramos.poo.clases.abstractas.form.elementos.TextAreaForm;
import work.oscarramos.poo.clases.abstractas.form.elementos.estructures.Options;

import java.util.Arrays;
import java.util.List;

public class ImplementForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("passws","password");
        InputForm email = new InputForm("email","email");
        InputForm age = new InputForm("age","number");

        TextAreaForm experience = new TextAreaForm("exp",5,9);

        SelectForm language = new SelectForm("language");

        language.addOption(new Options("2","Java"))
        .addOption(new Options("2","C"))
        .addOption(new Options("3","Cobol").setSelected())
        .addOption(new Options("4","SQL"))
        .addOption(new Options("5","PHP"));
        ElementoForm helloText = new ElementoForm("Saludo") {
            @Override
            public String writeHtml() {
                return "<input disable name=\""+this.name+"\""
                        +" value=\""+this.value+"\">";
            }
        };

        helloText.setValue("Esta desahabilitado");
        username.setValue("snake");
        password.setValue("abc1234");
        email.setValue("oscar1940@gmail.com");
        age.setValue("39");
        experience.setValue("17 años perdiendo en tiempo en siesa.");
        List<ElementoForm> elementosForm = Arrays.asList(username,
                password,
                email,
                age,
                experience,
                language,
                helloText);

        elementosForm.forEach(element ->{
            System.out.println(element.writeHtml());
            System.out.println("<br>");
        });
    }
}
