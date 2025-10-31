package v7;

public class Movie {

    ;
	
	private String _title;
	Price.Code _priceCode;
	
	public Movie(String title, Price.Code priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public String getTitle() {
		return _title;
	}

}
