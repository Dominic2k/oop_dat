package CLASSES;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(){
    }

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.gender + ")" + " at " + this.email;
    }
}
