@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps

@CdkDslMarker
public class CfnStreamConsumerPropsDsl {
  private val cdkBuilder: CfnStreamConsumerProps.Builder = CfnStreamConsumerProps.builder()

  public fun consumerName(consumerName: String) {
    cdkBuilder.consumerName(consumerName)
  }

  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnStreamConsumerProps = cdkBuilder.build()
}
