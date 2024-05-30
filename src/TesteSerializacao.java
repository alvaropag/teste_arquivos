import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClasseParaSerializar c = new ClasseParaSerializar();
        c.setIdade(39);
        c.setNome("Alvaro");
        c.setSalario(50000);
        serializaObjeto(c);


        //para carregar
        ClasseParaSerializar c2 = deserializaObjeto();
        System.out.println(c2.getNome());
    }

    public static void serializaObjeto(ClasseParaSerializar c) throws IOException {
        FileOutputStream fos = new FileOutputStream("serializacao.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
    }

    public static ClasseParaSerializar deserializaObjeto() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("serializacao.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ClasseParaSerializar c = (ClasseParaSerializar) ois.readObject();
        ois.close();
        return c;
    }
}
