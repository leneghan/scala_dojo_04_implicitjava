package dojo

import java.util.{ArrayList, List}
import dojo.ImplicitJava._
import collection.JavaConversions._

class UserLookup(dataSource :DataSource) extends JUserLookup {

  /*
     Once this is passing by using the predicate class
     can you do it in the Scala way by passing in a function?
     Is there a way to imlicit[ly] convert a function to a Predicate?
   */
  def olderThan(age :Int): List[User] = {
    dataSource.findUsers((user:User) => user.getAge > age)
  }

  
  /*
      Are there standard JavaConversions to make it easier to work with Java collections?
   */

  def namesYoungerThan(age: Int):List[String] =
    dataSource.findUsers((user:User) => user.getAge < age).
      map((user:User) => user.getName())

  def allFemale(): List[String] = {
    filterAndMap((user: User) => !user.isMale())
  }

  def filterAndMap(func : (User) => Boolean) =
  {
    dataSource.findUsers(func).map((user: User) => user.getName())
  }

  /**
   * filters on isEligible by use of the userToExtendedUserImplicit function
   */
  def allEligible() = dataSource.findUsers((user : User) => user.isEligible())

}
