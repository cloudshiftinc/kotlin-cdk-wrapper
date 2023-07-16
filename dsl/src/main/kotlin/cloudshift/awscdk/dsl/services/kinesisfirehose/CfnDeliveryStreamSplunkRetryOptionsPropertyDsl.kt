@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamSplunkRetryOptionsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.SplunkRetryOptionsProperty.Builder =
      CfnDeliveryStream.SplunkRetryOptionsProperty.builder()

  public fun durationInSeconds(durationInSeconds: Number) {
    cdkBuilder.durationInSeconds(durationInSeconds)
  }

  public fun build(): CfnDeliveryStream.SplunkRetryOptionsProperty = cdkBuilder.build()
}
