class Student {
    private int age;
    private String name;
    private int ID;

    public Student(int a, String n, int id) {
        this.age = a;
        this.name = n;
        this.ID = id;
    }

    public Student(){

    }
    public int getage(){
        return  age;
    }
    public  String getname(){
        return name;
    }
    public int getID(){
        return ID;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int id) {
        this.ID = id;
    }
//    public String toString() {
//        return
//    }

}
