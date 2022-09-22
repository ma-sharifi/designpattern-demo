package com.example.ceationpatter.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.StandardException;

/**
 * @author Mahdi Sharifi
 * @since 9/22/22
 */

@Data
@AllArgsConstructor
public class Student {
   private String name;
   private int age;
   private float score;

   public static Student.StudentBuilder builder() {
      return new Student.StudentBuilder();
   }

   public static class StudentBuilder {
      private String name;
      private int age;
      private float score;

      StudentBuilder() {
      }

      public Student.StudentBuilder name(String name) {
         this.name = name;
         return this;
      }

      public Student.StudentBuilder age(int age) {
         this.age = age;
         return this;
      }

      public Student.StudentBuilder score(float score) {
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
