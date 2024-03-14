package io.cloudshiftdev.awscdk.pipelines

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface StackAsset {
  public fun assetId(): String

  public fun assetManifestPath(): String

  public fun assetPublishingRoleArn(): String? = unwrap(this).getAssetPublishingRoleArn()

  public fun assetSelector(): String

  public fun assetType(): AssetType

  public fun isTemplate(): Boolean

  public interface Builder {
    public fun assetId(assetId: String) {
    }

    public fun assetManifestPath(assetManifestPath: String) {
    }

    public fun assetPublishingRoleArn(assetPublishingRoleArn: String) {
    }

    public fun assetSelector(assetSelector: String) {
    }

    public fun assetType(assetType: AssetType) {
    }

    public fun isTemplate(isTemplate: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.StackAsset.Builder =
        software.amazon.awscdk.pipelines.StackAsset.builder()

    public override fun assetId(assetId: String) {
      cdkBuilder.assetId(assetId)
    }

    public override fun assetManifestPath(assetManifestPath: String) {
      cdkBuilder.assetManifestPath(assetManifestPath)
    }

    public override fun assetPublishingRoleArn(assetPublishingRoleArn: String) {
      cdkBuilder.assetPublishingRoleArn(assetPublishingRoleArn)
    }

    public override fun assetSelector(assetSelector: String) {
      cdkBuilder.assetSelector(assetSelector)
    }

    public override fun assetType(assetType: AssetType) {
      cdkBuilder.assetType(assetType.let(AssetType::unwrap))
    }

    public override fun isTemplate(isTemplate: Boolean) {
      cdkBuilder.isTemplate(isTemplate)
    }

    public fun build(): software.amazon.awscdk.pipelines.StackAsset = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.StackAsset,
  ) : StackAsset {
    public override fun assetId(): String = unwrap(this).getAssetId()

    public override fun assetManifestPath(): String = unwrap(this).getAssetManifestPath()

    public override fun assetPublishingRoleArn(): String? = unwrap(this).getAssetPublishingRoleArn()

    public override fun assetSelector(): String = unwrap(this).getAssetSelector()

    public override fun assetType(): AssetType = unwrap(this).getAssetType().let(AssetType::wrap)

    public override fun isTemplate(): Boolean = unwrap(this).getIsTemplate()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StackAsset {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackAsset): StackAsset =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StackAsset): software.amazon.awscdk.pipelines.StackAsset = (wrapped
        as Wrapper).cdkObject
  }
}
