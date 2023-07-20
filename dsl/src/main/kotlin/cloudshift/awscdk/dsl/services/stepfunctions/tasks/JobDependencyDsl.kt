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
import software.amazon.awscdk.services.stepfunctions.tasks.JobDependency
import kotlin.String

@CdkDslMarker
public class JobDependencyDsl {
    private val cdkBuilder: JobDependency.Builder = JobDependency.builder()

    public fun jobId(jobId: String) {
        cdkBuilder.jobId(jobId)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): JobDependency = cdkBuilder.build()
}
