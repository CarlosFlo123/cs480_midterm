import java.util.Random;

class Mouse {
    private String name;
    private int legs = 4;

    private int getRandomNum() {
        Random rand = new Random(); // instance of random class
        int upperbound = 5;
        return rand.nextInt(upperbound);
    }

    public Mouse(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isNormal() {
        return this.legs == 4;
    }

    public String toString() {
        return this.name + " mice has " + this.legs + " legs.";
    }

    public boolean equals(Object obj) { // override equals()
        Mouse tstMouse; 
        if (!(obj instanceof Mouse)) return false; 
        tstMouse = (Mouse) obj;        
        return (legs == tstMouse.legs && name.equals(tstMouse.name));
    }

    public void fight(){
        int randomNumber = getRandomNum();
        this.legs = randomNumber;
    }
}