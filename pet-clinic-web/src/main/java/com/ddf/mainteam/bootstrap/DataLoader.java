package com.ddf.mainteam.bootstrap;

import com.ddf.mainteam.model.Owner;
import com.ddf.mainteam.model.Vet;
import com.ddf.mainteam.service.OwnerService;
import com.ddf.mainteam.service.PetService;
import com.ddf.mainteam.service.VetService;
import com.ddf.mainteam.service.map.OwnerServiceMap;
import com.ddf.mainteam.service.map.PetServiceMap;
import com.ddf.mainteam.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by InnocentTIALO on 5/25/2020.
 */
@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
        petService = new PetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = Owner.ownerBuilder()
                .id(1L)
                .firstName("Innocent")
                .lastName("TIALO")
                .build();

        Owner owner2 = Owner.ownerBuilder()
                .id(2L)
                .firstName("Jean-Rene")
                .lastName("TALLA")
                .build();

        ownerService.save(owner1, owner2);
        System.out.println("Loaded owners...");

        Vet vet1 = Vet.vetBuilder()
                .id(1L)
                .firstName("Stephane")
                .lastName("KENGNE")
                .build();

        Vet vet2 = Vet.vetBuilder()
                .id(2L)
                .firstName("Jean-Pierre")
                .lastName("KENFACK")
                .build();

        vetService.save(vet1, vet2);
        System.out.println("Loaded Vets...");

    }

}
