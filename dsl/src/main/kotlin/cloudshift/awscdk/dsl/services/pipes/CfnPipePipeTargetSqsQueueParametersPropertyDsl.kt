@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeTargetSqsQueueParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetSqsQueueParametersProperty.Builder =
      CfnPipe.PipeTargetSqsQueueParametersProperty.builder()

  /**
   * @param messageDeduplicationId This parameter applies only to FIFO (first-in-first-out) queues.
   * The token used for deduplication of sent messages.
   */
  public fun messageDeduplicationId(messageDeduplicationId: String) {
    cdkBuilder.messageDeduplicationId(messageDeduplicationId)
  }

  /**
   * @param messageGroupId The FIFO message group ID to use as the target.
   */
  public fun messageGroupId(messageGroupId: String) {
    cdkBuilder.messageGroupId(messageGroupId)
  }

  public fun build(): CfnPipe.PipeTargetSqsQueueParametersProperty = cdkBuilder.build()
}
