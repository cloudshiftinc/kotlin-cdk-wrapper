@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `SplunkRetryOptions` property type specifies retry behavior in case Kinesis Data Firehose is
 * unable to deliver documents to Splunk or if it doesn't receive an acknowledgment from Splunk.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * SplunkRetryOptionsProperty splunkRetryOptionsProperty = SplunkRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamSplunkRetryOptionsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.SplunkRetryOptionsProperty.Builder =
      CfnDeliveryStream.SplunkRetryOptionsProperty.builder()

  /**
   * @param durationInSeconds The total amount of time that Kinesis Data Firehose spends on retries.
   * This duration starts after the initial attempt to send data to Splunk fails. It doesn't include
   * the periods during which Kinesis Data Firehose waits for acknowledgment from Splunk after each
   * attempt.
   */
  public fun durationInSeconds(durationInSeconds: Number) {
    cdkBuilder.durationInSeconds(durationInSeconds)
  }

  public fun build(): CfnDeliveryStream.SplunkRetryOptionsProperty = cdkBuilder.build()
}
