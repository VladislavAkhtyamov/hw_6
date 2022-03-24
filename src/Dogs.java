import javax.lang.model.element.Name;

public class Dogs extends Animals {


    public Dogs(int maxRun, int maxSwim, String Name) {
        super(maxRun, maxSwim, Name);
    }

    public Dogs() { this(500, 10, "Имя"); }


    @Override
    public void Run(int DistRun) {
        if (getMaxRun() <= DistRun){
            System.out.println("Собака пробежала " +DistRun);
        } else {
            System.out.println(String.format("Собака не пробежит %s, максимум %s",+ DistRun, getMaxRun()));
        }

    }

    @Override
    public void Swim(int DistSwim) {
        if (getMaxSwim() <= DistSwim){
            System.out.println("Собака проплыла " +DistSwim);
        } else {
            System.out.println(String.format("Собака не проплывет %s, максимум %s",+ DistSwim, getMaxSwim()));
        }
    }
}