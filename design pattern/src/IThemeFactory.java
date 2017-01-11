import javax.swing.JButton;
import java.awt.*;

public interface IThemeFactory {

    //Sting définit par JButton
    public JButton createButton(String text);
}