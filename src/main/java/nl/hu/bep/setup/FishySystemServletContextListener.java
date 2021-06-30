package nl.hu.bep.setup;

import nl.hu.bep.fishysystem.model.Aquarium;
import nl.hu.bep.fishysystem.model.AquariumManager;
import nl.hu.bep.fishysystem.model.Eigenaar;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;
import reactor.netty.http.HttpResources;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import java.time.Duration;

@WebListener
public class FishySystemServletContextListener implements javax.servlet.ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Initializing Application...");
        // test data


        // blobs

//        System.out.println("Downloading Blobs");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Terminating Application...");

        Schedulers.shutdownNow();
        HttpResources.disposeLoopsAndConnectionsLater(Duration.ZERO, Duration.ZERO).block();
    }

    public void createTestData() {
        AquariumManager aqManager = new AquariumManager("Jos\' installatie");

        Aquarium aq1 = new Aquarium("Aquarium0", 30, 60, 30, null, null);
        Aquarium aq2 = new Aquarium("Aquarium1", 30, 60, 30, null, null);
        Aquarium aq3 = new Aquarium("Aquarium2", 30, 60, 30, null, null);

        Eigenaar eig1 = new Eigenaar("Zoonlief", "Reenen");
        Eigenaar eig2 = new Eigenaar("Dochterlief", "Reenen");

        eig1.addAquarium(aq2);
        eig2.addAquarium(aq3);
    }
}
