public class Bonus {
    
    static int[] maximum(int[] tab){
        int max=0, pos=0;
        int[] tab_max = {max, pos};
        for(int i=0; i<tab.length; ++i){
            if(tab[i]>tab[i+1]){
                max = tab[i];
                pos=i;
            }
        }
        tab_max[1] = pos;
        tab_max[0] = max;
        return tab_max;
    }

    static int compteSup(int[] tab, int v){
        int occ=0;
        for(int i=0; i<tab.length; ++i){
            if(tab[i]> v){
                occ++;
            }
        }
        return occ;
    }

    static int recherche(int[] tab, int v){
        int i=0;
        while(i<tab.length){
            if(tab[i] == v){
                return i;
            }
            ++i;
        }
        return -1;
    }

    static boolean estTrie(int[] tab){
        int i=0;
        while(i<tab.length){
            if(tab[i]>tab[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }

    static int[] fusion(int[] tab1, int[] tab2){
        int[] tab3 = new int[tab1.length + tab2.length];
        int i;
        for(i=0; i<tab1.length; ++i){
            tab3[i] = tab1[i];
        }
        for(i=tab1.length; i<tab2.length; ++i){
            tab3[i] = tab2[i];
        }
        return tab3;
    }



}
