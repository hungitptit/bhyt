/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lenovo
 */
public class Person {
    private int person_id;
    private String name;
    private int account_id;
    private String phoneNumber;
    private Date dob;
    private String email;
    private String cmt;
    private String sothebaohiem;
    private String address;
    private int muabaohiem;
    private Bhyt bhyt;
    public int getMuabaohiem() {
        return muabaohiem;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.person_id != other.person_id) {
            return false;
        }
        if (this.account_id != other.account_id) {
            return false;
        }
        if (this.muabaohiem != other.muabaohiem) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.cmt, other.cmt)) {
            return false;
        }
        if (!Objects.equals(this.sothebaohiem, other.sothebaohiem)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        if (!Objects.equals(this.bhyt, other.bhyt)) {
            return false;
        }
        if (!Objects.equals(this.listDisease, other.listDisease)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "person_id=" + person_id + ", name=" + name + ", account_id=" + account_id + ", phoneNumber=" + phoneNumber + ", dob=" + dob + ", email=" + email + ", cmt=" + cmt + ", sothebaohiem=" + sothebaohiem + ", address=" + address + ", muabaohiem=" + muabaohiem + ", bhyt=" + bhyt + ", listDisease=" + listDisease + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }


    public Bhyt getBhyt() {
        return bhyt;
    }

    public void setBhyt(Bhyt bhyt) {
        this.bhyt = bhyt;
    }

    public void setMuabaohiem(int muabaohiem) {
        this.muabaohiem = muabaohiem;
    }
    private List<Disease> listDisease;

    public Person(int person_id, String name, int account_id, String phoneNumber, Date dob, String email, String cmt, String sothebaohiem, String address) {
        this.person_id = person_id;
        this.name = name;
        this.account_id = account_id;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.email = email;
        this.cmt = cmt;
        this.sothebaohiem = sothebaohiem;
        this.address = address;
        this.listDisease = new ArrayList<>();
        
    }


    public Person() {
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public List<Disease> getListDisease() {
        return listDisease;
    }

    public void setListDisease(List<Disease> listDisease) {
        this.listDisease = listDisease;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
        public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public String getSothebaohiem() {
        return sothebaohiem;
    }

    public void setSothebaohiem(String sothebaohiem) {
        this.sothebaohiem = sothebaohiem;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}
