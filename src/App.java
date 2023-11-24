import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.SilverGenerator;
import Fabric.BlessingGenerator;
import Fabric.CoinGenerator;
import Fabric.CopperGenerator;
import Fabric.DummyGenerator;
import Fabric.MedalGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        // ItemGenerator f1 = new GoldGenerator();
        // f1.openReward();

        List<ItemGenerator> generators = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            generators.add(new GoldGenerator());
        }
        for (int i = 0; i < 5; i++) {
            generators.add(new GemGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new SilverGenerator());
        }
        for (int i = 0; i < 10; i++) {
            generators.add(new BlessingGenerator());
        }
        for (int i = 0; i < 10; i++) {
            generators.add(new CoinGenerator());
        }
        for (int i = 0; i < 40; i++) {
            generators.add(new CopperGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new DummyGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new MedalGenerator());
        }

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 50; i++) {
            int index = random.nextInt(generators.size());
            generators.get(index).openReward();
        }

    }
}
