FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift:latest
USER root
WORKDIR /apps/its
ADD ./its.jar /apps/its/ldap.jar
EXPOSE 8420
USER 1001
CMD java -jar /apps/its/ldap.jar