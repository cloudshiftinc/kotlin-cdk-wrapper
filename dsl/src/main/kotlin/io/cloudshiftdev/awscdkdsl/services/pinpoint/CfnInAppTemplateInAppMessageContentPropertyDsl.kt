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
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate

/**
 * Specifies the configuration of an in-app message, including its header, body, buttons, colors,
 * and images.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * InAppMessageContentProperty inAppMessageContentProperty = InAppMessageContentProperty.builder()
 * .backgroundColor("backgroundColor")
 * .bodyConfig(BodyConfigProperty.builder()
 * .alignment("alignment")
 * .body("body")
 * .textColor("textColor")
 * .build())
 * .headerConfig(HeaderConfigProperty.builder()
 * .alignment("alignment")
 * .header("header")
 * .textColor("textColor")
 * .build())
 * .imageUrl("imageUrl")
 * .primaryBtn(ButtonConfigProperty.builder()
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
 * .secondaryBtn(ButtonConfigProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html)
 */
@CdkDslMarker
public class CfnInAppTemplateInAppMessageContentPropertyDsl {
    private val cdkBuilder: CfnInAppTemplate.InAppMessageContentProperty.Builder =
        CfnInAppTemplate.InAppMessageContentProperty.builder()

    /**
     * @param backgroundColor The background color for an in-app message banner, expressed as a hex
     *   color code (such as #000000 for black).
     */
    public fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    /**
     * @param bodyConfig An object that contains configuration information about the header or title
     *   text of the in-app message.
     */
    public fun bodyConfig(bodyConfig: IResolvable) {
        cdkBuilder.bodyConfig(bodyConfig)
    }

    /**
     * @param bodyConfig An object that contains configuration information about the header or title
     *   text of the in-app message.
     */
    public fun bodyConfig(bodyConfig: CfnInAppTemplate.BodyConfigProperty) {
        cdkBuilder.bodyConfig(bodyConfig)
    }

    /**
     * @param headerConfig An object that contains configuration information about the header or
     *   title text of the in-app message.
     */
    public fun headerConfig(headerConfig: IResolvable) {
        cdkBuilder.headerConfig(headerConfig)
    }

    /**
     * @param headerConfig An object that contains configuration information about the header or
     *   title text of the in-app message.
     */
    public fun headerConfig(headerConfig: CfnInAppTemplate.HeaderConfigProperty) {
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
    public fun primaryBtn(primaryBtn: CfnInAppTemplate.ButtonConfigProperty) {
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
    public fun secondaryBtn(secondaryBtn: CfnInAppTemplate.ButtonConfigProperty) {
        cdkBuilder.secondaryBtn(secondaryBtn)
    }

    public fun build(): CfnInAppTemplate.InAppMessageContentProperty = cdkBuilder.build()
}
