package ru.gb.lesson6;

import java.util.Objects;

public class Cat {

    // private недоступно никому
    // protected доступно внутри пакета + наследование
    // default доступно внутри пакета
    // public доступно всем

    public String name; // поле, содержащее имя кота
    public int appetite; // аппетит кота (столько он съедает за раз)
    public int satiety; // сытость от 0 до 10 (0 - голодный, 10 - сытый)

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    // getter
    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (satiety==10) {
            return;
        } else {
            increaseSatiety(plate.decreaseFood(appetite)/10);
        }
    }

    public void increaseSatiety(int food) {
        if (food > 0) {
            this.satiety += food;
        }
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "], " + " [" + satiety + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat anotherCat) {
//            Cat anotherCat = (Cat) obj; // cast
            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // if obj1.equals(obj2) => obj1.hashcode() == obj2.hashcode()

    //    // setter
//    public void setName(String catName) {
//        name = catName;
//    }


}