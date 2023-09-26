public class Film {
    private String titre;
    private String real;
    private String[] listeActeurs;
    private String paysProd;
    private int anneeSortie;
    private int duree;
    static int nbFilm;

    Film(){
        Film.nbFilm++; 
    }

    Film(String titre, String real){
        this.titre = titre;
        this.real = real;
        Film.nbFilm++; 
       
    }

    Film(String titre, String real,int anneeSortie, int duree){
        this.anneeSortie = anneeSortie;
        this.titre = titre;
        this.real = real;
        this.duree = duree;
        Film.nbFilm++; 
    }

    Film(String titre, String real,String[] listeActeurs,String paysProd, int anneeSortie, int duree){
        this.titre = titre;
        this.real = real;
        this.listeActeurs = listeActeurs;
        this.paysProd = paysProd;
        this.anneeSortie = anneeSortie;
        this.duree = duree;
        Film.nbFilm++; 
    }
    
    public String getListe(){
        String s = " ";
        for(int i=0; i<this.listeActeurs.length; ++i){
            s+= ", " + this.listeActeurs[i];
        }
        return s;
    }
    

    public String toString(){
        String s = " Titre : " + getTitre()  +"\nRealisateur : " + getReal() + "\nActeurs principaux : " + getListe()+
        "\nPays : " + getPays() + "\nAnnée de sortie : " + getAnnee() + "\nDurée : " + getDuree();
        return s;
    }

    public String getTitre(){
        return this.titre;
    }

    public String getReal(){
        return this.real;
    }
    
    public String getPays(){
        return this.paysProd;
    }
    public int getAnnee(){
        return this.anneeSortie;
    }

    public int getDuree(){
        return this.duree;
    }

    public void setTitre(String titre){
        this.titre = titre;
    }

    public void setReal(String real){
        this.real = real;
    }
    
    public void setPays(String paysProd){
        this.paysProd = paysProd;
    }
    public void setAnnee(int anneeSortie){
        this.anneeSortie = anneeSortie;
    }

    public void setDuree(int duree){
        this.duree = duree;
    }

    public void setListe(String[] liste){
        for(int i=0; i<this.listeActeurs.length; ++i){
            this.listeActeurs[i] = liste[i];
        }
    }

    public boolean equals(Object o){
        if(o instanceof Film){
            Film f = (Film) o;
            if(f.getTitre() == this.getTitre()){
                if(f.getReal() == this.getReal()){
                    return true;
                }
            }
        }
        return false;
    }

    static void afficherNbFilms(){
        System.out.println(nbFilm);
    }


}
