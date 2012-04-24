package dojo

import java.util.{ArrayList, List}
import ImplicitJava._
import scala.collection.JavaConversions._

class UserLookup(dataSource :DataSource) extends JUserLookup {

  /*
     Once this is passing by using the predicate class
     can you do it in the Scala way by passing in a function?
     Is there a way to imlicit[ly] convert a function to a Predicate?
   */
  def olderThan(age :Int): List[User] = {
    dataSource
      .findUsers((user:User) => (user.getAge > age))
  }

  /*
      Are there standard JavaConversions to make it easier to work with Java collections?
   */
  def namesYoungerThan(age: Int):List[String] = {   null
    dataSource
      .findUsers((user:User) => (user.getAge < age))
      .map(item => item.getName)
  }

  def allFemale(): List[String] = {
    dataSource
      .findUsers((user:User) => (!user.isMale))
      .map(item => item.getName)
  }

  def allEligible() = {
    dataSource
      .findUsers((user:User) => user.isEligible)
  }

}
