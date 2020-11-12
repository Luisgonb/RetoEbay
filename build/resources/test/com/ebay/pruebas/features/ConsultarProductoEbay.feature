#language:es

Característica: Consultar en ebay

 @tes
Escenario: Consultar Articulos en ebay
    Dado que estoy en la pagina de inicio ebay e ingreso la el articulo
    Cuando selecciono la opcion buscar
      
      | bicicleta| 
      
    Entonces valido que aparezca el mensaje  <Bicicleta de montaña/> 
