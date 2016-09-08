package seedu.addressbook.data.person;

public class Contact {
    public final String value;
    private boolean isPrivate;
    
    public Contact(String newVal, boolean isPrivate){
    	this.isPrivate = isPrivate;
    	value = newVal.trim();
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
