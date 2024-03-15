@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for how to produce a Docker image from a source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
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
public interface DockerImageSource {
  /**
   * Disable the cache and pass `--no-cache` to the `docker build` command.
   *
   * Default: - cache is used
   */
  public fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

  /**
   * Cache from options to pass to the `docker build` command.
   *
   * Default: - no cache from options are passed to the build command
   *
   * [Documentation](https://docs.docker.com/build/cache/backends/)
   */
  public fun cacheFrom(): List<DockerCacheOption> =
      unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

  /**
   * Cache to options to pass to the `docker build` command.
   *
   * Default: - no cache to options are passed to the build command
   *
   * [Documentation](https://docs.docker.com/build/cache/backends/)
   */
  public fun cacheTo(): DockerCacheOption? = unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

  /**
   * The directory containing the Docker image build instructions.
   *
   * This path is relative to the asset manifest location.
   *
   * Default: - Exactly one of `directory` and `executable` is required
   */
  public fun directory(): String? = unwrap(this).getDirectory()

  /**
   * Additional build arguments.
   *
   * Only allowed when `directory` is set.
   *
   * Default: - No additional build arguments
   */
  public fun dockerBuildArgs(): Map<String, String> = unwrap(this).getDockerBuildArgs() ?:
      emptyMap()

  /**
   * Additional build secrets.
   *
   * Only allowed when `directory` is set.
   *
   * Default: - No additional build secrets
   */
  public fun dockerBuildSecrets(): Map<String, String> = unwrap(this).getDockerBuildSecrets() ?:
      emptyMap()

  /**
   * SSH agent socket or keys.
   *
   * Requires building with docker buildkit.
   *
   * Default: - No ssh flag is set
   */
  public fun dockerBuildSsh(): String? = unwrap(this).getDockerBuildSsh()

  /**
   * Target build stage in a Dockerfile with multiple build stages.
   *
   * Only allowed when `directory` is set.
   *
   * Default: - The last stage in the Dockerfile
   */
  public fun dockerBuildTarget(): String? = unwrap(this).getDockerBuildTarget()

  /**
   * The name of the file with build instructions.
   *
   * Only allowed when `directory` is set.
   *
   * Default: "Dockerfile"
   */
  public fun dockerFile(): String? = unwrap(this).getDockerFile()

  /**
   * Outputs.
   *
   * Default: - no outputs are passed to the build command (default outputs are used)
   *
   * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
   */
  public fun dockerOutputs(): List<String> = unwrap(this).getDockerOutputs() ?: emptyList()

  /**
   * A command-line executable that returns the name of a local Docker image on stdout after being
   * run.
   *
   * Default: - Exactly one of `directory` and `executable` is required
   */
  public fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

  /**
   * Networking mode for the RUN commands during build. *Requires Docker Engine API v1.25+*.
   *
   * Specify this property to build images on a specific networking mode.
   *
   * Default: - no networking mode specified
   */
  public fun networkMode(): String? = unwrap(this).getNetworkMode()

  /**
   * Platform to build for. *Requires Docker Buildx*.
   *
   * Specify this property to build images on a specific platform/architecture.
   *
   * Default: - current machine platform
   */
  public fun platform(): String? = unwrap(this).getPlatform()

  /**
   * A builder for [DockerImageSource]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build` command.
     */
    public fun cacheDisabled(cacheDisabled: Boolean)

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    public fun cacheFrom(cacheFrom: List<DockerCacheOption>)

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    public fun cacheFrom(vararg cacheFrom: DockerCacheOption)

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    public fun cacheTo(cacheTo: DockerCacheOption)

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6351ac2eb73a01241d0b2f13b4100f776f02dce966026e6ef65f34569c1dd197")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    /**
     * @param directory The directory containing the Docker image build instructions.
     * This path is relative to the asset manifest location.
     */
    public fun directory(directory: String)

    /**
     * @param dockerBuildArgs Additional build arguments.
     * Only allowed when `directory` is set.
     */
    public fun dockerBuildArgs(dockerBuildArgs: Map<String, String>)

