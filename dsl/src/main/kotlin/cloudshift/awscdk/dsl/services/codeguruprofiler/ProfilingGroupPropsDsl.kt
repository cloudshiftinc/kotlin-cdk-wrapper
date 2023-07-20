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

package cloudshift.awscdk.dsl.services.codeguruprofiler

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codeguruprofiler.ComputePlatform
import software.amazon.awscdk.services.codeguruprofiler.ProfilingGroupProps
import kotlin.String

@CdkDslMarker
public class ProfilingGroupPropsDsl {
    private val cdkBuilder: ProfilingGroupProps.Builder = ProfilingGroupProps.builder()

    public fun computePlatform(computePlatform: ComputePlatform) {
        cdkBuilder.computePlatform(computePlatform)
    }

    public fun profilingGroupName(profilingGroupName: String) {
        cdkBuilder.profilingGroupName(profilingGroupName)
    }

    public fun build(): ProfilingGroupProps = cdkBuilder.build()
}
