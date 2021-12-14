class BikeTester
{
    public static void main(String s[])
    {
        Bike bike = new Bike("Hero Honda", "Shine", 125);
        bike.mileage = 72.5;
        bike.diskBrakes = false;

        System.out.println(bike.company + "'s " + bike.model + " has " + bike.cc + "cc power.");
    }
}

class Bike
{
    Bike(String companyParam, String modelParam, int ccParam)
    {
        company = companyParam;
        model = modelParam;
        cc = ccParam;
    }

    Bike()
    {
    }

    String company;
    String model;
    int cc;
    double mileage;
    boolean diskBrakes;
}
