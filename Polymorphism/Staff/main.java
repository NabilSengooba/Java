package Staff;

class Main {
    public static void main(String[] args) {
      staffMember staffMember= new staffMember(); 
      staffMember staffemployee = new Employee();  
      staffMember staffvolunteer = new volunteer();  
      
      Employee HourlyEmployee = new Hourly();
      Employee ExecutiveEmployee = new Executive();
      staffMember.position();
      staffemployee.position();
      staffvolunteer.position();
      HourlyEmployee.position();
      ExecutiveEmployee.position();
    }
  }
    