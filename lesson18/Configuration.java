package lesson18;

import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private int mesaigunlimiti;
    private int mesaigunlukmaas;

    public Configuration() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);

            // Config dosyasından değerleri oku
            mesaigunlimiti = Integer.parseInt(prop.getProperty("mesaigunlimiti"));
            mesaigunlukmaas = Integer.parseInt(prop.getProperty("mesaigunlukmaas"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getMesaigunlimiti() {
        return mesaigunlimiti;
    }

    public int getMesaigunlukmaas() {
        return mesaigunlukmaas;
    }
}
