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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.LaunchTemplateAttributes

/**
 * Attributes for an imported LaunchTemplate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * LaunchTemplateAttributes launchTemplateAttributes = LaunchTemplateAttributes.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .versionNumber("versionNumber")
 * .build();
 * ```
 */
@CdkDslMarker
public class LaunchTemplateAttributesDsl {
    private val cdkBuilder: LaunchTemplateAttributes.Builder = LaunchTemplateAttributes.builder()

    /**
     * @param launchTemplateId The identifier of the Launch Template. Exactly one of
     *   `launchTemplateId` and `launchTemplateName` may be set.
     */
    public fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
    }

    /**
     * @param launchTemplateName The name of the Launch Template. Exactly one of `launchTemplateId`
     *   and `launchTemplateName` may be set.
     */
    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /** @param versionNumber The version number of this launch template to use. */
    public fun versionNumber(versionNumber: String) {
        cdkBuilder.versionNumber(versionNumber)
    }

    public fun build(): LaunchTemplateAttributes = cdkBuilder.build()
}
