class Person {
    String name;
    public String address;
    protected int age;
    private String phone;

    /*начало блока инициализатора*/
    {
        name = "Noname";
        age = 1;
    }
    /*конец блока инициализатора*/

    public Person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
    public void displayName(){
        System.out.printf("Name: %s \n", name);
    }
    void displayAge(){
        System.out.printf("Age: %d \n", age);
    }
    private void displayAddress(){
        System.out.printf("Address: %s \n", address);
    }
    protected void displayPhone(){
        System.out.printf("Phone: %s \n", phone);
    }
}
