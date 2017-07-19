import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 18.07.2017.
 */
public class Company {
    List<Menager> menagerList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public Company() {
        for (Menager menager : menagerList) {
             for(Worker worker : menager.getWorkerList()){
                  for(Worker.Registry registry : worker.getRegistryList()){
                      System.out.println("Opis tasku: " + registry.getMessage());
                      System.out.println("Czas trwania: " + registry.getTaskTime());
                  }
             }
        }
    }

}
