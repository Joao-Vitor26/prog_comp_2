// Classe que representa monitores de computadores
public class Monitor {

    // Atributos da classe
    private String marca;       // Marca do monitor, ex: Dell, LG
    private String modelo;      // Modelo do monitor, ex: UltraGear, Odyssey G5  
    private double tamanho;     // Tamanho da tela em polegadas
    private String resolucao;   // Resolução do monitor, ex: 1920x1080
    private boolean eCurvo;     // Indica se o monitor é curvo (true) ou plano (false)

    // Construtor da classe para inicializar os atributos
    public Monitor(String marca, String modelo, double tamanho, String resolucao, boolean eCurvo) {
        this.marca = marca;
        this.modelo = modelo;        
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.eCurvo = eCurvo;
    }

    // Método que exibe as informações do monitor
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);        
        System.out.println("Tamanho: " + tamanho + " polegadas");
        System.out.println("Resolução: " + resolucao);
        System.out.println("É curvo: " + (eCurvo ? "Sim" : "Não"));
    }

    // Método que ajusta a resolução do monitor
    public void ajustarResolucao(String novaResolucao) {
        this.resolucao = novaResolucao;
        System.out.println("Resolução ajustada para: " + novaResolucao);
    }

    // Método que verifica se o monitor é curvo
    public boolean eMonitorCurvo() {
        return eCurvo; // Retorna true se o monitor for curvo
    }

    // Método principal para demonstrar o uso da classe
    public static void main(String[] args) {
        
        // Criando um objeto da classe Monitor
        Monitor monitor = new Monitor("LG", "UltraGear", 27.0, "2560x1440", true);

        // Exibindo informações do monitor
        monitor.exibirInformacoes();

        // Ajustando a resolução
        monitor.ajustarResolucao("1920x1080");

        // Verificando se o monitor é curvo
        if (monitor.eMonitorCurvo()) {
            System.out.println("Este monitor é curvo.");
        } else {
            System.out.println("Este monitor é plano.");
        }
    }
}