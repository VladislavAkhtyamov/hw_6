import javax.lang.model.element.Name;

public class Cats extends Animals {

    public Cats(int maxRun, String Name) {
        super(maxRun, -1, Name);
    }
    public Cats(){
        this(200,"Имя");
    }

    @Override
    public void Run(int DistRun) {
        if (getMaxRun() <= DistRun){
            System.out.println("Кот пробежал " +DistRun);
        } else {
            System.out.println(String.format("Кот %s не пробежит, максимум %s",+ DistRun, getMaxRun()));
        }

    }

    @Override
    public void Swim(int DistSwim) {
        System.out.println("Котики не любят мочить лапки");
    }
}