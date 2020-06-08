

/**
 *
 * @author Sebastián Rojas Guzmán
 */
import javax.swing.JOptionPane;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        String nombre = JOptionPane.showInputDialog("Escriba su nombre");
        JOptionPane.showMessageDialog(null, nombre);
        
        int edad=28;
    
        //Fin del if
        if (edad>=18){
           JOptionPane.showMessageDialog(null, "Puede votar");
           
           if(edad>=30){
               JOptionPane.showMessageDialog(null, "Usted puede ser candidato a presidente");
           }//Fin del if anidado
        }//Fin del if
        
          int pregunta_mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número del mes"));
    
          diasdelmes(pregunta_mes);
          
          int preguntadiadelasemana = Integer.parseInt(JOptionPane.showInputDialog("Digite un día de la semana"));
          
          diasdelasemana(preguntadiadelasemana);
                  
    }//fin del metodo principal
    public static void diasdelmes(int mes){
     if(mes==1 || mes==3 || mes==5 || mes==7){
            JOptionPane.showMessageDialog(null, "Hay 31 días en el mes");
        }
        else if (mes==2){
        JOptionPane.showMessageDialog(null, "Normalmente tiene 28 días");
        }
        else if (mes==4 || mes==6 || mes==9 || mes==11){
        JOptionPane.showMessageDialog(null, "Hay 30 días en el mes");
        }
        else{
            JOptionPane.showMessageDialog(null, "El día es invalido");
        }
        
    }// Fin de metodo dias del mes
    
    public static void diasdelasemana(int d){
    if(d==1){
        JOptionPane.showMessageDialog(null,"El día elegido es domingo");
    }
    else if(d==2){
        JOptionPane.showMessageDialog(null, "El sía elegido es lunes");
    }
    else if(d==3){
        JOptionPane.showMessageDialog(null,"El dia elegido es martes");
    }
    else if(d==4){ 
        JOptionPane.showMessageDialog(null, "El día elegido es miercoles");
    }
    else if(d==5){
        JOptionPane.showMessageDialog(null, "El día elegido es jueves");
    }
    else if(d==6){
        JOptionPane.showMessageDialog(null, "El día elegido es viernes");
    }
    else if(d==7){
        JOptionPane.showMessageDialog(null, "el día elegido es sabado");
    }
    else{
        JOptionPane.showMessageDialog(null, "Día invalido");
    }
    }//Fin de metodo diasdelasemana
    
}// fin de la clase principal
