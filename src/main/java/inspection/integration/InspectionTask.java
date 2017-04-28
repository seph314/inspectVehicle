package inspection.integration;

/**
 * Created by Anders on 2017-04-26.
 *
 */
public class InspectionTask {

    private String name;
    private int i = 1;

    /**
     * Creates new instance representing the specified control.
     * @param name The name of this control.
     *
     */
    InspectionTask(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    int getI() {
        return i;
    }
}