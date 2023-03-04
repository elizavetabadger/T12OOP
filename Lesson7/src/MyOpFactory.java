class MyOpFactory implements OperationFactory{

    int operationCode;
    private Operation operation;

    @Override
    //  Получает код операции, по которому создает соответствующий объект операции
    public Operation getOpInstance(int op) {
        this.operationCode = op;
        switch (operationCode){
            case 0:{
                operation = new OpSum();
                break;
            }
            case 1:{
                operation = new OpMinus();
                break;
            }
            case 2:{
                operation = new OpMultiply();
                break;
            }
            case 3:{
                operation = new OpDivision();
                break;
            }
            default:{
                operation = null;
            }
        }
        return operation;
    }
}