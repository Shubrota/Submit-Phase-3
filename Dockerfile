FROM anapsix/alpine-java 
LABEL maintainer="shubrota@gmail.com" 
COPY C:/Shubrota/caltech/phase 4/Submit-Phase-3/TaxiBooking/target/TaxiBooking-0.0.1-SNAPSHOT.jar /home/TaxiBooking-0.0.1-SNAPSHOT.jar 
CMD ["java","-jar","/home/TaxiBooking-0.0.1-SNAPSHOT.jar"]