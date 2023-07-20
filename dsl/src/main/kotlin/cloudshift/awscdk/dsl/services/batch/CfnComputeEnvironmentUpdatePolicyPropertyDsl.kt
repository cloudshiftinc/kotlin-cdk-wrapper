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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CfnComputeEnvironmentUpdatePolicyPropertyDsl {
    private val cdkBuilder: CfnComputeEnvironment.UpdatePolicyProperty.Builder =
        CfnComputeEnvironment.UpdatePolicyProperty.builder()

    public fun jobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes: Number) {
        cdkBuilder.jobExecutionTimeoutMinutes(jobExecutionTimeoutMinutes)
    }

    public fun terminateJobsOnUpdate(terminateJobsOnUpdate: Boolean) {
        cdkBuilder.terminateJobsOnUpdate(terminateJobsOnUpdate)
    }

    public fun terminateJobsOnUpdate(terminateJobsOnUpdate: IResolvable) {
        cdkBuilder.terminateJobsOnUpdate(terminateJobsOnUpdate)
    }

    public fun build(): CfnComputeEnvironment.UpdatePolicyProperty = cdkBuilder.build()
}
