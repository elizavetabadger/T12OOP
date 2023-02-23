public interface Format {
    <T extends Task> String createString(T task);
}