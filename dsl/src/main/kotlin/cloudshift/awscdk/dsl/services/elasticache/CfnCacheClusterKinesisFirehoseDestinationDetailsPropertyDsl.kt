@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnCacheCluster

@CdkDslMarker
public class CfnCacheClusterKinesisFirehoseDestinationDetailsPropertyDsl {
  private val cdkBuilder: CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.Builder =
      CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.builder()

  /**
   * @param deliveryStream The name of the Kinesis Data Firehose delivery stream. 
   */
  public fun deliveryStream(deliveryStream: String) {
    cdkBuilder.deliveryStream(deliveryStream)
  }

  public fun build(): CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty = cdkBuilder.build()
}
