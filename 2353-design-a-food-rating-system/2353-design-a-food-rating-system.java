class FoodRatings {
    class Food {
        String name;
        String cuisine;
        int rating;

        Food(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }
    }

    Map<String, Food> foodMap = new HashMap<>();
    Map<String, TreeSet<Food>> cuisineMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            Food food = new Food(foods[i], cuisines[i], ratings[i]);
            foodMap.put(foods[i], food);

            cuisineMap.computeIfAbsent(cuisines[i], k ->
                new TreeSet<>((a, b) -> {
                    if (a.rating != b.rating)
                        return b.rating - a.rating;
                    return a.name.compareTo(b.name);
                })
            ).add(food);
        }
    }
    
    public void changeRating(String food, int newRating) {
        Food food1 = foodMap.get(food);
        TreeSet<Food> set = cuisineMap.get(food1.cuisine);

        set.remove(food1);          
        food1.rating = newRating;
        set.add(food1); 
    }
    
    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).first().name;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */