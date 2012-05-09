package dojo

import java.util.{ArrayList, List}
import ImplicitJava._
import scala.collection.immutable.List._
import com.google.common.collect.Lists

class UserLookup(dataSource :DataSource) extends JUserLookup {

  /*
     Once this is passing by using the predicate class
     can you do it in the Scala way by passing in a function?
     Is there a way to imlicit[ly] convert a function to a Predicate?
   */
  def olderThan(age :Int): List[User] = dataSource.findUsers((u:User) => u.getAge() > age)

  /*
      Are there standard JavaConversions to make it easier to work with Java collections?
   */
  	def namesYoungerThan(age: Int):List[String] =  Lists.transform[User,String](dataSource.findUsers((u:User) => u.getAge() < age),(u:User) => u.getName())


  def allFemale(): List[String] = Lists.transform[User,String](dataSource.findUsers((u:User) => !u.isMale()),(u:User) => u.getName())

  def allEligible() = dataSource.findUsers((u:User) => u.getAge() > 35 && u.isMale())

}
