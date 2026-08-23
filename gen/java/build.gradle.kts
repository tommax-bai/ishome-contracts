// ishome contracts Java SDK 包装（生成代码在 src/main/java，由 buf generate 产出，手改无效）
// 消费坐标：com.ishome:ishome-contracts-java（GitHub Packages Maven，发布 job 见仓根 CI，拍板后启用）
// 本地消费（发布启用前）：composite build 或 mavenLocal（./gradlew publishToMavenLocal）
plugins {
    `java-library`
    `maven-publish`
}

group = "com.ishome"
version = "0.1.0"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    api("com.google.protobuf:protobuf-java:4.28.3")
    api("io.grpc:grpc-stub:1.68.1")
    api("io.grpc:grpc-protobuf:1.68.1")
    compileOnly("org.apache.tomcat:annotations-api:6.0.53") // grpc 生成代码的 @Generated
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "ishome-contracts-java"
            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/tommax-bai/ishome-contracts")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
