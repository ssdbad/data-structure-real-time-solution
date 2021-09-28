package ds.practice;

import java.util.Date;
import java.util.List;

public class Iqvia {
    public static void main(String[] args) {
        
    }
}

//Make Mutable so that it can be usable as key 
class Employee{
	Integer empId;
	Date dob;
	List<Address> addresses;
}

/**If residence address and permanent address is same
 * then autodetect the permanent address.
*/
class Address{
    /**if both residence type are same then permanent 
     * address details autodetected from residence
     */
	String residenceType;
    
}

enum AddressType{
    RESIDENCE,PERMANENT
}