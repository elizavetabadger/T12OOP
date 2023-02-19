class Employee extends Person {

    String company;

    public Employee(String name, String company) {

        super(name);
        this.company = company;
    }

    public void work() {
        System.out.printf("%s works in %s \n", getName(), company);
    }
}
