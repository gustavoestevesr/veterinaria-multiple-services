# 👨‍🔧 Arquitetura de Microsserviços (MSA)

## 👨‍💻 Projeto:
Desenvolvimento de uma aplicação para Veterinária formada por um conjunto de pequenos serviços que são executadas isoladamente em seu próprio processo e se comunicam através do protocolo HTTP.

## 🎯 Objetivo
O objetivo do projeto é entender como é possível subir uma aplicação com múltiplos serviços e inclusive com múltiplas instâncias de um mesmo serviço em execução. Principalmente, como é possível trocar informação de um serviço com o outro?

## 📽 Solução:
Então, através das dependências: Discovery Service e Gateway Service, ambos desenvolvidos pela Netflix!

## 👨‍🏫 Explicação: 
Esses microsserviços são conectados por um serviço de descoberta (Discovery Service) que tem como propósito localizar e registrar os microsserviços de uma aplicação. Além disso, todo o acesso é gerenciado/controlado por um Gateway Service, que funciona como a única via de entrada para as requisições, sendo ele o responsável por direcioná-las para os microsserviços, permitindo que seja feito o roteamento e o balanceamento de carga.

