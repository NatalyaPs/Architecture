import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.BronzeGenerator;
import Fabric.EmeraldGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.PlatinumGenerator;
import Fabric.RubyGenerator;
import Fabric.SapphireGenerator;
import Fabric.SilverGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        //  ЧТОБЫ СДЕЛАТЬ, Ч.Б. ВЫПАДАЛО МНОГО СЕРЕБРА, МЕНЬШЕ ЗОЛОТА И СОВСЕМ МАЛО АЛМАЗОВ, делаем нужное кол-во фабрик - это плюс фабричного метода

        List<ItemGenerator> listGenerator = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listGenerator.add(new GoldGenerator());
        }
        
        for (int i = 0; i < 20; i++) {
            listGenerator.add(new SilverGenerator());
        }
        
        for (int i = 0; i < 5; i++) {
            listGenerator.add(new GemGenerator());
        }
        
        for (int i = 0; i < 5; i++) {
            listGenerator.add(new PlatinumGenerator());
        }

        for (int i = 0; i < 40; i++) {
            listGenerator.add(new BronzeGenerator());
        }

        for (int i = 0; i < 5; i++) {
            listGenerator.add(new RubyGenerator());
        }

        for (int i = 0; i < 5; i++) {
            listGenerator.add(new EmeraldGenerator());
        }

        for (int i = 0; i < 5; i++) {
            listGenerator.add(new SapphireGenerator());
        }

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(95);
            // вызываем фабрику рандомно (95 фабрик: 10+20+5+5+40+5+5+5), а у нее метод openReward
            listGenerator.get(index).openReward();
        }
    }
}
