import java.util.HashMap;

// Main class
public class hashMap {
        String nameOfBlock;
        HashMap<Integer, Declaration> map = new HashMap<>();
        int count = 0;

        public void setName(String inputName){
                nameOfBlock = inputName;
        }
        public void addString(String type, String id, String value){
                Declaration decl = new Declaration();
                decl.setDecl(type, id, value);
                map.put(count, decl);
                count = count + 1;
        }
        public void printBlock() {
                System.out.println("Symbol table " + nameOfBlock);
                for (int i = 0; i < count; i++){
                        if (map.get(i).value != "") {
                                System.out.println("name " + map.get(i).id + " type " + map.get(i).type + " value " + map.get(i).value);
                        }
                        else{
                                System.out.println("name " + map.get(i).id + " type " + map.get(i).type);
                        }
                }
                System.out.print("\n");
        }
        public void checkForDuplicatesInBlock(String idToCheck) {
                for (int i = 0; i < count; i++){
                        if (map.get(i).id.equals(idToCheck)) {
                                System.out.println("\nDECLARATION ERROR " + map.get(i).id);
                                System.exit(0);
                        }
                }
        }
}
//declarations of INT and STRING
class Declaration{
        String type;
        String id;
        String value;

        public void setDecl(String type, String id, String value){
                this.type = type;
                this.id = id;
                this.value = value;
        }
}

