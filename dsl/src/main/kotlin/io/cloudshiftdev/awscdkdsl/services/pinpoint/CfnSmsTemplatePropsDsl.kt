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
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps

/**
 * Properties for defining a `CfnSmsTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object tags;
 * CfnSmsTemplateProps cfnSmsTemplateProps = CfnSmsTemplateProps.builder()
 * .body("body")
 * .templateName("templateName")
 * // the properties below are optional
 * .defaultSubstitutions("defaultSubstitutions")
 * .tags(tags)
 * .templateDescription("templateDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html)
 */
@CdkDslMarker
public class CfnSmsTemplatePropsDsl {
    private val cdkBuilder: CfnSmsTemplateProps.Builder = CfnSmsTemplateProps.builder()

    /**
     * @param body The message body to use in text messages that are based on the message template.
     */
    public fun body(body: String) {
        cdkBuilder.body(body)
    }

    /**
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     *   message variables in the message template. This object is a set of key-value pairs. Each
     *   key defines a message variable in the template. The corresponding value defines the default
     *   value for that variable. When you create a message that's based on the template, you can
     *   override these defaults with message-specific and address-specific variables and values.
     */
    public fun defaultSubstitutions(defaultSubstitutions: String) {
        cdkBuilder.defaultSubstitutions(defaultSubstitutions)
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

    /** @param templateDescription A custom description of the message template. */
    public fun templateDescription(templateDescription: String) {
        cdkBuilder.templateDescription(templateDescription)
    }

    /** @param templateName The name of the message template. */
    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    public fun build(): CfnSmsTemplateProps = cdkBuilder.build()
}
