/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author catal
 */
public class LógicaCine {
    
         public int preciof1;
        public int preciof2;
        public int preciof3;
        public int preciof4;
        public int preciof5;
        public int preciof6;
        public int preciof7;
        public int preciof8;
        public int preciof9;
        public int preciof10;
        public int preciof11;
        public int preciof12;
        public int preciof13;
        public int preciof14;
        public int preciof15;
        
        int [] dispo=new int[450];
        int cantidadboletos=0;
        int [] venta = new int[450];
        int [] fila = new int[450];
        int [] columna = new int[450];
        int precio;
        int preciototal;
        

       
       public int precio(int fila[], int columna[], Integer preciof1, Integer preciof2, Integer preciof3, Integer preciof4, Integer preciof5, Integer preciof6,
                Integer preciof7, Integer preciof8, Integer preciof9, Integer preciof10, Integer preciof11, Integer preciof12, Integer preciof13,
                 Integer preciof14, Integer preciof15){ 
           precio = 0;
           for(int silla=1;silla<450;silla++){
               if (fila[silla] == 1)
                   precio = precio + preciof1;
               else if (fila[silla] == 2)
                   precio = precio + preciof2;
               else if (fila[silla] == 3)
                   precio = precio + preciof3;
               else if (fila[silla] == 4)
                   precio = precio + preciof4;
               else if (fila[silla] == 5)
                   precio = precio + preciof5;
               else if (fila[silla] == 6)
                   precio = precio + preciof6;
               else if (fila[silla] == 7)
                   precio = precio + preciof7;
               else if (fila[silla] == 8)
                   precio = precio + preciof8;
               else if (fila[silla] == 9)
                   precio = precio + preciof9;
               else if (fila[silla] == 10)
                   precio = precio + preciof10;
               else if (fila[silla] == 11)
                   precio = precio + preciof11;
               else if (fila[silla] == 12)
                   precio = precio + preciof12;
               else if (fila[silla] == 13)
                   precio = precio + preciof13;
               else if (fila[silla] == 14)
                   precio = precio + preciof14;
               else
                   precio = precio + preciof15;
               preciototal = precio + preciototal;
           }
           return precio;
           
           
    }
       
       public int preciototal(int fila[], int columna[], Integer preciof1, Integer preciof2, Integer preciof3, Integer preciof4, Integer preciof5, Integer preciof6,
                Integer preciof7, Integer preciof8, Integer preciof9, Integer preciof10, Integer preciof11, Integer preciof12, Integer preciof13,
                 Integer preciof14, Integer preciof15){ 
           precio = 0;
           for(int silla=1;silla<450;silla++){
               if (fila[silla] == 1)
                   precio = precio + preciof1;
               else if (fila[silla] == 2)
                   precio = precio + preciof2;
               else if (fila[silla] == 3)
                   precio = precio + preciof3;
               else if (fila[silla] == 4)
                   precio = precio + preciof4;
               else if (fila[silla] == 5)
                   precio = precio + preciof5;
               else if (fila[silla] == 6)
                   precio = precio + preciof6;
               else if (fila[silla] == 7)
                   precio = precio + preciof7;
               else if (fila[silla] == 8)
                   precio = precio + preciof8;
               else if (fila[silla] == 9)
                   precio = precio + preciof9;
               else if (fila[silla] == 10)
                   precio = precio + preciof10;
               else if (fila[silla] == 11)
                   precio = precio + preciof11;
               else if (fila[silla] == 12)
                   precio = precio + preciof12;
               else if (fila[silla] == 13)
                   precio = precio + preciof13;
               else if (fila[silla] == 14)
                   precio = precio + preciof14;
               else
                   precio = precio + preciof15;
               preciototal = precio + preciototal;
           }
           return preciototal;
           
           
    }
    
}


