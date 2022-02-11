package ru.mirea;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.time.LocalDate;

import ru.mirea.classes.Human;


public class App {
  private static final String INPUT_FILE = "/home/ezh1k/Documents/Java/prac-2/files/input.txt";

  public static void main(String[] args) {
    var people = createArray();

    // 3 февраля 1999
    var date = LocalDate.of(1999, 2, 3);

    var processed = people.stream()
      .map(person -> {
        return new Human(person.getAge(),
                         person.getFirstName(),
                         person.getLastName(),
                         person.getBirthDate(),
                         person.getWeight() - 5);
      })
      .filter(person -> person.getBirthDate().compareTo(date) < 0)
      .toArray(Human[]::new);

    System.out.print(processed[0].getLastName());
    for (int i = 1; i < processed.length; ++i) {
      System.out.print(" " + processed[i].getLastName());
    }
    System.out.println();
  }

  /**
   * Создаёт массив людей, данные которых считываются из файла
   */
  private static ArrayList<Human> createArray() {
    try (Scanner fin = new Scanner(new File(INPUT_FILE))) {
      var men = new ArrayList<Human>();

      while (fin.hasNextLine()) {
        String[] line = fin.nextLine().split(" ");

        // line[0] - возраст
        // line[1] - имя, line[2] - фамилия
        int age = Integer.parseInt(line[0]);

        // line[3] - дата рождения в формате dd.mm.yyyy
        String[] birthDate = line[3].split("\\.");

        int dayOfBirth = Integer.parseInt(birthDate[0]);
        int monthOfBirth = Integer.parseInt(birthDate[1]);
        int yearOfBirth = Integer.parseInt(birthDate[2]);

        // line[4] - вес
        int weight = Integer.parseInt(line[4]);
        Human man = new Human(age,
                              line[1],
                              line[2],
                              LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth),
                              weight);

        men.add(man);
      }

      return men;
    }
    catch (Exception exc) {
      exc.fillInStackTrace();
      exc.printStackTrace();
      return null;
    }
  }
}
