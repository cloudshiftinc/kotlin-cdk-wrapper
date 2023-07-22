@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnDestinationProps

@CdkDslMarker
public class CfnDestinationPropsDsl {
  private val cdkBuilder: CfnDestinationProps.Builder = CfnDestinationProps.builder()

  /**
   * @param destinationName The name of the destination. 
   */
  public fun destinationName(destinationName: String) {
    cdkBuilder.destinationName(destinationName)
  }

  /**
   * @param destinationPolicy An IAM policy document that governs which AWS accounts can create
   * subscription filters against this destination.
   */
  public fun destinationPolicy(destinationPolicy: String) {
    cdkBuilder.destinationPolicy(destinationPolicy)
  }

  /**
   * @param roleArn The ARN of an IAM role that permits CloudWatch Logs to send data to the
   * specified AWS resource. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param targetArn The Amazon Resource Name (ARN) of the physical target where the log events are
   * delivered (for example, a Kinesis stream). 
   */
  public fun targetArn(targetArn: String) {
    cdkBuilder.targetArn(targetArn)
  }

  public fun build(): CfnDestinationProps = cdkBuilder.build()
}
