package club.banyuan.person;

public class Person {

  private String name;
  private int age;
  private int count = 0;
  public int count2 = 0;
  public int count1 = 0;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.count++;
    this.count2++;
  }

  public Person(String name) {
    this.name = name;
    this.count++;
    this.count1++;
  }

  public Person() {
  }

  public int getCount(){
    return count;
  }

  public int getCount(String name, int age){
    Person(name, age);
    return count;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}