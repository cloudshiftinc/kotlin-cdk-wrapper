package io.cloudshiftdev.awscdk.services.s3.assets

import io.cloudshiftdev.awscdk.AssetHashType
import io.cloudshiftdev.awscdk.BundlingOptions
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IAsset
import io.cloudshiftdev.awscdk.IgnoreMode
import io.cloudshiftdev.awscdk.SymlinkFollowMode
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Asset internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.assets.Asset,
) : CloudshiftdevConstructsConstruct(cdkObject), IAsset {
  public open fun addResourceMetadata(resource: CfnResource, resourceProperty: String) {
    unwrap(this).addResourceMetadata(resource.let(CfnResource::unwrap), resourceProperty)
  }

  public override fun assetHash(): String = unwrap(this).getAssetHash()

  public open fun assetPath(): String = unwrap(this).getAssetPath()

  public open fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  public open fun grantRead(grantee: IGrantable) {
    unwrap(this).grantRead(grantee.let(IGrantable::unwrap))
  }

  public open fun httpUrl(): String = unwrap(this).getHttpUrl()

  public open fun isFile(): Boolean = unwrap(this).getIsFile()

  public open fun isZipArchive(): Boolean = unwrap(this).getIsZipArchive()

  public open fun s3BucketName(): String = unwrap(this).getS3BucketName()

  public open fun s3ObjectKey(): String = unwrap(this).getS3ObjectKey()

  public open fun s3ObjectUrl(): String = unwrap(this).getS3ObjectUrl()

  public interface Builder {
    public fun assetHash(assetHash: String)

    public fun assetHashType(assetHashType: AssetHashType)

    public fun bundling(bundling: BundlingOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("507668c83b0111ed17916394eec5d6c85b10451e6896b5ff6482fd3d562938bc")
    public fun bundling(bundling: BundlingOptions.Builder.() -> Unit)

    public fun deployTime(deployTime: Boolean)

    public fun exclude(exclude: List<String>)

    public fun followSymlinks(followSymlinks: SymlinkFollowMode)

    public fun ignoreMode(ignoreMode: IgnoreMode)

    public fun path(path: String)

    public fun readers(readers: List<IGrantable>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.assets.Asset.Builder =
        software.amazon.awscdk.services.s3.assets.Asset.Builder.create(scope, id)

    override fun assetHash(assetHash: String) {
      cdkBuilder.assetHash(assetHash)
    }

    override fun assetHashType(assetHashType: AssetHashType) {
      cdkBuilder.assetHashType(assetHashType.let(AssetHashType::unwrap))
    }

    override fun bundling(bundling: BundlingOptions) {
      cdkBuilder.bundling(bundling.let(BundlingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("507668c83b0111ed17916394eec5d6c85b10451e6896b5ff6482fd3d562938bc")
    override fun bundling(bundling: BundlingOptions.Builder.() -> Unit): Unit =
        bundling(BundlingOptions(bundling))

    override fun deployTime(deployTime: Boolean) {
      cdkBuilder.deployTime(deployTime)
    }

    override fun exclude(exclude: List<String>) {
      cdkBuilder.exclude(exclude)
    }

    override fun followSymlinks(followSymlinks: SymlinkFollowMode) {
      cdkBuilder.followSymlinks(followSymlinks.let(SymlinkFollowMode::unwrap))
    }

    override fun ignoreMode(ignoreMode: IgnoreMode) {
      cdkBuilder.ignoreMode(ignoreMode.let(IgnoreMode::unwrap))
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun readers(readers: List<IGrantable>) {
      cdkBuilder.readers(readers.map(IGrantable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.assets.Asset = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Asset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Asset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.assets.Asset): Asset =
        Asset(cdkObject)

    internal fun unwrap(wrapped: Asset): software.amazon.awscdk.services.s3.assets.Asset =
        wrapped.cdkObject
  }
}
