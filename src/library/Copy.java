package library;

public class Copy {


    /*Copy
        Estado (Disponible, en prestamo)
        Accion - marcarPrestado (No recibe nada, no retorna nada)

        */
    private CopyStatus status;

    public Copy() {
        this.status = CopyStatus.AVAILABLE;
    }

    public CopyStatus getstatus() {
        return this.status;
    }

    public void setStatus(CopyStatus status) {

        this.status = status;
    }

    public void loancopy() {
        this.status = CopyStatus.ON_LOAN;
    }

    public void returcopy() {
        this.status = CopyStatus.AVAILABLE;
    }

}
