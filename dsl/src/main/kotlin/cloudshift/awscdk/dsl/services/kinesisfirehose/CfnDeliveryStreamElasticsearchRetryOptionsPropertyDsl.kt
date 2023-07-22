@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamElasticsearchRetryOptionsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder =
      CfnDeliveryStream.ElasticsearchRetryOptionsProperty.builder()

  /**
   * @param durationInSeconds After an initial failure to deliver to Amazon ES, the total amount of
   * time during which Kinesis Data Firehose re-attempts delivery (including the first attempt).
   * If Kinesis Data Firehose can't deliver the data within the specified time, it writes the data
   * to the backup S3 bucket. For valid values, see the `DurationInSeconds` content for the
   * [ElasticsearchRetryOptions](https://docs.aws.amazon.com/firehose/latest/APIReference/API_ElasticsearchRetryOptions.html)
   * data type in the *Amazon Kinesis Data Firehose API Reference* .
   */
  public fun durationInSeconds(durationInSeconds: Number) {
    cdkBuilder.durationInSeconds(durationInSeconds)
  }

  public fun build(): CfnDeliveryStream.ElasticsearchRetryOptionsProperty = cdkBuilder.build()
}
