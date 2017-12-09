/**
 * Created by shuwn on 05/12/2017.
 */
public class Simulator {
    public static double consumption (Machine machine, int speed) {
        return speed* (machine.getHorsePower() + machine.getWeight());
    }
}
