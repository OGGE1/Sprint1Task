/**
 * Created by Oscar Norman <br>
 * Date: 2020-09-28   <br>
 * Time: 10:53   <br>
 * Project: Sprint 1 Inlämningsuppgift <br>
 */
public class Snake extends Animal {
    private Food food = Food.ORMPELLETS;

    Snake(double weight, String name, Food food) {
        super(weight, name, food);
    }

    @Override
    public double foodInGrams() {
        return 20;
    }
}
