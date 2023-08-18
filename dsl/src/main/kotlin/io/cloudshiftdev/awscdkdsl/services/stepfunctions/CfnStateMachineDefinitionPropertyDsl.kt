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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * DefinitionProperty definitionProperty = DefinitionProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-definition.html)
 */
@CdkDslMarker
public class CfnStateMachineDefinitionPropertyDsl {
    private val cdkBuilder: CfnStateMachine.DefinitionProperty.Builder =
        CfnStateMachine.DefinitionProperty.builder()

    public fun build(): CfnStateMachine.DefinitionProperty = cdkBuilder.build()
}
