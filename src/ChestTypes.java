public class ChestTypes {

    int SIZE;

    public void bronzeChest(){
        System.out.println("Meh, only a bronze? Well, maybe you will get lucky, lets see what you get!");

        message("open");

        pause(2000);

        ChestObj chestObj = new ChestObj();
        this.SIZE = chestObj.setSIZE(3);

        int sizeOfChest = this.SIZE;
        Loots loots = new Loots();
        for(int i = 0; i < sizeOfChest; i++ ){
            loots.getLoot(75,20,5);
        }
        message("end");
    }
    public void goldChest(){
        System.out.println("Wow, nice pick! You are about to open a gold chest, get ready!!");

        message("open");

        pause(2000);

        ChestObj chestObj = new ChestObj();
        this.SIZE = chestObj.setSIZE(4);

        int sizeOfChest = this.SIZE;
        Loots loots = new Loots();
        for(int i = 0; i < sizeOfChest; i++ ){
            loots.getLoot(60,30,10);
        }
        message("end");
    }
    public void diamondChest(){
        System.out.println("Wow, really? A diamond chest?! Everything or nothing!!");

        message("open");

        pause(2000);

        ChestObj chestObj = new ChestObj();
        this.SIZE = chestObj.setSIZE(5);

        int sizeOfChest = this.SIZE;
        Loots loots = new Loots();
        for(int i = 0; i < sizeOfChest; i++ ){
            loots.getLoot(30,45,25);
        }
        message("end");
    }
    public void pause(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-------------OPENNING IN PROGRESS-------------");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-------------THESE ARE YOUR REWARDS-------------");
    }
    public void message(String openOrEnd){
        ChestMessages message = new ChestMessages();
        switch (openOrEnd){
            case "open":
                message.openingMessages();
                break;
            case "end" :
                message.endMessages();
                break;
            default:
                break;
        }
    }
}
