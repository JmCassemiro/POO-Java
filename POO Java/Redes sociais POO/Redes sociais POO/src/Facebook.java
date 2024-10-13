public class Facebook extends RedeSocial implements videoConferencia, Compartilhamento {

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou do Facebook.");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez Streaming de Facebook.");
    }

    // metodos de RedeSocial

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Facebook.");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Facebook.");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu publicação no Facebook.");
    }

}
