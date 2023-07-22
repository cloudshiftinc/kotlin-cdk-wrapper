@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * SAMPolicyTemplateProperty sAMPolicyTemplateProperty = SAMPolicyTemplateProperty.builder()
 * .lambdaInvokePolicy(FunctionSAMPTProperty.builder()
 * .functionName("functionName")
 * .build())
 * .stepFunctionsExecutionPolicy(StateMachineSAMPTProperty.builder()
 * .stateMachineName("stateMachineName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-sampolicytemplate.html)
 */
@CdkDslMarker
public class CfnStateMachineSAMPolicyTemplatePropertyDsl {
  private val cdkBuilder: CfnStateMachine.SAMPolicyTemplateProperty.Builder =
      CfnStateMachine.SAMPolicyTemplateProperty.builder()

  /**
   * @param lambdaInvokePolicy the value to be set.
   */
  public fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable) {
    cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy)
  }

  /**
   * @param lambdaInvokePolicy the value to be set.
   */
  public fun lambdaInvokePolicy(lambdaInvokePolicy: CfnStateMachine.FunctionSAMPTProperty) {
    cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy)
  }

  /**
   * @param stepFunctionsExecutionPolicy the value to be set.
   */
  public fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable) {
    cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy)
  }

  /**
   * @param stepFunctionsExecutionPolicy the value to be set.
   */
  public
      fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: CfnStateMachine.StateMachineSAMPTProperty) {
    cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy)
  }

  public fun build(): CfnStateMachine.SAMPolicyTemplateProperty = cdkBuilder.build()
}
