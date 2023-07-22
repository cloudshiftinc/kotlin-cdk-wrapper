@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnPackagingGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPackagingGroup.Builder = CfnPackagingGroup.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Parameters for CDN authorization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-authorization)
   * @param authorization Parameters for CDN authorization. 
   */
  public fun authorization(authorization: IResolvable) {
    cdkBuilder.authorization(authorization)
  }

  /**
   * Parameters for CDN authorization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-authorization)
   * @param authorization Parameters for CDN authorization. 
   */
  public fun authorization(authorization: CfnPackagingGroup.AuthorizationProperty) {
    cdkBuilder.authorization(authorization)
  }

  /**
   * The configuration parameters for egress access logging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-egressaccesslogs)
   * @param egressAccessLogs The configuration parameters for egress access logging. 
   */
  public fun egressAccessLogs(egressAccessLogs: IResolvable) {
    cdkBuilder.egressAccessLogs(egressAccessLogs)
  }

  /**
   * The configuration parameters for egress access logging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-egressaccesslogs)
   * @param egressAccessLogs The configuration parameters for egress access logging. 
   */
  public fun egressAccessLogs(egressAccessLogs: CfnPackagingGroup.LogConfigurationProperty) {
    cdkBuilder.egressAccessLogs(egressAccessLogs)
  }

  /**
   * Unique identifier that you assign to the packaging group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-id)
   * @param id Unique identifier that you assign to the packaging group. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * The tags to assign to the packaging group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-tags)
   * @param tags The tags to assign to the packaging group. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to assign to the packaging group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packaginggroup.html#cfn-mediapackage-packaginggroup-tags)
   * @param tags The tags to assign to the packaging group. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPackagingGroup {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
