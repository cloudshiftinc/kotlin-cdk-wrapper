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
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplateCpuOptionsPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.CpuOptionsProperty.Builder =
        CfnLaunchTemplate.CpuOptionsProperty.builder()

    public fun amdSevSnp(amdSevSnp: String) {
        cdkBuilder.amdSevSnp(amdSevSnp)
    }

    public fun coreCount(coreCount: Number) {
        cdkBuilder.coreCount(coreCount)
    }

    public fun threadsPerCore(threadsPerCore: Number) {
        cdkBuilder.threadsPerCore(threadsPerCore)
    }

    public fun build(): CfnLaunchTemplate.CpuOptionsProperty = cdkBuilder.build()
}
