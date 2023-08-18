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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps

/**
 * Properties for defining a `CfnInAppTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object customConfig;
 * Object tags;
 * CfnInAppTemplateProps cfnInAppTemplateProps = CfnInAppTemplateProps.builder()
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
public class CfnInAppTemplatePropsDsl {
    private val cdkBuilder: CfnInAppTemplateProps.Builder = CfnInAppTemplateProps.builder()

    private val _content: MutableList<Any> = mutableListOf()

    /**
     * @param content An object that contains information about the content of an in-app message,
     *   including its title and body text, text colors, background colors, images, buttons, and
     *   behaviors.
     */
    public fun content(vararg content: Any) {
        _content.addAll(listOf(*content))
    }

    /**
     * @param content An object that contains information about the content of an in-app message,
     *   including its title and body text, text colors, background colors, images, buttons, and
     *   behaviors.
     */
    public fun content(content: Collection<Any>) {
        _content.addAll(content)
    }

    /**
     * @param content An object that contains information about the content of an in-app message,
     *   including its title and body text, text colors, background colors, images, buttons, and
     *   behaviors.
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
     * @param layout A string that determines the appearance of the in-app message. You can specify
     *   one of the following:.
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

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /** @param templateDescription An optional description of the in-app template. */
    public fun templateDescription(templateDescription: String) {
        cdkBuilder.templateDescription(templateDescription)
    }

    /** @param templateName The name of the in-app message template. */
    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    public fun build(): CfnInAppTemplateProps {
        if (_content.isNotEmpty()) cdkBuilder.content(_content)
        return cdkBuilder.build()
    }
}
