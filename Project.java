public class Project {
    
    public String alicization(String name){
        return createAlicization(name);
    }
    public String alicization(){
        return createAlicization("Its an world of AI's");
    }
    public String alicization(String name, String description){
        System.out.println("The project name is " + name);
        return createAlicization("Project Name: " + name + "is about" + description);
    }
    public String createAlicization(String varFromPublicObjects){
        return varFromPublicObjects;
    }
}

