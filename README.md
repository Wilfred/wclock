# wclock

A minimal Android app, currently a hello-world screen built with Jetpack Compose.

## Requirements

- JDK 17
- Android SDK with platform API 37 (Android Studio installs it for you; on a bare
  machine, point `ANDROID_HOME` at an SDK and Gradle will fetch what it needs)

Gradle itself does not need to be installed — use the wrapper (`./gradlew`).

## Layout

```
app/                                  the single application module
  src/main/kotlin/uk/me/wilfred/wclock/
    MainActivity.kt                   the launcher activity and home screen
    Greeting.kt                       plain-Kotlin logic, unit tested on the JVM
    ui/theme/                         Material 3 colours, typography and theme
  src/main/res/                       strings, launcher icons, backup rules
  src/test/                           JVM unit tests
  src/androidTest/                    Compose UI tests, run on a device/emulator
gradle/libs.versions.toml             version catalog: all dependency versions
.github/workflows/ci.yml              build, lint, unit tests, instrumented tests
```

## Common tasks

```sh
./gradlew build                       # assemble, lint and run unit tests
./gradlew installDebug                # install on a connected device
./gradlew testDebugUnitTest           # JVM unit tests only
./gradlew connectedDebugAndroidTest   # instrumented tests (needs a device/emulator)
./gradlew lint                        # Android Lint; warnings are errors
```

The debug build uses the application ID `uk.me.wilfred.wclock.debug`, so it can be
installed alongside a release build.

## Conventions

- Dependency versions live only in `gradle/libs.versions.toml`. Compose artifact
  versions come from the Compose BOM, so they are not pinned individually.
- Lint runs with `warningsAsErrors`, so a warning fails the build.
- Anything that does not need Android APIs goes in plain Kotlin and gets a JVM
  unit test; only genuinely UI-level behaviour is covered by instrumented tests.

## CI

Every push to `main` and every pull request runs [`ci.yml`](.github/workflows/ci.yml):

- **Build, lint and unit test** — `./gradlew build` on JDK 17, uploading the debug
  APK and the lint/test reports as artifacts.
- **Instrumented tests** — the Compose UI tests on an API 35 emulator.

Dependabot proposes weekly updates for Gradle dependencies and GitHub Actions.

## License

MIT — see [LICENSE](LICENSE).
