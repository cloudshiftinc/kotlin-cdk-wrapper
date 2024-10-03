@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.assets

import io.cloudshiftdev.awscdk.AssetHashType
import io.cloudshiftdev.awscdk.BundlingOptions
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * Asset asset = Asset.Builder.create(this, "BundledAsset")
 * .path("/path/to/asset")
 * .bundling(BundlingOptions.builder()
 * .image(DockerImage.fromRegistry("alpine"))
 * .command(List.of("command-that-produces-an-archive.sh"))
 * .outputType(BundlingOutput.NOT_ARCHIVED)
 * .build())
 * .build();
 * ```
 */
public interface AssetProps : AssetOptions {
  /**
   * The disk location of the asset.
   *
   * The path should refer to one of the following:
   *
   * * A regular file or a .zip file, in which case the file will be uploaded as-is to S3.
   * * A directory, in which case it will be archived into a .zip file and uploaded to S3.
   */
  public fun path(): String

  /**
   * A builder for [AssetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetHash Specify a custom hash for this asset.
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
     */
    public fun assetHash(assetHash: String)

    /**
     * @param assetHashType Specifies the type of hash to calculate for this asset.
     * If `assetHash` is configured, this option must be `undefined` or
     * `AssetHashType.CUSTOM`.
     */
    public fun assetHashType(assetHashType: AssetHashType)

    /**
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider.
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     */
    public fun bundling(bundling: BundlingOptions)

    /**
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider.
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90f8f05d36986f4edd9a9276127344832fd649bcb96a968e728face052288fed")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)

    /**
     * @param deployTime Whether or not the asset needs to exist beyond deployment time;.
     * i.e.
     * are copied over to a different location and not needed afterwards.
     * Setting this property to true has an impact on the lifecycle of the asset,
     * because we will assume that it is safe to delete after the CloudFormation
     * deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during
     * deployment. Therefore, it is not necessary to store the asset in S3, so
     * we consider those deployTime assets.
     */
    public fun deployTime(deployTime: Boolean)

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
     * @param followSymlinks A strategy for how to handle symlinks.
     */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    /**
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    public fun ignoreMode(ignoreMode: IgnoreMode)

    /**
     * @param path The disk location of the asset. 
     * The path should refer to one of the following:
     *
     * * A regular file or a .zip file, in which case the file will be uploaded as-is to S3.
     * * A directory, in which case it will be archived into a .zip file and uploaded to S3.
     */
    public fun path(path: String)

    /**
     * @param readers A list of principals that should be able to read this asset from S3.
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     */
    public fun readers(readers: List<IGrantable>)

    /**
     * @param readers A list of principals that should be able to read this asset from S3.
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     */
    public fun readers(vararg readers: IGrantable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.assets.AssetProps.Builder =
        software.amazon.awscdk.services.s3.assets.AssetProps.builder()

    /**
     * @param assetHash Specify a custom hash for this asset.
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
     */
    override fun assetHash(assetHash: String) {
      cdkBuilder.assetHash(assetHash)
    }

    /**
     * @param assetHashType Specifies the type of hash to calculate for this asset.
     * If `assetHash` is configured, this option must be `undefined` or
     * `AssetHashType.CUSTOM`.
     */
    override fun assetHashType(assetHashType: AssetHashType) {
      cdkBuilder.assetHashType(assetHashType.let(AssetHashType.Companion::unwrap))
    }

    /**
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider.
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     */
    override fun bundling(bundling: BundlingOptions) {
      cdkBuilder.bundling(bundling.let(BundlingOptions.Companion::unwrap))
    }

    /**
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     * bundling provider.
     * The asset path will be mounted at `/asset-input`. The Docker
     * container is responsible for putting content at `/asset-output`.
     * The content at `/asset-output` will be zipped and used as the
     * final asset.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90f8f05d36986f4edd9a9276127344832fd649bcb96a968e728face052288fed")
    override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    /**
     * @param deployTime Whether or not the asset needs to exist beyond deployment time;.
     * i.e.
     * are copied over to a different location and not needed afterwards.
     * Setting this property to true has an impact on the lifecycle of the asset,
     * because we will assume that it is safe to delete after the CloudFormation
     * deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during
     * deployment. Therefore, it is not necessary to store the asset in S3, so
     * we consider those deployTime assets.
     */
    override fun deployTime(deployTime: Boolean) {
      cdkBuilder.deployTime(deployTime)
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
     * @param path The disk location of the asset. 
     * The path should refer to one of the following:
     *
     * * A regular file or a .zip file, in which case the file will be uploaded as-is to S3.
     * * A directory, in which case it will be archived into a .zip file and uploaded to S3.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param readers A list of principals that should be able to read this asset from S3.
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     */
    override fun readers(readers: List<IGrantable>) {
      cdkBuilder.readers(readers.map(IGrantable.Companion::unwrap))
    }

    /**
     * @param readers A list of principals that should be able to read this asset from S3.
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     */
    override fun readers(vararg readers: IGrantable): Unit = readers(readers.toList())

    public fun build(): software.amazon.awscdk.services.s3.assets.AssetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.assets.AssetProps,
  ) : CdkObject(cdkObject),
      AssetProps {
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
     */
    override fun assetHash(): String? = unwrap(this).getAssetHash()

    /**
     * Specifies the type of hash to calculate for this asset.
     *
     * If `assetHash` is configured, this option must be `undefined` or
     * `AssetHashType.CUSTOM`.
     *
     * Default: - the default is `AssetHashType.SOURCE`, but if `assetHash` is
     * explicitly specified this value defaults to `AssetHashType.CUSTOM`.
     */
    override fun assetHashType(): AssetHashType? =
        unwrap(this).getAssetHashType()?.let(AssetHashType::wrap)

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
     */
    override fun bundling(): BundlingOptions? =
        unwrap(this).getBundling()?.let(BundlingOptions::wrap)

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
     */
    override fun deployTime(): Boolean? = unwrap(this).getDeployTime()

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
     * The disk location of the asset.
     *
     * The path should refer to one of the following:
     *
     * * A regular file or a .zip file, in which case the file will be uploaded as-is to S3.
     * * A directory, in which case it will be archived into a .zip file and uploaded to S3.
     */
    override fun path(): String = unwrap(this).getPath()

    /**
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     */
    override fun readers(): List<IGrantable> = unwrap(this).getReaders()?.map(IGrantable::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.assets.AssetProps): AssetProps =
        CdkObjectWrappers.wrap(cdkObject) as? AssetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetProps): software.amazon.awscdk.services.s3.assets.AssetProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.assets.AssetProps
  }
}
