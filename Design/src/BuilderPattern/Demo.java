package BuilderPattern;

/**
 * 建造者模式
 */
public class Demo {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();

        System.out.println("123");

        Meal meal1 = mealBuilder.prepareVegMeal();
        meal1.showItems();
    }
}
