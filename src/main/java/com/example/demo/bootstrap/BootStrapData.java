package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import com.example.demo.domain.InhousePart;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if (partRepository.count() == 0) {

            InhousePart rtx460 = new InhousePart();
            rtx460.setName("RTX 460");
            rtx460.setPrice(299.00);
            rtx460.setInv(20);

            InhousePart rtx470 = new InhousePart();
            rtx470.setName("RTX 470");
            rtx470.setPrice(399.00);
            rtx470.setInv(20);

            InhousePart rtx480 = new InhousePart();
            rtx480.setName("RTX 480");
            rtx480.setPrice(499.00);
            rtx480.setInv(20);

            InhousePart rtx490 = new InhousePart();
            rtx490.setName("RTX 490");
            rtx490.setPrice(599.00);
            rtx490.setInv(20);

            InhousePart rtx540 = new InhousePart();
            rtx540.setName("RTX 540");
            rtx540.setPrice(699.00);
            rtx540.setInv(20);


            partRepository.save(rtx460);
            partRepository.save(rtx470);
            partRepository.save(rtx480);
            partRepository.save(rtx490);
            partRepository.save(rtx540);

        }

        if (outsourcedPartRepository.count() == 0) {

            OutsourcedPart cpu1 = new OutsourcedPart();
            cpu1.setName("CPU1");
            cpu1.setPrice(349.00);
            cpu1.setInv(20);
            cpu1.setCompanyName("NotIntel");

            OutsourcedPart cpu2 = new OutsourcedPart();
            cpu2.setName("CPU2");
            cpu2.setPrice(449.00);
            cpu2.setInv(20);
            cpu2.setCompanyName("NotIntel");

            OutsourcedPart cpu3 = new OutsourcedPart();
            cpu3.setName("CPU3");
            cpu3.setPrice(549.00);
            cpu3.setInv(20);
            cpu3.setCompanyName("NotIntel");

            OutsourcedPart cpu4 = new OutsourcedPart();
            cpu4.setName("CPU4");
            cpu4.setPrice(699.00);
            cpu4.setInv(20);
            cpu4.setCompanyName("NotIntel");

            OutsourcedPart cpu5 = new OutsourcedPart();
            cpu5.setName("CPU5");
            cpu5.setPrice(799.00);
            cpu5.setInv(20);
            cpu5.setCompanyName("NotIntel");


            outsourcedPartRepository.save(cpu1);
            outsourcedPartRepository.save(cpu2);
            outsourcedPartRepository.save(cpu3);
            outsourcedPartRepository.save(cpu4);
            outsourcedPartRepository.save(cpu5);

        }


        if (productRepository.count() == 0) {
            Product computer1 = new Product("Computer1", 600, 20);
            Product computer2 = new Product("Computer2", 800, 20);
            Product computer3 = new Product("Computer3", 1000, 20);
            Product computer4 = new Product("Computer4", 1200, 20);
            Product computer5 = new Product("Computer5", 1400, 20);

            productRepository.save(computer1);
            productRepository.save(computer2);
            productRepository.save(computer3);
            productRepository.save(computer4);
            productRepository.save(computer5);

        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products" + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts" + partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
