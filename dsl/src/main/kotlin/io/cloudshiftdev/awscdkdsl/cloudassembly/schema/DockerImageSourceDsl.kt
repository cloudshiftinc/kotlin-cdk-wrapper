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

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.DockerCacheOption
import software.amazon.awscdk.cloudassembly.schema.DockerImageSource

/**
 * Properties for how to produce a Docker image from a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * DockerImageSource dockerImageSource = DockerImageSource.builder()
 * .cacheDisabled(false)
 * .cacheFrom(List.of(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build()))
 * .cacheTo(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build())
 * .directory("directory")
 * .dockerBuildArgs(Map.of(
 * "dockerBuildArgsKey", "dockerBuildArgs"))
 * .dockerBuildSecrets(Map.of(
 * "dockerBuildSecretsKey", "dockerBuildSecrets"))
 * .dockerBuildSsh("dockerBuildSsh")
 * .dockerBuildTarget("dockerBuildTarget")
 * .dockerFile("dockerFile")
 * .dockerOutputs(List.of("dockerOutputs"))
 * .executable(List.of("executable"))
 * .networkMode("networkMode")
 * .platform("platform")
 * .build();
 * ```
 */
@CdkDslMarker
public class DockerImageSourceDsl {
    private val cdkBuilder: DockerImageSource.Builder = DockerImageSource.builder()

    private val _cacheFrom: MutableList<DockerCacheOption> = mutableListOf()

    private val _dockerOutputs: MutableList<String> = mutableListOf()

    private val _executable: MutableList<String> = mutableListOf()

    /**
     * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build` command.
     */
    public fun cacheDisabled(cacheDisabled: Boolean) {
        cdkBuilder.cacheDisabled(cacheDisabled)
    }

    /** @param cacheFrom Cache from options to pass to the `docker build` command. */
    public fun cacheFrom(cacheFrom: DockerCacheOptionDsl.() -> Unit) {
        _cacheFrom.add(DockerCacheOptionDsl().apply(cacheFrom).build())
    }

    /** @param cacheFrom Cache from options to pass to the `docker build` command. */
    public fun cacheFrom(cacheFrom: Collection<DockerCacheOption>) {
        _cacheFrom.addAll(cacheFrom)
    }

    /** @param cacheTo Cache to options to pass to the `docker build` command. */
    public fun cacheTo(cacheTo: DockerCacheOptionDsl.() -> Unit = {}) {
        val builder = DockerCacheOptionDsl()
        builder.apply(cacheTo)
        cdkBuilder.cacheTo(builder.build())
    }

    /** @param cacheTo Cache to options to pass to the `docker build` command. */
    public fun cacheTo(cacheTo: DockerCacheOption) {
        cdkBuilder.cacheTo(cacheTo)
    }

    /**
     * @param directory The directory containing the Docker image build instructions. This path is
     *   relative to the asset manifest location.
     */
    public fun directory(directory: String) {
        cdkBuilder.directory(directory)
    }

    /** @param dockerBuildArgs Additional build arguments. Only allowed when `directory` is set. */
    public fun dockerBuildArgs(dockerBuildArgs: Map<String, String>) {
        cdkBuilder.dockerBuildArgs(dockerBuildArgs)
    }

    /** @param dockerBuildSecrets Additional build secrets. Only allowed when `directory` is set. */
    public fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>) {
        cdkBuilder.dockerBuildSecrets(dockerBuildSecrets)
    }

    /** @param dockerBuildSsh SSH agent socket or keys. Requires building with docker buildkit. */
    public fun dockerBuildSsh(dockerBuildSsh: String) {
        cdkBuilder.dockerBuildSsh(dockerBuildSsh)
    }

    /**
     * @param dockerBuildTarget Target build stage in a Dockerfile with multiple build stages. Only
     *   allowed when `directory` is set.
     */
    public fun dockerBuildTarget(dockerBuildTarget: String) {
        cdkBuilder.dockerBuildTarget(dockerBuildTarget)
    }

    /**
     * @param dockerFile The name of the file with build instructions. Only allowed when `directory`
     *   is set.
     */
    public fun dockerFile(dockerFile: String) {
        cdkBuilder.dockerFile(dockerFile)
    }

    /** @param dockerOutputs Outputs. */
    public fun dockerOutputs(vararg dockerOutputs: String) {
        _dockerOutputs.addAll(listOf(*dockerOutputs))
    }

    /** @param dockerOutputs Outputs. */
    public fun dockerOutputs(dockerOutputs: Collection<String>) {
        _dockerOutputs.addAll(dockerOutputs)
    }

    /**
     * @param executable A command-line executable that returns the name of a local Docker image on
     *   stdout after being run.
     */
    public fun executable(vararg executable: String) {
        _executable.addAll(listOf(*executable))
    }

    /**
     * @param executable A command-line executable that returns the name of a local Docker image on
     *   stdout after being run.
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
     *   build images on a specific platform/architecture.
     */
    public fun platform(platform: String) {
        cdkBuilder.platform(platform)
    }

    public fun build(): DockerImageSource {
        if (_cacheFrom.isNotEmpty()) cdkBuilder.cacheFrom(_cacheFrom)
        if (_dockerOutputs.isNotEmpty()) cdkBuilder.dockerOutputs(_dockerOutputs)
        if (_executable.isNotEmpty()) cdkBuilder.executable(_executable)
        return cdkBuilder.build()
    }
}
