#!/bin/bash

/usr/share/dependency-check/bin/dependency-check.sh \
    --scan . \
    --format "ALL" \
    --project "Digital Probation Java Skeleton" \
    --out ./dependency-check-report/
