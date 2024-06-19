
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice(); 

// instanciando o objeto cachorro
        Dog dog = new Dog(); 
        dog.setName("Totozinho"); 
        dog.setBirthDate(new Date("12/03/2022")); 
        dog.setBreed("Pastor Alemao");

// aparecer na tela 
System.out.println("Meu cachorro chama-se: " + dog.getName());        
System.out.println("Meu " + dog.getName() + " nasceu em, " + dog.getBirthDate());        
System.out.println("Ele e da raca: " + dog.getBreed());        

// instanciando op objeto da classe cat
    Cat cat = new Cat(); 
    cat.setName("Snowbell"); 
    cat.setBirthDate(new Date("11/01/2021"));
    cat.setFurColor("White"); 

// aparecer na tela 
System.out.println("Meu gato chama-se: " + cat.getName());        
System.out.println("Meu " + cat.getName() + " nasceu em, " + cat.getBirthDate());        
System.out.println("A cor do meu gato e " + cat.getFurColor());   



    
    }

}
