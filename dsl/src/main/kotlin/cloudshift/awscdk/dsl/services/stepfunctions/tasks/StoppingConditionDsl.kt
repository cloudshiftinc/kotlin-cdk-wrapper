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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition

@CdkDslMarker
public class StoppingConditionDsl {
    private val cdkBuilder: StoppingCondition.Builder = StoppingCondition.builder()

    public fun maxRuntime(maxRuntime: Duration) {
        cdkBuilder.maxRuntime(maxRuntime)
    }

    public fun build(): StoppingCondition = cdkBuilder.build()
}
