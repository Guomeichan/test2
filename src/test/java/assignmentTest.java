import javafx.stage.Stage;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;
import java.io.*;


public class assignmentTest extends assignment{
    TextArea text;
    Stage primaryStage;
    @BeforeEach


    @Test
    public void openfunction1() throws IOException {
        assignment o = new assignment();
//        String encoding = "UTF-8";
//        File file = new File(o.openfunction(primaryStage).getName());
//        Long filelength = file.length();
//        byte[] filecontent = new byte[filelength.intValue()];
//        try {
//            FileInputStream in = new FileInputStream(file);
//            in.read(filecontent);
//            in.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(filecontent);
//        assertEquals(text.getText(),filecontent);

        assertEquals(o.openfunction(primaryStage),true);

    }

    @Test
    public void start1(){
        Stage stage = new Stage();
        start(stage);
    }

}
