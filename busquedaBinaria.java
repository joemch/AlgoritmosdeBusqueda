public class busquedaBinaria {    

    private int cmps;
    
    public busquedaBinaria() {
        this.cmps = 0;
    }
    
    public int busquedaIterativa(int[] arreglo, int key){
        this.cmps = 0;
        int ind_menor = 0;
        int ind_mayor = arreglo.length-1;
        int ind_medio = 0;
        while(ind_menor<=ind_mayor){
            
            ind_medio = (int) Math.floor((ind_mayor+ind_menor)/2);
            this.cmps++;
            if(key == arreglo[ind_medio]){
		          return ind_medio+1;
            }
            
            else {
                this.cmps++;    
                if(key < arreglo[ind_medio])
                		ind_mayor = ind_medio-1;
                else
                		ind_menor = ind_medio+1;
            }
            
        }//Fin while
        return -1;
    }//Fin busquedaIterativa

    public int busquedaRecursiva(int[] arreglo, int key){
        this.cmps = 0;      
        int ind_key = busquedaRecursiva(arreglo, 0, arreglo.length-1, key);
        return ind_key;
    }

    public int busquedaRecursiva(int[] arreglo, int ind_menor, int ind_mayor, int key){
        if(ind_menor <= ind_mayor){
            
            int ind_medio = (int) Math.floor((ind_mayor+ind_menor)/2);
            this.cmps++;
            if(key < arreglo[ind_medio])
		            return busquedaRecursiva( arreglo, ind_menor, ind_medio-1, key);
            else{
                this.cmps++;
                if(key > arreglo[ind_medio])
                    return busquedaRecursiva( arreglo, ind_medio+1, ind_mayor, key);
                else
                    return ind_medio+1;
            }
        }// Fin if
        
        return -1;
    }
    
    public int getCmps() {
        return cmps;
    }
    
}//Fin busquedaRecursiva
