abstract class GenericEntity {
    private int id;
    private String name;

    //constructor
    public GenericEntity(int id, String name){
        this.id = id;
        this.name = name;
    }

    //getter and setter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //method for implementation
    public abstract String getDescription();
}
