import javax.swing.JOptionPane;
public class dialogo {
    public static void main(String[] args) {
        double peso=
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en KG"));
        double altura=
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura  en m"));
        double imc=peso/(altura*altura);
        String mensaje=String.format("su ICM es de :",imc);
        JOptionPane.showMessageDialog(null,imc);
    }

}
