import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Vector implements Cloneable, Iterable<Double>{

   
private List<Double> components;


public Vector(List<Double> values){
    this.components = new ArrayList<>(values);
}

     


public double get(int i){
    return components.get(i);
}



public void set(int i, double val){
    components.set(i,val);
}


public int length(){
    return components.size();
}


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


@Override
public Vector clone(){
    return new Vector(this.components);
}


@Override
public String toString(){
    return components.toString();
}


@Override
public boolean equals(Object o){
    if(this == o) return true;
    if(!(o instanceof Vector)) return false;
    Vector v = (Vector) o;
    return Objects.equals(this.components, v.components);
}


@Override
public Iterator<Double> iterator(){
    return components.iterator();
}

}