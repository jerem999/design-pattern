import javax.swing.*;
import java.awt.*;

public class MarioTheme implements IThemeFactory {

    @Override
    public JButton createButton(String text) {
        //Instance
        return new MarioThemeButton(text);
    }
}