public class BonusMilesService {
    public int calculate( int cost ){

        int priceMiles = 20; // Стоимость одной мили

        int miles = cost / priceMiles;
        return miles;
    }
}
