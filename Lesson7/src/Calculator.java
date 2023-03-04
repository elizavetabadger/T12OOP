import java.util. *;

class Calculator {

    MyOpFactory myOpFactory;

    public Calculator(MyOpFactory myOpFactory){

        this.myOpFactory = myOpFactory;
    }
    //  Обеспечивает цикл ввода аргументов и вида операции и вывод результата операции
    public void exec(){

        boolean nextStep = true;                //  Условие выхода из цикла
        boolean p = true;
        double buf = 0;
        Scanner in = new Scanner(System.in);    //  Объявление потока ввода
        do {
            //  Ввод превого аргумента
            double arg1;
            arg1 = buf;
            if(p){
                System.out.println("Введите первый аргумент");
                try{
                    if(!in.hasNextDouble()) {
                        throw new NumberFormatException();
                    } else
                        arg1 = in.nextDouble(); //  Ввод числа с клавиатуры
                }catch(NumberFormatException e){
                    System.out.println(e);
                    break;
                }
            }
            //  Ввод операции
            System.out.println("Выберите операцию:");
            System.out.print("0 - сумма\t");
            System.out.print("1 - разность\t");
            System.out.print("2 - уменожение\t");
            System.out.print("3 - деление");
            System.out.println();
            int operation = in.nextInt();

            //  Ввод второго агрумента
            System.out.println("Введите второй аргумент");
            double arg2 = in.nextDouble();

            //  Обработка операций над аргемунтами
            System.out.print("Результат равен:\t");
            Operation op = myOpFactory.getOpInstance(operation);
            if (op != null){
                System.out.println(op.exec(arg1, arg2));
                buf = (int) op.exec(arg1, arg2);
            }
            else System.out.println("Недопустимая операция.");

            System.out.println("Хотите использовать результат как первый аргумент ?");
            System.out.print("1 - Да\t");
            System.out.println("2 - Нет");
            int what = in.nextInt();
            if (what == 1){
                p = false;
                continue;
            }
            else p = true;

            // Проверка на выход из цикла
            System.out.println("Хотите продолжить?");
            System.out.print("1 - Продолжить\t");
            System.out.println("2 - Выйти");
            int whatDo = in.nextInt();
            if (whatDo == 2)
                nextStep = false;
        } while (nextStep);
    }
}