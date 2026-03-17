package reservas;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@ToString
public class Reserva {

    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fecha_hora;

    public Reserva(Usuario usuario, Pista pista) {
        this.usuario = usuario;
        this.pista = pista;
        this.fecha_hora = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(pista, reserva.pista) && Objects.equals(fecha_hora, reserva.fecha_hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pista, fecha_hora);
    }
}
