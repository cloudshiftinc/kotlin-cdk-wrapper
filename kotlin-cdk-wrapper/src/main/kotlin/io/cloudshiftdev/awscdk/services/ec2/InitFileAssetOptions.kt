@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.AssetHashType
import io.cloudshiftdev.awscdk.BundlingOptions
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Additional options for creating an InitFile from an asset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * DockerImage dockerImage;
 * IGrantable grantable;
 * InitServiceRestartHandle initServiceRestartHandle;
 * Key key;
 * ILocalBundling localBundling;
 * InitFileAssetOptions initFileAssetOptions = InitFileAssetOptions.builder()
 * .assetHash("assetHash")
 * .assetHashType(AssetHashType.SOURCE)
 * .base64Encoded(false)
 * .bundling(BundlingOptions.builder()
 * .image(dockerImage)
 * // the properties below are optional
 * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
 * .command(List.of("command"))
 * .entrypoint(List.of("entrypoint"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .local(localBundling)
 * .network("network")
 * .outputType(BundlingOutput.ARCHIVED)
 * .platform("platform")
 * .securityOpt("securityOpt")
 * .user("user")
 * .volumes(List.of(DockerVolume.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * // the properties below are optional
 * .consistency(DockerVolumeConsistency.CONSISTENT)
 * .build()))
 * .volumesFrom(List.of("volumesFrom"))
 * .workingDirectory("workingDirectory")
 * .build())
 * .deployTime(false)
 * .exclude(List.of("exclude"))
 * .followSymlinks(SymlinkFollowMode.NEVER)
 * .group("group")
 * .ignoreMode(IgnoreMode.GLOB)
 * .mode("mode")
 * .owner("owner")
 * .readers(List.of(grantable))
 * .serviceRestartHandles(List.of(initServiceRestartHandle))
 * .sourceKMSKey(key)
 * .build();
 * ```
 */
public interface InitFileAssetOptions : InitFileOptions, AssetOptions {
  /**
   * A builder for [InitFileAssetOptions]
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
     * @param base64Encoded True if the inlined content (from a string or file) should be treated as
     * base64 encoded.
     * Only applicable for inlined string and file content.
     */
    public fun base64Encoded(base64Encoded: Boolean)

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
    @JvmName("22442b9efd7b9f2223c071530858a2745ed4c4243a0af788c1ce6f4efefc3ff4")
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
     * @param group The name of the owning group for this file.
     * Not supported for Windows systems.
     */
    public fun group(group: String)

    /**
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    public fun ignoreMode(ignoreMode: IgnoreMode)

    /**
     * @param mode A six-digit octal value representing the mode for this file.
     * Use the first three digits for symlinks and the last three digits for
     * setting permissions. To create a symlink, specify 120xxx, where xxx
     * defines the permissions of the target file. To specify permissions for a
     * file, use the last three digits, such as 000644.
     *
     * Not supported for Windows systems.
     */
    public fun mode(mode: String)

    /**
     * @param owner The name of the owning user for this file.
     * Not supported for Windows systems.
     */
    public fun owner(owner: String)

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
     * @param serviceRestartHandles Restart the given service after this file has been written.
     */
    public fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>)

    /**
     * @param serviceRestartHandles Restart the given service after this file has been written.
     */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle)

    /**
     * @param sourceKmsKey The ARN of the KMS key used to encrypt the handler code.
     */
    public fun sourceKmsKey(sourceKmsKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InitFileAssetOptions.Builder =
        software.amazon.awscdk.services.ec2.InitFileAssetOptions.builder()

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
     * @param base64Encoded True if the inlined content (from a string or file) should be treated as
     * base64 encoded.
     * Only applicable for inlined string and file content.
     */
    override fun base64Encoded(base64Encoded: Boolean) {
      cdkBuilder.base64Encoded(base64Encoded)
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
    @JvmName("22442b9efd7b9f2223c071530858a2745ed4c4243a0af788c1ce6f4efefc3ff4")
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
     * @param group The name of the owning group for this file.
     * Not supported for Windows systems.
     */
    override fun group(group: String) {
      cdkBuilder.group(group)
    }

    /**
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode.Companion::unwrap))
    }

    /**
     * @param mode A six-digit octal value representing the mode for this file.
     * Use the first three digits for symlinks and the last three digits for
     * setting permissions. To create a symlink, specify 120xxx, where xxx
     * defines the permissions of the target file. To specify permissions for a
     * file, use the last three digits, such as 000644.
     *
     * Not supported for Windows systems.
     */
    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    /**
     * @param owner The name of the owning user for this file.
     * Not supported for Windows systems.
     */
    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
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
     * @param serviceRestartHandles Restart the given service after this file has been written.
     */
    override fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>) {
      cdkBuilder.serviceRestartHandles(serviceRestartHandles.map(InitServiceRestartHandle.Companion::unwrap))
    }

    /**
     * @param serviceRestartHandles Restart the given service after this file has been written.
     */
    override fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle): Unit
        = serviceRestartHandles(serviceRestartHandles.toList())

    /**
     * @param sourceKmsKey The ARN of the KMS key used to encrypt the handler code.
     */
    override fun sourceKmsKey(sourceKmsKey: IKey) {
      cdkBuilder.sourceKmsKey(sourceKmsKey.let(IKey.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.InitFileAssetOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.InitFileAssetOptions,
  ) : CdkObject(cdkObject),
      InitFileAssetOptions {
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
     * True if the inlined content (from a string or file) should be treated as base64 encoded.
     *
     * Only applicable for inlined string and file content.
     *
     * Default: false
     */
    override fun base64Encoded(): Boolean? = unwrap(this).getBase64Encoded()

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
     * The name of the owning group for this file.
     *
     * Not supported for Windows systems.
     *
     * Default: 'root'
     */
    override fun group(): String? = unwrap(this).getGroup()

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     */
    override fun ignoreMode(): IgnoreMode? = unwrap(this).getIgnoreMode()?.let(IgnoreMode::wrap)

    /**
     * A six-digit octal value representing the mode for this file.
     *
     * Use the first three digits for symlinks and the last three digits for
     * setting permissions. To create a symlink, specify 120xxx, where xxx
     * defines the permissions of the target file. To specify permissions for a
     * file, use the last three digits, such as 000644.
     *
     * Not supported for Windows systems.
     *
     * Default: '000644'
     */
    override fun mode(): String? = unwrap(this).getMode()

    /**
     * The name of the owning user for this file.
     *
     * Not supported for Windows systems.
     *
     * Default: 'root'
     */
    override fun owner(): String? = unwrap(this).getOwner()

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
     * Restart the given service after this file has been written.
     *
     * Default: - Do not restart any service
     */
    override fun serviceRestartHandles(): List<InitServiceRestartHandle> =
        unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

    /**
     * The ARN of the KMS key used to encrypt the handler code.
     *
     * Default: - the default server-side encryption with Amazon S3 managed keys(SSE-S3) key will be
     * used.
     */
    override fun sourceKMSKey(): IKey? = unwrap(this).getSourceKMSKey()?.let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InitFileAssetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitFileAssetOptions):
        InitFileAssetOptions = CdkObjectWrappers.wrap(cdkObject) as? InitFileAssetOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitFileAssetOptions):
        software.amazon.awscdk.services.ec2.InitFileAssetOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.InitFileAssetOptions
  }
}
