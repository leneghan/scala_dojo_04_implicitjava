package dojo

import java.util.{ArrayList, List}

class UserLookup(dataSource :DataSource) extends JUserLookup {
  
  def olderThan(age :Int): List[User] = new ArrayList[User]()

  def namesYoungerThan(age: Int):List[String] = new ArrayList[String]()

  def allFemale(): List[String] = new ArrayList[String]()

  def allEligible() = new ArrayList[User]()

}
