./gradlew :profile:clean

./gradlew :profile_api:assembleRelease
./gradlew :profile_api:publish -Penv=stag -PpublishAar=true
./gradlew :profile_api:publish -Penv=prod -PpublishAar=true

./gradlew :profile:assembleRelease publishAar
./gradlew :profile:publish -Penv=stag -PpublishAar=true
./gradlew :profile:publish -Penv=prod -PpublishAar=true
