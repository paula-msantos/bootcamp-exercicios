package br.com.dh.teste03.dto;

import br.com.dh.teste03.model.Conta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransfDTO {
    private Conta origem;
    private Conta destino;
}
