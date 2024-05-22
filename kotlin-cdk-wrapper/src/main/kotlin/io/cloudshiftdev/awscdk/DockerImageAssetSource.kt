@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
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
 * .dockerCacheDisabled(false)
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
public interface DockerImageAssetSource {
  /**
   * Unique identifier of the docker image asset and its potential revisions.
   *
   * Required if using AppScopedStagingSynthesizer.
   *
   * Default: - no asset name
   */
  public fun assetName(): String? = unwrap(this).getAssetName()

  /**
   * The directory where the Dockerfile is stored, must be relative to the cloud assembly root.
   *
   * Default: - Exactly one of `directoryName` and `executable` is required
   */
  public fun directoryName(): String? = unwrap(this).getDirectoryName()

  /**
   * Build args to pass to the `docker build` command.
   *
   * Since Docker build arguments are resolved before deployment, keys and
   * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
   * `queue.queueUrl`).
   *
   * Only allowed when `directoryName` is specified.
   *
   * Default: - no build args are passed
   */
  public fun dockerBuildArgs(): Map<String, String> = unwrap(this).getDockerBuildArgs() ?:
      emptyMap()

  /**
   * Build secrets to pass to the `docker build` command.
   *
   * Since Docker build secrets are resolved before deployment, keys and
   * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
   * `queue.queueUrl`).
   *
   * Only allowed when `directoryName` is specified.
   *
   * Default: - no build secrets are passed
   */
  public fun dockerBuildSecrets(): Map<String, String> = unwrap(this).getDockerBuildSecrets() ?:
      emptyMap()

  /**
   * SSH agent socket or keys to pass to the `docker buildx` command.
   *
   * Default: - no ssh arg is passed
   */
  public fun dockerBuildSsh(): String? = unwrap(this).getDockerBuildSsh()

  /**
   * Docker target to build to.
   *
   * Only allowed when `directoryName` is specified.
   *
   * Default: - no target
   */
  public fun dockerBuildTarget(): String? = unwrap(this).getDockerBuildTarget()

  /**
   * Disable the cache and pass `--no-cache` to the `docker build` command.
   *
   * Default: - cache is used
   */
  public fun dockerCacheDisabled(): Boolean? = unwrap(this).getDockerCacheDisabled()

  /**
   * Cache from options to pass to the `docker build` command.
   *
   * Default: - no cache from args are passed
   */
  public fun dockerCacheFrom(): List<DockerCacheOption> =
      unwrap(this).getDockerCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

  /**
   * Cache to options to pass to the `docker build` command.
   *
   * Default: - no cache to args are passed
   */
  public fun dockerCacheTo(): DockerCacheOption? =
      unwrap(this).getDockerCacheTo()?.let(DockerCacheOption::wrap)

  /**
   * Path to the Dockerfile (relative to the directory).
   *
   * Only allowed when `directoryName` is specified.
   *
   * Default: - no file
   */
  public fun dockerFile(): String? = unwrap(this).getDockerFile()

  /**
   * Outputs to pass to the `docker build` command.
   *
   * Default: - no build args are passed
   */
  public fun dockerOutputs(): List<String> = unwrap(this).getDockerOutputs() ?: emptyList()

  /**
   * An external command that will produce the packaged asset.
   *
   * The command should produce the name of a local Docker image on `stdout`.
   *
   * Default: - Exactly one of `directoryName` and `executable` is required
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
   * Specify this property to build images on a specific platform.
   *
   * Default: - no platform specified (the current machine architecture will be used)
   */
  public fun platform(): String? = unwrap(this).getPlatform()

  /**
   * The hash of the contents of the docker build context.
   *
   * This hash is used
   * throughout the system to identify this image and avoid duplicate work
   * in case the source did not change.
   *
   * NOTE: this means that if you wish to update your docker image, you
   * must make a modification to the source (e.g. add some metadata to your Dockerfile).
   */
  public fun sourceHash(): String

  /**
   * A builder for [DockerImageAssetSource]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetName Unique identifier of the docker image asset and its potential revisions.
     * Required if using AppScopedStagingSynthesizer.
     */
    public fun assetName(assetName: String)

