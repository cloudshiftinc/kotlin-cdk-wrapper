@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnLayerVersion
import software.amazon.awscdk.services.sam.CfnLayerVersionProps

@CdkDslMarker
public class CfnLayerVersionPropsDsl {
  private val cdkBuilder: CfnLayerVersionProps.Builder = CfnLayerVersionProps.builder()

  private val _compatibleRuntimes: MutableList<String> = mutableListOf()

  /**
   * @param compatibleRuntimes the value to be set.
   */
  public fun compatibleRuntimes(vararg compatibleRuntimes: String) {
    _compatibleRuntimes.addAll(listOf(*compatibleRuntimes))
  }

  /**
   * @param compatibleRuntimes the value to be set.
   */
  public fun compatibleRuntimes(compatibleRuntimes: Collection<String>) {
    _compatibleRuntimes.addAll(compatibleRuntimes)
  }

  /**
   * @param contentUri the value to be set.
   */
  public fun contentUri(contentUri: String) {
    cdkBuilder.contentUri(contentUri)
  }

  /**
   * @param contentUri the value to be set.
   */
  public fun contentUri(contentUri: IResolvable) {
    cdkBuilder.contentUri(contentUri)
  }

  /**
   * @param contentUri the value to be set.
   */
  public fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty) {
    cdkBuilder.contentUri(contentUri)
  }

  /**
   * @param description the value to be set.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param layerName the value to be set.
   */
  public fun layerName(layerName: String) {
    cdkBuilder.layerName(layerName)
  }

  /**
   * @param licenseInfo the value to be set.
   */
  public fun licenseInfo(licenseInfo: String) {
    cdkBuilder.licenseInfo(licenseInfo)
  }

  /**
   * @param retentionPolicy the value to be set.
   */
  public fun retentionPolicy(retentionPolicy: String) {
    cdkBuilder.retentionPolicy(retentionPolicy)
  }

  public fun build(): CfnLayerVersionProps {
    if(_compatibleRuntimes.isNotEmpty()) cdkBuilder.compatibleRuntimes(_compatibleRuntimes)
    return cdkBuilder.build()
  }
}
