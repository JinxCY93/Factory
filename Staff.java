
import java.util.*;

import sun.jvm.hotspot.runtime.StackFrameInfo;

public class Staff {
  private String staffName;
  private String department;
  private Integer staffLevels;

  Staff(String staffName, String department, int staffLevels) {
    this.staffName = staffName;
    this.department = department;
    this.staffLevels = staffLevels;
  }

  public String toString() {
    return "Name : " + staffName + ", Department : " + department + ", StaffLevels : " + staffLevels;
  }

  // operation part
  // public void operation(int staffLevels) {
  // if (staffLevels == 1) {
  // this.staffName = "Lucas";
  // this.department = "Quantity Control";
  // String message = this.staffName + " from " + this.department
  // + " department is working on the materials procurement....";
  // System.out.println(message);
  // }
  // if (staffLevels == 2) {
  // this.staffName = "Dave";
  // this.department = "Operator";
  // String message = this.staffName + " from " + this.department + " department
  // is creating a bicycle";
  // System.out.println(message);
  // }
  // if (staffLevels == 3) {
  // this.staffName = "John";
  // this.department = "Quality Control";
  // String message = this.staffName + " from " + this.department + " inspects
  // wheel #1 for irregularities";
  // String message2 = this.staffName + " approves wheel #1";
  // System.out.println(message);
  // System.out.println(message2);
  // }
  // }

  public static void main(String[] args) {
    // Operation part
    // Staff staff = new Staff();
    // staff.staffLevels = 1;
    // staff.operation(1);
    Staff staff1 = new Staff("Lucas", "Quantity Control", 1);
    Staff staff2 = new Staff("Dave", "Operator", 2);
    Staff staff3 = new Staff("John", "Quality Control", 3);

    List<Staff> staffs = new ArrayList<Staff>();
    staffs.add(staff1);
    staffs.add(staff2);
    staffs.add(staff3);

    for (Staff eachStaff : staffs) {
      System.out.println(eachStaff);
    }
  }
}