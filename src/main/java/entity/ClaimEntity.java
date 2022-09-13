package entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "claim", schema = "p1v3", catalog = "")
public class ClaimEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "claimId")
    private int claimId;
    @Basic
    @Column(name = "claimDate")
    private Date claimDate;
    @Basic
    @Column(name = "claimAmount")
    private Integer claimAmount;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "caption")
    private String caption;
    @Basic
    @Column(name = "img")
    private byte[] img;
    @Basic
    @Column(name = "approved")
    private Byte approved;
    @Basic
    @Column(name = "empId")
    private Integer empId;

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
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

    public Byte getApproved() {
        return approved;
    }

    public void setApproved(Byte approved) {
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
        if (approved != null ? !approved.equals(that.approved) : that.approved != null) return false;
        if (empId != null ? !empId.equals(that.empId) : that.empId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = claimId;
        result = 31 * result + (claimDate != null ? claimDate.hashCode() : 0);
        result = 31 * result + (claimAmount != null ? claimAmount.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (caption != null ? caption.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(img);
        result = 31 * result + (approved != null ? approved.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        return result;
    }
}
