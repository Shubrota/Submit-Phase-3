FROM anapsix/alpine-java 
LABEL maintainer="shubrota@gmail.com" 
COPY /TaxiBooking/target/TaxiBooking-0.0.1-SNAPSHOT.jar /home/TaxiBooking-0.0.1-SNAPSHOT.jar 
CMD ["java","-jar","/home/TaxiBooking-0.0.1-SNAPSHOT.jar"]