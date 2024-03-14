package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.AssetHashType
import io.cloudshiftdev.awscdk.BundlingOptions
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class AssetEnvironmentFile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.AssetEnvironmentFile,
) : EnvironmentFile(cdkObject) {
  /**
   * Called when the container is initialized to allow this object to bind to the stack.
   *
   * @param scope 
   */
  public override fun bind(scope: Construct): EnvironmentFileConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(EnvironmentFileConfig::wrap)

  /**
   * The path to the asset file or directory.
   */
  public open fun path(): String = unwrap(this).getPath()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.AssetEnvironmentFile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specify a custom hash for this asset.
     *
     * If `assetHashType` is set it must
     * be set to `AssetHashType.CUSTOM`. For consistency, this custom hash will
     * be SHA256 hashed and encoded as hex. The resulting hash will be the asset
     * hash.
     *
     * NOTE: the hash is used in order to identify a specific revision of the asset, and
     * used for optimizing and caching deployment activities related to this asset such as
     * packaging, uploading to Amazon S3, etc. If you chose to customize the hash, you will
     * need to make sure it is updated every time the asset changes, or otherwise it is
     * possible that some deployments will not be invalidated.
     *
     * Default: - based on `assetHashType`
     *
     * @param assetHash Specify a custom hash for this asset. 
     */
    public fun assetHash(assetHash: String)

    /**
     * Specifies the type of hash to calculate for this asset.
     *
     * If `assetHash` is configured, this option must be `undefined` or
     * `AssetHashType.CUSTOM`.
     *
     * Default: - the default is `AssetHashType.SOURCE`, but if `assetHash` is
     * explicitly specified this value defaults to `AssetHashType.CUSTOM`.
     *
     * @param assetHashType Specifies the type of hash to calculate for this asset. 
     */
    public fun assetHashType(assetHashType: AssetHashType)

    /**
     * Bundle the asset by executing a command in a Docker container or a custom bundling provider.
     *
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     *
     * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file,
     * archived into a .zip file and uploaded to S3 otherwise
     *
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider. 
     */
    public fun bundling(bundling: BundlingOptions)

    /**
     * Bundle the asset by executing a command in a Docker container or a custom bundling provider.
     *
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     *
     * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file,
     * archived into a .zip file and uploaded to S3 otherwise
     *
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2340990b1c321dbdf222110179975f1e8a15d6807621bbce582a740dac93f0b")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)

    /**
     * Whether or not the asset needs to exist beyond deployment time;
     *
     * i.e.
     * are copied over to a different location and not needed afterwards.
     * Setting this property to true has an impact on the lifecycle of the asset,
     * because we will assume that it is safe to delete after the CloudFormation
     * deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during
     * deployment. Therefore, it is not necessary to store the asset in S3, so
     * we consider those deployTime assets.
     *
     * Default: false
     *
     * @param deployTime Whether or not the asset needs to exist beyond deployment time;. 
     */
    public fun deployTime(deployTime: Boolean)

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
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     *
     * @param readers A list of principals that should be able to read this asset from S3. 
     */
    public fun readers(readers: List<IGrantable>)

    /**
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     *
     * @param readers A list of principals that should be able to read this asset from S3. 
     */
    public fun readers(vararg readers: IGrantable)
  }

  private class BuilderImpl(
    path: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.AssetEnvironmentFile.Builder =
        software.amazon.awscdk.services.ecs.AssetEnvironmentFile.Builder.create(path)

    /**
     * Specify a custom hash for this asset.
     *
     * If `assetHashType` is set it must
     * be set to `AssetHashType.CUSTOM`. For consistency, this custom hash will
     * be SHA256 hashed and encoded as hex. The resulting hash will be the asset
     * hash.
     *
     * NOTE: the hash is used in order to identify a specific revision of the asset, and
     * used for optimizing and caching deployment activities related to this asset such as
     * packaging, uploading to Amazon S3, etc. If you chose to customize the hash, you will
     * need to make sure it is updated every time the asset changes, or otherwise it is
     * possible that some deployments will not be invalidated.
     *
     * Default: - based on `assetHashType`
     *
     * @param assetHash Specify a custom hash for this asset. 
     */
    override fun assetHash(assetHash: String) {
      cdkBuilder.assetHash(assetHash)
    }

    /**
     * Specifies the type of hash to calculate for this asset.
     *
     * If `assetHash` is configured, this option must be `undefined` or
     * `AssetHashType.CUSTOM`.
     *
     * Default: - the default is `AssetHashType.SOURCE`, but if `assetHash` is
     * explicitly specified this value defaults to `AssetHashType.CUSTOM`.
     *
     * @param assetHashType Specifies the type of hash to calculate for this asset. 
     */
    override fun assetHashType(assetHashType: AssetHashType) {
      cdkBuilder.assetHashType(assetHashType.let(AssetHashType::unwrap))
    }

    /**
     * Bundle the asset by executing a command in a Docker container or a custom bundling provider.
     *
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     *
     * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file,
     * archived into a .zip file and uploaded to S3 otherwise
     *
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider. 
     */
    override fun bundling(bundling: BundlingOptions) {
      cdkBuilder.bundling(bundling.let(BundlingOptions::unwrap))
    }

    /**
     * Bundle the asset by executing a command in a Docker container or a custom bundling provider.
     *
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     *
     * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file,
     * archived into a .zip file and uploaded to S3 otherwise
     *
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2340990b1c321dbdf222110179975f1e8a15d6807621bbce582a740dac93f0b")
    override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    /**
     * Whether or not the asset needs to exist beyond deployment time;
     *
     * i.e.
     * are copied over to a different location and not needed afterwards.
     * Setting this property to true has an impact on the lifecycle of the asset,
     * because we will assume that it is safe to delete after the CloudFormation
     * deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during
     * deployment. Therefore, it is not necessary to store the asset in S3, so
     * we consider those deployTime assets.
     *
     * Default: false
     *
     * @param deployTime Whether or not the asset needs to exist beyond deployment time;. 
     */
    override fun deployTime(deployTime: Boolean) {
      cdkBuilder.deployTime(deployTime)
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
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     *
     * @param readers A list of principals that should be able to read this asset from S3. 
     */
    override fun readers(readers: List<IGrantable>) {
      cdkBuilder.readers(readers.map(IGrantable::unwrap))
    }

    /**
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     *
     * @param readers A list of principals that should be able to read this asset from S3. 
     */
    override fun readers(vararg readers: IGrantable): Unit = readers(readers.toList())

    public fun build(): software.amazon.awscdk.services.ecs.AssetEnvironmentFile =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(path: String, block: Builder.() -> Unit = {}): AssetEnvironmentFile {
      val builderImpl = BuilderImpl(path)
      return AssetEnvironmentFile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AssetEnvironmentFile):
        AssetEnvironmentFile = AssetEnvironmentFile(cdkObject)

    internal fun unwrap(wrapped: AssetEnvironmentFile):
        software.amazon.awscdk.services.ecs.AssetEnvironmentFile = wrapped.cdkObject
  }
}
