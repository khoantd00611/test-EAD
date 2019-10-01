package t1708m.springead.entity;

import javax.persistence.*;

@Entity
@Table()
public class Sale {
    @Id
    private String SlNo;
    private int SalesmanID;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProdID;
    private String SalesManName;
    private String DOS;

    @ManyToMany(fetch = FetchType.LAZY, cascade =
            {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "sale_product",
            joinColumns = @JoinColumn(name = "sale_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))

    public String getSlNo() {
        return SlNo;
    }

    public void setSlNo(String slNo) {
        SlNo = slNo;
    }

    public int getSalesmanID() {
        return SalesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        SalesmanID = salesmanID;
    }

    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int prodID) {
        ProdID = prodID;
    }

    public String getSalesManName() {
        return SalesManName;
    }

    public void setSalesManName(String salesManName) {
        SalesManName = salesManName;
    }

    public String getDOS() {
        return DOS;
    }

    public void setDOS(String DOS) {
        this.DOS = DOS;
    }
}
