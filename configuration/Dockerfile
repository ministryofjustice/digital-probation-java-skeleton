FROM ubuntu:16.04

# Install openjdk so can run liquibase
RUN echo 'en_US.UTF-8 UTF-8' > /etc/locale.gen
RUN apt-get update && apt-get install -y locales openjdk-8-jre curl jq

# Liquibase
ADD database/liquibase-3.6.2-bin.tar.gz /opt/liquibase

# Setup script
COPY setup.sh /opt
RUN chmod +x /opt/setup.sh

# Database script
COPY database/migrate.sh /opt/liquibase

# Copy database change scripts
COPY database/changelogs/changelogs /opt/liquibase/changelogs

RUN chmod +x /opt/liquibase/liquibase && ln -s /opt/liquibase/liquibase /usr/local/bin/ && chmod +x /opt/liquibase/migrate.sh

WORKDIR /opt

CMD ["/bin/bash", "setup.sh"]
