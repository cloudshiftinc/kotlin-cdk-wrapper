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
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnPackagingConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPackagingConfiguration.Builder =
      CfnPackagingConfiguration.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Parameters for CMAF packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
   * @param cmafPackage Parameters for CMAF packaging. 
   */
  public fun cmafPackage(cmafPackage: IResolvable) {
    cdkBuilder.cmafPackage(cmafPackage)
  }

  /**
   * Parameters for CMAF packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
   * @param cmafPackage Parameters for CMAF packaging. 
   */
  public fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty) {
    cdkBuilder.cmafPackage(cmafPackage)
  }

  /**
   * Parameters for DASH-ISO packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
   * @param dashPackage Parameters for DASH-ISO packaging. 
   */
  public fun dashPackage(dashPackage: IResolvable) {
    cdkBuilder.dashPackage(dashPackage)
  }

  /**
   * Parameters for DASH-ISO packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
   * @param dashPackage Parameters for DASH-ISO packaging. 
   */
  public fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty) {
    cdkBuilder.dashPackage(dashPackage)
  }

  /**
   * Parameters for Apple HLS packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
   * @param hlsPackage Parameters for Apple HLS packaging. 
   */
  public fun hlsPackage(hlsPackage: IResolvable) {
    cdkBuilder.hlsPackage(hlsPackage)
  }

  /**
   * Parameters for Apple HLS packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
   * @param hlsPackage Parameters for Apple HLS packaging. 
   */
  public fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty) {
    cdkBuilder.hlsPackage(hlsPackage)
  }

  /**
   * Unique identifier that you assign to the packaging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-id)
   * @param id Unique identifier that you assign to the packaging configuration. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
   * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
   */
  public fun mssPackage(mssPackage: IResolvable) {
    cdkBuilder.mssPackage(mssPackage)
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
   * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
   */
  public fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty) {
    cdkBuilder.mssPackage(mssPackage)
  }

  /**
   * The ID of the packaging group associated with this packaging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-packaginggroupid)
   * @param packagingGroupId The ID of the packaging group associated with this packaging
   * configuration. 
   */
  public fun packagingGroupId(packagingGroupId: String) {
    cdkBuilder.packagingGroupId(packagingGroupId)
  }

  /**
   * The tags to assign to the packaging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-tags)
   * @param tags The tags to assign to the packaging configuration. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to assign to the packaging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-tags)
   * @param tags The tags to assign to the packaging configuration. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPackagingConfiguration {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