    /**
     * @param directoryName The directory where the Dockerfile is stored, must be relative to the
     * cloud assembly root.
     */
    public fun directoryName(directoryName: String)

    /**
     * @param dockerBuildArgs Build args to pass to the `docker build` command.
     * Since Docker build arguments are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     *
     * Only allowed when `directoryName` is specified.
     */
    public fun dockerBuildArgs(dockerBuildArgs: Map<String, String>)

    /**
     * @param dockerBuildSecrets Build secrets to pass to the `docker build` command.
     * Since Docker build secrets are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     *
     * Only allowed when `directoryName` is specified.
     */
    public fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>)

    /**
     * @param dockerBuildSsh SSH agent socket or keys to pass to the `docker buildx` command.
     */
    public fun dockerBuildSsh(dockerBuildSsh: String)

    /**
     * @param dockerBuildTarget Docker target to build to.
     * Only allowed when `directoryName` is specified.
     */
    public fun dockerBuildTarget(dockerBuildTarget: String)

    /**
     * @param dockerCacheDisabled Disable the cache and pass `--no-cache` to the `docker build`
     * command.
     */
    public fun dockerCacheDisabled(dockerCacheDisabled: Boolean)

    /**
     * @param dockerCacheFrom Cache from options to pass to the `docker build` command.
     */
    public fun dockerCacheFrom(dockerCacheFrom: List<DockerCacheOption>)

    /**
     * @param dockerCacheFrom Cache from options to pass to the `docker build` command.
     */
    public fun dockerCacheFrom(vararg dockerCacheFrom: DockerCacheOption)

    /**
     * @param dockerCacheTo Cache to options to pass to the `docker build` command.
     */
    public fun dockerCacheTo(dockerCacheTo: DockerCacheOption)

    /**
     * @param dockerCacheTo Cache to options to pass to the `docker build` command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("100251e0b74a679199279257fb70f8e28f5fa8cd3e3691ebfda3c891efc2a6dc")
    public fun dockerCacheTo(dockerCacheTo: DockerCacheOption.Builder.() -> Unit)

    /**
     * @param dockerFile Path to the Dockerfile (relative to the directory).
     * Only allowed when `directoryName` is specified.
     */
    public fun dockerFile(dockerFile: String)

    /**
     * @param dockerOutputs Outputs to pass to the `docker build` command.
     */
    public fun dockerOutputs(dockerOutputs: List<String>)

    /**
     * @param dockerOutputs Outputs to pass to the `docker build` command.
     */
    public fun dockerOutputs(vararg dockerOutputs: String)

    /**
     * @param executable An external command that will produce the packaged asset.
     * The command should produce the name of a local Docker image on `stdout`.
     */
    public fun executable(executable: List<String>)

    /**
     * @param executable An external command that will produce the packaged asset.
     * The command should produce the name of a local Docker image on `stdout`.
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
     * Specify this property to build images on a specific platform.
     */
    public fun platform(platform: String)

    /**
     * @param sourceHash The hash of the contents of the docker build context. 
     * This hash is used
     * throughout the system to identify this image and avoid duplicate work
     * in case the source did not change.
     *
     * NOTE: this means that if you wish to update your docker image, you
     * must make a modification to the source (e.g. add some metadata to your Dockerfile).
     */
    public fun sourceHash(sourceHash: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerImageAssetSource.Builder =
        software.amazon.awscdk.DockerImageAssetSource.builder()

    /**
     * @param assetName Unique identifier of the docker image asset and its potential revisions.
     * Required if using AppScopedStagingSynthesizer.
     */
    override fun assetName(assetName: String) {
      cdkBuilder.assetName(assetName)
    }

    /**
     * @param directoryName The directory where the Dockerfile is stored, must be relative to the
     * cloud assembly root.
     */
    override fun directoryName(directoryName: String) {
      cdkBuilder.directoryName(directoryName)
    }

    /**
     * @param dockerBuildArgs Build args to pass to the `docker build` command.
     * Since Docker build arguments are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     *
     * Only allowed when `directoryName` is specified.
     */
    override fun dockerBuildArgs(dockerBuildArgs: Map<String, String>) {
      cdkBuilder.dockerBuildArgs(dockerBuildArgs)
    }

    /**
     * @param dockerBuildSecrets Build secrets to pass to the `docker build` command.
     * Since Docker build secrets are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     *
     * Only allowed when `directoryName` is specified.
     */
    override fun dockerBuildSecrets(dockerBuildSecrets: Map<String, String>) {
      cdkBuilder.dockerBuildSecrets(dockerBuildSecrets)
    }

    /**
     * @param dockerBuildSsh SSH agent socket or keys to pass to the `docker buildx` command.
     */
    override fun dockerBuildSsh(dockerBuildSsh: String) {
      cdkBuilder.dockerBuildSsh(dockerBuildSsh)
    }

    /**
     * @param dockerBuildTarget Docker target to build to.
     * Only allowed when `directoryName` is specified.
     */
    override fun dockerBuildTarget(dockerBuildTarget: String) {
      cdkBuilder.dockerBuildTarget(dockerBuildTarget)
    }

    /**
     * @param dockerCacheDisabled Disable the cache and pass `--no-cache` to the `docker build`
     * command.
     */
    override fun dockerCacheDisabled(dockerCacheDisabled: Boolean) {
      cdkBuilder.dockerCacheDisabled(dockerCacheDisabled)
    }

    /**
     * @param dockerCacheFrom Cache from options to pass to the `docker build` command.
     */
    override fun dockerCacheFrom(dockerCacheFrom: List<DockerCacheOption>) {
      cdkBuilder.dockerCacheFrom(dockerCacheFrom.map(DockerCacheOption.Companion::unwrap))
    }

    /**
     * @param dockerCacheFrom Cache from options to pass to the `docker build` command.
     */
    override fun dockerCacheFrom(vararg dockerCacheFrom: DockerCacheOption): Unit =
        dockerCacheFrom(dockerCacheFrom.toList())

    /**
     * @param dockerCacheTo Cache to options to pass to the `docker build` command.
     */
    override fun dockerCacheTo(dockerCacheTo: DockerCacheOption) {
      cdkBuilder.dockerCacheTo(dockerCacheTo.let(DockerCacheOption.Companion::unwrap))
    }

    /**
     * @param dockerCacheTo Cache to options to pass to the `docker build` command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("100251e0b74a679199279257fb70f8e28f5fa8cd3e3691ebfda3c891efc2a6dc")
    override fun dockerCacheTo(dockerCacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        dockerCacheTo(DockerCacheOption(dockerCacheTo))

    /**
     * @param dockerFile Path to the Dockerfile (relative to the directory).
     * Only allowed when `directoryName` is specified.
     */
    override fun dockerFile(dockerFile: String) {
      cdkBuilder.dockerFile(dockerFile)
    }

    /**
     * @param dockerOutputs Outputs to pass to the `docker build` command.
     */
    override fun dockerOutputs(dockerOutputs: List<String>) {
      cdkBuilder.dockerOutputs(dockerOutputs)
    }

    /**
     * @param dockerOutputs Outputs to pass to the `docker build` command.
     */
    override fun dockerOutputs(vararg dockerOutputs: String): Unit =
        dockerOutputs(dockerOutputs.toList())

    /**
     * @param executable An external command that will produce the packaged asset.
     * The command should produce the name of a local Docker image on `stdout`.
     */
    override fun executable(executable: List<String>) {
      cdkBuilder.executable(executable)
    }

    /**
     * @param executable An external command that will produce the packaged asset.
     * The command should produce the name of a local Docker image on `stdout`.
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
     * Specify this property to build images on a specific platform.
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * @param sourceHash The hash of the contents of the docker build context. 
     * This hash is used
     * throughout the system to identify this image and avoid duplicate work
     * in case the source did not change.
     *
     * NOTE: this means that if you wish to update your docker image, you
     * must make a modification to the source (e.g. add some metadata to your Dockerfile).
     */
    override fun sourceHash(sourceHash: String) {
      cdkBuilder.sourceHash(sourceHash)
    }

    public fun build(): software.amazon.awscdk.DockerImageAssetSource = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.DockerImageAssetSource,
  ) : CdkObject(cdkObject), DockerImageAssetSource {
    /**
     * Unique identifier of the docker image asset and its potential revisions.
     *
     * Required if using AppScopedStagingSynthesizer.
     *
     * Default: - no asset name
     */
    override fun assetName(): String? = unwrap(this).getAssetName()

    /**
     * The directory where the Dockerfile is stored, must be relative to the cloud assembly root.
     *
     * Default: - Exactly one of `directoryName` and `executable` is required
     */
    override fun directoryName(): String? = unwrap(this).getDirectoryName()

    /**
     * Build args to pass to the `docker build` command.
     *
     * Since Docker build arguments are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     *
     * Only allowed when `directoryName` is specified.
     *
     * Default: - no build args are passed
     */
    override fun dockerBuildArgs(): Map<String, String> = unwrap(this).getDockerBuildArgs() ?:
        emptyMap()

    /**
     * Build secrets to pass to the `docker build` command.
     *
     * Since Docker build secrets are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     *
     * Only allowed when `directoryName` is specified.
     *
     * Default: - no build secrets are passed
     */
    override fun dockerBuildSecrets(): Map<String, String> = unwrap(this).getDockerBuildSecrets() ?:
        emptyMap()

    /**
     * SSH agent socket or keys to pass to the `docker buildx` command.
     *
     * Default: - no ssh arg is passed
     */
    override fun dockerBuildSsh(): String? = unwrap(this).getDockerBuildSsh()

    /**
     * Docker target to build to.
     *
     * Only allowed when `directoryName` is specified.
     *
     * Default: - no target
     */
    override fun dockerBuildTarget(): String? = unwrap(this).getDockerBuildTarget()

    /**
     * Disable the cache and pass `--no-cache` to the `docker build` command.
     *
     * Default: - cache is used
     */
    override fun dockerCacheDisabled(): Boolean? = unwrap(this).getDockerCacheDisabled()

    /**
     * Cache from options to pass to the `docker build` command.
     *
     * Default: - no cache from args are passed
     */
    override fun dockerCacheFrom(): List<DockerCacheOption> =
        unwrap(this).getDockerCacheFrom()?.map(DockerCacheOption::wrap) ?: emptyList()

    /**
     * Cache to options to pass to the `docker build` command.
     *
     * Default: - no cache to args are passed
     */
    override fun dockerCacheTo(): DockerCacheOption? =
        unwrap(this).getDockerCacheTo()?.let(DockerCacheOption::wrap)

    /**
     * Path to the Dockerfile (relative to the directory).
     *
     * Only allowed when `directoryName` is specified.
     *
     * Default: - no file
     */
    override fun dockerFile(): String? = unwrap(this).getDockerFile()

    /**
     * Outputs to pass to the `docker build` command.
     *
     * Default: - no build args are passed
     */
    override fun dockerOutputs(): List<String> = unwrap(this).getDockerOutputs() ?: emptyList()

    /**
     * An external command that will produce the packaged asset.
     *
     * The command should produce the name of a local Docker image on `stdout`.
     *
     * Default: - Exactly one of `directoryName` and `executable` is required
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
     * Specify this property to build images on a specific platform.
     *
     * Default: - no platform specified (the current machine architecture will be used)
     */
    override fun platform(): String? = unwrap(this).getPlatform()

    /**
     * The hash of the contents of the docker build context.
     *
     * This hash is used
     * throughout the system to identify this image and avoid duplicate work
     * in case the source did not change.
     *
     * NOTE: this means that if you wish to update your docker image, you
     * must make a modification to the source (e.g. add some metadata to your Dockerfile).
     */
    override fun sourceHash(): String = unwrap(this).getSourceHash()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageAssetSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerImageAssetSource):
        DockerImageAssetSource = CdkObjectWrappers.wrap(cdkObject) as? DockerImageAssetSource ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAssetSource):
        software.amazon.awscdk.DockerImageAssetSource = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.DockerImageAssetSource
  }
}
