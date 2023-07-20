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
import software.amazon.awscdk.services.ec2.LaunchTemplateAttributes
import kotlin.String

@CdkDslMarker
public class LaunchTemplateAttributesDsl {
    private val cdkBuilder: LaunchTemplateAttributes.Builder = LaunchTemplateAttributes.builder()

    public fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
    }

    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    public fun versionNumber(versionNumber: String) {
        cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): LaunchTemplateAttributes = cdkBuilder.build()
}
