import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    Main() {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog(5, "Sixten", Food.HUNDFODER));
        animalList.add(new Dog(10, "Dogge", Food.HUNDFODER));
        animalList.add(new Cat(5, "Venus", Food.KATTFODER));
        animalList.add(new Cat(3, "Ove", Food.KATTFODER));
        animalList.add(new Snake(1, "Hypno", Food.ORMPELLETS));

        run(animalList);
    }

    public void run(List<Animal> animalList) {
        while (true) {
            String input = JOptionPane.showInputDialog("Vilket djur?");
            boolean isInList = false;

            if (input == null)
                System.exit(0);

            input.trim();

            for (var e : animalList) {
                if (e.getName().equalsIgnoreCase(input)) {
                    isInList = true;
                    e.printAnimal();
                }
            }
            if (!isInList) {
                JOptionPane.showMessageDialog(null, "Detta djur finns ej, försök igen!");
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
