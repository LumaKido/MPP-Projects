package decorator;

//Interface basica para definir os metodos de ler e escrever

public interface DataSource {
    void writeData(String data);

    String readData();
}
