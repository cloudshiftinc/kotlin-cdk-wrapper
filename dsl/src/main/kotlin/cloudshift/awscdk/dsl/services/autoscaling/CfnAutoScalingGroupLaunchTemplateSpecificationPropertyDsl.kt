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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import kotlin.String

@CdkDslMarker
public class CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder =
        CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.builder()

    public fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
    }

    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnAutoScalingGroup.LaunchTemplateSpecificationProperty = cdkBuilder.build()
}
