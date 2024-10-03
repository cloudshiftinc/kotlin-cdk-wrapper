@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerCacheOption
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetOptions
import io.cloudshiftdev.awscdk.services.ecr.assets.NetworkMode
import io.cloudshiftdev.awscdk.services.ecr.assets.Platform
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties to initialize a new AssetImage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ecr.assets.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * NetworkMode networkMode;
 * Platform platform;
 * AssetImageCodeProps assetImageCodeProps = AssetImageCodeProps.builder()
 * .assetName("assetName")
 * .buildArgs(Map.of(
 * "buildArgsKey", "buildArgs"))
 * .buildSecrets(Map.of(
 * "buildSecretsKey", "buildSecrets"))
 * .buildSsh("buildSsh")
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
 * .cmd(List.of("cmd"))
 * .entrypoint(List.of("entrypoint"))
 * .exclude(List.of("exclude"))
 * .extraHash("extraHash")
 * .file("file")
 * .followSymlinks(SymlinkFollowMode.NEVER)
 * .ignoreMode(IgnoreMode.GLOB)
 * .invalidation(DockerImageAssetInvalidationOptions.builder()
 * .buildArgs(false)
 * .buildSecrets(false)
 * .buildSsh(false)
 * .extraHash(false)
 * .file(false)
 * .networkMode(false)
 * .outputs(false)
 * .platform(false)
 * .repositoryName(false)
 * .target(false)
 * .build())
 * .networkMode(networkMode)
 * .outputs(List.of("outputs"))
 * .platform(platform)
 * .target("target")
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 */
public interface AssetImageCodeProps : DockerImageAssetOptions {
  /**
   * Specify or override the CMD on the specified Docker image or Dockerfile.
   *
   * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
   *
   * Default: - use the CMD specified in the docker image or Dockerfile.
   *
   * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
   */
  public fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

  /**
   * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
   *
   * An ENTRYPOINT allows you to configure a container that will run as an executable.
   * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
   *
   * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
   *
   * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
   */
  public fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

  /**
   * Specify or override the WORKDIR on the specified Docker image or Dockerfile.
   *
   * A WORKDIR allows you to configure the working directory the container will use.
   *
   * Default: - use the WORKDIR in the docker image or Dockerfile.
   *
   * [Documentation](https://docs.docker.com/engine/reference/builder/#workdir)
   */
  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * A builder for [AssetImageCodeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetName Unique identifier of the docker image asset and its potential revisions.
     * Required if using AppScopedStagingSynthesizer.
     */
    public fun assetName(assetName: String)

    /**
     * @param buildArgs Build args to pass to the `docker build` command.
     * Since Docker build arguments are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     */
    public fun buildArgs(buildArgs: Map<String, String>)

    /**
     * @param buildSecrets Build secrets.
     * Docker BuildKit must be enabled to use build secrets.
     */
    public fun buildSecrets(buildSecrets: Map<String, String>)

    /**
     * @param buildSsh SSH agent socket or keys to pass to the `docker build` command.
     * Docker BuildKit must be enabled to use the ssh flag
     */
    public fun buildSsh(buildSsh: String)

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
    @JvmName("a97b43ad5b4e1d1d5faa8207303136779196583c1ebf427576252fade48a21b2")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    /**
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    public fun cmd(cmd: List<String>)

    /**
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    public fun cmd(vararg cmd: String)

    /**
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile.
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    public fun entrypoint(entrypoint: List<String>)

    /**
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile.
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    public fun entrypoint(vararg entrypoint: String)

    /**
     * @param exclude File paths matching the patterns will be excluded.
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(exclude: List<String>)

    /**
     * @param exclude File paths matching the patterns will be excluded.
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(vararg exclude: String)

    /**
     * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions
     * and other inputs).
     */
    public fun extraHash(extraHash: String)

    /**
     * @param file Path to the Dockerfile (relative to the directory).
     */
    public fun `file`(`file`: String)

    /**
     * @param followSymlinks A strategy for how to handle symlinks.
     */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    /**
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    public fun ignoreMode(ignoreMode: IgnoreMode)

    /**
     * @param invalidation Options to control which parameters are used to invalidate the asset
     * hash.
     */
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions)

