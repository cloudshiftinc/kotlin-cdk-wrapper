@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelAssetPropertyValuePropertyDsl {
  private val cdkBuilder: CfnDetectorModel.AssetPropertyValueProperty.Builder =
      CfnDetectorModel.AssetPropertyValueProperty.builder()

  /**
   * @param quality The quality of the asset property value.
   * The value must be `'GOOD'` , `'BAD'` , or `'UNCERTAIN'` .
   */
  public fun quality(quality: String) {
    cdkBuilder.quality(quality)
  }

  /**
   * @param timestamp The timestamp associated with the asset property value.
   * The default is the current event time.
   */
  public fun timestamp(timestamp: IResolvable) {
    cdkBuilder.timestamp(timestamp)
  }

  /**
   * @param timestamp The timestamp associated with the asset property value.
   * The default is the current event time.
   */
  public fun timestamp(timestamp: CfnDetectorModel.AssetPropertyTimestampProperty) {
    cdkBuilder.timestamp(timestamp)
  }

  /**
   * @param value The value to send to an asset property. 
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The value to send to an asset property. 
   */
  public fun `value`(`value`: CfnDetectorModel.AssetPropertyVariantProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDetectorModel.AssetPropertyValueProperty = cdkBuilder.build()
}
