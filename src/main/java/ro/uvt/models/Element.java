package ro.uvt.models;

public interface Element extends Visitee{
    //atribute
    //metode

    default void add(Element e)
    {
        throw new UnsupportedOperationException();
    };
    default void remove(Element e)
    {
        throw new UnsupportedOperationException();
    };
    default Element getElement(int i)
    {
        throw new UnsupportedOperationException();
    };
    //void render();
}
