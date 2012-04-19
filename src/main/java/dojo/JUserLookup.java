package dojo;

import java.util.List;

public interface JUserLookup {

    List<User> olderThan(int age);

    List<String> namesYoungerThan(int age);

    List<String> allFemale();

    List<User>  allEligible();

}