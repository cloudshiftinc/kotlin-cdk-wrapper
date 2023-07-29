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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * The properties that are applied when using Zendesk as a flow source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * ZendeskSourcePropertiesProperty zendeskSourcePropertiesProperty =
 * ZendeskSourcePropertiesProperty.builder()
 * .object("object")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-zendesksourceproperties.html)
 */
@CdkDslMarker
public class CfnIntegrationZendeskSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnIntegration.ZendeskSourcePropertiesProperty.Builder =
        CfnIntegration.ZendeskSourcePropertiesProperty.builder()

    /** @param object The object specified in the Zendesk flow source. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    public fun build(): CfnIntegration.ZendeskSourcePropertiesProperty = cdkBuilder.build()
}
