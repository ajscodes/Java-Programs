public class ForEach{
    public static void main(String[]args){
        String[] names = {"Java","C++","Python","Ruby","Php"};
        System.out.println("List of Programming Languages are given below: \n");
        for(String name : names ){
            System.out.println(name);
        }
    }
}