    /**
     * @param dockerBuildSecrets Additional build secrets.
     * Only allowed when `directory` is set.
     */
    public fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>)

    /**
     * @param dockerBuildSsh SSH agent socket or keys.
     * Requires building with docker buildkit.
     */
    public fun dockerBuildSsh(dockerBuildSsh: String)

    /**
     * @param dockerBuildTarget Target build stage in a Dockerfile with multiple build stages.
     * Only allowed when `directory` is set.
     */
    public fun dockerBuildTarget(dockerBuildTarget: String)

    /**
     * @param dockerFile The name of the file with build instructions.
     * Only allowed when `directory` is set.
     */
    public fun dockerFile(dockerFile: String)

    /**
     * @param dockerOutputs Outputs.
     */
    public fun dockerOutputs(dockerOutputs: List<String>)

    /**
     * @param dockerOutputs Outputs.
     */
    public fun dockerOutputs(vararg dockerOutputs: String)

    /**
     * @param executable A command-line executable that returns the name of a local Docker image on
     * stdout after being run.
     */
    public fun executable(executable: List<String>)

    /**
     * @param executable A command-line executable that returns the name of a local Docker image on
     * stdout after being run.
     */
    public fun executable(vararg executable: String)

    /**
     * @param networkMode Networking mode for the RUN commands during build. *Requires Docker Engine
     * API v1.25+*.
     * Specify this property to build images on a specific networking mode.
     */
    public fun networkMode(networkMode: String)

    /**
     * @param platform Platform to build for. *Requires Docker Buildx*.
     * Specify this property to build images on a specific platform/architecture.
     */
    public fun platform(platform: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DockerImageSource.Builder =
        software.amazon.awscdk.cloudassembly.schema.DockerImageSource.builder()

    /**
     * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build` command.
     */
    override fun cacheDisabled(cacheDisabled: Boolean) {
      cdkBuilder.cacheDisabled(cacheDisabled)
    }

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    override fun cacheFrom(cacheFrom: List<DockerCacheOption>) {
      cdkBuilder.cacheFrom(cacheFrom.map(DockerCacheOption::unwrap))
    }

    /**
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    override fun cacheFrom(vararg cacheFrom: DockerCacheOption): Unit =
        cacheFrom(cacheFrom.toList())

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    override fun cacheTo(cacheTo: DockerCacheOption) {
      cdkBuilder.cacheTo(cacheTo.let(DockerCacheOption::unwrap))
    }

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6351ac2eb73a01241d0b2f13b4100f776f02dce966026e6ef65f34569c1dd197")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    /**
     * @param directory The directory containing the Docker image build instructions.
     * This path is relative to the asset manifest location.
     */
    override fun directory(directory: String) {
      cdkBuilder.directory(directory)
    }

    /**
     * @param dockerBuildArgs Additional build arguments.
     * Only allowed when `directory` is set.
     */
    override fun dockerBuildArgs(dockerBuildArgs: Map<String, String>) {
      cdkBuilder.dockerBuildArgs(dockerBuildArgs)
    }

    /**
     * @param dockerBuildSecrets Additional build secrets.
     * Only allowed when `directory` is set.
     */
    override fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>) {
      cdkBuilder.dockerBuildSecrets(dockerBuildSecrets)
    }

    /**
     * @param dockerBuildSsh SSH agent socket or keys.
     * Requires building with docker buildkit.
     */
    override fun dockerBuildSsh(dockerBuildSsh: String) {
      cdkBuilder.dockerBuildSsh(dockerBuildSsh)
    }

    /**
     * @param dockerBuildTarget Target build stage in a Dockerfile with multiple build stages.
     * Only allowed when `directory` is set.
     */
    override fun dockerBuildTarget(dockerBuildTarget: String) {
      cdkBuilder.dockerBuildTarget(dockerBuildTarget)
    }

    /**
     * @param dockerFile The name of the file with build instructions.
     * Only allowed when `directory` is set.
     */
    override fun dockerFile(dockerFile: String) {
      cdkBuilder.dockerFile(dockerFile)
    }

    /**
     * @param dockerOutputs Outputs.
     */
    override fun dockerOutputs(dockerOutputs: List<String>) {
      cdkBuilder.dockerOutputs(dockerOutputs)
    }

    /**
     * @param dockerOutputs Outputs.
     */
    override fun dockerOutputs(vararg dockerOutputs: String): Unit =
        dockerOutputs(dockerOutputs.toList())

    /**
     * @param executable A command-line executable that returns the name of a local Docker image on
     * stdout after being run.
     */
    override fun executable(executable: List<String>) {
      cdkBuilder.executable(executable)
    }

    /**
     * @param executable A command-line executable that returns the name of a local Docker image on
     * stdout after being run.
     */
    override fun executable(vararg executable: String): Unit = executable(executable.toList())

    /**
     * @param networkMode Networking mode for the RUN commands during build. *Requires Docker Engine
     * API v1.25+*.
     * Specify this property to build images on a specific networking mode.
     */
    override fun networkMode(networkMode: String) {
      cdkBuilder.networkMode(networkMode)
    }

    /**
     * @param platform Platform to build for. *Requires Docker Buildx*.
     * Specify this property to build images on a specific platform/architecture.
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DockerImageSource =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.DockerImageSource,
  ) : CdkObject(cdkObject), DockerImageSource {
    /**
     * Disable the cache and pass `--no-cache` to the `docker build` command.
     *
     * Default: - cache is used
     */
    override fun cacheDisabled(): Boolean? = unwrap(this).getCacheDisabled()

    /**
     * Cache from options to pass to the `docker build` command.
     *
     * Default: - no cache from options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     */
    override fun cacheFrom(): List<DockerCacheOption> =
        unwrap(this).getCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    /**
     * Cache to options to pass to the `docker build` command.
     *
     * Default: - no cache to options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     */
    override fun cacheTo(): DockerCacheOption? =
        unwrap(this).getCacheTo()?.let(DockerCacheOption::wrap)

    /**
     * The directory containing the Docker image build instructions.
     *
     * This path is relative to the asset manifest location.
     *
     * Default: - Exactly one of `directory` and `executable` is required
     */
    override fun directory(): String? = unwrap(this).getDirectory()

    /**
     * Additional build arguments.
     *
     * Only allowed when `directory` is set.
     *
     * Default: - No additional build arguments
     */
    override fun dockerBuildArgs(): Map<String, String> = unwrap(this).getDockerBuildArgs() ?:
        emptyMap()

    /**
     * Additional build secrets.
     *
     * Only allowed when `directory` is set.
     *
     * Default: - No additional build secrets
     */
    override fun dockerBuildSecrets(): Map<String, String> = unwrap(this).getDockerBuildSecrets() ?:
        emptyMap()

    /**
     * SSH agent socket or keys.
     *
     * Requires building with docker buildkit.
     *
     * Default: - No ssh flag is set
     */
    override fun dockerBuildSsh(): String? = unwrap(this).getDockerBuildSsh()

    /**
     * Target build stage in a Dockerfile with multiple build stages.
     *
     * Only allowed when `directory` is set.
     *
     * Default: - The last stage in the Dockerfile
     */
    override fun dockerBuildTarget(): String? = unwrap(this).getDockerBuildTarget()

    /**
     * The name of the file with build instructions.
     *
     * Only allowed when `directory` is set.
     *
     * Default: "Dockerfile"
     */
    override fun dockerFile(): String? = unwrap(this).getDockerFile()

    /**
     * Outputs.
     *
     * Default: - no outputs are passed to the build command (default outputs are used)
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
     */
    override fun dockerOutputs(): List<String> = unwrap(this).getDockerOutputs() ?: emptyList()

    /**
     * A command-line executable that returns the name of a local Docker image on stdout after being
     * run.
     *
     * Default: - Exactly one of `directory` and `executable` is required
     */
    override fun executable(): List<String> = unwrap(this).getExecutable() ?: emptyList()

    /**
     * Networking mode for the RUN commands during build. *Requires Docker Engine API v1.25+*.
     *
     * Specify this property to build images on a specific networking mode.
     *
     * Default: - no networking mode specified
     */
    override fun networkMode(): String? = unwrap(this).getNetworkMode()

    /**
     * Platform to build for. *Requires Docker Buildx*.
     *
     * Specify this property to build images on a specific platform/architecture.
     *
     * Default: - current machine platform
     */
    override fun platform(): String? = unwrap(this).getPlatform()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DockerImageSource):
        DockerImageSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageSource):
        software.amazon.awscdk.cloudassembly.schema.DockerImageSource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.DockerImageSource
  }
}
