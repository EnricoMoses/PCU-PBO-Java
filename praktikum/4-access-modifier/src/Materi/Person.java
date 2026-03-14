package Materi;

public class Person {
  private String name;
  public int age;
  public int height;

  public Person(String name, int age, int height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }
//
//  public Person(Person p) {
//    this.name = p.name;
//    this.age = p.age;
//    this.height = p.height;
//  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void print() {
    System.out.println(this.name + this.age + this.height );
  }
}
