@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelIotSiteWisePropertyDsl {
  private val cdkBuilder: CfnDetectorModel.IotSiteWiseProperty.Builder =
      CfnDetectorModel.IotSiteWiseProperty.builder()

  /**
   * @param assetId The ID of the asset that has the specified property.
   */
  public fun assetId(assetId: String) {
    cdkBuilder.assetId(assetId)
  }

  /**
   * @param entryId A unique identifier for this entry.
   * You can use the entry ID to track which data entry causes an error in case of failure. The
   * default is a new unique identifier.
   */
  public fun entryId(entryId: String) {
    cdkBuilder.entryId(entryId)
  }

  /**
   * @param propertyAlias The alias of the asset property.
   */
  public fun propertyAlias(propertyAlias: String) {
    cdkBuilder.propertyAlias(propertyAlias)
  }

  /**
   * @param propertyId The ID of the asset property.
   */
  public fun propertyId(propertyId: String) {
    cdkBuilder.propertyId(propertyId)
  }

  /**
   * @param propertyValue The value to send to the asset property. 
   * This value contains timestamp, quality, and value (TQV) information.
   */
  public fun propertyValue(propertyValue: IResolvable) {
    cdkBuilder.propertyValue(propertyValue)
  }

  /**
   * @param propertyValue The value to send to the asset property. 
   * This value contains timestamp, quality, and value (TQV) information.
   */
  public fun propertyValue(propertyValue: CfnDetectorModel.AssetPropertyValueProperty) {
    cdkBuilder.propertyValue(propertyValue)
  }

  public fun build(): CfnDetectorModel.IotSiteWiseProperty = cdkBuilder.build()
}
