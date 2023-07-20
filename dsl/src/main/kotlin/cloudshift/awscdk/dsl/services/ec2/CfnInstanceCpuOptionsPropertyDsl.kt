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
import software.amazon.awscdk.services.ec2.CfnInstance
import kotlin.Number

@CdkDslMarker
public class CfnInstanceCpuOptionsPropertyDsl {
    private val cdkBuilder: CfnInstance.CpuOptionsProperty.Builder =
        CfnInstance.CpuOptionsProperty.builder()

    public fun coreCount(coreCount: Number) {
        cdkBuilder.coreCount(coreCount)
    }

    public fun threadsPerCore(threadsPerCore: Number) {
        cdkBuilder.threadsPerCore(threadsPerCore)
    }

    public fun build(): CfnInstance.CpuOptionsProperty = cdkBuilder.build()
}
