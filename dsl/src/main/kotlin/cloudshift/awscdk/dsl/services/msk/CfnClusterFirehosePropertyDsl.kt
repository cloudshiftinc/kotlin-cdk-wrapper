@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

@CdkDslMarker
public class CfnClusterFirehosePropertyDsl {
  private val cdkBuilder: CfnCluster.FirehoseProperty.Builder =
      CfnCluster.FirehoseProperty.builder()

  /**
   * @param deliveryStream The Kinesis Data Firehose delivery stream that is the destination for
   * broker logs.
   */
  public fun deliveryStream(deliveryStream: String) {
    cdkBuilder.deliveryStream(deliveryStream)
  }

  /**
   * @param enabled Specifies whether broker logs get send to the specified Kinesis Data Firehose
   * delivery stream. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether broker logs get send to the specified Kinesis Data Firehose
   * delivery stream. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnCluster.FirehoseProperty = cdkBuilder.build()
}
