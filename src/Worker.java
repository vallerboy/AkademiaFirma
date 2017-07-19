import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 18.07.2017.
 */
public class Worker extends Employee{

    private List<Registry> registryList = new ArrayList<>();

    public Worker(String name) {
        super(name);
    }

    public void addRegistry(int timeTask, String message){
        registryList.add(new Registry(timeTask, message));
    }

    public List<Registry> getRegistryList() {
        return registryList;
    }

    public class Registry{
        int taskTime;
        String message;

        public Registry(int taskTime, String message) {
            this.taskTime = taskTime;
            this.message = message;
        }

        public int getTaskTime() {
            return taskTime;
        }

        public void setTaskTime(int taskTime) {
            this.taskTime = taskTime;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
