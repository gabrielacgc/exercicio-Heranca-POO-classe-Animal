// HERANCA
// PALAVRA RESERVADA --> EXTENDS 
// O QUE É HERANÇA --> é a capacidade de uma subclasse de ter acesso as propriedades da superclasse(também chamada classe base) 
// relacionada a esta subclasse.
// permite que uma classe seja baseada em outra classe existente, conhecida como classe base ou superclasse. 
// A classe que herda os atributos e métodos da classe base é chamada de subclasse ou classe derivada.

import java.util.Date; 

public class Animal { 
    private String name; 
    private Date birthDate; 


// método da classe animal 
public void voice() { 
    System.out.println("o animal faz...");
}

// get - atributo name

    public String getName() {
        return name;
    }

// set - atributo name   

    public void setName(String name) {
        this.name = name;
    }

// get - atributo age

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

   



} // fim da classe animal 
