#!/usr/bin/env sh

liquibase --url=${DATABASE_DB_CONNECTION_STRING} \
    --changeLogFile="migrations.xml" \
    --username="${DB_USER}" \
    --password="${DB_PASSWORD}"
