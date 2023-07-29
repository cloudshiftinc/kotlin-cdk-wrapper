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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies the appearance of an in-app message, including the message type, the title and body
 * text, text and background colors, and the configurations of buttons that appear in the message.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object customConfig;
 * CampaignInAppMessageProperty campaignInAppMessageProperty =
 * CampaignInAppMessageProperty.builder()
 * .content(List.of(InAppMessageContentProperty.builder()
 * .backgroundColor("backgroundColor")
 * .bodyConfig(InAppMessageBodyConfigProperty.builder()
 * .alignment("alignment")
 * .body("body")
 * .textColor("textColor")
 * .build())
 * .headerConfig(InAppMessageHeaderConfigProperty.builder()
 * .alignment("alignment")
 * .header("header")
 * .textColor("textColor")
 * .build())
 * .imageUrl("imageUrl")
 * .primaryBtn(InAppMessageButtonProperty.builder()
 * .android(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .defaultConfig(DefaultButtonConfigurationProperty.builder()
 * .backgroundColor("backgroundColor")
 * .borderRadius(123)
 * .buttonAction("buttonAction")
 * .link("link")
 * .text("text")
 * .textColor("textColor")
 * .build())
 * .ios(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .web(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .build())
 * .secondaryBtn(InAppMessageButtonProperty.builder()
 * .android(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .defaultConfig(DefaultButtonConfigurationProperty.builder()
 * .backgroundColor("backgroundColor")
 * .borderRadius(123)
 * .buttonAction("buttonAction")
 * .link("link")
 * .text("text")
 * .textColor("textColor")
 * .build())
 * .ios(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .web(OverrideButtonConfigurationProperty.builder()
 * .buttonAction("buttonAction")
 * .link("link")
 * .build())
 * .build())
 * .build()))
 * .customConfig(customConfig)
 * .layout("layout")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigninappmessage.html)
 */
@CdkDslMarker
public class CfnCampaignCampaignInAppMessagePropertyDsl {
    private val cdkBuilder: CfnCampaign.CampaignInAppMessageProperty.Builder =
        CfnCampaign.CampaignInAppMessageProperty.builder()

    private val _content: MutableList<Any> = mutableListOf()

    /**
     * @param content An array that contains configurtion information about the in-app message for
     *   the campaign, including title and body text, text colors, background colors, image URLs,
     *   and button configurations.
     */
    public fun content(vararg content: Any) {
        _content.addAll(listOf(*content))
    }

    /**
     * @param content An array that contains configurtion information about the in-app message for
     *   the campaign, including title and body text, text colors, background colors, image URLs,
     *   and button configurations.
     */
    public fun content(content: Collection<Any>) {
        _content.addAll(content)
    }

    /**
     * @param content An array that contains configurtion information about the in-app message for
     *   the campaign, including title and body text, text colors, background colors, image URLs,
     *   and button configurations.
     */
    public fun content(content: IResolvable) {
        cdkBuilder.content(content)
    }

    /**
     * @param customConfig Custom data, in the form of key-value pairs, that is included in an
     *   in-app messaging payload.
     */
    public fun customConfig(customConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(customConfig)
        cdkBuilder.customConfig(builder.map)
    }

    /**
     * @param customConfig Custom data, in the form of key-value pairs, that is included in an
     *   in-app messaging payload.
     */
    public fun customConfig(customConfig: Any) {
        cdkBuilder.customConfig(customConfig)
    }

    /**
     * @param layout A string that describes how the in-app message will appear. You can specify one
     *   of the following:.
     * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
     * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
     * * `OVERLAYS` – a message that covers entire screen.
     * * `MOBILE_FEED` – a message that appears in a window in front of the page.
     * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
     * * `CAROUSEL` – a scrollable layout of up to five unique messages.
     */
    public fun layout(layout: String) {
        cdkBuilder.layout(layout)
    }

    public fun build(): CfnCampaign.CampaignInAppMessageProperty {
        if (_content.isNotEmpty()) cdkBuilder.content(_content)
        return cdkBuilder.build()
    }
}
