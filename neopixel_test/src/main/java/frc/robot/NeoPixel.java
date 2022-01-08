package frc.robot;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.util.Color;


public class NeoPixel {
    public static int length = 100;
    public static AddressableLED led = new AddressableLED(0);
    public static AddressableLEDBuffer buffer = new AddressableLEDBuffer(length);


    public synchronized static void led_stuff() {
        led.setLength(length);
        buffer_setup();
        led.setData(buffer);

        led.start();
    }    
    public static void buffer_setup(){
       for(int i = 0; i < length; i++){
            buffer.setLED(i, Color.kGreen);
       }
    }
    public static void remove_buffer(){
        buffer = new AddressableLEDBuffer(1);
        led.setData(buffer);
    }
}
