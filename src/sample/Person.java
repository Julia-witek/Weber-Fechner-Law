package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty propertyName= new SimpleStringProperty(this,"NameProperty","");

    public StringProperty getPropertyAge() {
        return propertyAge;
    }

    public void setPropertyAge(String propertyAge) {
        this.propertyAge.set(propertyAge);
    }

    private StringProperty propertyAge= new SimpleStringProperty(this,"AgeProperty","");

    public StringProperty getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName.set(propertyName);
    }

}
