import java.util.Arrays;

public class Pelicula {;
    //atributos de la clase
    private String title = null;
    private int capNum=0;
    private String genre = null;
    private String writer = null;
    private String[] actors = new String[]{"","","","",""};
    private int price = 0;

    //CONSTRUCTORES--------------------------------
    Pelicula(){}

    Pelicula(String title,String writer){
        this.title=title;
        this.writer=writer;
    }

    Pelicula(String title, int capNum, String genre, String writer, String[] actors, int price){
        this.title=title;
        this.capNum=capNum;
        this.genre=genre;
        this.writer=writer;
        this.actors=actors;
        this.price=price;
    }
    //MÉTODOS--------------------------------------
    public String getTitle() {return this.title;}
    public void setTitle(String title){this.title = title;}

    public int getCapNum() {return this.capNum;}
    public void setCapNum(int capNum){this.capNum =capNum;}

    public String getGenre() {return this.genre;}
    public void setGenre(String genre){this.genre =genre;}

    public String getWriter() {return this.writer;}
    public void setWriter(String writer){this.writer =writer;}

    public String[] getActors() {return this.actors;}
    public void setActors(String[] actors){this.actors =actors;}

    public int getPrice() {return this.price;}
    public void setPrice(int price){this.price =price;}

    public String toString() {
        return "Pelicula{" +
                "title='" + title + '\'' +
                ", capNum=" + capNum +
                ", genre='" + genre + '\'' +
                ", writer='" + writer + '\'' +
                ", actors=" + Arrays.toString(actors) +
                ", price=" + price +
                '}';
    }
    
    protected Object clone(){
  
    Pelicula clone= new Pelicula (this.title,this.capNum,this.genre,this.writer,this.actors,this.price);
    return clone;
  }
}
