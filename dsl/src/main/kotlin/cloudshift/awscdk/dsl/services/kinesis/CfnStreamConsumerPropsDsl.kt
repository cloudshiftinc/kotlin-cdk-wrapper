@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps

@CdkDslMarker
public class CfnStreamConsumerPropsDsl {
  private val cdkBuilder: CfnStreamConsumerProps.Builder = CfnStreamConsumerProps.builder()

  /**
   * @param consumerName The name of the consumer is something you choose when you register the
   * consumer. 
   */
  public fun consumerName(consumerName: String) {
    cdkBuilder.consumerName(consumerName)
  }

  /**
   * @param streamArn The ARN of the stream with which you registered the consumer. 
   */
  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnStreamConsumerProps = cdkBuilder.build()
}
