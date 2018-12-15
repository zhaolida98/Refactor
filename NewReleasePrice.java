package lab13;

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 0;
        result += daysRented * 3;
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int datRented){
        if (datRented > 1) return 2;
        return 1;
    }

}