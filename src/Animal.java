import javax.swing.*;

/**
 * Created by Oscar Norman <br>
 * Date: 2020-09-28   <br>
 * Time: 10:53   <br>
 * Project: Sprint 1 Inlämningsuppgift <br>
 */
public abstract class Animal implements IgetFoodInGrams {
    private double weight;
    private String name;
    private Food food;

    Animal() {}

    Animal(double weight, String name, Food food) {
        this.weight = weight;
        this.name = name;
        this.food = food;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void printAnimal() {
        JOptionPane.showMessageDialog(null, getName() + " ska äta "
                + foodInGrams() + " gram " + food.getFoodType() + ".");
    }
}
