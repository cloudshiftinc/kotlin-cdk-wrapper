@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerCacheOption
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import io.cloudshiftdev.awscdk.services.ecr.assets.NetworkMode
import io.cloudshiftdev.awscdk.services.ecr.assets.Platform
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Represents an ECR image that will be constructed from the specified asset and can be bound as
 * Lambda code.
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
 * AssetImageCode assetImageCode = AssetImageCode.Builder.create("directory")
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
 * .displayName("displayName")
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
public open class AssetImageCode(
  cdkObject: software.amazon.awscdk.services.lambda.AssetImageCode,
) : Code(cdkObject) {
  public constructor(directory: String, props: AssetImageCodeProps) :
      this(software.amazon.awscdk.services.lambda.AssetImageCode(directory,
      props.let(AssetImageCodeProps.Companion::unwrap))
  )

  public constructor(directory: String, props: AssetImageCodeProps.Builder.() -> Unit) :
      this(directory, AssetImageCodeProps(props)
  )

  /**
   * Called when the lambda or layer is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param scope 
   */
  public override fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap)).let(CodeConfig::wrap)

  /**
   * Called after the CFN function resource has been created to allow the code class to bind to it.
   *
   * Specifically it's required to allow assets to add
   * metadata for tooling like SAM CLI to be able to find their origins.
   *
   * @param resource 
   * @param options
   */
  public override fun bindToResource(resource: CfnResource) {
    unwrap(this).bindToResource(resource.let(CfnResource.Companion::unwrap))
  }

  /**
   * Called after the CFN function resource has been created to allow the code class to bind to it.
   *
   * Specifically it's required to allow assets to add
   * metadata for tooling like SAM CLI to be able to find their origins.
   *
   * @param resource 
   * @param options
   */
  public override fun bindToResource(resource: CfnResource, options: ResourceBindOptions) {
    unwrap(this).bindToResource(resource.let(CfnResource.Companion::unwrap),
        options.let(ResourceBindOptions.Companion::unwrap))
  }

  /**
   * Called after the CFN function resource has been created to allow the code class to bind to it.
   *
   * Specifically it's required to allow assets to add
   * metadata for tooling like SAM CLI to be able to find their origins.
   *
   * @param resource 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83fd80fe1e3901a0f5645c4dd596ca04d5fabc7f1c05c24fc53008c232b144f1")
  public override fun bindToResource(resource: CfnResource,
      options: ResourceBindOptions.Builder.() -> Unit): Unit = bindToResource(resource,
      ResourceBindOptions(options))

  /**
   * Determines whether this Code is inline code or not.
   */
  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.AssetImageCode].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Unique identifier of the docker image asset and its potential revisions.
     *
     * Required if using AppScopedStagingSynthesizer.
     *
     * Default: - no asset name
     *
     * @param assetName Unique identifier of the docker image asset and its potential revisions. 
     */
    public fun assetName(assetName: String)

    /**
     * Build args to pass to the `docker build` command.
     *
     * Since Docker build arguments are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     *
     * Default: - no build args are passed
     *
     * @param buildArgs Build args to pass to the `docker build` command. 
     */
    public fun buildArgs(buildArgs: Map<String, String>)

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
     * @param buildSecrets Build secrets. 
     */
    public fun buildSecrets(buildSecrets: Map<String, String>)

    /**
     * SSH agent socket or keys to pass to the `docker build` command.
     *
     * Docker BuildKit must be enabled to use the ssh flag
     *
     * Default: - no --ssh flag
     *
     * [Documentation](https://docs.docker.com/build/buildkit/)
     * @param buildSsh SSH agent socket or keys to pass to the `docker build` command. 
     */
    public fun buildSsh(buildSsh: String)

    /**
     * Disable the cache and pass `--no-cache` to the `docker build` command.
     *
     * Default: - cache is used
     *
     * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build` command. 
     */
    public fun cacheDisabled(cacheDisabled: Boolean)

    /**
     * Cache from options to pass to the `docker build` command.
     *
     * Default: - no cache from options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     * @param cacheFrom Cache from options to pass to the `docker build` command. 
     */
    public fun cacheFrom(cacheFrom: List<DockerCacheOption>)

    /**
     * Cache from options to pass to the `docker build` command.
     *
     * Default: - no cache from options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     * @param cacheFrom Cache from options to pass to the `docker build` command. 
     */
    public fun cacheFrom(vararg cacheFrom: DockerCacheOption)

    /**
     * Cache to options to pass to the `docker build` command.
     *
     * Default: - no cache to options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     * @param cacheTo Cache to options to pass to the `docker build` command. 
     */
    public fun cacheTo(cacheTo: DockerCacheOption)

    /**
     * Cache to options to pass to the `docker build` command.
     *
     * Default: - no cache to options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     * @param cacheTo Cache to options to pass to the `docker build` command. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33e765f9e12f761150dd83e9d93c32b1113ef18c4ee97195167a9b7f0763e1cc")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile. 
     */
    public fun cmd(cmd: List<String>)

    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile. 
     */
    public fun cmd(vararg cmd: String)

    /**
     * A display name for this asset.
     *
     * If supplied, the display name will be used in locations where the asset
     * identifier is printed, like in the CLI progress information. If the same
     * asset is added multiple times, the display name of the first occurrence is
     * used.
     *
     * If `assetName` is given, it will also be used as the default `displayName`.
     * Otherwise, the default is the construct path of the ImageAsset construct,
     * with respect to the enclosing stack. If the asset is produced by a
     * construct helper function (such as `lambda.Code.fromAssetImage()`), this
     * will look like `MyFunction/AssetImage`.
     *
     * We use the stack-relative construct path so that in the common case where
     * you have multiple stacks with the same asset, we won't show something like
     * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
     * production.
     *
     * Default: - Stack-relative construct path
     *
     * @param displayName A display name for this asset. 
     */
    public fun displayName(displayName: String)

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile. 
     */
    public fun entrypoint(entrypoint: List<String>)

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile. 
     */
    public fun entrypoint(vararg entrypoint: String)

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded. 
     */
    public fun exclude(exclude: List<String>)

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded. 
     */
    public fun exclude(vararg exclude: String)

    /**
     * Extra information to encode into the fingerprint (e.g. build instructions and other inputs).
     *
     * Default: - hash is only based on source content
     *
     * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions
     * and other inputs). 
     */
    public fun extraHash(extraHash: String)

    /**
     * Path to the Dockerfile (relative to the directory).
     *
     * Default: 'Dockerfile'
     *
     * @param file Path to the Dockerfile (relative to the directory). 
     */
    public fun `file`(`file`: String)

    /**
     * A strategy for how to handle symlinks.
     *
     * Default: SymlinkFollowMode.NEVER
     *
     * @param followSymlinks A strategy for how to handle symlinks. 
     */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     *
     * @param ignoreMode The ignore behavior to use for `exclude` patterns. 
     */
    public fun ignoreMode(ignoreMode: IgnoreMode)

    /**
     * Options to control which parameters are used to invalidate the asset hash.
     *
     * Default: - hash all parameters
     *
     * @param invalidation Options to control which parameters are used to invalidate the asset
     * hash. 
     */
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions)

    /**
     * Options to control which parameters are used to invalidate the asset hash.
     *
     * Default: - hash all parameters
     *
     * @param invalidation Options to control which parameters are used to invalidate the asset
     * hash. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffd3625fc2b98ea71649fadf5499954ca10571581ab23be46f12ccb86f79940b")
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit)

    /**
     * Networking mode for the RUN commands during build.
     *
     * Support docker API 1.25+.
     *
     * Default: - no networking mode specified (the default networking mode `NetworkMode.DEFAULT`
     * will be used)
     *
     * @param networkMode Networking mode for the RUN commands during build. 
     */
    public fun networkMode(networkMode: NetworkMode)

    /**
     * Outputs to pass to the `docker build` command.
     *
     * Default: - no outputs are passed to the build command (default outputs are used)
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
     * @param outputs Outputs to pass to the `docker build` command. 
     */
    public fun outputs(outputs: List<String>)

    /**
     * Outputs to pass to the `docker build` command.
     *
     * Default: - no outputs are passed to the build command (default outputs are used)
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
     * @param outputs Outputs to pass to the `docker build` command. 
     */
    public fun outputs(vararg outputs: String)

    /**
     * Platform to build for.
     *
     * *Requires Docker Buildx*.
     *
     * Default: - no platform specified (the current machine architecture will be used)
     *
     * @param platform Platform to build for. 
     */
    public fun platform(platform: Platform)

    /**
     * Docker target to build to.
     *
     * Default: - no target
     *
     * @param target Docker target to build to. 
     */
    public fun target(target: String)

    /**
     * Specify or override the WORKDIR on the specified Docker image or Dockerfile.
     *
     * A WORKDIR allows you to configure the working directory the container will use.
     *
     * Default: - use the WORKDIR in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#workdir)
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     * Dockerfile. 
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl(
    directory: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AssetImageCode.Builder =
        software.amazon.awscdk.services.lambda.AssetImageCode.Builder.create(directory)

    /**
     * Unique identifier of the docker image asset and its potential revisions.
     *
     * Required if using AppScopedStagingSynthesizer.
     *
     * Default: - no asset name
     *
     * @param assetName Unique identifier of the docker image asset and its potential revisions. 
     */
    override fun assetName(assetName: String) {
      cdkBuilder.assetName(assetName)
    }

    /**
     * Build args to pass to the `docker build` command.
     *
     * Since Docker build arguments are resolved before deployment, keys and
     * values cannot refer to unresolved tokens (such as `lambda.functionArn` or
     * `queue.queueUrl`).
     *
     * Default: - no build args are passed
     *
     * @param buildArgs Build args to pass to the `docker build` command. 
     */
    override fun buildArgs(buildArgs: Map<String, String>) {
      cdkBuilder.buildArgs(buildArgs)
    }

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
     * @param buildSecrets Build secrets. 
     */
    override fun buildSecrets(buildSecrets: Map<String, String>) {
      cdkBuilder.buildSecrets(buildSecrets)
    }

    /**
     * SSH agent socket or keys to pass to the `docker build` command.
     *
     * Docker BuildKit must be enabled to use the ssh flag
     *
     * Default: - no --ssh flag
     *
     * [Documentation](https://docs.docker.com/build/buildkit/)
     * @param buildSsh SSH agent socket or keys to pass to the `docker build` command. 
     */
    override fun buildSsh(buildSsh: String) {
      cdkBuilder.buildSsh(buildSsh)
    }

    /**
     * Disable the cache and pass `--no-cache` to the `docker build` command.
     *
     * Default: - cache is used
     *
     * @param cacheDisabled Disable the cache and pass `--no-cache` to the `docker build` command. 
     */
    override fun cacheDisabled(cacheDisabled: Boolean) {
      cdkBuilder.cacheDisabled(cacheDisabled)
    }

    /**
     * Cache from options to pass to the `docker build` command.
     *
     * Default: - no cache from options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     * @param cacheFrom Cache from options to pass to the `docker build` command. 
     */
    override fun cacheFrom(cacheFrom: List<DockerCacheOption>) {
      cdkBuilder.cacheFrom(cacheFrom.map(DockerCacheOption.Companion::unwrap))
    }

    /**
     * Cache from options to pass to the `docker build` command.
     *
     * Default: - no cache from options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     * @param cacheFrom Cache from options to pass to the `docker build` command. 
     */
    override fun cacheFrom(vararg cacheFrom: DockerCacheOption): Unit =
        cacheFrom(cacheFrom.toList())

    /**
     * Cache to options to pass to the `docker build` command.
     *
     * Default: - no cache to options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     * @param cacheTo Cache to options to pass to the `docker build` command. 
     */
    override fun cacheTo(cacheTo: DockerCacheOption) {
      cdkBuilder.cacheTo(cacheTo.let(DockerCacheOption.Companion::unwrap))
    }

    /**
     * Cache to options to pass to the `docker build` command.
     *
     * Default: - no cache to options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     * @param cacheTo Cache to options to pass to the `docker build` command. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33e765f9e12f761150dd83e9d93c32b1113ef18c4ee97195167a9b7f0763e1cc")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile. 
     */
    override fun cmd(cmd: List<String>) {
      cdkBuilder.cmd(cmd)
    }

    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile. 
     */
    override fun cmd(vararg cmd: String): Unit = cmd(cmd.toList())

    /**
     * A display name for this asset.
     *
     * If supplied, the display name will be used in locations where the asset
     * identifier is printed, like in the CLI progress information. If the same
     * asset is added multiple times, the display name of the first occurrence is
     * used.
     *
     * If `assetName` is given, it will also be used as the default `displayName`.
     * Otherwise, the default is the construct path of the ImageAsset construct,
     * with respect to the enclosing stack. If the asset is produced by a
     * construct helper function (such as `lambda.Code.fromAssetImage()`), this
     * will look like `MyFunction/AssetImage`.
     *
     * We use the stack-relative construct path so that in the common case where
     * you have multiple stacks with the same asset, we won't show something like
     * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
     * production.
     *
     * Default: - Stack-relative construct path
     *
     * @param displayName A display name for this asset. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile. 
     */
    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile. 
     */
    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded. 
     */
    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior.
     * Has no effect on Assets bundled using the `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded. 
     */
    override fun exclude(vararg exclude: String): Unit = exclude(exclude.toList())

    /**
     * Extra information to encode into the fingerprint (e.g. build instructions and other inputs).
     *
     * Default: - hash is only based on source content
     *
     * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions
     * and other inputs). 
     */
    override fun extraHash(extraHash: String) {
      cdkBuilder.extraHash(extraHash)
    }

    /**
     * Path to the Dockerfile (relative to the directory).
     *
     * Default: 'Dockerfile'
     *
     * @param file Path to the Dockerfile (relative to the directory). 
     */
    override fun `file`(`file`: String) {
      cdkBuilder.`file`(`file`)
    }

    /**
     * A strategy for how to handle symlinks.
     *
     * Default: SymlinkFollowMode.NEVER
     *
     * @param followSymlinks A strategy for how to handle symlinks. 
     */
    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode.Companion::unwrap))
    }

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     *
     * @param ignoreMode The ignore behavior to use for `exclude` patterns. 
     */
    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode.Companion::unwrap))
    }

    /**
     * Options to control which parameters are used to invalidate the asset hash.
     *
     * Default: - hash all parameters
     *
     * @param invalidation Options to control which parameters are used to invalidate the asset
     * hash. 
     */
    override fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
      cdkBuilder.invalidation(invalidation.let(DockerImageAssetInvalidationOptions.Companion::unwrap))
    }

    /**
     * Options to control which parameters are used to invalidate the asset hash.
     *
     * Default: - hash all parameters
     *
     * @param invalidation Options to control which parameters are used to invalidate the asset
     * hash. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ffd3625fc2b98ea71649fadf5499954ca10571581ab23be46f12ccb86f79940b")
    override fun invalidation(invalidation: DockerImageAssetInvalidationOptions.Builder.() -> Unit):
        Unit = invalidation(DockerImageAssetInvalidationOptions(invalidation))

    /**
     * Networking mode for the RUN commands during build.
     *
     * Support docker API 1.25+.
     *
     * Default: - no networking mode specified (the default networking mode `NetworkMode.DEFAULT`
     * will be used)
     *
     * @param networkMode Networking mode for the RUN commands during build. 
     */
    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode.Companion::unwrap))
    }

    /**
     * Outputs to pass to the `docker build` command.
     *
     * Default: - no outputs are passed to the build command (default outputs are used)
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
     * @param outputs Outputs to pass to the `docker build` command. 
     */
    override fun outputs(outputs: List<String>) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * Outputs to pass to the `docker build` command.
     *
     * Default: - no outputs are passed to the build command (default outputs are used)
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
     * @param outputs Outputs to pass to the `docker build` command. 
     */
    override fun outputs(vararg outputs: String): Unit = outputs(outputs.toList())

    /**
     * Platform to build for.
     *
     * *Requires Docker Buildx*.
     *
     * Default: - no platform specified (the current machine architecture will be used)
     *
     * @param platform Platform to build for. 
     */
    override fun platform(platform: Platform) {
      cdkBuilder.platform(platform.let(Platform.Companion::unwrap))
    }

    /**
     * Docker target to build to.
     *
     * Default: - no target
     *
     * @param target Docker target to build to. 
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    /**
     * Specify or override the WORKDIR on the specified Docker image or Dockerfile.
     *
     * A WORKDIR allows you to configure the working directory the container will use.
     *
     * Default: - use the WORKDIR in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#workdir)
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     * Dockerfile. 
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.AssetImageCode = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(directory: String, block: Builder.() -> Unit = {}): AssetImageCode {
      val builderImpl = BuilderImpl(directory)
      return AssetImageCode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AssetImageCode):
        AssetImageCode = AssetImageCode(cdkObject)

    internal fun unwrap(wrapped: AssetImageCode):
        software.amazon.awscdk.services.lambda.AssetImageCode = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.AssetImageCode
  }
}
