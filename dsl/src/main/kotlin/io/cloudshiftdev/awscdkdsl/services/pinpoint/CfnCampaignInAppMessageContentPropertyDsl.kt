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

package io.cloudshiftdev.awscdkdsl.services.pinpoint

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Specifies the configuration and contents of an in-app message.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * InAppMessageContentProperty inAppMessageContentProperty = InAppMessageContentProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-inappmessagecontent.html)
 */
@CdkDslMarker
public class CfnCampaignInAppMessageContentPropertyDsl {
    private val cdkBuilder: CfnCampaign.InAppMessageContentProperty.Builder =
        CfnCampaign.InAppMessageContentProperty.builder()

    /**
     * @param backgroundColor The background color for an in-app message banner, expressed as a hex
     *   color code (such as #000000 for black).
     */
    public fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    /**
     * @param bodyConfig Specifies the configuration of main body text in an in-app message
     *   template.
     */
    public fun bodyConfig(bodyConfig: IResolvable) {
        cdkBuilder.bodyConfig(bodyConfig)
    }

    /**
     * @param bodyConfig Specifies the configuration of main body text in an in-app message
     *   template.
     */
    public fun bodyConfig(bodyConfig: CfnCampaign.InAppMessageBodyConfigProperty) {
        cdkBuilder.bodyConfig(bodyConfig)
    }

    /**
     * @param headerConfig Specifies the configuration and content of the header or title text of
     *   the in-app message.
     */
    public fun headerConfig(headerConfig: IResolvable) {
        cdkBuilder.headerConfig(headerConfig)
    }

    /**
     * @param headerConfig Specifies the configuration and content of the header or title text of
     *   the in-app message.
     */
    public fun headerConfig(headerConfig: CfnCampaign.InAppMessageHeaderConfigProperty) {
        cdkBuilder.headerConfig(headerConfig)
    }

    /** @param imageUrl The URL of the image that appears on an in-app message banner. */
    public fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
    }

    /**
     * @param primaryBtn An object that contains configuration information about the primary button
     *   in an in-app message.
     */
    public fun primaryBtn(primaryBtn: IResolvable) {
        cdkBuilder.primaryBtn(primaryBtn)
    }

    /**
     * @param primaryBtn An object that contains configuration information about the primary button
     *   in an in-app message.
     */
    public fun primaryBtn(primaryBtn: CfnCampaign.InAppMessageButtonProperty) {
        cdkBuilder.primaryBtn(primaryBtn)
    }

    /**
     * @param secondaryBtn An object that contains configuration information about the secondary
     *   button in an in-app message.
     */
    public fun secondaryBtn(secondaryBtn: IResolvable) {
        cdkBuilder.secondaryBtn(secondaryBtn)
    }

    /**
     * @param secondaryBtn An object that contains configuration information about the secondary
     *   button in an in-app message.
     */
    public fun secondaryBtn(secondaryBtn: CfnCampaign.InAppMessageButtonProperty) {
        cdkBuilder.secondaryBtn(secondaryBtn)
    }

    public fun build(): CfnCampaign.InAppMessageContentProperty = cdkBuilder.build()
}
