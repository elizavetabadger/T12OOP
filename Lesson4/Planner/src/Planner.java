import java.util.*;

public class Planner implements Iterable<Task> {
    private final List<Task> tasks;

    public Planner() {
        this.tasks = new ArrayList<>();
    }

    public static void launch() {
    }

    public void add(Task task) {
        this.tasks.add(task);
    }

    public int getSize() {
        return tasks.size();
    }

    public void showAll() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public Task getBySub(String subject) {  //поиск по названию задачи
        return tasks.stream()
                .filter(task -> task.getSubject().equals(subject))
                .findFirst()
                .orElse(null);
    }

    public Task getById(int id) {  //поиск по названию задачи
        return tasks.stream()
                .filter(task -> task.getId() == (id))
                .findFirst()
                .orElse(null);
    }

    public void totalSearch(String keyword) {
        int res = 0;
        System.out.println("Вы ищете задачи по слову: " + keyword);
        for (Task task : tasks) {
            String temp = task.toString();
            if (temp.toLowerCase().contains(keyword.toLowerCase())) {
                res++;
                System.out.println(temp);
            }
        }
        if (res == 0) {
            String myRes = String.format("Совпадений со словом %s нет", keyword);
            System.out.println(myRes);
        }
    }

    public void sort() {
        Collections.sort(tasks);
    }

    public void sortByPriority() {
        Comparator<Task> priorComp = new TaskComparator();
        tasks.sort(priorComp);
    }

    @Override
    public Iterator<Task> iterator() {
        return new PlannerIterator(this);
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }

}

