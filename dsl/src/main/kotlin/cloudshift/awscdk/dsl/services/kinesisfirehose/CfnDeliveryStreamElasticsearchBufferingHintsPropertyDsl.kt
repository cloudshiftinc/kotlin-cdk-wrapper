@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `ElasticsearchBufferingHints` property type specifies how Amazon Kinesis Data Firehose
 * (Kinesis Data Firehose) buffers incoming data while delivering it to the destination.
 *
 * The first buffer condition that is satisfied triggers Kinesis Data Firehose to deliver the data.
 *
 * ElasticsearchBufferingHints is the property type for the `BufferingHints` property of the [Amazon
 * Kinesis Data Firehose DeliveryStream
 * ElasticsearchDestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * ElasticsearchBufferingHintsProperty elasticsearchBufferingHintsProperty =
 * ElasticsearchBufferingHintsProperty.builder()
 * .intervalInSeconds(123)
 * .sizeInMBs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamElasticsearchBufferingHintsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder =
      CfnDeliveryStream.ElasticsearchBufferingHintsProperty.builder()

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

  public fun build(): CfnDeliveryStream.ElasticsearchBufferingHintsProperty = cdkBuilder.build()
}
