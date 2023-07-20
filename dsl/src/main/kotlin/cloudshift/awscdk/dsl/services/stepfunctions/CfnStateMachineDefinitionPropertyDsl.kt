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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineDefinitionPropertyDsl {
    private val cdkBuilder: CfnStateMachine.DefinitionProperty.Builder =
        CfnStateMachine.DefinitionProperty.builder()

    public fun build(): CfnStateMachine.DefinitionProperty = cdkBuilder.build()
}
