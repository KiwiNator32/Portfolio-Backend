FROM amazoncorretto:17
MAINTAINER lautaroguzzio
COPY target/PortfolioBackend.jar PortfolioBackend.jar
ENTRYPOINT ["java","-jar","/PortfolioBackend.jar"]