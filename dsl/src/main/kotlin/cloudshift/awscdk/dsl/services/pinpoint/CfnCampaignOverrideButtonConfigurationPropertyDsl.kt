@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnCampaign
import kotlin.String

/**
 * Specifies the configuration of a button with settings that are specific to a certain device type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * OverrideButtonConfigurationProperty overrideButtonConfigurationProperty =
 * OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-overridebuttonconfiguration.html)
 */
@CdkDslMarker
public class CfnCampaignOverrideButtonConfigurationPropertyDsl {
    private val cdkBuilder: CfnCampaign.OverrideButtonConfigurationProperty.Builder =
        CfnCampaign.OverrideButtonConfigurationProperty.builder()

    /**
     * @param buttonAction The action that occurs when a recipient chooses a button in an in-app
     * message.
     * You can specify one of the following:
     *
     * * `LINK` – A link to a web destination.
     * * `DEEP_LINK` – A link to a specific page in an application.
     * * `CLOSE` – Dismisses the message.
     */
    public fun buttonAction(buttonAction: String) {
        cdkBuilder.buttonAction(buttonAction)
    }

    /**
     * @param link The destination (such as a URL) for a button.
     */
    public fun link(link: String) {
        cdkBuilder.link(link)
    }

    public fun build(): CfnCampaign.OverrideButtonConfigurationProperty = cdkBuilder.build()
}
