public class ChestObj extends ChestTypes {
    int SIZE;
    String DESCRIPTION;
    String[] CONTENTS;


/*    Chest(String ...item) {
        this.SIZE = item.length;
        this.CONTENTS = new String[SIZE];
        for (int i = 0; i < item.length; i++) {
            this.CONTENTS[i] = item[i];
        }
        System.out.println(Arrays.toString(this.CONTENTS));
    }*/
    public int setSIZE(int size){
        this.SIZE = size;
        return size;
    }
    public int getSIZE(){
        return SIZE;
    }
    public String[] setCONTENTS(String[] contents){
        this.CONTENTS = contents;
        return contents;
    }
    public String[] getCONTENTS(){
        return CONTENTS;
    }
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
}
