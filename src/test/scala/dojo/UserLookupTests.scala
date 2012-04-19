package dojo

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import com.google.common.collect.Lists.newArrayList
import com.google.common.base.Predicate

@RunWith(classOf[JUnitRunner])
class UserLookupTests extends FunSuite with ShouldMatchers{

  val tom = new User(1,"tom", true, 25)
  val helen = new User(2,"helen", false, 15)
  val paul = new User(3,"paul", true, 34)
  val john = new User(4,"john", true, 40)
  val louise = new User(5,"louise", false, 56)
  val maggie = new User(6,"maggie", false, 21)

  val dataSource = new DataSource(newArrayList(tom, helen, paul, john, louise, maggie))
  
  test("should return a predicate that wraps the function"){
    val hasId2:Predicate[User] = ImplicitJava funcToPred  ((u:User) => u.getId == 2)

    hasId2 apply helen should equal (true)
    hasId2 apply paul should equal (false)
  }
  
  test("should find users older than 34"){
    val expectedUsers = newArrayList(john, louise)
    val userLookup = new UserLookup(dataSource)
    
    userLookup olderThan 34 should equal (expectedUsers)
  }

  test("should return names of users under 26"){
    val expectedUsers = newArrayList("tom", "helen", "maggie")
    val userLookup = new UserLookup(dataSource)
    
    userLookup namesYoungerThan 26 should equal (expectedUsers)
  }

  test("should find all female users"){
    val expectedUsers = newArrayList("helen", "louise", "maggie")
    val userLookup = new UserLookup(dataSource)

    userLookup allFemale() should equal (expectedUsers)
  }
  
  test("should return all eligible users"){
    val expectedUsers = newArrayList(john);
    val userLookup = new UserLookup(dataSource)
    
    userLookup allEligible() should equal (expectedUsers)
  }
}
