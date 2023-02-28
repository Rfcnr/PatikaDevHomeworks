public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Boxing Match
            The boxing match simulation.
            Note: There is no exception checking.
         */

        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 15);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 25);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}