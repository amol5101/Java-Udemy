package OOP.Data_Hiding;    // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this here, so ignore this

/*

Data Hiding :
in this program we are hiding the data using class and access modifier
here we have declared length and breadth as private to make them hide
so we cannot access them from outside of class
so we have taken setter and getter methods which are publicly accessible


 */


class rectangle{
    private int length;         // private data member  (property)
    private int breadth;        // private data member  (property)

    int getLength(){            // getter method to know the length from outside of class
        return length;
    }

    int getBreadth(){           // getter method to know the breadth from outside of class
        return breadth;
    }

    void setLength(int l){      // setter method to set length from outside of class
        length = l;
    }
    void setBreadth(int b){     // setter method to set breadth from outside of class
        breadth = b;
    }

    public int area(){
        return length * breadth;
    }

    public int perimeter(){
        return 2 * (length + breadth);
    }
}
public class dataHiding {
    public static void main( String args[]){

        rectangle obj = new rectangle();        // creating object of class rectangle

//        obj.length = 10;        // we cannot access length and breadth from outside because they are hidden
//        obj.breadth = 20;       // so this will throw error

        // for setting and getting length we have taken setter and getter method by which we can access them
        obj.setLength(100);
        obj.setBreadth(200);

        System.out.println("Area is : "+obj.area());
        System.out.println("Perimeter is : "+obj.perimeter());

        System.out.println("Length : " + obj.getLength());
        System.out.println("Breadth : " + obj.getBreadth());

    }
}
