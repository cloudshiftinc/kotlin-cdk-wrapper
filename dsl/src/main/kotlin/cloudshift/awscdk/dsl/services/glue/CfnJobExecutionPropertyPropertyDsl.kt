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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnJob
import kotlin.Number

@CdkDslMarker
public class CfnJobExecutionPropertyPropertyDsl {
    private val cdkBuilder: CfnJob.ExecutionPropertyProperty.Builder =
        CfnJob.ExecutionPropertyProperty.builder()

    public fun maxConcurrentRuns(maxConcurrentRuns: Number) {
        cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
    }

    public fun build(): CfnJob.ExecutionPropertyProperty = cdkBuilder.build()
}
