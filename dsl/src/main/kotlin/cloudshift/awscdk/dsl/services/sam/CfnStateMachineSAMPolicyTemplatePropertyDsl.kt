@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineSAMPolicyTemplatePropertyDsl {
    private val cdkBuilder: CfnStateMachine.SAMPolicyTemplateProperty.Builder =
        CfnStateMachine.SAMPolicyTemplateProperty.builder()

    public fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy)
    }

    public fun lambdaInvokePolicy(lambdaInvokePolicy: CfnStateMachine.FunctionSAMPTProperty) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy)
    }

    public fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy)
    }

    public fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: CfnStateMachine.StateMachineSAMPTProperty) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy)
    }

    public fun build(): CfnStateMachine.SAMPolicyTemplateProperty = cdkBuilder.build()
}
