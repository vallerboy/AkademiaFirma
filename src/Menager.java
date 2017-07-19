import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 18.07.2017.
 */
public class Menager extends  Employee {

    private List<Worker> workerList = new ArrayList<>();


    public Menager(String name) {
        super(name);
    }

    public void addEmployee(Worker employee){
        workerList.add(employee);
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }
}
