<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
    Updated title from My Bicycle Shop to German's Adventure Corner. 

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

        CHANGE - mainscreen.html

        Line 14 - < title > My Bicycle Shop < title >
                            TO
                  < title > German's Adventure Corner < /title >

        Line 19 - < h1 > Shop < /h1 >
                            TO
                  < h1 > German's Adventure Corner  < /h1 >


D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
    Added an about page inside the template folder. There is a link in the homepage to the about page.

        CREATE about.html - Entire DOC

        <!DOCTYPE html>

            <link rel="stylesheet" type="text/css" href="/css/demo.css">
            <html lang="en">

        <head>
            <meta charset="UTF-8">
            <title>About</title>
        </head>

        <body>

        <header>
            <h1>About German's Adventure Corner</h1>
        </header>

        German's Adventure Corner welcomes you to the premier online shop for all your gaming computer needs.
        Founded in 2024 by German Medina and his long time friend, Longfellow Deeds, German's Adventure Corner quickly
        became the industry's go-to business for top of the line gaming products and parts. Please come see us.<br><br>

        <a th:href="@{/mainscreen}" >Return to main page</a>
            </body>
        </html>


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.


Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

    INSERT - BootStrapData - Lines 71-162


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



F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.


    CREATE purchasesuccessful.html - Entire DOC

    <!DOCTYPE html>
    <html lang="en">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <head>
        <meta charset="UTF-8">
        <title>Purchase Successful!</title>
    </head>
        <h1 style = "text-align:center">Your purchase is processing.</h1>
        <body style = "text-align:center">
            <a th:href="@{/mainscreen}"> Return</a>
        </body>
    </html>



    CREATE purchasefailed.html - Entire DOC

    <!DOCTYPE html>
    <html lang="en">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <head>
        <meta charset="UTF-8">
        <title>We're Sorry!</title>
        <h1 style="text-align: center">We're Sorry!</h1>
    </head>
    <br><br>
    <body style="text-align: center">
        The item you have requested is out of stock.
    <br> <br> <br>
    <div>
        <a style="text-align: center;" th:href="@{/mainscreen}" >Return</a>
    </div>
    </body>
    </html>


    INSERT - mainscreen.html - Line 89

    <a th:href="@{/buyProduct(productID=${tempProduct.id})}" class="btn btn-primary btn-sm mb-3">Buy now</a>


    INSERT - product - line 111-120

    //check inv before accepting buynow click
    public boolean buyProduct() {
        if (this.inv >= 1 ) {
            this.inv--;
            return true;
        } else {
            return false;
        }

    }


    CREATE  BuyProductController - Entire DOC

    package com.example.demo.controllers;

    import com.example.demo.domain.Product;
    import com.example.demo.repositories.ProductRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.context.annotation.ComponentScan;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import java.util.Optional;

    @Controller
    public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theId, Model theModel) {
        Optional<Product> productToBuy = productRepository.findById(theId);

        if (productToBuy.isPresent()) {                 //check if product in DB
            Product product = productToBuy.get();

            if (product.getInv() > 0) {                 //check if product in stock
                product.setInv(product.getInv() - 1);   //decrement stock
                productRepository.save(product);        //save to product DB

                return "purchasesuccessful";            //successful purchase
            } else {
                return "purchasefailed";                //purchase failed: out of stock
            }
        } else {
            return "purchasefailed";                    //purchase failed: product not in DB
        }
    }


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

    INSERT - mainscreen - lines 38-39

        < th > Minimum < /th > 
        < th > Maximum < /th > 
    
    INSERT - mainscreen - lines 48-49 
        < td th:text="${tempPart.minimum}" > 1 < /td > 
        < td th:text="${tempPart.maximum}" > 1 < /td >


    INSERT - part.java - lines 36-38

        @Min (value = 0, message = "Minimum inventory must be > 0")
        int minimum;
        int maximum;

        INSERT - part.java lines 123-126

        public void setMinimum(int minimum) {this.minimum = minimum;}
        public int getMinimum() {return this.minimum;}
        public void setMaximum(int maximum) {this.maximum = maximum;}
        public int getMaximum() {return this.maximum;}

    INSERT - InhousePart.java (lines 18-20) AND OutsourcedPart.java (lines 18-19)
        // Adding values for maximum and minimum, but can be changed in web app
        this.minimum = 0;
        this.maximum = 100;


    INSERT - InhousePartForm(lines 24-34) and OutSourcedPartForm(lines 25-31) 
    <p><input type="text" th:field="*{minimum}" placeholder="Minimum" class="form-control mb-4 col-4"/></p>

    <p><input type="text" th:field="*{maximum}" placeholder="Maximum" class="form-control mb-4 col-4"/></p>

    <p><input type="text" th:field="*{partId}" placeholder="Part ID" class="form-control mb-4 col-4"/></p>

    <p>
        <div th:if="${#fields.hasAnyErrors()}">
            <ul><li th:each="err: ${#fields.allErrors()}" th:text="${err}"></li></ul>
        </div>
    </p>


    MODIFY - application properties - line 6
        spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db102
                                    TO
        spring.datasource.url=jdbc:h2:file:~/src/main/resources/spring-boot-h2-db102

    
    INSERT - part.java - lines 105-111
    
        public void validateLimits() {
        if (this.inv < this.minimum) {
            this.inv = this.minimum;
        } else if (this.inv > this.maximum) {
            this.inv = this.maximum;
        }
    }

    INSERT - InhousePartServiceImpl.java(line 54) AND OutsourcedPartServiceImpl.java(line 52)
        thePart.validateLimits();



