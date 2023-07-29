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
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate
import software.constructs.Construct

/**
 * Creates a message template that you can use to send in-app messages.
 *
 * A message template is a set of content and settings that you can define, save, and reuse in
 * messages for any of your Amazon Pinpoint applications. The In-App channel is unavailable in AWS
 * GovCloud (US).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object customConfig;
 * Object tags;
 * CfnInAppTemplate cfnInAppTemplate = CfnInAppTemplate.Builder.create(this, "MyCfnInAppTemplate")
 * .templateName("templateName")
 * // the properties below are optional
 * .content(List.of(InAppMessageContentProperty.builder()
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
 * .build()))
 * .customConfig(customConfig)
 * .layout("layout")
 * .tags(tags)
 * .templateDescription("templateDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html)
 */
@CdkDslMarker
public class CfnInAppTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInAppTemplate.Builder = CfnInAppTemplate.Builder.create(scope, id)

    private val _content: MutableList<Any> = mutableListOf()

    /**
     * An object that contains information about the content of an in-app message, including its
     * title and body text, text colors, background colors, images, buttons, and behaviors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
     *
     * @param content An object that contains information about the content of an in-app message,
     *   including its title and body text, text colors, background colors, images, buttons, and
     *   behaviors.
     */
    public fun content(vararg content: Any) {
        _content.addAll(listOf(*content))
    }

    /**
     * An object that contains information about the content of an in-app message, including its
     * title and body text, text colors, background colors, images, buttons, and behaviors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
     *
     * @param content An object that contains information about the content of an in-app message,
     *   including its title and body text, text colors, background colors, images, buttons, and
     *   behaviors.
     */
    public fun content(content: Collection<Any>) {
        _content.addAll(content)
    }

    /**
     * An object that contains information about the content of an in-app message, including its
     * title and body text, text colors, background colors, images, buttons, and behaviors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
     *
     * @param content An object that contains information about the content of an in-app message,
     *   including its title and body text, text colors, background colors, images, buttons, and
     *   behaviors.
     */
    public fun content(content: IResolvable) {
        cdkBuilder.content(content)
    }

    /**
     * Custom data, in the form of key-value pairs, that is included in an in-app messaging payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-customconfig)
     *
     * @param customConfig Custom data, in the form of key-value pairs, that is included in an
     *   in-app messaging payload.
     */
    public fun customConfig(customConfig: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(customConfig)
        cdkBuilder.customConfig(builder.map)
    }

    /**
     * Custom data, in the form of key-value pairs, that is included in an in-app messaging payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-customconfig)
     *
     * @param customConfig Custom data, in the form of key-value pairs, that is included in an
     *   in-app messaging payload.
     */
    public fun customConfig(customConfig: Any) {
        cdkBuilder.customConfig(customConfig)
    }

    /**
     * A string that determines the appearance of the in-app message. You can specify one of the
     * following:.
     * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
     * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
     * * `OVERLAYS` – a message that covers entire screen.
     * * `MOBILE_FEED` – a message that appears in a window in front of the page.
     * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
     * * `CAROUSEL` – a scrollable layout of up to five unique messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-layout)
     *
     * @param layout A string that determines the appearance of the in-app message. You can specify
     *   one of the following:.
     */
    public fun layout(layout: String) {
        cdkBuilder.layout(layout)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * An optional description of the in-app template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-templatedescription)
     *
     * @param templateDescription An optional description of the in-app template.
     */
    public fun templateDescription(templateDescription: String) {
        cdkBuilder.templateDescription(templateDescription)
    }

    /**
     * The name of the in-app message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-templatename)
     *
     * @param templateName The name of the in-app message template.
     */
    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    public fun build(): CfnInAppTemplate {
        if (_content.isNotEmpty()) cdkBuilder.content(_content)
        return cdkBuilder.build()
    }
}
