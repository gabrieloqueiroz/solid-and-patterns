# Builder

Este Desing-Pattern tem como objetivo resolver a criação de objetos complexos, com muitos parametros.

- Os muitos atributos separamos em classes ou enums, que seriam nossos **components**.
Neste caso temos os seguintes componetens: `` Engine, Transmission, CarType, Colors, Brands.``
- Temos as nossas entidades, que terá suas caracteristicas. Por exemplo temos todos os tipos de veículos: ``Car, SportCar, Truck``.
- O método abstrato que é implementado por cada classe _concreta_ devolve uma instância *Vehicle*;
- As classes builders de fato, são as classes que executam a montagem do objeto.
- A classe diretor é quem direciona para o builder o passo a passo da montagem de cada produto.