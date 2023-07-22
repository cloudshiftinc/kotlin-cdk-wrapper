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
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps

@CdkDslMarker
public class CfnPackagingConfigurationPropsDsl {
  private val cdkBuilder: CfnPackagingConfigurationProps.Builder =
      CfnPackagingConfigurationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param cmafPackage Parameters for CMAF packaging.
   */
  public fun cmafPackage(cmafPackage: IResolvable) {
    cdkBuilder.cmafPackage(cmafPackage)
  }

  /**
   * @param cmafPackage Parameters for CMAF packaging.
   */
  public fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty) {
    cdkBuilder.cmafPackage(cmafPackage)
  }

  /**
   * @param dashPackage Parameters for DASH-ISO packaging.
   */
  public fun dashPackage(dashPackage: IResolvable) {
    cdkBuilder.dashPackage(dashPackage)
  }

  /**
   * @param dashPackage Parameters for DASH-ISO packaging.
   */
  public fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty) {
    cdkBuilder.dashPackage(dashPackage)
  }

  /**
   * @param hlsPackage Parameters for Apple HLS packaging.
   */
  public fun hlsPackage(hlsPackage: IResolvable) {
    cdkBuilder.hlsPackage(hlsPackage)
  }

  /**
   * @param hlsPackage Parameters for Apple HLS packaging.
   */
  public fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty) {
    cdkBuilder.hlsPackage(hlsPackage)
  }

  /**
   * @param id Unique identifier that you assign to the packaging configuration. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
   */
  public fun mssPackage(mssPackage: IResolvable) {
    cdkBuilder.mssPackage(mssPackage)
  }

  /**
   * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
   */
  public fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty) {
    cdkBuilder.mssPackage(mssPackage)
  }

  /**
   * @param packagingGroupId The ID of the packaging group associated with this packaging
   * configuration. 
   */
  public fun packagingGroupId(packagingGroupId: String) {
    cdkBuilder.packagingGroupId(packagingGroupId)
  }

  /**
   * @param tags The tags to assign to the packaging configuration.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags to assign to the packaging configuration.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPackagingConfigurationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
