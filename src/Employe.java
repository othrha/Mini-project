public class Employe {

    private int Matricule;
    private String Nom;
    private String Prenom;
    private int Age;
    private double Salaire;

    public Employe(int Matricule, String Nom, String Prenom, int Age, double Salaire) {
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.Salaire = Salaire;
    }

    public int getMatricule() {
        return Matricule;
    }

    public void setMatricule(int matricule) {
        Matricule = matricule;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getSalaire() {
        return Salaire;
    }

    public void setSalaire(double salaire) {
        Salaire = salaire;
    }

    @Override
    public String toString() {
        return
                        "      - Le Matricule  = " + Matricule +'\n'+
                        "      - le Nom        = " + Nom + '\n' +
                        "      - le Prenom     = " + Prenom + '\n' +
                        "      - le Age        = " + Age +'\n' +
                        "      - le Salaire    = " + Salaire +'\n'
                ;
    }


    public static void menu (){

        System.out.println("                   Menu du programme                   ");
        System.out.println("1 - Ajouter un nouvel employé \t");
        System.out.println("2 - Modifier un employé \t");
        System.out.println("3 - Supprimer un employé \t");
        System.out.println("4 - Afficher un employé \t");
        System.out.println("5 - Afficher tous les employés  \t");
        System.out.println("6 - Calculer le nombre des employés ayant un salaire qui dépasse 10000. \t");
        System.out.println("7 - Afficher l’employé le plus âgé.\t");
        System.out.println("8 - Afficher l’employé le moins âgé.  \t");
        System.out.println("9 - Quitter \t");
        System.out.println("Donner votre choix :\s");

    }



}