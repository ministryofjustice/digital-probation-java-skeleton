#!/usr/bin/env bash

check_exit_code() {
    exit_code=$1
    if [[ ${exit_code} != 0 ]]; then
        echo "Script failed with exit_code ${exit_code}"
        exit ${exit_code}
    fi
}

cd liquibase
./migrate.sh
check_exit_code $?
