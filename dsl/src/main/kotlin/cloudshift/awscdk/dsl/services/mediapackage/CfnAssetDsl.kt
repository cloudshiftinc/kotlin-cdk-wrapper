@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnAsset
import software.constructs.Construct

/**
 * Creates an asset to ingest VOD content.
 *
 * After it's created, the asset starts ingesting content and generates playback URLs for the
 * packaging configurations associated with it. When ingest is complete, downstream devices use the
 * appropriate URL to request VOD content from AWS Elemental MediaPackage .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * CfnAsset cfnAsset = CfnAsset.Builder.create(this, "MyCfnAsset")
 * .id("id")
 * .packagingGroupId("packagingGroupId")
 * .sourceArn("sourceArn")
 * .sourceRoleArn("sourceRoleArn")
 * // the properties below are optional
 * .egressEndpoints(List.of(EgressEndpointProperty.builder()
 * .packagingConfigurationId("packagingConfigurationId")
 * .url("url")
 * .build()))
 * .resourceId("resourceId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html)
 */
@CdkDslMarker
public class CfnAssetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAsset.Builder = CfnAsset.Builder.create(scope, id)

  private val _egressEndpoints: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * List of playback endpoints that are available for this asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
   * @param egressEndpoints List of playback endpoints that are available for this asset. 
   */
  public fun egressEndpoints(vararg egressEndpoints: Any) {
    _egressEndpoints.addAll(listOf(*egressEndpoints))
  }

  /**
   * List of playback endpoints that are available for this asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
   * @param egressEndpoints List of playback endpoints that are available for this asset. 
   */
  public fun egressEndpoints(egressEndpoints: Collection<Any>) {
    _egressEndpoints.addAll(egressEndpoints)
  }

  /**
   * List of playback endpoints that are available for this asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-egressendpoints)
   * @param egressEndpoints List of playback endpoints that are available for this asset. 
   */
  public fun egressEndpoints(egressEndpoints: IResolvable) {
    cdkBuilder.egressEndpoints(egressEndpoints)
  }

  /**
   * Unique identifier that you assign to the asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-id)
   * @param id Unique identifier that you assign to the asset. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * The ID of the packaging group associated with this asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-packaginggroupid)
   * @param packagingGroupId The ID of the packaging group associated with this asset. 
   */
  public fun packagingGroupId(packagingGroupId: String) {
    cdkBuilder.packagingGroupId(packagingGroupId)
  }

  /**
   * Unique identifier for this asset, as it's configured in the key provider service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-resourceid)
   * @param resourceId Unique identifier for this asset, as it's configured in the key provider
   * service. 
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * The ARN for the source content in Amazon S3.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-sourcearn)
   * @param sourceArn The ARN for the source content in Amazon S3. 
   */
  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  /**
   * The ARN for the IAM role that provides AWS Elemental MediaPackage access to the Amazon S3
   * bucket where the source content is stored.
   *
   * Valid format: arn:aws:iam::{accountID}:role/{name}
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-sourcerolearn)
   * @param sourceRoleArn The ARN for the IAM role that provides AWS Elemental MediaPackage access
   * to the Amazon S3 bucket where the source content is stored. 
   */
  public fun sourceRoleArn(sourceRoleArn: String) {
    cdkBuilder.sourceRoleArn(sourceRoleArn)
  }

  /**
   * The tags to assign to the asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-tags)
   * @param tags The tags to assign to the asset. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to assign to the asset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-asset.html#cfn-mediapackage-asset-tags)
   * @param tags The tags to assign to the asset. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAsset {
    if(_egressEndpoints.isNotEmpty()) cdkBuilder.egressEndpoints(_egressEndpoints)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
