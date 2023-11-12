public class TestPrb1 {
    TestPrb1(){
        System.out.println("Constructor TestPrb1(unde am main-ul)");
    }
    static void printAutomobil(Autovehicul a){
        if(a instanceof Sport){
            ((Sport) a).printSport();
        }
        else{
            ((Berlina) a).printBerlina();
        }
    }
    public static void main(String[] args) {
        // de adaugat gradul in metoda main
        Berlina b = new Berlina();
        b.tipAutomobil();
        b.printBerlina();

        System.out.println("- 1. -");
        Autovehicul s = new Sport(); // up-casting
        s.tipAutomobil(); // legare dinamica
        ((Sport)s).printSport();// ??? //down-casting

        System.out.println("- 2. -");
        Object m = new Sport(); //upcasting
        ((Autovehicul) m).tipAutomobil(); // ??? //down-casting

        TestPrb1.printAutomobil(b);
        TestPrb1.printAutomobil(s);
        TestPrb1.printAutomobil((Autovehicul) m);
    }
}

//Output:
        /*Constructor Autovehicul.
        Constructor Berlina.
        Aceasta este o masina Berlina.
        Volkswagen Passat
        - 1. -
        Constructor Autovehicul.
        Constructor Sport.
        Aceasta este o masina Sport.
        Mustangggg.
        - 2. -
        Constructor Autovehicul.
        Constrcutor Sport.
        Aceasta este o masina Sport.
        Volkswagen Passat
        Mustangggg.*/
        //Mustangggg.