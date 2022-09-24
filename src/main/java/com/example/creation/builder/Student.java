package com.example.creation.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Mahdi Sharifi
 * @since 9/22/22
 */

@Data
@AllArgsConstructor
// Builder from lombok
public class Student {
   private String name;
   private int age;
   private float score;

   public static StudentBuilder builder() {
      return new StudentBuilder();
   }

   //Builder is a creational design pattern that lets you construct complex objects step by step.
   //The pattern allows you to produce different types and representations of an object using the same construction code.

   /**
    PROS:
    You can construct objects step-by-step, defer construction steps or run steps recursively.
    You can reuse the same construction code when building various representations of products.
    Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.

    CONS:
    The overall complexity of the code increases since the pattern requires creating multiple new classes.
    */
   public static class StudentBuilder {
      private String name;
      private int age;
      private float score;

      StudentBuilder() {
      }

      public StudentBuilder name(String name) {
         this.name = name;
         return this;
      }

      public StudentBuilder age(int age) {
         this.age = age;
         return this;
      }

      public StudentBuilder score(float score) {
         this.score = score;
         return this;
      }

      public Student build() {
         return new Student(this.name, this.age, this.score);
      }

      public String toString() {
         return "Student.StudentBuilder(name=" + this.name + ", age=" + this.age + ", score=" + this.score + ")";
      }
   }
}
