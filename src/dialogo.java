import javax.swing.JOptionPane;
public class dialogo {
    public static void main(String[] args) {
        try {
            double peso=
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en KG"));
            double altura=
                    Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura  en m"));
            double imc=peso/(altura*altura);

            JOptionPane.showMessageDialog(null,"su ICM es de :"+imc);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ingrese bien los datos!!");
        }

    }

}
