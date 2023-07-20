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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import kotlin.Unit

@CdkDslMarker
public class EmrCreateClusterScalingTriggerPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.ScalingTriggerProperty.Builder =
        EmrCreateCluster.ScalingTriggerProperty.builder()

    public fun cloudWatchAlarmDefinition(
        block: EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl()
        builder.apply(block)
        cdkBuilder.cloudWatchAlarmDefinition(builder.build())
    }

    public fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: EmrCreateCluster.CloudWatchAlarmDefinitionProperty) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
    }

    public fun build(): EmrCreateCluster.ScalingTriggerProperty = cdkBuilder.build()
}
