@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamAmazonopensearchserviceRetryOptionsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty.Builder =
      CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty.builder()

  /**
   * @param durationInSeconds After an initial failure to deliver to Amazon OpenSearch Service, the
   * total amount of time during which Kinesis Data Firehose retries delivery (including the first
   * attempt).
   * After this time has elapsed, the failed documents are written to Amazon S3. Default value is
   * 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
   */
  public fun durationInSeconds(durationInSeconds: Number) {
    cdkBuilder.durationInSeconds(durationInSeconds)
  }

  public fun build(): CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty =
      cdkBuilder.build()
}
