package lesson18;
import org.junit.Test;
import java.lang.module.Configuration;
import static org.junit.Assert.assertEquals;

public class MaasHesaplamaTest {
    String departman ="Muhasebe Departmanı";
    String personeladi ="Cemre Avci";
    int gunsayisi = 25;
    int gunlukmaas=1500;

    Configuration config = new Configuration();
    int mesaigunlimiti = config.getClass().getModifiers();
    int mesaigunlukmaas = config.getClass().getModifiers();

    MaasHesaplama maasHesaplama =new MaasHesaplama(departman, personeladi, gunsayisi, gunlukmaas, mesaigunlimiti, mesaigunlukmaas);

    int expectedMaas=37500;
    int calculateMaas=maasHesaplama.hesaplamaMaas();

}
