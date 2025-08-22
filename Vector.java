import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

//Vector class implements cloneable and iterable
public class Vector implements Cloneable, Iterable<Double>{

    //Encapsulation stores coordnates in private list
private List<Double> components;

//constructor
public Vector(List<Double> values){
    this.components = new ArrayList<>(values); //defensive copy
}

     //Public interface methods 

//get(i): returns coordinate at index i
public double get(int i){
    return components.get(i);
}


//set(int i,val) update coordinate
public void set(int i, double val){
    components.set(i,val);
}

//length() returns number of dimension
public int length(){
    return components.size();
}

//add(other) return new vector that is the sum
public Vector add(Vector other){
    if(this.length() != other.length()){
        throw new IllegalArgumentException("Dimension must match");
    }
  List<Double> result = new ArrayList<>();
  for(int i = 0 ; i < components.size() ; i++){
    result.add(this.components.get(i) + other.components.get(i));

  } 
  return new Vector(result);

}

//subtract(other ) return new vector that is the difference
public Vector subtract(Vector other){
    if(this.length() != other.length()){
        throw new IllegalArgumentException("Dimension must match");
    }
  List<Double> result = new ArrayList<>();
  for(int i = 0 ; i < components.size() ; i++){
    result.add(this.components.get(i) - other.components.get(i));

  } 
  return new Vector(result);

}

//clone() deep copy
@Override
public Vector clone(){
    return new Vector(this.components);
}

//toString() string representation
@Override
public String toString(){
    return components.toString();
}

// equals(Object o) check equality
@Override
public boolean equals(Object o){
    if(this == o) return true;
    if(!(o instanceof Vector)) return false;
    Vector v = (Vector) o;
    return Objects.equals(this.components, v.components);
}

//Iteration implement Iterable<Double>
@Override
public Iterator<Double> iterator(){
    return components.iterator();
}

}