public class ProjectTest {
    public static void main (String[] args) { //public needs to be lowercase
        Project aiWorld = new Project(); //setting a method to aiworld
        
        String makeWorld = aiWorld.alicization();
        String makeWorldNow = aiWorld.createAlicization("Alicization");
        System.out.println(makeWorld);
    } 
}