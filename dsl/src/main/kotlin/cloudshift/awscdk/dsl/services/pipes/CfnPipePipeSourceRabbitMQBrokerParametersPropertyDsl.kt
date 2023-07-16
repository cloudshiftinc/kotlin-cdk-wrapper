@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeSourceRabbitMQBrokerParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.Builder =
      CfnPipe.PipeSourceRabbitMQBrokerParametersProperty.builder()

  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  public fun credentials(credentials: IResolvable) {
    cdkBuilder.credentials(credentials)
  }

  public fun credentials(credentials: CfnPipe.MQBrokerAccessCredentialsProperty) {
    cdkBuilder.credentials(credentials)
  }

  public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
    cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
  }

  public fun queueName(queueName: String) {
    cdkBuilder.queueName(queueName)
  }

  public fun virtualHost(virtualHost: String) {
    cdkBuilder.virtualHost(virtualHost)
  }

  public fun build(): CfnPipe.PipeSourceRabbitMQBrokerParametersProperty = cdkBuilder.build()
}
