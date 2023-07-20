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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@CdkDslMarker
public class CfnStateMachineLogDestinationPropertyDsl {
    private val cdkBuilder: CfnStateMachine.LogDestinationProperty.Builder =
        CfnStateMachine.LogDestinationProperty.builder()

    public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable) {
        cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup)
    }

    public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CfnStateMachine.CloudWatchLogsLogGroupProperty) {
        cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup)
    }

    public fun build(): CfnStateMachine.LogDestinationProperty = cdkBuilder.build()
}
