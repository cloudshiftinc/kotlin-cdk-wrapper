@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Starts execution of a Step Functions state machine.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * StepFunctionsActionProperty stepFunctionsActionProperty = StepFunctionsActionProperty.builder()
 * .roleArn("roleArn")
 * .stateMachineName("stateMachineName")
 * // the properties below are optional
 * .executionNamePrefix("executionNamePrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleStepFunctionsActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.StepFunctionsActionProperty.Builder =
      CfnTopicRule.StepFunctionsActionProperty.builder()

  /**
   * @param executionNamePrefix (Optional) A name will be given to the state machine execution
   * consisting of this prefix followed by a UUID.
   * Step Functions automatically creates a unique name for each state machine execution if one is
   * not provided.
   */
  public fun executionNamePrefix(executionNamePrefix: String) {
    cdkBuilder.executionNamePrefix(executionNamePrefix)
  }

  /**
   * @param roleArn The ARN of the role that grants IoT permission to start execution of a state
   * machine ("Action":"states:StartExecution"). 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param stateMachineName The name of the Step Functions state machine whose execution will be
   * started. 
   */
  public fun stateMachineName(stateMachineName: String) {
    cdkBuilder.stateMachineName(stateMachineName)
  }

  public fun build(): CfnTopicRule.StepFunctionsActionProperty = cdkBuilder.build()
}
