package apps;

import apps.FacebookMessenger;
import apps.ServicoMensagemInstantanea;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        // Não se sabe qual App, todos devem enviar e receber
        String appEscolhido = "msg";

        if(appEscolhido.equals("msg"))
            smi = new apps.MSNMessenger();

        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();

        else if(appEscolhido.equals("tlg"))
            smi = new apps.Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}