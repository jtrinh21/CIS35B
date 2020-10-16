package adapter;

public interface UpdateAuto {

    //This function searches the Model for a given OptionSet and sets the name of OptionSet to
    //newName.
    public void updateOptionSetName(String optionSetName, String newName);

    //This function searches the Model for a given OptionSet and Option name, and sets the price to
    //newPrice
    public void updateOptionPrice(String optionName, float price, String optionSetName);

}
