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
import software.amazon.awscdk.services.mediapackage.CfnAssetProps

@CdkDslMarker
public class CfnAssetPropsDsl {
  private val cdkBuilder: CfnAssetProps.Builder = CfnAssetProps.builder()

  private val _egressEndpoints: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param egressEndpoints List of playback endpoints that are available for this asset.
   */
  public fun egressEndpoints(vararg egressEndpoints: Any) {
    _egressEndpoints.addAll(listOf(*egressEndpoints))
  }

  /**
   * @param egressEndpoints List of playback endpoints that are available for this asset.
   */
  public fun egressEndpoints(egressEndpoints: Collection<Any>) {
    _egressEndpoints.addAll(egressEndpoints)
  }

  /**
   * @param egressEndpoints List of playback endpoints that are available for this asset.
   */
  public fun egressEndpoints(egressEndpoints: IResolvable) {
    cdkBuilder.egressEndpoints(egressEndpoints)
  }

  /**
   * @param id Unique identifier that you assign to the asset. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param packagingGroupId The ID of the packaging group associated with this asset. 
   */
  public fun packagingGroupId(packagingGroupId: String) {
    cdkBuilder.packagingGroupId(packagingGroupId)
  }

  /**
   * @param resourceId Unique identifier for this asset, as it's configured in the key provider
   * service.
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * @param sourceArn The ARN for the source content in Amazon S3. 
   */
  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  /**
   * @param sourceRoleArn The ARN for the IAM role that provides AWS Elemental MediaPackage access
   * to the Amazon S3 bucket where the source content is stored. 
   * Valid format: arn:aws:iam::{accountID}:role/{name}
   */
  public fun sourceRoleArn(sourceRoleArn: String) {
    cdkBuilder.sourceRoleArn(sourceRoleArn)
  }

  /**
   * @param tags The tags to assign to the asset.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to assign to the asset.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAssetProps {
    if(_egressEndpoints.isNotEmpty()) cdkBuilder.egressEndpoints(_egressEndpoints)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
