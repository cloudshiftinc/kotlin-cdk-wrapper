@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.assets

import io.cloudshiftdev.awscdk.AssetHashType
import io.cloudshiftdev.awscdk.BundlingOptions
import io.cloudshiftdev.awscdk.FileCopyOptions
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * Function.Builder.create(this, "Function")
 * .code(Code.fromAsset(join(__dirname, "my-python-handler"), AssetOptions.builder()
 * .bundling(BundlingOptions.builder()
 * .image(Runtime.PYTHON_3_9.getBundlingImage())
 * .command(List.of("bash", "-c", "pip install -r requirements.txt -t /asset-output &amp;&amp;
 * cp -au . /asset-output"))
 * .build())
 * .build()))
 * .runtime(Runtime.PYTHON_3_9)
 * .handler("index.handler")
 * .build();
 * ```
 */
public interface AssetOptions : io.cloudshiftdev.awscdk.AssetOptions, FileCopyOptions {
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
  public fun deployTime(): Boolean? = unwrap(this).getDeployTime()

  /**
   * A display name for this asset.
   *
   * If supplied, the display name will be used in locations where the asset
   * identifier is printed, like in the CLI progress information. If the same
   * asset is added multiple times, the display name of the first occurrence is
   * used.
   *
   * The default is the construct path of the Asset construct, with respect to
   * the enclosing stack. If the asset is produced by a construct helper
   * function (such as `lambda.Code.fromAsset()`), this will look like
   * `MyFunction/Code`.
   *
   * We use the stack-relative construct path so that in the common case where
   * you have multiple stacks with the same asset, we won't show something like
   * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
   * production.
   *
   * Default: - Stack-relative construct path
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * A list of principals that should be able to read this asset from S3.
   *
   * You can use `asset.grantRead(principal)` to grant read permissions later.
   *
   * Default: - No principals that can read file asset.
   */
  public fun readers(): List<IGrantable> = unwrap(this).getReaders()?.map(IGrantable::wrap) ?:
      emptyList()

  /**
   * The ARN of the KMS key used to encrypt the handler code.
   *
   * Default: - the default server-side encryption with Amazon S3 managed keys(SSE-S3) key will be
   * used.
   */
  public fun sourceKMSKey(): IKey? = unwrap(this).getSourceKMSKey()?.let(IKey::wrap)

  /**
   * A builder for [AssetOptions]
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
    @JvmName("5e4839270a5dcff2c1b91d0006869247f9a5e445bf2d9b19aaaadb836021b09e")
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
     * @param displayName A display name for this asset.
     * If supplied, the display name will be used in locations where the asset
     * identifier is printed, like in the CLI progress information. If the same
     * asset is added multiple times, the display name of the first occurrence is
     * used.
     *
     * The default is the construct path of the Asset construct, with respect to
     * the enclosing stack. If the asset is produced by a construct helper
     * function (such as `lambda.Code.fromAsset()`), this will look like
     * `MyFunction/Code`.
     *
     * We use the stack-relative construct path so that in the common case where
     * you have multiple stacks with the same asset, we won't show something like
     * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
     * production.
     */
    public fun displayName(displayName: String)

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
     * @param readers A list of principals that should be able to read this asset from S3.
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     */
    public fun readers(readers: List<IGrantable>)

    /**
     * @param readers A list of principals that should be able to read this asset from S3.
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     */
    public fun readers(vararg readers: IGrantable)

    /**
     * @param sourceKmsKey The ARN of the KMS key used to encrypt the handler code.
     */
    public fun sourceKmsKey(sourceKmsKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.assets.AssetOptions.Builder =
        software.amazon.awscdk.services.s3.assets.AssetOptions.builder()

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
    @JvmName("5e4839270a5dcff2c1b91d0006869247f9a5e445bf2d9b19aaaadb836021b09e")
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
     * @param displayName A display name for this asset.
     * If supplied, the display name will be used in locations where the asset
     * identifier is printed, like in the CLI progress information. If the same
     * asset is added multiple times, the display name of the first occurrence is
     * used.
     *
     * The default is the construct path of the Asset construct, with respect to
     * the enclosing stack. If the asset is produced by a construct helper
     * function (such as `lambda.Code.fromAsset()`), this will look like
     * `MyFunction/Code`.
     *
     * We use the stack-relative construct path so that in the common case where
     * you have multiple stacks with the same asset, we won't show something like
     * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
     * production.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
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

    /**
     * @param sourceKmsKey The ARN of the KMS key used to encrypt the handler code.
     */
    override fun sourceKmsKey(sourceKmsKey: IKey) {
      cdkBuilder.sourceKmsKey(sourceKmsKey.let(IKey.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.assets.AssetOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.assets.AssetOptions,
  ) : CdkObject(cdkObject),
      AssetOptions {
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
     * A display name for this asset.
     *
     * If supplied, the display name will be used in locations where the asset
     * identifier is printed, like in the CLI progress information. If the same
     * asset is added multiple times, the display name of the first occurrence is
     * used.
     *
     * The default is the construct path of the Asset construct, with respect to
     * the enclosing stack. If the asset is produced by a construct helper
     * function (such as `lambda.Code.fromAsset()`), this will look like
     * `MyFunction/Code`.
     *
     * We use the stack-relative construct path so that in the common case where
     * you have multiple stacks with the same asset, we won't show something like
     * `/MyBetaStack/MyFunction/Code` when you are actually deploying to
     * production.
     *
     * Default: - Stack-relative construct path
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

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
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     */
    override fun readers(): List<IGrantable> = unwrap(this).getReaders()?.map(IGrantable::wrap) ?:
        emptyList()

    /**
     * The ARN of the KMS key used to encrypt the handler code.
     *
     * Default: - the default server-side encryption with Amazon S3 managed keys(SSE-S3) key will be
     * used.
     */
    override fun sourceKMSKey(): IKey? = unwrap(this).getSourceKMSKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.assets.AssetOptions):
        AssetOptions = CdkObjectWrappers.wrap(cdkObject) as? AssetOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetOptions):
        software.amazon.awscdk.services.s3.assets.AssetOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.assets.AssetOptions
  }
}
