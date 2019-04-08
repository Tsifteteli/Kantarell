/*
SI-pass Java II
 */
package BugTracker;

import BugTracker.Enum.UserDesignation;

/**
 *
 * @author Caroline
 */
public class User {
   private String firstName;
   private String lastName;
   private UserDesignation designation;
   
   public User(String firstName, String lastName, UserDesignation designation){
      this.firstName = firstName;
      this.lastName = lastName;
      this.designation = designation;
   }
   
   //setters och getters för samtliga instansvariabler.
}
