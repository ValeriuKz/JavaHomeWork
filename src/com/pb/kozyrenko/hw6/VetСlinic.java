package com.pb.kozyrenko.hw6;

public class VetСlinic {
        public static void main(String[] args) {
            Veterinarian veterinarian = new Veterinarian();
            Animal[] animals = new Animal[3];
            animals[0] = new Dog("Мясо", "Улица");
            animals[1] = new Cat("Рыбка", "Дом");
            animals[2] = new Horse("Овёс", "Конюшня");

            System.out.println("Следующие животные пойдет на прием к ветиринару:");
            for (Animal animal : animals) {
                veterinarian.treatAnimal(animal);

            }
        }
    }