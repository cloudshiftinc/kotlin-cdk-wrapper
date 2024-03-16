@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * An asset used by a Stack.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.pipelines.*;
 * StackAsset stackAsset = StackAsset.builder()
 * .assetId("assetId")
 * .assetManifestPath("assetManifestPath")
 * .assetSelector("assetSelector")
 * .assetType(AssetType.FILE)
 * .isTemplate(false)
 * // the properties below are optional
 * .assetPublishingRoleArn("assetPublishingRoleArn")
 * .build();
 * ```
 */
public interface StackAsset {
  /**
   * Asset identifier.
   */
  public fun assetId(): String

  /**
   * Absolute asset manifest path.
   *
   * This needs to be made relative at a later point in time, but when this
   * information is parsed we don't know about the root cloud assembly yet.
   */
  public fun assetManifestPath(): String

  /**
   * Role ARN to assume to publish.
   *
   * Default: - No need to assume any role
   */
  public fun assetPublishingRoleArn(): String? = unwrap(this).getAssetPublishingRoleArn()

  /**
   * Asset selector to pass to `cdk-assets`.
   */
  public fun assetSelector(): String

  /**
   * Type of asset to publish.
   */
  public fun assetType(): AssetType

  /**
   * Does this asset represent the CloudFormation template for the stack.
   *
   * Default: false
   */
  public fun isTemplate(): Boolean

  /**
   * A builder for [StackAsset]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetId Asset identifier. 
     */
    public fun assetId(assetId: String)

    /**
     * @param assetManifestPath Absolute asset manifest path. 
     * This needs to be made relative at a later point in time, but when this
     * information is parsed we don't know about the root cloud assembly yet.
     */
    public fun assetManifestPath(assetManifestPath: String)

    /**
     * @param assetPublishingRoleArn Role ARN to assume to publish.
     */
    public fun assetPublishingRoleArn(assetPublishingRoleArn: String)

    /**
     * @param assetSelector Asset selector to pass to `cdk-assets`. 
     */
    public fun assetSelector(assetSelector: String)

    /**
     * @param assetType Type of asset to publish. 
     */
    public fun assetType(assetType: AssetType)

    /**
     * @param isTemplate Does this asset represent the CloudFormation template for the stack. 
     */
    public fun isTemplate(isTemplate: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.StackAsset.Builder =
        software.amazon.awscdk.pipelines.StackAsset.builder()

    /**
     * @param assetId Asset identifier. 
     */
    override fun assetId(assetId: String) {
      cdkBuilder.assetId(assetId)
    }

    /**
     * @param assetManifestPath Absolute asset manifest path. 
     * This needs to be made relative at a later point in time, but when this
     * information is parsed we don't know about the root cloud assembly yet.
     */
    override fun assetManifestPath(assetManifestPath: String) {
      cdkBuilder.assetManifestPath(assetManifestPath)
    }

    /**
     * @param assetPublishingRoleArn Role ARN to assume to publish.
     */
    override fun assetPublishingRoleArn(assetPublishingRoleArn: String) {
      cdkBuilder.assetPublishingRoleArn(assetPublishingRoleArn)
    }

    /**
     * @param assetSelector Asset selector to pass to `cdk-assets`. 
     */
    override fun assetSelector(assetSelector: String) {
      cdkBuilder.assetSelector(assetSelector)
    }

    /**
     * @param assetType Type of asset to publish. 
     */
    override fun assetType(assetType: AssetType) {
      cdkBuilder.assetType(assetType.let(AssetType::unwrap))
    }

    /**
     * @param isTemplate Does this asset represent the CloudFormation template for the stack. 
     */
    override fun isTemplate(isTemplate: Boolean) {
      cdkBuilder.isTemplate(isTemplate)
    }

    public fun build(): software.amazon.awscdk.pipelines.StackAsset = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.StackAsset,
  ) : CdkObject(cdkObject), StackAsset {
    /**
     * Asset identifier.
     */
    override fun assetId(): String = unwrap(this).getAssetId()

    /**
     * Absolute asset manifest path.
     *
     * This needs to be made relative at a later point in time, but when this
     * information is parsed we don't know about the root cloud assembly yet.
     */
    override fun assetManifestPath(): String = unwrap(this).getAssetManifestPath()

    /**
     * Role ARN to assume to publish.
     *
     * Default: - No need to assume any role
     */
    override fun assetPublishingRoleArn(): String? = unwrap(this).getAssetPublishingRoleArn()

    /**
     * Asset selector to pass to `cdk-assets`.
     */
    override fun assetSelector(): String = unwrap(this).getAssetSelector()

    /**
     * Type of asset to publish.
     */
    override fun assetType(): AssetType = unwrap(this).getAssetType().let(AssetType::wrap)

    /**
     * Does this asset represent the CloudFormation template for the stack.
     *
     * Default: false
     */
    override fun isTemplate(): Boolean = unwrap(this).getIsTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StackAsset {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.StackAsset): StackAsset =
        CdkObjectWrappers.wrap(cdkObject) as StackAsset

    internal fun unwrap(wrapped: StackAsset): software.amazon.awscdk.pipelines.StackAsset = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.pipelines.StackAsset
  }
}
