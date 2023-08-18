@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.DockerCacheOption
import software.amazon.awscdk.DockerImageAssetSource

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * DockerImageAssetSource dockerImageAssetSource = DockerImageAssetSource.builder()
 * .sourceHash("sourceHash")
 * // the properties below are optional
 * .assetName("assetName")
 * .directoryName("directoryName")
 * .dockerBuildArgs(Map.of(
 * "dockerBuildArgsKey", "dockerBuildArgs"))
 * .dockerBuildSecrets(Map.of(
 * "dockerBuildSecretsKey", "dockerBuildSecrets"))
 * .dockerBuildSsh("dockerBuildSsh")
 * .dockerBuildTarget("dockerBuildTarget")
 * .dockerCacheFrom(List.of(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build()))
 * .dockerCacheTo(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build())
 * .dockerFile("dockerFile")
 * .dockerOutputs(List.of("dockerOutputs"))
 * .executable(List.of("executable"))
 * .networkMode("networkMode")
 * .platform("platform")
 * .build();
 * ```
 */
@CdkDslMarker
public class DockerImageAssetSourceDsl {
    private val cdkBuilder: DockerImageAssetSource.Builder = DockerImageAssetSource.builder()

    private val _dockerCacheFrom: MutableList<DockerCacheOption> = mutableListOf()

    private val _dockerOutputs: MutableList<String> = mutableListOf()

    private val _executable: MutableList<String> = mutableListOf()

    /**
     * @param assetName Unique identifier of the docker image asset and its potential revisions.
     *   Required if using AppScopedStagingSynthesizer.
     */
    public fun assetName(assetName: String) {
        cdkBuilder.assetName(assetName)
    }

    /**
     * @param directoryName The directory where the Dockerfile is stored, must be relative to the
     *   cloud assembly root.
     */
    public fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
    }

    /**
     * @param dockerBuildArgs Build args to pass to the `docker build` command. Since Docker build
     *   arguments are resolved before deployment, keys and values cannot refer to unresolved tokens
     *   (such as `lambda.functionArn` or `queue.queueUrl`).
     *
     * Only allowed when `directoryName` is specified.
     */
    public fun dockerBuildArgs(dockerBuildArgs: Map<String, String>) {
        cdkBuilder.dockerBuildArgs(dockerBuildArgs)
    }

    /**
     * @param dockerBuildSecrets Build secrets to pass to the `docker build` command. Since Docker
     *   build secrets are resolved before deployment, keys and values cannot refer to unresolved
     *   tokens (such as `lambda.functionArn` or `queue.queueUrl`).
     *
     * Only allowed when `directoryName` is specified.
     */
    public fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>) {
        cdkBuilder.dockerBuildSecrets(dockerBuildSecrets)
    }

    /** @param dockerBuildSsh SSH agent socket or keys to pass to the `docker buildx` command. */
    public fun dockerBuildSsh(dockerBuildSsh: String) {
        cdkBuilder.dockerBuildSsh(dockerBuildSsh)
    }

    /**
     * @param dockerBuildTarget Docker target to build to. Only allowed when `directoryName` is
     *   specified.
     */
    public fun dockerBuildTarget(dockerBuildTarget: String) {
        cdkBuilder.dockerBuildTarget(dockerBuildTarget)
    }

    /** @param dockerCacheFrom Cache from options to pass to the `docker build` command. */
    public fun dockerCacheFrom(dockerCacheFrom: DockerCacheOptionDsl.() -> Unit) {
        _dockerCacheFrom.add(DockerCacheOptionDsl().apply(dockerCacheFrom).build())
    }

    /** @param dockerCacheFrom Cache from options to pass to the `docker build` command. */
    public fun dockerCacheFrom(dockerCacheFrom: Collection<DockerCacheOption>) {
        _dockerCacheFrom.addAll(dockerCacheFrom)
    }

    /** @param dockerCacheTo Cache to options to pass to the `docker build` command. */
    public fun dockerCacheTo(dockerCacheTo: DockerCacheOptionDsl.() -> Unit = {}) {
        val builder = DockerCacheOptionDsl()
        builder.apply(dockerCacheTo)
        cdkBuilder.dockerCacheTo(builder.build())
    }

    /** @param dockerCacheTo Cache to options to pass to the `docker build` command. */
    public fun dockerCacheTo(dockerCacheTo: DockerCacheOption) {
        cdkBuilder.dockerCacheTo(dockerCacheTo)
    }

    /**
     * @param dockerFile Path to the Dockerfile (relative to the directory). Only allowed when
     *   `directoryName` is specified.
     */
    public fun dockerFile(dockerFile: String) {
        cdkBuilder.dockerFile(dockerFile)
    }

    /** @param dockerOutputs Outputs to pass to the `docker build` command. */
    public fun dockerOutputs(vararg dockerOutputs: String) {
        _dockerOutputs.addAll(listOf(*dockerOutputs))
    }

    /** @param dockerOutputs Outputs to pass to the `docker build` command. */
    public fun dockerOutputs(dockerOutputs: Collection<String>) {
        _dockerOutputs.addAll(dockerOutputs)
    }

    /**
     * @param executable An external command that will produce the packaged asset. The command
     *   should produce the name of a local Docker image on `stdout`.
     */
    public fun executable(vararg executable: String) {
        _executable.addAll(listOf(*executable))
    }

    /**
     * @param executable An external command that will produce the packaged asset. The command
     *   should produce the name of a local Docker image on `stdout`.
     */
    public fun executable(executable: Collection<String>) {
        _executable.addAll(executable)
    }

    /**
     * @param networkMode Networking mode for the RUN commands during build. *Requires Docker Engine
     *   API v1.25+*. Specify this property to build images on a specific networking mode.
     */
    public fun networkMode(networkMode: String) {
        cdkBuilder.networkMode(networkMode)
    }

    /**
     * @param platform Platform to build for. *Requires Docker Buildx*. Specify this property to
     *   build images on a specific platform.
     */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    /**
     * @param sourceHash The hash of the contents of the docker build context. This hash is used
     *   throughout the system to identify this image and avoid duplicate work in case the source
     *   did not change.
     *
     * NOTE: this means that if you wish to update your docker image, you must make a modification
     * to the source (e.g. add some metadata to your Dockerfile).
     */
    public fun sourceHash(sourceHash: String) {
        cdkBuilder.sourceHash(sourceHash)
    }

    public fun build(): DockerImageAssetSource {
        if (_dockerCacheFrom.isNotEmpty()) cdkBuilder.dockerCacheFrom(_dockerCacheFrom)
        if (_dockerOutputs.isNotEmpty()) cdkBuilder.dockerOutputs(_dockerOutputs)
        if (_executable.isNotEmpty()) cdkBuilder.executable(_executable)
        return cdkBuilder.build()
    }
}
