FROM ghcr.io/navikt/hops-build AS build1

FROM build1 AS build
COPY . .
ARG project
RUN gradle ${project}:shadowJar --no-daemon --no-build-cache

FROM navikt/java:16
COPY --from=build /home/gradle/*/build/libs/*.jar app.jar
