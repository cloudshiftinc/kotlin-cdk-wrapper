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
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineVersionProps
import kotlin.String

@CdkDslMarker
public class CfnStateMachineVersionPropsDsl {
    private val cdkBuilder: CfnStateMachineVersionProps.Builder =
        CfnStateMachineVersionProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun stateMachineArn(stateMachineArn: String) {
        cdkBuilder.stateMachineArn(stateMachineArn)
    }

    public fun stateMachineRevisionId(stateMachineRevisionId: String) {
        cdkBuilder.stateMachineRevisionId(stateMachineRevisionId)
    }

    public fun build(): CfnStateMachineVersionProps = cdkBuilder.build()
}
