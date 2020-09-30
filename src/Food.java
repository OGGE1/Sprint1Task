/**
 * Created by Oscar Norman <br>
 * Date: 2020-09-29   <br>
 * Time: 13:01   <br>
 * Project: Sprint 1 Inlämningsuppgift <br>
 */
public enum Food {
        HUNDFODER ("hundfoder"),
        KATTFODER ("kattfoder"),
        ORMPELLETS ("ormpellets");

        private String foodType;
        Food(String foodType) {
                this.foodType = foodType;
        }

        public String getFoodType() {
                return this.foodType;
        }
}
