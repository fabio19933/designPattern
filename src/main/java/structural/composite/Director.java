package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Director implements Employee{
    List<Employee> companyMembers = new ArrayList<>();
    @Override
    public void description() {
        for ( Employee companyMember : companyMembers) {
            companyMember.description();
        }
    }
    public void addMember(Employee e){
        companyMembers.add(e);
    }
    public void removeMember(Employee e){
        companyMembers.remove(e);
    }
}

