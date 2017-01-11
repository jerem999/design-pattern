import javax.swing.*;
import java.awt.*;

public class StarWarsTheme implements IThemeFactory {

    @Override
    public JButton createButton(String text) {
        //Instance
        return new StarWarsThemeButton(text);
    }
}