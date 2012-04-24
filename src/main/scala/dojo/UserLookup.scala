package dojo

import java.util.{ArrayList, List}

class UserLookup(dataSource :DataSource) extends JUserLookup {

  /*
     Once this is passing by using the predicate class
     can you do it in the Scala way by passing in a function?
     Is there a way to imlicit[ly] convert a function to a Predicate?
   */
  def olderThan(age :Int): List[User] = new ArrayList[User]()

  /*
      Are there standard JavaConversions to make it easier to work with Java collections?
   */

  def namesYoungerThan(age: Int):List[String] =
    dataSource.findUsers((user:User) => user.getAge < age).
      map((user:User) => user.getName())

  def allFemale(): List[String] = {
    dataSource.findUsers((user: User) => !user.isMale()).
      map((user: User) => user.getName())
  }

  def allEligible() = new ArrayList[User]()

}
