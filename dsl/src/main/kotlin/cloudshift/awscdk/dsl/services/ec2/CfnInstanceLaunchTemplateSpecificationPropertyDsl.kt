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
import kotlin.String

@CdkDslMarker
public class CfnInstanceLaunchTemplateSpecificationPropertyDsl {
    private val cdkBuilder: CfnInstance.LaunchTemplateSpecificationProperty.Builder =
        CfnInstance.LaunchTemplateSpecificationProperty.builder()

    public fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
    }

    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnInstance.LaunchTemplateSpecificationProperty = cdkBuilder.build()
}
