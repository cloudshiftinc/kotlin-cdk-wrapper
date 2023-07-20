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
import software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect
import kotlin.Boolean

@CdkDslMarker
public class LaunchTemplateRequireImdsv2AspectDsl {
    private val cdkBuilder: LaunchTemplateRequireImdsv2Aspect.Builder =
        LaunchTemplateRequireImdsv2Aspect.Builder.create()

    public fun suppressWarnings(suppressWarnings: Boolean) {
        cdkBuilder.suppressWarnings(suppressWarnings)
    }

    public fun build(): LaunchTemplateRequireImdsv2Aspect = cdkBuilder.build()
}
