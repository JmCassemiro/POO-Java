public class GooglePlus extends RedeSocial implements Compartilhamento, videoConferencia {

    @Override
    public void compartilhar(){
        System.out.println("Compartilhou do Google Plus.");
    }

    @Override
    public void fazStreaming(){
        System.out.println("Fez Streaming de Google Plus.");
    }


    //metodos RedeSocial
    @Override
    public void postarFoto(){
        System.out.println("Postou uma foto no Google Plus");
    }
    @Override
    public void postarVideo(){
        System.out.println("Postou um video no Google Plus.");
    }
    @Override
    public void postarComentario(){
        System.out.println("Postou comentario no Google Plus.");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("Curtiu publicação no Google Plus.");
    }
}
