public class App {
    public static void main(String[] args) {

        Livre livre1 = new Livre("Da Vince Code", "Dan Brown", "99587135", 10);

        System.out.println(livre1);

        System.out.println("------------------------");
        System.out.println("Emprunt 1");
        livre1.emprunter(5);
        System.out.println(livre1);

        System.out.println("------------------------");
        System.out.println("Emprunt 2");
        livre1.emprunter(-1);
        System.out.println(livre1);


    }
}
