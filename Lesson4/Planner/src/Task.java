import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task implements Comparable<Task> {
    private String subject;
    private String writer;
    private final String addTime;
    private final String addDate;
    private int priority;
    private String deadline;
    private final int id;
    private static int count;

    static {
        count = 0;
    }

    public Task(String subject, String writer, int priority, String deadline) {
        this.subject = subject;
        this.writer = writer;
        this.addTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.addDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.priority = priority;
        this.deadline = deadline;
        this.id = ++count;
    }

    public Task(String subject) {
        this.addTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.addDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.subject = subject;
        this.writer = "неизвестный";
        this.priority = 0;
        this.deadline = "бессрочно";
        this.id = ++count;
    }

    public Task() {
        this.addTime = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm"));
        this.addDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        this.subject = "Задача " + (count);
        this.writer = "неизвестный";
        this.priority = 0;
        this.deadline = "бессрочно";
        this.id = ++count;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getAddTime() {
        return addTime;
    }

    public String getAddDate() {
        return addDate;
    }

    public String getDeadline() {
        return deadline;
    }

    public int getId() {
        return id;
    }

    public String getPriority() { //возвращает приоритет в зависимости от кода
        return switch (priority) {
            case 1 -> "низкий";
            case 2 -> "средний";
            case 3 -> "критический";
            default -> "без приоритета";
        };
    }

    public int getPriorityCode() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }


    @Override
    public String toString() {
        return "№" + getId() + ' ' + getSubject() +
                ", автор: " + getWriter() +
                ", время добавления: " + addTime +
                ", дата добавления: " + addDate +
                ", дедлайн: " + deadline +
                ", важность: " + getPriority();
    }

    @Override
    public int compareTo(Task o) {
        int compareId
                = o.getId();
        return this.id - compareId;
    }

    public void deadline(String nextLine) {
    }
}