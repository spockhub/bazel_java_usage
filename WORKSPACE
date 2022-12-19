workspace(name = "bazel_java_usage")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

JUNIT5_API_VERSION = "5.7.1"

JUNIT5_PLATFORM_VERSION = "1.7.1"

RULES_JVM_EXTERNAL_TAG = "4.5"

RULES_JVM_EXTERNAL_SHA = "b17d7388feb9bfa7f2fa09031b32707df529f26c91ab9e5d909eb1676badd9a6"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/refs/tags/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "junit:junit:4.13.1",
        "org.openjfx:javafx-base:11",
        "androidx.test.espresso:espresso-core:3.1.1",
        "org.hamcrest:hamcrest-library:2.2",
        "commons-io:commons-io:2.8.0",
        "org.slf4j:slf4j-api:2.0.0-alpha1",
        "org.slf4j:slf4j-simple:2.0.0-alpha1",
        # JUnit 5
        "org.junit.jupiter:junit-jupiter-api:" + JUNIT5_API_VERSION,
        "org.junit.jupiter:junit-jupiter-engine:" + JUNIT5_API_VERSION,
        "org.junit.jupiter:junit-jupiter-params:" + JUNIT5_API_VERSION,
        "org.apiguardian:apiguardian-api:1.1.0",
        "org.opentest4j:opentest4j:1.2.0",
        "org.junit.platform:junit-platform-commons:" + JUNIT5_PLATFORM_VERSION,
        "org.junit.platform:junit-platform-console:" + JUNIT5_PLATFORM_VERSION,
        "org.junit.platform:junit-platform-engine:" + JUNIT5_PLATFORM_VERSION,
        "org.junit.platform:junit-platform-launcher:" + JUNIT5_PLATFORM_VERSION,
        "org.junit.platform:junit-platform-suite-api:" + JUNIT5_PLATFORM_VERSION,
    ],
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
)

CONTRIB_RULES_JVM_VERSION = "0.9.0"

CONTRIB_RULES_JVM_SHA = "548f0583192ff79c317789b03b882a7be9b1325eb5d3da5d7fdcc4b7ca69d543"

http_archive(
    name = "contrib_rules_jvm",
    sha256 = CONTRIB_RULES_JVM_SHA,
    strip_prefix = "rules_jvm-%s" % CONTRIB_RULES_JVM_VERSION,
    url = "https://github.com/bazel-contrib/rules_jvm/archive/refs/tags/v%s.tar.gz" % CONTRIB_RULES_JVM_VERSION,
)

load("@contrib_rules_jvm//:repositories.bzl", "contrib_rules_jvm_deps")

contrib_rules_jvm_deps()

load("@contrib_rules_jvm//:setup.bzl", "contrib_rules_jvm_setup")

contrib_rules_jvm_setup()

load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")

# 有缓存 ，不建议用分支，建议使用commit_id或者tag
git_repository(
    name = "rules_test",
    commit = "af0f1f1d742d1b21d94f4e30a07e2320d9b95c75",
    remote = "https://github.com/spockhub/rules_test.git",
)
