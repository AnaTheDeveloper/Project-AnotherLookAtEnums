public enum Favourites {

    ANA("Pizza", DietRequirement.MEATEATER){
        @Override
        public void sayLeastFavouriteFood(){
            System.out.println("I hate brussels sprouts");
        }
        @Override
        public void sayDietRequirement(){
            ANA.getDietRequirement().myDiet();
        }
        @Override
        public void sayFavouriteFood(){
            System.out.println(ANA.getFavouriteFood());
        }
    },
    LUKE("KFC", DietRequirement.MEATEATER){
        @Override
        public void sayLeastFavouriteFood(){
            System.out.println("I hate cucumber");
        }
        @Override
        public void sayDietRequirement(){
            LUKE.getDietRequirement().myDiet();
        }
        @Override
        public void sayFavouriteFood(){
            System.out.println(LUKE.getFavouriteFood());
        }
    },
    LUCY("Chocolate", DietRequirement.VEGETARIAN){
        @Override
        public void sayLeastFavouriteFood(){
            System.out.println("I hate cucumber");
        }
        @Override
        public void sayDietRequirement(){
            LUCY.getDietRequirement().myDiet();
        }
        @Override
        public void sayFavouriteFood(){
            System.out.println(LUCY.getFavouriteFood());
        }
    };

    //Instance varibales
    private String favouriteFood;
    private DietRequirement dietRequirement;

    //Constructor

    Favourites(String favouriteFood, DietRequirement dietRequirement){
        this.favouriteFood = favouriteFood;
        this.dietRequirement = dietRequirement;
    }

    //Getters and Setters

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public DietRequirement getDietRequirement() {
        return dietRequirement;
    }
    //Abstract Methods

    public abstract void sayLeastFavouriteFood();
    public abstract void sayFavouriteFood();
    public abstract void sayDietRequirement();

    //Nested Enum
    public enum DietRequirement {
        VEGETARIAN {
            @Override
            public void myDiet(){
                System.out.println("I am a vegetarian!");
            }
        }, MEATEATER {
            @Override
            public void myDiet(){
                System.out.println("I eat meat!");
            }
        };
        public abstract void myDiet();
    }
















}
