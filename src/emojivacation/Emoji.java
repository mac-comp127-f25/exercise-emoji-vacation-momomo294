package emojivacation;
import edu.macalester.graphics.*;
import java.awt.Color;

@SuppressWarnings("WeakerAccess") 
public class Emoji {
    private static final Color
        HEAD_COLOR = new Color(0xFFDE30),
        HEAD_OUTLINE_COLOR = new Color(0xAC9620),
        MOUTH_COLOR = new Color(0xE45B5B),
        EYE_COLOR = new Color(0xAC9620);

    public static GraphicsGroup createSmileyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Ellipse eye = createEye(size * .1, size * .1);
        eye.setCenter(size * 0.35, size * 0.35);
        group.add(eye);

        Ellipse eye2 = createEye(size * .1, size * .1);
        eye2.setCenter(size * 0.65, size * 0.35);
        group.add(eye2);

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }

    public static GraphicsGroup createWinkingFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Ellipse eye = createEye(size * .1, size * .1);
        eye.setCenter(size * 0.35, size * 0.35);
        group.add(eye);

        Line winkingEye = createWink(size * .1, size * .1);
        winkingEye.setCenter(size * 0.65, size * 0.35);
        group.add(winkingEye);

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }
    
    private static Ellipse createHead(double height, double width) {
        Ellipse head = new Ellipse(0, 0, width, height);
        head.setFillColor(HEAD_COLOR);
        head.setStrokeColor(HEAD_OUTLINE_COLOR);
        head.setStrokeWidth(2);
        return head;
    }

    private static Arc createSmile(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 200, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }

    private static Ellipse createEye(double height, double width) {
        Ellipse eye = new Ellipse(0, 0, width, height);
        eye.setFillColor(EYE_COLOR);
        eye.setStrokeWidth(4);
        return eye;
    }

    private static Line createWink(double height, double width) {
        Line eye = new Line(20,30,40,30);
        eye.setStrokeColor(EYE_COLOR);
        eye.setStrokeWidth(4);
        return eye;
    }
}
