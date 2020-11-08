package oops;
/*
*Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class).
* The subclass can add its own fields and methods in addition to the superclass fields and methods.
Reusability: Inheritance supports the concept of “reusability”, i.e.
* when we want to create a new class and there is already a class that includes some of the code that we want,
*  we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.
* */

class GrandParents{
    int grandParentsAsset;
    String grandDadName;
    String grandMotherName;
    int grandParentsAssetWorth;


    public int getGrandParentsAsset() {
        return grandParentsAsset;
    }

    public void setGrandParentsAsset(int grandParentsAsset) {
        this.grandParentsAsset = grandParentsAsset;
    }


    public String getGrandDadName() {
        return grandDadName;
    }

    public void setGrandDadName(String grandDadName) {
        this.grandDadName = grandDadName;
    }

    public String getGrandMotherName() {
        return grandMotherName;
    }

    public void setGrandMotherName(String grandMotherName) {
        this.grandMotherName = grandMotherName;
    }

    public int getGrandParentsAssetWorth() {
        return grandParentsAssetWorth;
    }

    public void setGrandParentsAssetWorth(int grandParentsAssetWorth) {
        this.grandParentsAssetWorth = grandParentsAssetWorth;
    }

    int getCalculateGrandAssets(){
        return  getGrandParentsAsset();
    }
}

class Parents extends GrandParents{
    String dadName;
    String motherName;

    int parentsAssetWorth;

    public int getParentsAssetWorth() {
        return parentsAssetWorth;
    }

    public void setParentsAssetWorth(int parentsAssetWorth) {
        this.parentsAssetWorth = getParentsWorthDetails();
    }

    public String getDadName() {
        return dadName;
    }

    public void setDadName(String dadName) {
        this.dadName = dadName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    int getParentsWorthDetails(){
        int grandParentsAsset = getCalculateGrandAssets();
        return grandParentsAsset * 2;
    }
}

class Child extends Parents {
    String name;

    int assetWorth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAssetWorth() {
        return assetWorth;
    }

    public void setAssetWorth(int assetWorth) {
        this.assetWorth = getChildWorthDetails();
    }


    int getChildWorthDetails(){
        int grandParentsAsset = getCalculateGrandAssets();
        int parentsAsset = getParentsWorthDetails();
        return  grandParentsAsset + parentsAsset;
    }
}

public class FamilyTree {
    public static void main(String args[]){
        System.out.println("Inheritance");
        Child kid = new Child();

        kid.setGrandDadName("Mylswamy");
        kid.setGrandMotherName("Velumani");
        kid.setDadName("Shinto");
        kid.setMotherName("Savitha");
        kid.setGrandParentsAsset(300000);
        kid.setName("Anish");

        System.out.println("Grand Father: "+ kid.getGrandDadName() + "'s Asset Worth:"+ kid.getCalculateGrandAssets());
        System.out.println("Father: "+ kid.getDadName() + "'s Asset Worth:"+ kid.getParentsWorthDetails());
        System.out.println("Name: "+ kid.getName() + "'s Asset Worth:"+ kid.getChildWorthDetails());

    }
}