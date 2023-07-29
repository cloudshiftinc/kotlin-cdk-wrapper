@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * FunctionSAMPTProperty functionSAMPTProperty = FunctionSAMPTProperty.builder()
 * .functionName("functionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-functionsampt.html)
 */
@CdkDslMarker
public class CfnStateMachineFunctionSAMPTPropertyDsl {
    private val cdkBuilder: CfnStateMachine.FunctionSAMPTProperty.Builder =
        CfnStateMachine.FunctionSAMPTProperty.builder()

    /** @param functionName the value to be set. */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun build(): CfnStateMachine.FunctionSAMPTProperty = cdkBuilder.build()
}
