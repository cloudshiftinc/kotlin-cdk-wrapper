@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeSourceActiveMQBrokerParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeSourceActiveMQBrokerParametersProperty.Builder =
      CfnPipe.PipeSourceActiveMQBrokerParametersProperty.builder()

  /**
   * @param batchSize The maximum number of records to include in each batch.
   */
  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  /**
   * @param credentials The credentials needed to access the resource. 
   */
  public fun credentials(credentials: IResolvable) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * @param credentials The credentials needed to access the resource. 
   */
  public fun credentials(credentials: CfnPipe.MQBrokerAccessCredentialsProperty) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
   */
  public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
    cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
  }

  /**
   * @param queueName The name of the destination queue to consume. 
   */
  public fun queueName(queueName: String) {
    cdkBuilder.queueName(queueName)
  }

  public fun build(): CfnPipe.PipeSourceActiveMQBrokerParametersProperty = cdkBuilder.build()
}
