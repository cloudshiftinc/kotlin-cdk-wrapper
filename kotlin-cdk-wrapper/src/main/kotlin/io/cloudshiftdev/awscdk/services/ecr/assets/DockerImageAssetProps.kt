@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
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
 * Props for DockerImageAssets.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAsset;
 * DockerImageAsset asset = DockerImageAsset.Builder.create(this, "MyBuildImage")
 * .directory(join(__dirname, "my-image"))
 * .buildArgs(Map.of(
 * "HTTP_PROXY", "http://10.20.30.2:1234"))
 * .invalidation(DockerImageAssetInvalidationOptions.builder()
 * .buildArgs(false)
 * .build())
 * .build();
 * ```
 */
public interface DockerImageAssetProps : DockerImageAssetOptions {
  /**
   * The directory where the Dockerfile is stored.
   *
   * Any directory inside with a name that matches the CDK output folder (cdk.out by default) will
   * be excluded from the asset
   */
  public fun directory(): String

  /**
   * A builder for [DockerImageAssetProps]
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
    @JvmName("eff72b9e2693449e1c755fda93aaf9f0f4ec6260991b3263dce576f4c5dd4050")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    /**
     * @param directory The directory where the Dockerfile is stored. 
     * Any directory inside with a name that matches the CDK output folder (cdk.out by default) will
     * be excluded from the asset
     */
    public fun directory(directory: String)

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
    @JvmName("d3482f99ca60fc0e4b765bd6fddcc5f8290bfe9159b443438ab1038fab7634db")
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps.Builder
        = software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps.builder()

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
    @JvmName("eff72b9e2693449e1c755fda93aaf9f0f4ec6260991b3263dce576f4c5dd4050")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    /**
     * @param directory The directory where the Dockerfile is stored. 
     * Any directory inside with a name that matches the CDK output folder (cdk.out by default) will
     * be excluded from the asset
     */
    override fun directory(directory: String) {
      cdkBuilder.directory(directory)
    }

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
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    /**
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    /**
     * @param invalidation Options to control which parameters are used to invalidate the asset
     * hash.
     */
    override fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
      cdkBuilder.invalidation(invalidation.let(DockerImageAssetInvalidationOptions::unwrap))
    }

    /**
     * @param invalidation Options to control which parameters are used to invalidate the asset
     * hash.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3482f99ca60fc0e4b765bd6fddcc5f8290bfe9159b443438ab1038fab7634db")
    override fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit):
        Unit = invalidation(DockerImageAssetInvalidationOptions(invalidation))

    /**
     * @param networkMode Networking mode for the RUN commands during build.
     * Support docker API 1.25+.
     */
    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
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
      cdkBuilder.platform(platform.let(Platform::unwrap))
    }

    /**
     * @param target Docker target to build to.
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public fun build(): software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps,
  ) : CdkObject(cdkObject), DockerImageAssetProps {
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
     * The directory where the Dockerfile is stored.
     *
     * Any directory inside with a name that matches the CDK output folder (cdk.out by default) will
     * be excluded from the asset
     */
    override fun directory(): String = unwrap(this).getDirectory()

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageAssetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps):
        DockerImageAssetProps = CdkObjectWrappers.wrap(cdkObject) as? DockerImageAssetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAssetProps):
        software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps
  }
}
