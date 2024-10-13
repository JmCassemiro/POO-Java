public abstract class ClasseMae implements Comparable <ClasseMae> {


    protected String nome;

    protected int id;

    @Override
    public int compareTo(ClasseMae o){


        return Integer.compare(this.preco, o.getPreco());

    }

    
}