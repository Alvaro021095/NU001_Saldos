package co.com.bancolombia.recharges.acceptancetest.commons;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;



@RunWith(Karate.class)
@KarateOptions(features = "src/test/java/co/com/bancolombia/recharges/acceptancetest/commons/headers.feature")
public class HeadersRunner {
}


