import java.util.Comparator;

public class TaskComparator implements Comparator <Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return o2.getPriorityCode()- o1.getPriorityCode();
    }
}