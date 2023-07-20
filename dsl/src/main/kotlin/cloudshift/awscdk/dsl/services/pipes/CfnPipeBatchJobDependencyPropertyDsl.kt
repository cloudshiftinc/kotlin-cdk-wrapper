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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.String

@CdkDslMarker
public class CfnPipeBatchJobDependencyPropertyDsl {
    private val cdkBuilder: CfnPipe.BatchJobDependencyProperty.Builder =
        CfnPipe.BatchJobDependencyProperty.builder()

    public fun jobId(jobId: String) {
        cdkBuilder.jobId(jobId)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPipe.BatchJobDependencyProperty = cdkBuilder.build()
}
