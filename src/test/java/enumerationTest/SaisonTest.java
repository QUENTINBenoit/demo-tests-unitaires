package enumerationTest;
  import fr.diginamic.enumerations.Saison;
  import org.junit.Assert;
  import org.junit.Test;
public class SaisonTest {

    @Test
    public  void testValueOfLibelle(){
         Saison  sais = Saison.valueOfLibelle("Printemps");
         for ( Saison s: sais.values()){
             System.out.println(s);
         }
        Assert.assertEquals("Printemps",  sais.getLibelle());

    }


}
