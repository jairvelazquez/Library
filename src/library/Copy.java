package library;

public class Copy {
    /*Copy
    Estado (Disponible, en prestamo)
    Accion - marcarPrestado (No recibe nada, no retorna nada)

    */
    private CopyStatus status;

    public Copy (){
        this.status=CopyStatus.AVAILABLE;
    }

    public void loancopy(){
        this.status=CopyStatus.ON_LOAN;
    }

    public void returcopy(){
        this.status=CopyStatus.AVAILABLE;
    }

}
