package Task2;

public class Student {
    private byte rollNo;
    private String fname;
    private String lname;
    private long guardianContact;
    private double marks;

    
    public Student(byte rollNo, String fname, String lname, long guardianContact, double marks) {
        this.rollNo = rollNo;
        this.fname = fname;
        this.lname = lname;
        this.guardianContact = guardianContact;
        this.marks = marks;
    }


    public Student() {
    }

    

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", fname=" + fname + ", lname=" + lname + ", guardianContact="
                + guardianContact + ", marks=" + marks + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        result = prime * result + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result + ((lname == null) ? 0 : lname.hashCode());
        result = prime * result + (int) (guardianContact ^ (guardianContact >>> 32));
        long temp;
        temp = Double.doubleToLongBits(marks);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo != other.rollNo)
            return false;
        if (fname == null) {
            if (other.fname != null)
                return false;
        } else if (!fname.equals(other.fname))
            return false;
        if (lname == null) {
            if (other.lname != null)
                return false;
        } else if (!lname.equals(other.lname))
            return false;
        if (guardianContact != other.guardianContact)
            return false;
        if (Double.doubleToLongBits(marks) != Double.doubleToLongBits(other.marks))
            return false;
        return true;
    }


    public byte getRollNo() {
        return rollNo;
    }


    public void setRollNo(byte rollNo) {
        this.rollNo = rollNo;
    }


    public String getFname() {
        return fname;
    }


    public void setFname(String fname) {
        this.fname = fname;
    }


    public String getLname() {
        return lname;
    }


    public void setLname(String lname) {
        this.lname = lname;
    }


    public long getGuardianContact() {
        return guardianContact;
    }


    public void setGuardianContact(long guardianContact) {
        this.guardianContact = guardianContact;
    }


    public double getMarks() {
        return marks;
    }


    public void setMarks(double marks) {
        this.marks = marks;
    }

    
       

}
