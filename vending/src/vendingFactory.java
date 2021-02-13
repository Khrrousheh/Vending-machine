
public class vendingFactory {

    public Items getItems(String itemType) throws ItemTypeNotfoundException {
            if(itemType== null){
                return null;
            }
            Items item;
            switch (itemType){
                case "Drinks":
                    item= new Drinks();
                    break;
                case "Snacks":
                    item= new Snacks();
                    break;
                case "Frozen":
                    item= new Frozen();
                            break;
                default:
                    throw new ItemTypeNotfoundException();
            }
            return item;
    }
}
