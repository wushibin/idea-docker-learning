FROM java:8-jdk

ADD ./startup.sh /startup.sh
ADD ./target/idea-docker-plugin-usage-1.0-SNAPSHOT.jar /idea-docker-plugin-usage.jar
RUN bash -c 'touch /idea-docker-plugin-usage.jar'
EXPOSE 58080
EXPOSE 58000
ENTRYPOINT ["bash", "/startup.sh"]