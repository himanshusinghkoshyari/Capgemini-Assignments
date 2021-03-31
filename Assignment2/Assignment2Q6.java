abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "In FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "In DatabasePersistence";
    }
}

class client extends Persistence{
    @Override
    public String persist() {
        return "In client class";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
       client obj = new client();
       obj.persist();
    
    }
}