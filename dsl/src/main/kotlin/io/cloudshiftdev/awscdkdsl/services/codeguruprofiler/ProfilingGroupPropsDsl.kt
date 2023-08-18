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

package io.cloudshiftdev.awscdkdsl.services.codeguruprofiler

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codeguruprofiler.ComputePlatform
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps

/**
 * Properties for creating a new Profiling Group.
 *
 * Example:
 * ```
 * ProfilingGroup profilingGroup = ProfilingGroup.Builder.create(this, "MyProfilingGroup")
 * .computePlatform(ComputePlatform.AWS_LAMBDA)
 * .build();
 * ```
 */
@CdkDslMarker
public class ProfilingGroupPropsDsl {
    private val cdkBuilder: ProfilingGroupProps.Builder = ProfilingGroupProps.builder()

    /** @param computePlatform The compute platform of the profiling group. */
    public fun computePlatform(computePlatform: ComputePlatform) {
        cdkBuilder.computePlatform(computePlatform)
    }

    /** @param profilingGroupName A name for the profiling group. */
    public fun profilingGroupName(profilingGroupName: String) {
        cdkBuilder.profilingGroupName(profilingGroupName)
    }

    public fun build(): ProfilingGroupProps = cdkBuilder.build()
}
