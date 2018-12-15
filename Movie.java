package lab13;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    Price _price;

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int datRented) {
        int frequentRenterPoints = 0;
        // add frequent renter points
        frequentRenterPoints ++;
        // add bonus for a two day new release rental
        if ((getPriceCode() == Movie.NEW_RELEASE)
                && datRented > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }

}

