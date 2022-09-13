package entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "employee", schema = "p1v3", catalog = "")
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "empId")
    private int empId;
    @Basic
    @Column(name = "empName")
    private String empName;
    @Basic
    @Column(name = "empEmail")
    private String empEmail;
    @OneToMany(mappedBy = "employeeByEmpId")
    private Collection<ClaimEntity> claimsByEmpId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (empId != that.empId) return false;
        if (empName != null ? !empName.equals(that.empName) : that.empName != null) return false;
        if (empEmail != null ? !empEmail.equals(that.empEmail) : that.empEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (empEmail != null ? empEmail.hashCode() : 0);
        return result;
    }

    public Collection<ClaimEntity> getClaimsByEmpId() {
        return claimsByEmpId;
    }

    public void setClaimsByEmpId(Collection<ClaimEntity> claimsByEmpId) {
        this.claimsByEmpId = claimsByEmpId;
    }
}
