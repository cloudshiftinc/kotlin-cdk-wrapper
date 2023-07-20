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
import software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect
import kotlin.Boolean

@CdkDslMarker
public class InstanceRequireImdsv2AspectDsl {
    private val cdkBuilder: InstanceRequireImdsv2Aspect.Builder =
        InstanceRequireImdsv2Aspect.Builder.create()

    public fun suppressLaunchTemplateWarning(suppressLaunchTemplateWarning: Boolean) {
        cdkBuilder.suppressLaunchTemplateWarning(suppressLaunchTemplateWarning)
    }

    public fun suppressWarnings(suppressWarnings: Boolean) {
        cdkBuilder.suppressWarnings(suppressWarnings)
    }

    public fun build(): InstanceRequireImdsv2Aspect = cdkBuilder.build()
}
