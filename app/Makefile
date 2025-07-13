.DEFAULT_GOAL := build-run

# Определяем ОС (Windows или Unix-like)
ifeq ($(OS), Windows_NT)
    RUN_DIST_CMD = .\build\install\app\bin\app.bat
    GRADLEW = .\gradlew.bat
else
    RUN_DIST_CMD = ./build/install/app/bin/app
    GRADLEW = ./gradlew
endif

setup:
	$(GRADLEW) wrapper --gradle-version 8.5

clean:
	$(GRADLEW) clean

build:
	$(GRADLEW) clean build

install:
	$(GRADLEW) clean install

run-dist:
	@echo "Running distribution..."
	$(RUN_DIST_CMD)

run:
	$(GRADLEW) run

test:
	$(GRADLEW) test

report:
	$(GRADLEW) jacocoTestReport

lint:
	$(GRADLEW) checkstyleMain

check-deps:
	$(GRADLEW) dependencyUpdates -Drevision=release

build-run: build run

.PHONY: setup clean build install run-dist run test report lint check-deps build-run