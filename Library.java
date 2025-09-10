public class Library {

    static class Book{
        static String libName="Central Library";
        String title;
        String author;
        final int isbn; //book refrence number
        static void Display(){
            System.out.println(libName);
        }

        public Book(String title,String author,int isbn){
            this.title=title;
            this.author=author;
            this.isbn=isbn;
        }

        void displayBook(){

            if(this instanceof Book){
                System.out.println("title"+title);
                System.out.println("Author"+author);
                System.out.println("isbn"+isbn);
            }
            else{
                System.out.println("Not a valid Book");
            }
        }
    }

    public static void main(String[] args) {
        Book b1=new Book("Sisodiya","Sandeep",78758);
        System.out.println(b1.libName);
        System.out.println(b1.author);
        System.out.println(b1.title);
    }
    
}
