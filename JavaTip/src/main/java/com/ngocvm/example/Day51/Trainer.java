package com.ngocvm.example.Day51;

public class Trainer {
    public void teach(Animal animal) {
        animal.move();
        animal.eat();
        animal.sleep();
    }

    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        Snake snake = new Snake();

        trainer.teach(dog);
        trainer.teach(bird);
        trainer.teach(fish);
        trainer.teach(snake);
    }
}
