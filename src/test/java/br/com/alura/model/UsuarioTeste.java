package br.com.alura.model;

import io.quarkus.panache.mock.PanacheMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import java.util.Optional;

@QuarkusTest
public class UsuarioTeste {

    @Test
    public void testarSeFindByIdOptionRetornaUsuarioCorreto(){
        PanacheMock.mock(Usuario.class);

        Usuario u = new Usuario();
        Optional<PanacheEntityBase> usuario = Optional.of(u);

        Mockito.when(Usuario.findByIdOptional(6)).thenReturn(usuario);

        Assertions.assertSame(u,Usuario.findByIdOptional(6).get());

    }
}
