package com.mintic.casadeportiva;

import com.mintic.casadeportiva.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mintic.casadeportiva.repository.ProductRepository;

@SpringBootApplication
public class CasaDeportivaApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;


    /*
    * public CasaDeportivaApplication(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    * */

    public static void main(String[] args) {
        SpringApplication.run(CasaDeportivaApplication.class, args);
    }

    @Override
    public void run(String...args) throws Exception{
        productRepository.deleteAll();

        productRepository.save(new Product("Bicicleta Montaña","Bicicleta Scott Doble Suspension", "Cuadro Spark en aleación SL\n" +
                "Horquilla RockShox Judy 130 mm\n" +
                "X-Fusion Nude 5, 120 mm, TwinLoc\n" +
                "Shimano XT-Deore, 12 velocidades\n" +
                "Frenos de disco Shimano\n" +
                "Llantas Syncros X-30SE TR\n" +
                "Cubiertas Schwalbe Wicked Will\n" +
                "Tija ajustable y componentes Syncros\n" +
                "Talla: M", 11490, 60,"https://www.nitrobikes.com.co/wp-content/uploads/2021/12/9601.jpg"));
        productRepository.save(new Product("Bicicleta Montaña","Bicicleta Scott Scale RC", "Cuadro Scale RC en carbono HMF\n" +
                "RockShox SID SL RL 100 mm\n" +
                "Control remoto RideLoc\n" +
                "Shimano XT, 12 velocidades\n" +
                "Frenos de disco Shimano XT\n" +
                "Ruedas Syncros Silverton 2.0 TR\n" +
                "Cubiertas Schwalbe Racing Kevlar\n" +
                "Componentes Syncros", 12990, 50,"https://www.nitrobikes.com.co/wp-content/uploads/2021/12/rc10.jpg"));
        productRepository.save(new Product("Bicicleta Montaña","Bicicleta Scott Scale 940", "Not found", 8150, 50,"https://www.nitrobikes.com.co/wp-content/uploads/2021/11/SCA2.jpg"));
        productRepository.save(new Product("Bicicleta Montaña","Bicicleta Scott Scale 950 Slate Grey", "Cuadro Boost de aleación 6061 Scale\n" +
                "RockShox Judy 100 mm Maxel\n" +
                "Control remoto RideLoc con 2 posiciones\n" +
                "Shimano SLX-Deore, 12 velocidades\n" +
                "Frenos de disco Shimano\n" +
                "Llantas Syncros\n" +
                "Cubiertas Maxxis Rekon Race\n" +
                "Disponible en talla M\n" +
                "Modelo 2022\n", 5990, 10,"https://www.nitrobikes.com.co/wp-content/uploads/2022/02/SCALE-965A.jpg"));
        productRepository.save(new Product("Bicicleta Montaña","Bicicleta Scott Cotenssa Active 50", "Cuadro de aleación Active 700/900\n" +
                "Horquilla Suntour XCE28 100 mm\n" +
                "Shimano TX800 16, velocidades\n" +
                "Tektro hidráulicos Frenos de disco hidráulicos\n" +
                "Kenda Booster", 2480, 50,"https://www.nitrobikes.com.co/wp-content/uploads/2020/09/VERDE1.jpg"));
        productRepository.save(new Product("Bicicleta Ruta","Bicicleta Scott Addict 20", "Bicicleta de ruta\n" +
                "Marca: SCOTT\n" +
                "Referencia: ADDICT 20\n" +
                "Color: Verde, con logo blanco\n" +
                "11 Velocidades\n" +
                "Modelo 2022\n" +
                "Estado de la Bicicleta: Nuevo\n" +
                "Cuadro de carbono HMF Addict Disc\n" +
                "Horquilla Addict HMF\n" +
                "Shimano Ultegra Disc, 22 velocidades\n" +
                "Ruedas Syncros RP2.0 Disc\n" +
                "Cubiertas Schwalbe ONE\n" +
                "Componentes de carbono/aleación Syncros", 12250, 70,"https://www.nitrobikes.com.co/wp-content/uploads/2022/02/ADDICT20.jpg"));
        productRepository.save(new Product("Bicicleta Ruta","Bicicleta Scott Addict RC 30", "Cuadro de carbono HMX Addict RC Disc\n" +
                "Horquilla Addict RC HMX\n" +
                "SRAM RIVAL eTap AXS, 24 velocidades\n" +
                "Ruedas Syncros RP2.0 Disc\n" +
                "Cubiertas Schwalbe ONE Race-Guard\n" +
                "Componentes de carbono/aleación Syncros", 17650, 50,"https://www.nitrobikes.com.co/wp-content/uploads/2021/12/rc10.jpg"));
        productRepository.save(new Product("Casco","Casco Bunker STL BJL-105", "Casco Bunker STL BJL-105\n" +
                "\n" +
                "Casco BMX", 85, 150,"https://www.nitrobikes.com.co/wp-content/uploads/2020/05/BUN1.jpg"));
        productRepository.save(new Product("Casco","Casco Centric Plus", "Casco Centric", 690, 150,"https://www.nitrobikes.com.co/wp-content/uploads/2020/05/ACCCAS103.jpg"));
        productRepository.save(new Product("Casco","Casco Giro Vasona", "Casco de ciclismo VASONA Fit and Feeling Good.\n" +
                "\n" +
                "El casco Vasona combina un diseño elegante y ventilado con características inteligentes y una construcción ligera que se adapta a tu estilo en la carretera y en el terreno.",
                230, 140,"https://www.nitrobikes.com.co/wp-content/uploads/2021/09/va4.jpg"));
        productRepository.save(new Product("Casco","Casco Giro Vasona MIPS", "Casco Giro", 225, 150,"https://www.nitrobikes.com.co/wp-content/uploads/2020/08/e9a0452c-e9fa-4271-9156-0d4239a30ddd.jpg"));
        productRepository.save(new Product("Bolsa Hidrantante","Bolsa Hidratante CamelBak Rogue", "CamelBak Rogue", 338, 70,"https://www.nitrobikes.com.co/wp-content/uploads/2019/06/e70b4f00-e652-4c51-bd94-5cd33291254c-1.jpg"));
        productRepository.save(new Product("Bolsa Hidrantante","Bolsa Hidratante HidroBak", "Hidrobak", 170, 70,"https://www.nitrobikes.com.co/wp-content/uploads/2019/06/ACCBOL084.jpg"));
        productRepository.save(new Product("Candado","Candado kriptoflex", "Guaya Bicicletas KryptoFlex 1018 Key Cable\n" +
                "\n" +
                "• Cable trenzado en acero de 10mm provee resistencia opImizada para intentos de corte.\n" +
                "• Integrado, candado de sistema de combinación reseteable de 4 dígitos con número de marcación indexados para una fijación de combinación libre de errores.\n" +
                "• Cubierta protectora de vinilo.\n" +
                "• Programa Combo Safe, REGISTRO y REPOSICIÓN de llaves de por vida.", 370, 100,"https://www.nitrobikes.com.co/wp-content/uploads/2021/08/lla1-1.jpg"));
        productRepository.save(new Product("Candado","Candado Herradura Kinguard", "Candado en Herradura\n" +
                "\n" +
                "Marca: Kinguard", 370, 68,"https://www.nitrobikes.com.co/wp-content/uploads/2021/04/0d049f33-ea4d-469f-aff2-4e0e8cb9ad55.jpg"));
        productRepository.save(new Product("Ciclo Computador","Banda Cayete Frecuencia Cardiaca", "La banda de frecuencia cardiaca Cateye HR-12 realiza el seguimiento a tu corazón y a las calorías quemadas durante tu actividad física. Esta viene con tecnología Bluetooth, puedes conectar tu smartphone, relojes GPS y ciclo computadores.\n" +
                "\n" +
                "Conectividad: Bluetooth Smart\n" +
                "Batería: CR2032", 275, 65,"https://www.nitrobikes.com.co/wp-content/uploads/2021/04/Sin-titulo-1.jpg"));
        productRepository.save(new Product("Ciclo Computador","Ciclocomputador Sigma 23 Funciones", "Velocímetro ciclocomputador 23 funciones SIGMA 23.16 STS inalámbrico\n" +
                "Funciones de bicicleta:\n" +
                "Temperatura actual\n" +
                "Kilómetros totales\n" +
                "Velocidad máxima\n" +
                "Velocidad actual\n" +
                "Hora (12/24)\n" +
                "Tiempo del recorrido / Tiempo de entrenamiento\n" +
                "Distancia del recorrido\n" +
                "Distancia total para más ruedas\n" +
                "Tiempo total recorrido / Tiempo total entrenamiento", 500, 85,"https://www.nitrobikes.com.co/wp-content/uploads/2019/06/SIGMA-2.jpg"));
        productRepository.save(new Product("Ciclo Computador","Ciclocomputador Cayete Velo Wireless", "Wireless", 135,185,"https://www.nitrobikes.com.co/wp-content/uploads/2021/02/VELO.png"));
        productRepository.save(new Product("Luces","Luz delantera con velocimetro y pito", "Hecho de material ABS de alta calidad, IPX4 resistente al agua.\n" +
                "5 modos de iluminación para elegir, salida de 300 lúmenes, iluminando el camino por delante.\n" +
                "Combina con 2 luces antiniebla ámbar destacadas, que tienen una fuerte penetrabilidad, pudiendo iluminar las carreteras delanteras incluso en días nublados o lluviosos.", 105,105,"https://www.nitrobikes.com.co/wp-content/uploads/2021/05/luzp1.jpg"));
        productRepository.save(new Product("Luces","Luz trasera Avenue R-50", "Luz", 145,195,"https://www.nitrobikes.com.co/wp-content/uploads/2019/06/R-5000.jpg"));




    }

}
