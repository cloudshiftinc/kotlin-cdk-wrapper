package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAssetProps {
  /**
   * List of playback endpoints that are available for this asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
   */
  public fun egressEndpoints(): Any? = unwrap(this).getEgressEndpoints()

  /**
   * Unique identifier that you assign to the asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-id)
   */
  public fun id(): String

  /**
   * The ID of the packaging group associated with this asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-packaginggroupid)
   */
  public fun packagingGroupId(): String

  /**
   * Unique identifier for this asset, as it's configured in the key provider service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-resourceid)
   */
  public fun resourceId(): String? = unwrap(this).getResourceId()

  /**
   * The ARN for the source content in Amazon S3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-sourcearn)
   */
  public fun sourceArn(): String

  /**
   * The ARN for the IAM role that provides AWS Elemental MediaPackage access to the Amazon S3
   * bucket where the source content is stored.
   *
   * Valid format: arn:aws:iam::{accountID}:role/{name}
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-sourcerolearn)
   */
  public fun sourceRoleArn(): String

  /**
   * The tags to assign to the asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAssetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param egressEndpoints List of playback endpoints that are available for this asset.
     */
    public fun egressEndpoints(egressEndpoints: IResolvable)

    /**
     * @param egressEndpoints List of playback endpoints that are available for this asset.
     */
    public fun egressEndpoints(egressEndpoints: List<Any>)

    /**
     * @param egressEndpoints List of playback endpoints that are available for this asset.
     */
    public fun egressEndpoints(vararg egressEndpoints: Any)

    /**
     * @param id Unique identifier that you assign to the asset. 
     */
    public fun id(id: String)

    /**
     * @param packagingGroupId The ID of the packaging group associated with this asset. 
     */
    public fun packagingGroupId(packagingGroupId: String)

    /**
     * @param resourceId Unique identifier for this asset, as it's configured in the key provider
     * service.
     */
    public fun resourceId(resourceId: String)

    /**
     * @param sourceArn The ARN for the source content in Amazon S3. 
     */
    public fun sourceArn(sourceArn: String)

    /**
     * @param sourceRoleArn The ARN for the IAM role that provides AWS Elemental MediaPackage access
     * to the Amazon S3 bucket where the source content is stored. 
     * Valid format: arn:aws:iam::{accountID}:role/{name}
     */
    public fun sourceRoleArn(sourceRoleArn: String)

    /**
     * @param tags The tags to assign to the asset.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to the asset.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnAssetProps.Builder =
        software.amazon.awscdk.services.mediapackage.CfnAssetProps.builder()

    /**
     * @param egressEndpoints List of playback endpoints that are available for this asset.
     */
    override fun egressEndpoints(egressEndpoints: IResolvable) {
      cdkBuilder.egressEndpoints(egressEndpoints.let(IResolvable::unwrap))
    }

    /**
     * @param egressEndpoints List of playback endpoints that are available for this asset.
     */
    override fun egressEndpoints(egressEndpoints: List<Any>) {
      cdkBuilder.egressEndpoints(egressEndpoints)
    }

    /**
     * @param egressEndpoints List of playback endpoints that are available for this asset.
     */
    override fun egressEndpoints(vararg egressEndpoints: Any): Unit =
        egressEndpoints(egressEndpoints.toList())

    /**
     * @param id Unique identifier that you assign to the asset. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param packagingGroupId The ID of the packaging group associated with this asset. 
     */
    override fun packagingGroupId(packagingGroupId: String) {
      cdkBuilder.packagingGroupId(packagingGroupId)
    }

    /**
     * @param resourceId Unique identifier for this asset, as it's configured in the key provider
     * service.
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param sourceArn The ARN for the source content in Amazon S3. 
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    /**
     * @param sourceRoleArn The ARN for the IAM role that provides AWS Elemental MediaPackage access
     * to the Amazon S3 bucket where the source content is stored. 
     * Valid format: arn:aws:iam::{accountID}:role/{name}
     */
    override fun sourceRoleArn(sourceRoleArn: String) {
      cdkBuilder.sourceRoleArn(sourceRoleArn)
    }

    /**
     * @param tags The tags to assign to the asset.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to assign to the asset.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnAssetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackage.CfnAssetProps,
  ) : CdkObject(cdkObject), CfnAssetProps {
    /**
     * List of playback endpoints that are available for this asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
     */
    override fun egressEndpoints(): Any? = unwrap(this).getEgressEndpoints()

    /**
     * Unique identifier that you assign to the asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-id)
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * The ID of the packaging group associated with this asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-packaginggroupid)
     */
    override fun packagingGroupId(): String = unwrap(this).getPackagingGroupId()

    /**
     * Unique identifier for this asset, as it's configured in the key provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-resourceid)
     */
    override fun resourceId(): String? = unwrap(this).getResourceId()

    /**
     * The ARN for the source content in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-sourcearn)
     */
    override fun sourceArn(): String = unwrap(this).getSourceArn()

    /**
     * The ARN for the IAM role that provides AWS Elemental MediaPackage access to the Amazon S3
     * bucket where the source content is stored.
     *
     * Valid format: arn:aws:iam::{accountID}:role/{name}
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-sourcerolearn)
     */
    override fun sourceRoleArn(): String = unwrap(this).getSourceRoleArn()

    /**
     * The tags to assign to the asset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnAssetProps):
        CfnAssetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssetProps):
        software.amazon.awscdk.services.mediapackage.CfnAssetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackage.CfnAssetProps
  }
}
