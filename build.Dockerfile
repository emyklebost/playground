FROM ghcr.io/navikt/hops-build AS build
RUN touch foo

FROM navikt/java:16
COPY --from=build /home/gradle/ .
