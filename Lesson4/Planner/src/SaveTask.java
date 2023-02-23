import javax.sql.rowset.spi.XmlWriter;

public class SaveTask<T  extends Task> {
    Format format;
    String text;
    String path;
    T task;
    public SaveTask(T task) {
        this.task = task;
    }

    public void setFormat(XmlWriter format) {
        this.format = (Format) (Format) format;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
