@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamRetryOptionsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.RetryOptionsProperty.Builder =
      CfnDeliveryStream.RetryOptionsProperty.builder()

  /**
   * @param durationInSeconds The total amount of time that Kinesis Data Firehose spends on retries.
   * This duration starts after the initial attempt to send data to the custom destination via HTTPS
   * endpoint fails. It doesn't include the periods during which Kinesis Data Firehose waits for
   * acknowledgment from the specified destination after each attempt.
   */
  public fun durationInSeconds(durationInSeconds: Number) {
    cdkBuilder.durationInSeconds(durationInSeconds)
  }

  public fun build(): CfnDeliveryStream.RetryOptionsProperty = cdkBuilder.build()
}
