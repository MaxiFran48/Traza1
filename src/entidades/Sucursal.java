package entidades;

import lombok.*;

import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Sucursal {
    private Long id;
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private boolean esCasaMatriz;

    private Domicilio domicilio;

    @Override
    public String toString() {
        return "Sucursal{" +
                "esCasaMatriz=" + esCasaMatriz +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                '}';
    }
}
