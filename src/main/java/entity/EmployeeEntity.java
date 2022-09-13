package entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "employee", schema = "p1v3")
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "empId", nullable = false)
    private int empId;
    @Basic
    @Column(name = "empName", nullable = true, length = 20)
    private String empName;
    @Basic
    @Column(name = "empEmail", nullable = true, length = 20)
    private String empEmail;

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @OneToMany(mappedBy = "empId")
    private Collection<ClaimEntity> claimsByEmpId;
    @Basic
    @Column(name = "empl_Type", nullable = false)
    private int emplType;

    public EmployeeEntity() {
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (empId != that.empId) return false;
        if (empName != null ? !empName.equals(that.empName) : that.empName != null) return false;
        if (empEmail != null ? !empEmail.equals(that.empEmail) : that.empEmail != null) return false;

        return password != null ? password.equals(that.password) : that.password == null;

    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (empEmail != null ? empEmail.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);

        return result;
    }

    public Collection<ClaimEntity> getClaimsByEmpId() {
        return claimsByEmpId;
    }

    public void setClaimsByEmpId(Collection<ClaimEntity> claimsByEmpId) {
        this.claimsByEmpId = claimsByEmpId;
    }

    public int getEmplType() {
        return emplType;
    }

    public void setEmplType(int emplType) {
        this.emplType = emplType;
    }
}
