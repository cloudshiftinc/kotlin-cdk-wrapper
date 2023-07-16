@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamAmazonOpenSearchServerlessBufferingHintsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty.Builder
      = CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty.builder()

  public fun intervalInSeconds(intervalInSeconds: Number) {
    cdkBuilder.intervalInSeconds(intervalInSeconds)
  }

  public fun sizeInMBs(sizeInMBs: Number) {
    cdkBuilder.sizeInMBs(sizeInMBs)
  }

  public fun build(): CfnDeliveryStream.AmazonOpenSearchServerlessBufferingHintsProperty =
      cdkBuilder.build()
}
