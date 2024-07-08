package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */

    private String name;
    private Integer age;
    PetOwner petOwner;
    public Pet() {
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return this.petOwner   ;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
