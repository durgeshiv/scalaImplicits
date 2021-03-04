package com.durgeshSoftware.scalaImplicits


/**
 *
 * Written by Durgesh Agnihotri
 */

object ImplicitsIntro extends App {

  // Scala “implicits” allow you to omit calling methods or
  // referencing variables directly but instead rely on the compiler
  // to make the connections for you. For example, you could write a
  // function to convert from and Int to a String and rather than call
  // that function explicitly, you can ask the compiler to do it for you, implicitly.

  // An implicit does magical conversion from one type to another in certain scope.
  // Lets see a quick example.

  //Lets define a case class
  case class Person(name: String){
    def  greet = s"Hi $name, Welcome !!"
  }

  //Now lets define a method to convert string to Person type
  def stringtoPerson(str: String) : Person = Person(str)

  // In order to convert string to Person, we'll need to call method, normally as below ::
  stringtoPerson("durgesh").greet



  // Again letsdefine same conversion as above with little touch of implicits
  implicit def stringToPersonAnother(str2: String): Person = Person(str2)

  // in order to call greet method, object need to be of person type,
  // any string natively cannot implement that method.

  // try calling greet method over a string
  println("durgesh".greet) // this is made possible because



}
