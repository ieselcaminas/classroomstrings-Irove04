import org.junit.jupiter.api.Test;

class SiglasTest {

    @Test
    void siglas() {
        assertEquals("EOI", Siglas.siglas(new String[]{"Escuela", "Oficial",  "de", "Idiomas"}));
    }
}