@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamBufferingHintsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.BufferingHintsProperty.Builder =
      CfnDeliveryStream.BufferingHintsProperty.builder()

  /**
   * @param intervalInSeconds The length of time, in seconds, that Kinesis Data Firehose buffers
   * incoming data before delivering it to the destination.
   * For valid values, see the `IntervalInSeconds` content for the
   * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
   * data type in the *Amazon Kinesis Data Firehose API Reference* .
   */
  public fun intervalInSeconds(intervalInSeconds: Number) {
    cdkBuilder.intervalInSeconds(intervalInSeconds)
  }

  /**
   * @param sizeInMBs The size of the buffer, in MBs, that Kinesis Data Firehose uses for incoming
   * data before delivering it to the destination.
   * For valid values, see the `SizeInMBs` content for the
   * [BufferingHints](https://docs.aws.amazon.com/firehose/latest/APIReference/API_BufferingHints.html)
   * data type in the *Amazon Kinesis Data Firehose API Reference* .
   */
  public fun sizeInMBs(sizeInMBs: Number) {
    cdkBuilder.sizeInMBs(sizeInMBs)
  }

  public fun build(): CfnDeliveryStream.BufferingHintsProperty = cdkBuilder.build()
}
