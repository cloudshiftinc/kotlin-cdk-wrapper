@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamAmazonopensearchserviceBufferingHintsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty.Builder =
      CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty.builder()

  /**
   * @param intervalInSeconds Buffer incoming data for the specified period of time, in seconds,
   * before delivering it to the destination.
   * The default value is 300 (5 minutes).
   */
  public fun intervalInSeconds(intervalInSeconds: Number) {
    cdkBuilder.intervalInSeconds(intervalInSeconds)
  }

  /**
   * @param sizeInMBs Buffer incoming data to the specified size, in MBs, before delivering it to
   * the destination.
   * The default value is 5. We recommend setting this parameter to a value greater than the amount
   * of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically
   * ingest data at 1 MB/sec, the value should be 10 MB or higher.
   */
  public fun sizeInMBs(sizeInMBs: Number) {
    cdkBuilder.sizeInMBs(sizeInMBs)
  }

  public fun build(): CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty =
      cdkBuilder.build()
}
