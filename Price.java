package lab13;

public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public abstract int getFrequentRenterPoints(int datRented);
}
