public class ChestMessages extends ChestTypes {
    public void openingMessages(){
        System.out.println("---------------------------------------");
        String[] allMessages = {
                "What will you get, I can't wait to found out!",
                "It's so exciting, open it already!",
                "I feel like it's going to be your lucky day!",
                "Openning chests is the best, always gets me excited.",
                "Here we go!!!",
                "Win or lose? We'll soon see, get ready!"
        };
        System.out.println(allMessages[(int)(Math.random()*allMessages.length)]);
    }
    public void endMessages(){
        System.out.println("---------------------------------------");
        String[] allMessages = {
                "Could have gone better, maybe you should open another one.",
                "Awesome loot, I wish I could get something like that.",
                "We are just getting started baby, keep going!",
                "Gotta open em all!",
                "That loot is just sad.",
                "Are you really that unlucky?"
        };
        System.out.println(allMessages[(int)(Math.random()*allMessages.length)]);
    }
}
