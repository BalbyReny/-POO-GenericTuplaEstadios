package prueba;

public class GenericTupla<T,U> //Uso de clase genérica en lugar de ObjectTupla
{
  private final T first;
  private final U second;
  
  public GenericTupla (T first, U second) //T y U como tipos genéricos distintos
  {
    this.first = first;
    this.second = second;
  }

  public T getFirst () {
    return first;
  }

  public U getSecond () {
    return second;
  }

  @Override
  public String toString () {
    return String.format ("(%s, %s)", first.toString (), second.toString ());
  }
}
