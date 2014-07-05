public class busquedaSecuencial {

    public busquedaSecuencial() {

    }
    
    public  int busquedaSecuencial(int []arreglo,int key){
   
        int posicion;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == key){
            posicion = i;
            return posicion+1;
            }
        }//Fin for
     return -1;
    }    
    
}
