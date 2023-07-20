@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesis.CfnStreamConsumer
import software.constructs.Construct

@CdkDslMarker
public class CfnStreamConsumerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStreamConsumer.Builder = CfnStreamConsumer.Builder.create(scope, id)

  public fun consumerName(consumerName: String) {
    cdkBuilder.consumerName(consumerName)
  }

  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnStreamConsumer = cdkBuilder.build()
}
