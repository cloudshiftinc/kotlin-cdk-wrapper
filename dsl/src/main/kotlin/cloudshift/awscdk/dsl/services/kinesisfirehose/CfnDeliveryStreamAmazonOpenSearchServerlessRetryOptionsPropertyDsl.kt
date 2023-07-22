@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * AmazonOpenSearchServerlessRetryOptionsProperty amazonOpenSearchServerlessRetryOptionsProperty =
 * AmazonOpenSearchServerlessRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-amazonopensearchserverlessretryoptions.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamAmazonOpenSearchServerlessRetryOptionsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty.Builder =
      CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty.builder()

  /**
   * @param durationInSeconds the value to be set.
   */
  public fun durationInSeconds(durationInSeconds: Number) {
    cdkBuilder.durationInSeconds(durationInSeconds)
  }

  public fun build(): CfnDeliveryStream.AmazonOpenSearchServerlessRetryOptionsProperty =
      cdkBuilder.build()
}
