package dojo

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import java.util.ArrayList

@RunWith(classOf[JUnitRunner])
class UserLookupTests extends FunSuite with ShouldMatchers{

  val users = new ArrayList[User]();
  
  users.add(new User(1,"tom", true, 25));
  users.add(new User(2,"helen", false, 15));
  users.add(new User(3,"paul", true, 34));
  users.add(new User(4,"john", true, 40));
  users.add(new User(5,"louise", false, 56));
  users.add(new User(6,"maggie", false, 21));

  val dataSource = new DataSource(users)
  
  test("should find users older than 34"){

    val expectedUsers = new ArrayList[User]()
    expectedUsers.add(new User(4,"john", true, 40))
    expectedUsers.add(new User(5,"louise", false, 56))

    val userLookup = new UserLookup(dataSource)
    userLookup olderThan (34) should equal (expectedUsers)

  }

  test("should return names of users under 26"){

    val expectedUsers = new ArrayList[String]();
    expectedUsers.add("tom")
    expectedUsers.add("helen")
    expectedUsers.add("maggie")

    val userLookup = new UserLookup(dataSource)
    userLookup namesYoungerThan (26) should equal (expectedUsers)

  }

  test("should find all female users"){

    val expectedUsers = new ArrayList[String]();
    expectedUsers.add("helen")
    expectedUsers.add("louise")
    expectedUsers.add("maggie")

    val userLookup = new UserLookup(dataSource)
    userLookup allFemale() should equal (expectedUsers)

  }
  
  test("return all eligible users"){

    val expectedUsers = new ArrayList[User]();
    expectedUsers.add(new User(4,"john", true, 40))

    val userLookup = new UserLookup(dataSource)
    userLookup allEligible() should equal (expectedUsers)
  }
}
