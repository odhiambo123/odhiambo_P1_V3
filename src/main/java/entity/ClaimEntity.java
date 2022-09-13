package entity;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "claim", schema = "p1v3")
public class ClaimEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "claimId", nullable = false)
    private int claimId;
    @Basic
    @Column(name = "claimDate", nullable = true, length = 35)
    private String claimDate;
    @Basic
    @Column(name = "claimAmount", nullable = true)
    private Integer claimAmount;
    @Basic
    @Column(name = "description", nullable = true, length = 250)
    private String description;
    @Basic
    @Column(name = "caption", nullable = true, length = 50)
    private String caption;
    @Basic
    @Column(name = "img", nullable = true)
    private byte[] img;
    @Basic
    @Column(name = "approved", nullable = true)
    private boolean approved;
    @Basic
    @Column(name = "empId", nullable = true)
    private Integer empId;

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public String getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(String claimDate) {
        this.claimDate = claimDate;
    }

    public Integer getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Integer claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public boolean getApproved() {
        return approved;
    }

    public void setApproved(Byte approved) {
        this.approved = false;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClaimEntity that = (ClaimEntity) o;

        if (claimId != that.claimId) return false;
        if (claimDate != null ? !claimDate.equals(that.claimDate) : that.claimDate != null) return false;
        if (claimAmount != null ? !claimAmount.equals(that.claimAmount) : that.claimAmount != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (caption != null ? !caption.equals(that.caption) : that.caption != null) return false;
        if (!Arrays.equals(img, that.img)) return false;
        if (approved != that.approved) return false;
        return Objects.equals(empId, that.empId);
    }

    @Override
    public int hashCode() {
        int result = claimId;
        result = 31 * result + (claimDate != null ? claimDate.hashCode() : 0);
        result = 31 * result + (claimAmount != null ? claimAmount.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (caption != null ? caption.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(img);
        result = 31 * result + (approved ? 1 : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        return result;
    }
}
