public class ShipDriver {
    public static void main(String[] args) {
        // Create array of ships
        Ship[] ships = new Ship[3];
        
        // Instantiate each type
        ships[0] = new Ship("Titanic", "1912");
        ships[1] = new CruiseShip("Royal Caribbean", "2020", 5000);
        ships[2] = new CargoShip("Maersk", "2018", 20000);
        
        // Loop and print
        for (int i = 0; i < ships.length; i++) {
            ships[i].print();
            System.out.println();
        }
    }
}