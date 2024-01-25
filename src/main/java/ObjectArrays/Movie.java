package ObjectArrays;

import java.util.Comparator;

public class Movie {
    private int yearReleased;
    private float rating;
    private float budget;
    private float collectionAmount;

    public Movie(int yearReleased, float rating, float budget, float collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public float getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(float collectionAmount) {
        this.collectionAmount = collectionAmount;
    }
    class MovieByRatingProfit implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            return Float.compare(movie1.getRating(), movie2.getRating());
        }

    }
    class YearReleasedRatingComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie movie1, Movie movie2) {
            // First, compare by yearReleased
            int yearReleasedComparison = Integer.compare(movie1.getYearReleased(), movie2.getYearReleased());

            // If years are the same, then compare by rating
            if (yearReleasedComparison == 0) {
                return Double.compare(movie1.getRating(), movie2.getRating());
            }

            return yearReleasedComparison;
        }
    }

}