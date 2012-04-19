package dojo

import java.util.{ArrayList, List}

class UserLookup(dataSource :DataSource) {
  
  def olderThan(age :Int) = new ArrayList[Int]()

  def namesYoungerThan(age: Int):List[String] = new ArrayList[String]()

  def allFemale() = new ArrayList[User]()

  def allEligible() = new ArrayList[User]()

}
