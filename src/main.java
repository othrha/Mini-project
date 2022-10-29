import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);
    static int choix;

    static ArrayList<Employe> ArrayListEmploye = new ArrayList<>();


    public static void ajouterEmploye() {

        System.out.print("Entrer le matricule :");
        int Matricule = sc.nextInt();
        System.out.print("Entrer le nom :");
        String Nom = sc.next();
        System.out.print("Enter le prenom :");
        String Prenom = sc.next();
        System.out.print("Entrer l'age :");
        int Age = sc.nextInt();
        System.out.print("Entre le salaire :");
        double Salaire = sc.nextDouble();
        Employe e = new Employe(Matricule, Nom, Prenom, Age, Salaire);
        ArrayListEmploye.add(e);

    }

    public static void modifierEmploye() {
            boolean modifier = false;
            int i = 0;
            int ind = 0;

            for (Employe e : ArrayListEmploye) {
                ++i;
                if (e.getMatricule() == i) {
                    System.out.println(" Le Matricule de Employe  = " + e.getMatricule() +'\n'+
                            "      - Le Nom        = " + e.getNom()+ '\n' +
                                    "      - Le Prenom     = " + e.getPrenom() + '\n' +
                                    "      - Le Age        = " + e.getAge() +'\n' +
                                    "      - Le Salaire    = " + e.getSalaire() +'\n');
                    modifier = true;
                    ind = i;

                }
            }
            if (modifier) {
                System.out.println("Modification :");
                System.out.print("Entrer le matricule :");
                int Matricule = sc.nextInt();
                System.out.print("Entrer le nom :");
                String Nom = sc.next();
                System.out.print("Enter le prenom :");
                String Prenom = sc.next();
                System.out.print("Entrer l'age :");
                int Age = sc.nextInt();
                System.out.print("Entre le salaire :");
                double Salaire = sc.nextDouble();
                Employe e = new Employe(Matricule, Nom, Prenom, Age, Salaire);
                ArrayListEmploye.set(ind, e);

            } else {
                System.out.println("Cet employe indisponible !");

            }
        }
        public static void Supprimer() {
            if (ArrayListEmploye.isEmpty()) {
                System.out.print("Il n'y a aucun employe ! ");
            } else {
                System.out.print("Donner le Matricule de l'employer pour  supprimer : ");
                int Matricule = sc.nextInt();

                for (int i = 0; i < ArrayListEmploye.size(); i++) {
                    if (Matricule == ArrayListEmploye.get(i).getMatricule()) {
                        System.out.print("le employe " + ArrayListEmploye.get(i).getNom() + " qui l'y a un Matricule " + ArrayListEmploye.get(i).getMatricule() + " est supprimer ");
                        ArrayListEmploye.remove(i);

                    }else{
                        System.out.println("Il n'a pas aucun  employe avec ce matricule");
                    }
                }
            }
        }


        public static void afficherunEmploye() {

            if (ArrayListEmploye.isEmpty()) {
                System.out.println("Il n'y a aucun employe !");
            } else {
                System.out.print("Entrer le matricule d'employe pour l'afficher :");
                int Matricule = sc.nextInt();
                for (Employe e : ArrayListEmploye) {
                    if (e.getMatricule() == Matricule) {
                        System.out.println("Le Employe :");
                        System.out.println(e);
                    }
                }

            }
        }
        public static void AfficherSalaire () {
            int nb = 0;
            if (ArrayListEmploye.isEmpty()) {
                System.out.print("Il n'y a aucun employe ! \n");

            } else {

                for (int i = 0; i < ArrayListEmploye.size(); i++) {
                    if (ArrayListEmploye.get(i).getSalaire() > 10000) {
                        nb += 1;
                        System.out.println("le Matricule : " + ArrayListEmploye.get(i).getMatricule());
                        System.out.println("le Salaire : " + ArrayListEmploye.get(i).getSalaire());
                    }

                }
                System.out.println("Le nombre des employés ayant un salaire qui dépasse 10000 est : " + nb + "\n");


            }
        }
        public static void AfficherPlusAge () {

            if (ArrayListEmploye.isEmpty()) {
                System.out.print("Il n'y a aucun employe !\n");

            } else {
                int ind = 25;
                for (int i = 0; i < ArrayListEmploye.size(); i++) {
                    if (ArrayListEmploye.get(i).getAge() > ind) {

                        ind = ArrayListEmploye.get(i).getAge();
                        System.out.println("l'employe   " + ArrayListEmploye.get(i).getNom() + " le Plus Age : " + ind + "ans");
                    }

                }


            }
        }
        public static void AfficherMoinsAge () {

            if (ArrayListEmploye.isEmpty()) {
                System.out.print("Il n'y a aucun employe ! \n");

            } else {
                int ind = 25;
                for (int i = 0; i < ArrayListEmploye.size(); ++i) {
                    if (ArrayListEmploye.get(i).getAge() < ind) {

                        ind = ArrayListEmploye.get(i).getAge();
                        System.out.println("l'employe   " + ArrayListEmploye.get(i).getNom() + " le Moins Age : " + ind + " ans");
                    }

                }


            }
        }
        public static void affichetousEmploye() {

            if (ArrayListEmploye.isEmpty()) {
                System.out.println("Il n'y a aucun employe !");
            } else {

                for (Employe e : ArrayListEmploye) {
                    System.out.println("Le Employe : ");
                    System.out.println(e);
                }
            }

        }


        public static void main(String[]  args){

            while (choix < 1 || choix > 9) {

                Employe.menu();
                choix = sc.nextInt();

                while (choix >= 1 && choix <= 9) {

                    switch (choix) {

                        case 1:

                            ajouterEmploye();
                            Employe.menu();
                            choix = sc.nextInt();
                            break;
                        case 2:

                            modifierEmploye();
                            Employe.menu();
                            choix = sc.nextInt();
                            break;
                        case 3:

                            Supprimer();
                            Employe.menu();
                            choix = sc.nextInt();
                            break;
                        case 4:

                            afficherunEmploye();
                            Employe.menu();
                            choix = sc.nextInt();
                            break;
                        case 5:

                            affichetousEmploye();
                            Employe.menu();
                            choix = sc.nextInt();
                            break;
                        case 6:

                            AfficherSalaire();
                            Employe.menu();
                            choix = sc.nextInt();
                            break;
                        case 7:

                            AfficherPlusAge();
                            Employe.menu();
                            choix = sc.nextInt();
                            break;
                        case 8:

                            AfficherMoinsAge();
                            Employe.menu();
                            choix = sc.nextInt();
                            break;
                        case 9:
                            return;
                        default:
                            System.out.println("choisi les choix entre 1 et 9");
                    }
                }

            }
        }


    }
