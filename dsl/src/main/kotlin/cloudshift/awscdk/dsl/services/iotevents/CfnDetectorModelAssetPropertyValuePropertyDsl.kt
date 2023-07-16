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

  public fun quality(quality: String) {
    cdkBuilder.quality(quality)
  }

  public fun timestamp(timestamp: IResolvable) {
    cdkBuilder.timestamp(timestamp)
  }

  public fun timestamp(timestamp: CfnDetectorModel.AssetPropertyTimestampProperty) {
    cdkBuilder.timestamp(timestamp)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnDetectorModel.AssetPropertyVariantProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDetectorModel.AssetPropertyValueProperty = cdkBuilder.build()
}
