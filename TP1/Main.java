import java.util.Scanner;

public class Main{


    public static int[] saisieTableau(int n){

        int[] tab = new int[n];
        Scanner entree = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.println("Veuillez entrer un entier : ");
            tab[i] = entree.nextInt();
        }
        entree.close();
        return tab;
    }
    
    public static int[] initTab(int n){
        int[] tab = new int[n];
        
        for(int i=0; i<n; ++i){
            tab[i]+=i*10;
        }
        return tab;

    }

    public static void afficherTab(int[] tab){

        for(int i = 0; i<tab.length; ++i){
            System.out.println("tab[" + i + "]" + " = " + tab[i]);
        }
    }

    public static int sommePair(int[] tab){
        int somme=0;
        for(int i=0; i<tab.length; ++i){
            if(tab[i]%2 == 0){
                somme+=tab[i];
            } 
        }
        return somme;
    
    

    }

    public static int[] echanger(int[] tab, int i, int j){
        int aux = tab[i];
        tab[i] = tab[j];
        tab[j] = aux;
        return tab;
    }

    public static void main(String[] args){
        Scanner entree = new Scanner(System.in);
        /* 
        Film f1 = new Film("Dickson Greeting", "William Kennedy Laurie", 1891, 2);
        Film f2 = new Film("Nigh is short, Walk on Girl", "Masaaki Yuasa");
        String Acteurs[] = {"Johnny Depp", "Leonardo Dicaprio", "Juliette Lewis"};
        Film f3 = new Film("What s Eating Gilbert Grape","Lasse Hallstrom",Acteurs,  "Etats-Unis", 1993, 118);
        Film f4 = new Film("Sonatine melodie mortelle", "Takeshi Kitano", 1995, 94);
        System.out.println(f3);
        */

        
        
        /* 
        System.out.println("Saisir une chaine de caractère :");
        String s = entree.nextLine();
        System.out.println("Saisir un entier : ");
        int a = entree.nextInt();
        
        
        System.out.println("voici la chaine de caractere : "+ s); 
        System.out.println("voici l'entier : "+ a);
        



        System.out.println("Veuillez saisir la taille du tableau : ");

        int taille = entree.nextInt();
        //int[] tab = saisieTableau(taille);


        int[] tab = initTab(taille);
        afficherTab(tab);
        System.out.println("Voici la somme des nombres pairs du tableau : " + sommePair(tab));
        tab = echanger(tab, 0, 3);
        afficherTab(tab);
        
        */
    }


   


}




