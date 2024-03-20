@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An asset that represents a Docker image.
 *
 * The image will be created in build time and uploaded to an ECR repository.
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
public open class DockerImageAsset internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAsset,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DockerImageAssetProps,
  ) :
      this(software.amazon.awscdk.services.ecr.assets.DockerImageAsset(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(DockerImageAssetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DockerImageAssetProps.Builder.() -> Unit,
  ) : this(scope, id, DockerImageAssetProps(props)
  )

  /**
   * Adds CloudFormation template metadata to the specified resource with information that indicates
   * which resource property is mapped to this local asset.
   *
   * This can be used by tools such as SAM CLI to provide local
   * experience such as local invocation and debugging of Lambda functions.
   *
   * Asset metadata will only be included if the stack is synthesized with the
   * "aws:cdk:enable-asset-metadata" context key defined, which is the default
   * behavior when synthesizing via the CDK Toolkit.
   *
   * [Documentation](https://github.com/aws/aws-cdk/issues/1432)
   * @param resource The CloudFormation resource which is using this asset
   * [disable-awslint:ref-via-interface]. 
   * @param resourceProperty The property name where this asset is referenced. 
   */
  public open fun addResourceMetadata(resource: CfnResource, resourceProperty: String) {
    unwrap(this).addResourceMetadata(resource.let(CfnResource::unwrap), resourceProperty)
  }

  /**
   * A hash of this asset, which is available at construction time.
   *
   * As this is a plain string, it
   * can be used in construct IDs in order to enforce creation of a new resource when the content
   * hash has changed.
   */
  public open fun assetHash(): String = unwrap(this).getAssetHash()

  /**
   * The tag of this asset when it is uploaded to ECR.
   *
   * The tag may differ from the assetHash if a stack synthesizer adds a dockerTagPrefix.
   */
  public open fun imageTag(): String = unwrap(this).getImageTag()

  /**
   * The full URI of the image (including a tag).
   *
   * Use this reference to pull
   * the asset.
   */
  public open fun imageUri(): String = unwrap(this).getImageUri()

  /**
   * The full URI of the image (including a tag).
   *
   * Use this reference to pull
   * the asset.
   */
  public open fun imageUri(`value`: String) {
    unwrap(this).setImageUri(`value`)
  }

  /**
   * Repository where the image is stored.
   */
  public open fun repository(): IRepository = unwrap(this).getRepository().let(IRepository::wrap)

  /**
   * Repository where the image is stored.
   */
  public open fun repository(`value`: IRepository) {
    unwrap(this).setRepository(`value`.let(IRepository::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAsset].
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
    @JvmName("55a8bc6aaf46f20b979662bf52ea903702deb987f1444eb38425bc78da79a0e9")
    public fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit)

    /**
     * The directory where the Dockerfile is stored.
     *
     * Any directory inside with a name that matches the CDK output folder (cdk.out by default) will
     * be excluded from the asset
     *
     * @param directory The directory where the Dockerfile is stored. 
     */
    public fun directory(directory: String)

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
    @JvmName("ba7e582cb180be1f52bef86d2d258e1e348d4f6d030ec88401700b2186152039")
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
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.assets.DockerImageAsset.Builder =
        software.amazon.awscdk.services.ecr.assets.DockerImageAsset.Builder.create(scope, id)

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
      cdkBuilder.cacheFrom(cacheFrom.map(DockerCacheOption::unwrap))
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
      cdkBuilder.cacheTo(cacheTo.let(DockerCacheOption::unwrap))
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
    @JvmName("55a8bc6aaf46f20b979662bf52ea903702deb987f1444eb38425bc78da79a0e9")
    override fun cacheTo(cacheTo: DockerCacheOption.Builder.() -> Unit): Unit =
        cacheTo(DockerCacheOption(cacheTo))

    /**
     * The directory where the Dockerfile is stored.
     *
     * Any directory inside with a name that matches the CDK output folder (cdk.out by default) will
     * be excluded from the asset
     *
     * @param directory The directory where the Dockerfile is stored. 
     */
    override fun directory(directory: String) {
      cdkBuilder.directory(directory)
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
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     *
     * @param ignoreMode The ignore behavior to use for `exclude` patterns. 
     */
    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
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
      cdkBuilder.invalidation(invalidation.let(DockerImageAssetInvalidationOptions::unwrap))
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
    @JvmName("ba7e582cb180be1f52bef86d2d258e1e348d4f6d030ec88401700b2186152039")
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
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
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
      cdkBuilder.platform(platform.let(Platform::unwrap))
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

    public fun build(): software.amazon.awscdk.services.ecr.assets.DockerImageAsset =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DockerImageAsset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DockerImageAsset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.DockerImageAsset):
        DockerImageAsset = DockerImageAsset(cdkObject)

    internal fun unwrap(wrapped: DockerImageAsset):
        software.amazon.awscdk.services.ecr.assets.DockerImageAsset = wrapped.cdkObject
  }
}
