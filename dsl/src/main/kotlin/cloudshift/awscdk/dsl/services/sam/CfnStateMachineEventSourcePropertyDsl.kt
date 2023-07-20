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
import kotlin.String

@CdkDslMarker
public class CfnStateMachineEventSourcePropertyDsl {
    private val cdkBuilder: CfnStateMachine.EventSourceProperty.Builder =
        CfnStateMachine.EventSourceProperty.builder()

    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnStateMachine.ApiEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnStateMachine.CloudWatchEventEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnStateMachine.EventBridgeRuleEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnStateMachine.ScheduleEventProperty) {
        cdkBuilder.properties(properties)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnStateMachine.EventSourceProperty = cdkBuilder.build()
}
