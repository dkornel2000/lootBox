import java.util.stream.Stream;

public class Loots extends ChestTypes {

    public String getLoot(double avarageLootChance, double goodLootChance, double rareLootChance) {
        String[] averageLoot = {"Pear", "Banana", "Coconut", "Pomegranate", "Cherry", "Blueberry", "Currant", "Lemond", "Apple"};
        String[] goodLoot = {"Money", "Car", "Glasses", "AirPods", "Iphone", "Watch"};
        String[] rareLoot = {"Diamond", "Cocaine", "Airplane", "Spaceship", "Ship", "Pokemon"};

        double[] chances = {avarageLootChance, goodLootChance, rareLootChance};

        double highestChance = Stream.of(avarageLootChance, goodLootChance, rareLootChance)
                .max(Double::compareTo).orElse(0.0);

        double lowestChance = Stream.of(avarageLootChance, goodLootChance, rareLootChance)
                .min(Double::compareTo).orElse(0.0);

        double mediumChance = 0;

        for(byte i = 0; i < chances.length; i++){
            if (chances[i] != highestChance || chances[i] != lowestChance){
                mediumChance = chances[i];
            }
        }

        double chancesTotal = mediumChance+highestChance+lowestChance;

        double luckyNumber = Math.random()*chancesTotal;

        String reward = "";

        if(luckyNumber < lowestChance){
            int nthItem = (int) (rareLoot.length * Math.random());
            reward = rareLoot[nthItem];
        }else if(luckyNumber > mediumChance){
            int nthItem = (int) (goodLoot.length * Math.random());
            reward = goodLoot[nthItem];
        }else if(luckyNumber > highestChance){
            int nthItem = (int) (averageLoot.length * Math.random());
            reward = averageLoot[nthItem];
        }
        System.out.println(reward);
        return reward;
    }
}
