package work.oscarramos.poo.clases.abstractas.form;

import work.oscarramos.poo.clases.abstractas.form.elementos.ElementForm;
import work.oscarramos.poo.clases.abstractas.form.elementos.InputForm;
import work.oscarramos.poo.clases.abstractas.form.elementos.SelectForm;
import work.oscarramos.poo.clases.abstractas.form.elementos.TextAreaForm;
import work.oscarramos.poo.clases.abstractas.form.elementos.estructures.Options;
import work.oscarramos.poo.clases.abstractas.form.validators.EmailValidator;
import work.oscarramos.poo.clases.abstractas.form.validators.LengthValidator;
import work.oscarramos.poo.clases.abstractas.form.validators.NotNullValidator;
import work.oscarramos.poo.clases.abstractas.form.validators.NumberValidator;
import work.oscarramos.poo.clases.abstractas.form.validators.RequiredValidator;

import java.util.Arrays;
import java.util.List;

public class ImplementForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidator(new RequiredValidator());

        InputForm password = new InputForm("passws","password");
        password.addValidator(new RequiredValidator())
                .addValidator(new LengthValidator(6, 12));

        InputForm email = new InputForm("email","email");
        email.addValidator(new RequiredValidator())
             .addValidator(new EmailValidator());

        InputForm age = new InputForm("age","number");
        age.addValidator(new NumberValidator())
           .addValidator(new RequiredValidator());

        TextAreaForm experience = new TextAreaForm("exp",5,9);

        SelectForm language = new SelectForm("language");

        language.addOption(new Options("2","Java"))
        .addOption(new Options("2","C"))
        .addOption(new Options("3","Cobol").setSelected())
        .addOption(new Options("4","SQL"))
        .addOption(new Options("5","PHP"));

        language.addValidator(new NotNullValidator());
        ElementForm helloText = new ElementForm("Saludo") {
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
        List<ElementForm> elementsForm = Arrays.asList(username,
                password,
                email,
                age,
                experience,
                language,
                helloText);

        elementsForm.forEach(element ->{
            System.out.println(element.writeHtml());
            System.out.println("<br>");
        });

        elementsForm.forEach(elemnt ->{
            if(!elemnt.isValid()){
                elemnt.getErrors().forEach(System.out::println);
            }
        });
    }
}
