public class ItemTypeNotfoundException extends Exception{
    ItemTypeNotfoundException(){
        super("the inserted item is undefined type");
    }
    ItemTypeNotfoundException(String message){
        super(message);
    }
}
