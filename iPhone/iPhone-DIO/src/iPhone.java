
import equipamentos.AparelhoTelefonico;
import equipamentos.NavegadorInternet;
import equipamentos.ReprodutorMusical;


public class iPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    
    // REPRODUTOR MUSICAL
    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica..." + musica);
    }

    @Override
    public void tocar(){
        System.out.println("Reproduzindo musica...");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando musica...");
    }

// NAVEGADOR INTERNET
    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo pagina..." + url);
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando pagina...");
    }

    //Aparelho telefonico
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para... " + numero);
    }

    @Override
    public void atender(){
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
}