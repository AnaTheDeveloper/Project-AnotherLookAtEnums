public class Main {

    public static void main(String[] args) {

        Favourites.ANA.sayDietRequirement();
        Favourites.LUKE.sayDietRequirement();
        Favourites.LUCY.sayDietRequirement();

        System.out.println("--------------------");

        Favourites.ANA.sayLeastFavouriteFood();
        Favourites.LUKE.sayLeastFavouriteFood();
        Favourites.LUCY.sayLeastFavouriteFood();

        System.out.println("--------------------");

        Favourites.ANA.sayFavouriteFood();
        Favourites.LUKE.sayFavouriteFood();
        Favourites.LUCY.sayFavouriteFood();

    }
}
