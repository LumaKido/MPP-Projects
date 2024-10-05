package exemplo;

public class Personalidade {
	private String traco;

    public Personalidade(String trait) {
        this.traco = trait;
    }

    public String getTrait() {
        return traco;
    }

    @Override
    public String toString() {
        return "Tracos da personalidade: " + traco;
    }
}
