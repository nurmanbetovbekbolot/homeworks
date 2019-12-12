package com.company;

public class Dog extends Animal{
    public Dog(String name, Integer age) {
        super(name, age);
    }


    @Override
    public boolean equals(Object obj){
        if (obj==this) return true;
        if (obj instanceof Cat){
            return ((Cat)obj).name.equals(name)
                    && ((Cat) obj).age==age;
        }
        return false;
    }

    @Override
    public String toString() {
        String s=new String("Dog "+name+", "+age+" years old");
        return s;
    }
}
