import javax.sql.RowSetInternal;
import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.spi.XmlWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.util.Scanner;

public class User {

    private final Scanner scanner;
    private final Menu menu;
    private final Planner planner;
    private final Add add;
    protected static String xmlPath = "/Users/test/Documents/Программирование/ООП/Seminars/MyPlanner/src/Planner.xml";


    public User(Scanner scanner, Menu menu, Planner planner, Add add) {
        this.scanner = scanner;
        this.menu = menu;
        this.planner = planner;
        this.add = add;
    }

    public void start() {

        while (true) {
            switch (menu.selectFunction()) {
                case "1": // показать все задачи
                    planner.sort();
                    planner.showAll();
                    break;
                case "2": // найти задачу по теме
                    System.out.print("Введите тему задачи: ");
                    System.out.println(planner.getBySub(scanner.nextLine()));
                    break;
                case "3": // найти задачу по автору
                    System.out.print("Введите имя: ");
                    planner.totalSearch(scanner.nextLine());
                    break;
                case "4": // отсортировать задачи по приоритету
                    System.out.println("Сначала показаны задачи с наивысшим приоритетом : ");
                    planner.sortByPriority();
                    planner.showAll();
                    break;
                case "5": // добавить новую задачу
                    planner.add(add.makeNewTask());
                    break;
                case "0": // выход
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }

    public void saveFile() {
        PlannerIterator plannerIterator = new PlannerIterator(planner);
        while (true) {
                    SaveTask<Task> saved = new SaveTask<>(plannerIterator.next());
                    saved.setFormat(new XmlWriter() {
                        /**
                         * Writes the changes in this {@code RowSetWriter} object's
                         * rowset back to the data source from which it got its data.
                         *
                         * @param caller the {@code RowSet} object (1) that has implemented the
                         *               {@code RowSetInternal} interface, (2) with which this writer is
                         *               registered, and (3) that called this method internally
                         * @return {@code true} if the modified data was written; {@code false}
                         * if not, which will be the case if there is a conflict
                         * @throws SQLException if a database access error occurs
                         */
                        @Override
                        public boolean writeData(RowSetInternal caller) throws SQLException {
                            return false;
                        }

                        /**
                         * Writes the given <code>WebRowSet</code> object to the specified
                         * <code>java.io.Writer</code> output stream as an XML document.
                         * This document includes the rowset's data, metadata, and properties
                         * plus the appropriate XML tags.
                         * <p>
                         * The <code>caller</code> parameter must be a <code>WebRowSet</code>
                         * object whose <code>XmlWriter</code> field contains a reference to
                         * this <code>XmlWriter</code> object.
                         *
                         * @param caller the <code>WebRowSet</code> instance to be written,
                         *               for which this <code>XmlWriter</code> object is the writer
                         * @param writer the <code>java.io.Writer</code> object that serves
                         *               as the output stream for writing <code>caller</code> as
                         *               an XML document
                         * @throws SQLException if a database access error occurs or
                         *                      this <code>XmlWriter</code> object is not the writer
                         *                      for the given <code>WebRowSet</code> object
                         */
                        @Override
                        public void writeXML(WebRowSet caller, Writer writer) throws SQLException {

                        }
                    });
                    saved.setPath(xmlPath);
                }
    }
}