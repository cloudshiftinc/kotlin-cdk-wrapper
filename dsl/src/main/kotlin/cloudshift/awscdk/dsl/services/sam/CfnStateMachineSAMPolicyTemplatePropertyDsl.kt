@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnStateMachine

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