    /**
     * @param invalidation Options to control which parameters are used to invalidate the asset
     * hash.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2777d99f3c4e7178ce7d98822a9431b13ba33b7e14ebd29ce0cd2232b6da18f1")
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit)

    /**
     * @param networkMode Networking mode for the RUN commands during build.
     * Support docker API 1.25+.
     */
    public fun networkMode(networkMode: NetworkMode)

    /**
     * @param outputs Outputs to pass to the `docker build` command.
     */
    public fun outputs(outputs: List<String>)

    /**
     * @param outputs Outputs to pass to the `docker build` command.
     */
    public fun outputs(vararg outputs: String)

    /**
     * @param platform Platform to build for.
     * *Requires Docker Buildx*.
     */
    public fun platform(platform: Platform)

    /**
     * @param target Docker target to build to.
     */
    public fun target(target: String)

    /**
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     * Dockerfile.
     * A WORKDIR allows you to configure the working directory the container will use.
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AssetImageCodeProps.Builder =
        software.amazon.awscdk.services.lambda.AssetImageCodeProps.builder()

    /**
     * @param assetName Unique identifier of the docker image asset and its potential revisions.
     * Required if using AppScopedStagingSynthesizer.
     */
    override fun assetName(assetName: String) {
      cdkBuilder.assetName(assetName)
    }

