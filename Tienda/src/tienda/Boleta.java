package tienda;
/**
 *
 * @author CETECOM
 */
public class Boleta {
    private int n_unico;
    private String fecha;
    private long m_total;
    private String m_pago;
    //constructor
    public Boleta(int n_unico, String fecha, long m_total, String m_pago){
        this.n_unico = n_unico;
        this.fecha = fecha;
        this.m_total = m_total;
        this.m_pago = m_pago;
    }
    //accesador

    public int getN_unico() {
        return n_unico;
    }

    public void setN_unico(int n_unico) {
        if (n_unico > 0){
        this.n_unico = n_unico;
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getM_total() {
        return m_total;
    }

    public void setM_total(long m_total) {
        if (m_total > 0){
        this.m_total = m_total;
        }
    }

    public String getM_pago() {
        return m_pago;
    }

    public void setM_pago(String m_pago) {
        this.m_pago = m_pago;
    }
    
    
}
