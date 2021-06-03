public class Box<Thing>{

    Thing x;

    Box(Thing x){
     this.x = x;
    }

    public Thing getValue(){
        return x;
    }
}
