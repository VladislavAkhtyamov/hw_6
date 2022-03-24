public abstract class Animals {

    private final int maxRun;
    private final int maxSwim;
    private String Name;

    public Animals(int maxRun, int maxSwim, String Name) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.Name = Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public abstract void Run(int DistRun);
    public abstract void Swim(int DistSwim);


}