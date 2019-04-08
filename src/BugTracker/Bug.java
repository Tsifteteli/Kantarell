/*
SI-pass Java II
 */
package BugTracker;

import BugTracker.Enum.BugSeverity;
import BugTracker.Enum.BugPriority;
import BugTracker.Enum.BugStatus;
import java.util.ArrayList;

/**
 *
 * @author Caroline
 */
public class Bug {
   private int bugId; 
   private String bugTitle;
   private String description;
   private String stepsToReproduce;
   private BugPriority priority;
   private BugSeverity severity;
   private BugStatus status;
   private User assignedUser;
   private ArrayList<BugComment> comments = new ArrayList<>();
}
