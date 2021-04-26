package ordenar;
import java.util.Scanner;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;

public class Lista {

private int value;
private int posmen,i,j;
private Scanner scan = new Scanner(System.in);
public Lista(){
}
public Lista(int value){
  this.value = value;
}
public void setValue(int value){
  this.value = value;
}
public void ingresar(Collection lista){
do{
  System.out.println("ingrese numero:");
  value = scan.nextInt();
  Lista numero = new Lista(value);
  lista.add(numero);
  }while(lista.size()<10);
}
public void mostrar(List<Lista> lista){
Lista menor = new Lista();
Lista menor1 = new Lista();
Lista mayor1 = new Lista();
Lista aux = new Lista();
  menor1=lista.get(0);
  mayor1=lista.get(0);
  for(int i=0;i<lista.size();i++){
  if(lista.get(i).esMenor(menor1)){
    menor1=lista.get(i);
    }else if(lista.get(i).esMayor(mayor1)){
      mayor1=lista.get(i);
    }
  }
  System.out.println("El numero menor de la lista es: "+menor1);
  System.out.println("El numero mayor de la lista es: "+mayor1);
  //ORDENAMIENTO POR SELECCION
  System.out.println("La lista ordenada es:");
  for(i=0;i<lista.size();i++){
    posmen=i;
    menor=lista.get(i);
    for(j=i+1;j<lista.size();j++){
      if(lista.get(j).esMenor(menor)){
        menor=lista.get(j);
        posmen=j;
      }
    }
    aux=lista.get(i);
    lista.set(i,menor);
    lista.set(posmen,aux);
  }
    Iterator it = lista.iterator();
    while(it.hasNext())
    System.out.println(it.next());
}
public boolean esMenor(Lista n){
  if(this.value<n.getValue()){
    return true;
  }else{
    return false;
  }
}
public boolean esMayor(Lista n){
  if(this.value>n.getValue()){
    return true;
  }else{
    return false;
  }
}
public int getValue(){
  return value;
}
public String toString(){
  return String.format("%s",this.value);
}
}
