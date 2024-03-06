@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.batch.ComputeEnvironmentProps
import software.amazon.awscdk.services.iam.IRole

/**
 * Props common to all ComputeEnvironments.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * ComputeEnvironmentProps computeEnvironmentProps = ComputeEnvironmentProps.builder()
 * .computeEnvironmentName("computeEnvironmentName")
 * .enabled(false)
 * .serviceRole(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class ComputeEnvironmentPropsDsl {
    private val cdkBuilder: ComputeEnvironmentProps.Builder = ComputeEnvironmentProps.builder()

    /** @param computeEnvironmentName The name of the ComputeEnvironment. */
    public fun computeEnvironmentName(computeEnvironmentName: String) {
        cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    /**
     * @param enabled Whether or not this ComputeEnvironment can accept jobs from a Queue. Enabled
     *   ComputeEnvironments can accept jobs from a Queue and can scale instances up or down.
     *   Disabled ComputeEnvironments cannot accept jobs from a Queue or scale instances up or down.
     *
     * If you change a ComputeEnvironment from enabled to disabled while it is executing jobs, Jobs
     * in the `STARTED` or `RUNNING` states will not be interrupted. As jobs complete, the
     * ComputeEnvironment will scale instances down to `minvCpus`.
     *
     * To ensure you aren't billed for unused capacity, set `minvCpus` to `0`.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param serviceRole The role Batch uses to perform actions on your behalf in your account,
     *   such as provision instances to run your jobs.
     */
    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun build(): ComputeEnvironmentProps = cdkBuilder.build()
}
