public class App {
    public static void main(String[] args) {
        
        iPhone meuIphone = new iPhone();

        //ReprodutorMusical
        meuIphone.selecionarMusica("Turbulence");
        meuIphone.tocar();
        meuIphone.pausar();

        // AparelhoTelefonico
        meuIphone.ligar("99123-4567");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // NavegadorInternet
        meuIphone.exibirPagina("www.pandorasbiscoitos.com.br");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
