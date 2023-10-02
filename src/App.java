public class App {
    public static void main(String[] args) {

        Livre livre1 = new Livre("Da Vince Code", "Dan Brown", "99587135", -1);
        livre1.emprunter(2);
        System.out.println(livre1);
    }
}
