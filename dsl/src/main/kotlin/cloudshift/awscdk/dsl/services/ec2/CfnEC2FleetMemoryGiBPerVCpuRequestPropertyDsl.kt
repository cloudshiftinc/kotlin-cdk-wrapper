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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import kotlin.Number

@CdkDslMarker
public class CfnEC2FleetMemoryGiBPerVCpuRequestPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty.Builder =
        CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty.builder()

    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnEC2Fleet.MemoryGiBPerVCpuRequestProperty = cdkBuilder.build()
}