    /**
     * @param buildArgs Build args to pass to the `docker build` command.
     * Since Docker build arguments are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     */
    override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
    }

    /**
     * @param buildSecrets Build secrets.
     * Docker BuildKit must be enabled to use build secrets.
     */
    override fun buildSecrets(buildSecrets: Map<String, String>) {
      cdkBuilder.buildSecrets(buildSecrets)
    }

    /**
     * @param buildSsh SSH agent socket or keys to pass to the `docker build` command.
     * Docker BuildKit must be enabled to use the ssh flag
     */
    override fun buildSsh(buildSsh: String) {
      cdkBuilder.buildSsh(buildSsh)
    }

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
      cdkBuilder.cacheFrom(cacheFrom.map(DockerCacheOption.Companion::unwrap))
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
      cdkBuilder.cacheTo(cacheTo.let(DockerCacheOption.Companion::unwrap))
    }

    /**
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a97b43ad5b4e1d1d5faa8207303136779196583c1ebf427576252fade48a21b2")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    /**
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    override fun cmd(cmd: List<String>) {
      cdkBuilder.cmd(cmd)
    }

    /**
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    override fun cmd(vararg cmd: String): Unit = cmd(cmd.toList())

    /**
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile.
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    /**
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile.
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

    /**
     * @param exclude File paths matching the patterns will be excluded.
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     */
    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    /**
     * @param exclude File paths matching the patterns will be excluded.
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     */
    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    /**
     * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions
     * and other inputs).
     */
    override fun extraHash(extraHash: String) {
      cdkBuilder.extraHash(extraHash)
    }

    /**
     * @param file Path to the Dockerfile (relative to the directory).
     */
    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    /**
     * @param followSymlinks A strategy for how to handle symlinks.
     */
    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode.Companion::unwrap))
    }

    /**
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode.Companion::unwrap))
    }

    /**
     * @param invalidation Options to control which parameters are used to invalidate the asset
     * hash.
     */
    override fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
      cdkBuilder.invalidation(invalidation.let(DockerImageAssetInvalidationOptions.Companion::unwrap))
    }

    /**
     * @param invalidation Options to control which parameters are used to invalidate the asset
     * hash.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2777d99f3c4e7178ce7d98822a9431b13ba33b7e14ebd29ce0cd2232b6da18f1")
    override fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit):
        Unit = invalidation(DockerImageAssetInvalidationOptions(invalidation))

    /**
     * @param networkMode Networking mode for the RUN commands during build.
     * Support docker API 1.25+.
     */
    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode.Companion::unwrap))
    }

    /**
     * @param outputs Outputs to pass to the `docker build` command.
     */
    override fun outputs(outputs: List<String>) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * @param outputs Outputs to pass to the `docker build` command.
     */
    override fun outputs(vararg outputs: String): Unit = outputs(outputs.toList())

    /**
     * @param platform Platform to build for.
     * *Requires Docker Buildx*.
     */
    override fun platform(platform: Platform) {
      cdkBuilder.platform(platform.let(Platform.Companion::unwrap))
    }

    /**
     * @param target Docker target to build to.
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    /**
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     * Dockerfile.
     * A WORKDIR allows you to configure the working directory the container will use.
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.AssetImageCodeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.AssetImageCodeProps,
  ) : CdkObject(cdkObject),
      AssetImageCodeProps {
    /**
     * Unique identifier of the docker image asset and its potential revisions.
     *
     * Required if using AppScopedStagingSynthesizer.
     *
     * Default: - no asset name
     */
    override fun assetName(): String? = unwrap(this).getAssetName()

    /**
     * Build args to pass to the `docker build` command.
     *
     * Since Docker build arguments are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     *
     * Default: - no build args are passed
     */
    override fun buildArgs(): Map<String, String> = unwrap(this).getBuildArgs() ?: emptyMap()

    /**
     * Build secrets.
     *
     * Docker BuildKit must be enabled to use build secrets.
     *
     * Default: - no build secrets
     *
     * Example:
     *
     * ```
     * import io.cloudshiftdev.awscdk.DockerBuildSecret;
     * Map&lt;String, String&gt; buildSecrets = Map.of(
     * "MY_SECRET", DockerBuildSecret.fromSrc("file.txt"));
     * ```
     *
     * [Documentation](https://docs.docker.com/build/buildkit/)
     */
    override fun buildSecrets(): Map<String, String> = unwrap(this).getBuildSecrets() ?: emptyMap()

    /**
     * SSH agent socket or keys to pass to the `docker build` command.
     *
     * Docker BuildKit must be enabled to use the ssh flag
     *
     * Default: - no --ssh flag
     *
     * [Documentation](https://docs.docker.com/build/buildkit/)
     */
    override fun buildSsh(): String? = unwrap(this).getBuildSsh()

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
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     */
    override fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     */
    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     *
     * Default: - nothing is excluded
     */
    override fun exclude(): List<String> = unwrap(this).getExclude() ?: emptyList()

    /**
     * Extra information to encode into the fingerprint (e.g. build instructions and other inputs).
     *
     * Default: - hash is only based on source content
     */
    override fun extraHash(): String? = unwrap(this).getExtraHash()

    /**
     * Path to the Dockerfile (relative to the directory).
     *
     * Default: 'Dockerfile'
     */
    override fun `file`(): String? = unwrap(this).getFile()

    /**
     * A strategy for how to handle symlinks.
     *
     * Default: SymlinkFollowMode.NEVER
     */
    override fun followSymlinks(): SymlinkFollowMode? =
        unwrap(this).getFollowSymlinks()?.let(SymlinkFollowMode::wrap)

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     */
    override fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)

    /**
     * Options to control which parameters are used to invalidate the asset hash.
     *
     * Default: - hash all parameters
     */
    override fun invalidation(): DockerImageAssetInvalidationOptions? =
        unwrap(this).getInvalidation()?.let(DockerImageAssetInvalidationOptions::wrap)

    /**
     * Networking mode for the RUN commands during build.
     *
     * Support docker API 1.25+.
     *
     * Default: - no networking mode specified (the default networking mode `NetworkMode.DEFAULT`
     * will be used)
     */
    override fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    /**
     * Outputs to pass to the `docker build` command.
     *
     * Default: - no outputs are passed to the build command (default outputs are used)
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
     */
    override fun outputs(): List<String> = unwrap(this).getOutputs() ?: emptyList()

    /**
     * Platform to build for.
     *
     * *Requires Docker Buildx*.
     *
     * Default: - no platform specified (the current machine architecture will be used)
     */
    override fun platform(): Platform? = unwrap(this).getPlatform()?.let(Platform::wrap)

    /**
     * Docker target to build to.
     *
     * Default: - no target
     */
    override fun target(): String? = unwrap(this).getTarget()

    /**
     * Specify or override the WORKDIR on the specified Docker image or Dockerfile.
     *
     * A WORKDIR allows you to configure the working directory the container will use.
     *
     * Default: - use the WORKDIR in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#workdir)
     */
    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssetImageCodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AssetImageCodeProps):
        AssetImageCodeProps = CdkObjectWrappers.wrap(cdkObject) as? AssetImageCodeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetImageCodeProps):
        software.amazon.awscdk.services.lambda.AssetImageCodeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.AssetImageCodeProps
  }
}