H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

     INSERT - Part.java (lines 21-22)
        @ValidInventory
        @ValidPartInventoryMaximum



    CREATE PartInventoryValidator - entire doc

    package com.example.demo.validators;
    import com.example.demo.domain.Part;
    import org.springframework.context.ApplicationContext;
    import org.springframework.beans.factory.annotation.Autowired;
    import javax.validation.ConstraintValidatorContext;
    import javax.validation.ConstraintValidator;

    public class PartInventoryValidator implements ConstraintValidator<ValidInventory, Part> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMinimum();
    }
    }


    CREATE ValidInventory - entire doc

    package com.example.demo.validators;
    import javax.validation.Constraint;
    import javax.validation.Payload;
    import java.lang.annotation.ElementType;
    import java.lang.annotation.Retention;
    import java.lang.annotation.RetentionPolicy;
    import java.lang.annotation.Target;

    @Constraint(validatedBy = {PartInventoryValidator.class})
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ValidInventory {
    String message() default "Invalid Inventory - below minimum";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    }

    
    CREATE PartsInventoryMaximumValidator - entire doc

    package com.example.demo.validators;
    import com.example.demo.domain.Part;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.context.ApplicationContext;
    import javax.validation.ConstraintValidatorContext;
    import javax.validation.ConstraintValidator;

    public class PartInventoryMaximumValidator implements ConstraintValidator<ValidPartInventoryMaximum, Part> {
    @Autowired
    private ApplicationContext context;

    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidPartInventoryMaximum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() <= part.getMaximum();
    }
    }


    CREATE ValidPartInventoryMaximum - entire doc

    package com.example.demo.validators;
    import javax.validation.Constraint;
    import java.lang.annotation.ElementType;
    import java.lang.annotation.Retention;
    import java.lang.annotation.RetentionPolicy;
    import java.lang.annotation.Target;
    /**
    *
    *
    *
    *
    */
    @Constraint(validatedBy = {PartInventoryMaximumValidator.class})
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ValidPartInventoryMaximum {
    String message() default "Inventory cannot be higher than required maximum";
    Class [] groups() default {};
    Class [] payload() default {};
    }





I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

    INSERT - PartTest.java - lines 160-176 //tests ran successfully 

    @Test
    void getMinimum() {
        int minimum=5;
        partIn.setMinimum(minimum);
        assertEquals(minimum, partIn.getMinimum());
        partOut.setMinimum(minimum);
        assertEquals(minimum, partOut.getMinimum());
    }

    @Test
    void getMaximum() {
        int maximum=5;
        partIn.setMaximum(maximum);
        assertEquals(maximum, partIn.getMaximum());
        partOut.setMaximum(maximum);
        assertEquals(maximum, partOut.getMaximum());
    }


J.  Remove the class files for any unused validators in order to clean your code.

    Validator review:
    
    - DeletePartValidator : Used in Part.java
    - EnufPartsValidator  : Used in Product.java
    - PartInventoryMaximumValidator : Used in Part.Java
    - PartInventory.java  : Used in Part.java
    - PriceProductValidator : Product.java

    Validators used: 5/5