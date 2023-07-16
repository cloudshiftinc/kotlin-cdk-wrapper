@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelIotEventsPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.IotEventsProperty.Builder =
      CfnDetectorModel.IotEventsProperty.builder()

  public fun inputName(inputName: String) {
    cdkBuilder.inputName(inputName)
  }

  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  public fun payload(payload: CfnDetectorModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  public fun build(): CfnDetectorModel.IotEventsProperty = cdkBuilder.build()
}
