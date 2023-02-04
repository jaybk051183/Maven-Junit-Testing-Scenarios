package org.example;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    public void nameShouldNotBeChangedDuringCreation() {
        Person person = new Person("John Doe");
        String originalName = person.getName();
        person.setName("John Doe");
        assertEquals(originalName, person.getName());
    }

    @Test
    public void personWithoutNameShouldBeNamedJohn() {
        Person person = new Person();
        assertEquals("John", person.getName());
    }

    @Test
    public void ageShouldAddOneYear() {
        Person person = new Person(25);
        person.addOneYear();
        assertEquals(26, person.getAge());
    }

    @Test
    public void lastNameShouldStartWithUpperCaseWhenLowercaseGiven() {
        Person person = new Person();
        person.setLastName("john");
        assertEquals("John", person.getLastName());
    }

    @Test
    public void givenAPartnerHasPartnerShouldReturnTrue() {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setPartner(person2);
        assertTrue(person1.hasPartner());
    }

    @Test
    public void childShouldBeAddedToList() {
        Person person = new Person();
        Person child = new Person("Child");
        person.addChild(child);
        assertEquals(1, person.getChildren().size());
    }


}