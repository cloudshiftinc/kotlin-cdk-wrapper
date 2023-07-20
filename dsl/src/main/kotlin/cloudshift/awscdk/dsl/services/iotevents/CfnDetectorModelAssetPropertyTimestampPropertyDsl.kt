@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelAssetPropertyTimestampPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.AssetPropertyTimestampProperty.Builder =
      CfnDetectorModel.AssetPropertyTimestampProperty.builder()

  public fun offsetInNanos(offsetInNanos: String) {
    cdkBuilder.offsetInNanos(offsetInNanos)
  }

  public fun timeInSeconds(timeInSeconds: String) {
    cdkBuilder.timeInSeconds(timeInSeconds)
  }

  public fun build(): CfnDetectorModel.AssetPropertyTimestampProperty = cdkBuilder.build()
}
