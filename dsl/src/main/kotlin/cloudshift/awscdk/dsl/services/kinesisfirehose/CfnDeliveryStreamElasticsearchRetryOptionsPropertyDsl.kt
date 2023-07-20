@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamElasticsearchRetryOptionsPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder =
      CfnDeliveryStream.ElasticsearchRetryOptionsProperty.builder()

  public fun durationInSeconds(durationInSeconds: Number) {
    cdkBuilder.durationInSeconds(durationInSeconds)
  }

  public fun build(): CfnDeliveryStream.ElasticsearchRetryOptionsProperty = cdkBuilder.build()
}
