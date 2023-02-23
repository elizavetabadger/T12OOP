import java.util.Iterator;

public class PlannerIterator implements Iterator<Task> {

    private int i = -1;
    private Planner tasks;

    public PlannerIterator(Planner tasks) {

        this.tasks = tasks;
    }

    @Override
    public boolean hasNext() {

        return i < tasks.getSize()-1;
    }

    @Override
    public Task next() {

        return tasks.getTask(++i);
    }

}