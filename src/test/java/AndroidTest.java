import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class AndroidTest {
    private static final String[] androidNames = {"Blip","Slip","Flip","Clip"};
    private static Random rand = new Random();

    @Test
    void defaultConstructor(){
        Android android = new Android();
        assertEquals("C3PO:67.0",android.toString());
    }

    @Test
    void valueConstructor(){
        String name = androidNames[rand.nextInt(androidNames.length)];
        double height = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Android android = new Android(name,height);
        assertEquals(name+":"+height,android.toString());
    }

    @Test
    void getName() {
        String name = androidNames[rand.nextInt(androidNames.length)];
        Android android = new Android(name,80.5);
        assertEquals(name,android.getName());
    }

    @Test
    void getHeightInInches() {
        String name = androidNames[rand.nextInt(androidNames.length)];
        double height = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Android android = new Android(name,height);
        assertEquals(height, android.getHeightInInches());
    }

    @Test
    void getHeightInCentiMeters() {
        String name = androidNames[rand.nextInt(androidNames.length)];
        double height = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        Android android = new Android(name,height);
        assertEquals(height*2.54, android.getHeightInCentiMeters());
    }

    @Test
    void setName() {
        Android android = new Android();
        String name = androidNames[rand.nextInt(androidNames.length)];
        android.setName(name);
        assertEquals(name+":67.0",android.toString());
    }

    @Test
    void setHeight() {
        Android android = new Android();
        double height = ((int)((rand.nextInt()+rand.nextDouble())*100))/100.0;
        android.setHeight(height);
        assertEquals("C3PO:"+height,android.toString());
    }
}