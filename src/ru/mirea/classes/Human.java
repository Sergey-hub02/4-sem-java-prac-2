package ru.mirea.classes;
import java.time.LocalDate;


public class Human {
  private int age;
  private String firstName;
  private String lastName;
  private LocalDate birthDate;
  private int weight;

  /**
   * Конструктор, создающий объект со всеми полями
   * @param age                 возраст
   * @param firstName           имя
   * @param lastName            фамилия
   * @param birthDate           дата рождения
   * @param weight              вес
   */
  public Human(int age,
               String firstName,
               String lastName,
               LocalDate birthDate,
               int weight) {
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.weight = weight;
  }

  /**
   * Геттер для поля age
   * @return        возраст
   */
  public int getAge() {
    return this.age;
  }

  /**
   * Сеттер для поля age
   * @param age         новый возраст
   */
  public void setAge(int age) {
    this.age = age;
  }

  /**
   * Геттер для поля firstName
   * @return        имя
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Сеттер для поля firstName
   * @param firstName         новое имя
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Геттер для поля lastName
   * @return      фамилия
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Сеттер для поля lastName
   * @param lastName      новая фамилия
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Геттер для поля birthDate
   * @return        дата рождения
   */
  public LocalDate getBirthDate() {
    return this.birthDate;
  }

  /**
   * Сеттер для поля birthDate
   * @param birthDate         новая дата рождения
   */
  public void setLocalDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  /**
   * Геттер для поля weight
   * @return          вес
   */
  public int getWeight() {
    return this.weight;
  }

  /**
   * Сеттер для поля weight
   * @param weight        новый вес
   */
  public void setWeight(int weight) {
    this.weight = weight;
  }

  /**
   * Возвращает значения всех полей объекта
   */
  @Override
  public String toString() {
    return (
      "Human {\n"
      + "  age: " + this.age + "\n"
      + "  firstName: " + this.firstName + "\n"
      + "  lastName: " + this.lastName + "\n"
      + "  birthDate: " + this.birthDate.toString() + "\n"
      + "  weight: " + this.weight + "\n"
      + "}\n"
    );
  }
}
