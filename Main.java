public static void main(String[] args) {
    
    Vector v1 =  new Vector(List.of(3.0,4.0));
    Vector v2 =  new Vector(List.of(5.0,-2.0));

    System.out.println("v1 = " + v1);
    System.out.println("v2 = " + v2);

    Vector v3 = v1.add(v2);
    System.out.println("v1 + v2 = " + v3);

    Vector v4 = v1.subtract(v2);
    System.out.println("v1 - v2 = " + v4);

    Vector v5 = v1.clone();
    System.out.println("Cloned v1 = " + v5);

    System.out.println("Is v1 equals to v4? " + v1.equals(v5));

    System.out.println("Components of v1 = ");
    for(double c : v1){
        System.out.println(c + " ");
    }

}
