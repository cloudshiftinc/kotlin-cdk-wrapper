@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeDeadLetterConfigPropertyDsl {
  private val cdkBuilder: CfnPipe.DeadLetterConfigProperty.Builder =
      CfnPipe.DeadLetterConfigProperty.builder()

  /**
   * @param arn The ARN of the Amazon SQS queue specified as the target for the dead-letter queue.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnPipe.DeadLetterConfigProperty = cdkBuilder.build()
}
