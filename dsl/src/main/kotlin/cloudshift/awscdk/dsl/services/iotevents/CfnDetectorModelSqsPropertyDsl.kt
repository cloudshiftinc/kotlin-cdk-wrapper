@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

@CdkDslMarker
public class CfnDetectorModelSqsPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.SqsProperty.Builder =
      CfnDetectorModel.SqsProperty.builder()

  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  public fun payload(payload: CfnDetectorModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  public fun queueUrl(queueUrl: String) {
    cdkBuilder.queueUrl(queueUrl)
  }

  public fun useBase64(useBase64: Boolean) {
    cdkBuilder.useBase64(useBase64)
  }

  public fun useBase64(useBase64: IResolvable) {
    cdkBuilder.useBase64(useBase64)
  }

  public fun build(): CfnDetectorModel.SqsProperty = cdkBuilder.build()
}
