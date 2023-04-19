import java.util.Date;

public class Compra {

    private String id;
    private String concepto;
    private double importe;
    private Date fecha;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Compra(String id, String concepto, double importe, Date fecha) {
        this.id = id;
        this.concepto = concepto;
        this.importe = importe;
        this.fecha = fecha;
    }

    
}
