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
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplate
import software.constructs.Construct

/**
 * Creates a message template that you can use in messages that are sent through the SMS channel.
 *
 * A *message template* is a set of content and settings that you can define, save, and reuse in
 * messages for any of your Amazon Pinpoint applications.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object tags;
 * CfnSmsTemplate cfnSmsTemplate = CfnSmsTemplate.Builder.create(this, "MyCfnSmsTemplate")
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
public class CfnSmsTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSmsTemplate.Builder = CfnSmsTemplate.Builder.create(scope, id)

    /**
     * The message body to use in text messages that are based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-body)
     *
     * @param body The message body to use in text messages that are based on the message template.
     */
    public fun body(body: String) {
        cdkBuilder.body(body)
    }

    /**
     * A JSON object that specifies the default values to use for message variables in the message
     * template.
     *
     * This object is a set of key-value pairs. Each key defines a message variable in the template.
     * The corresponding value defines the default value for that variable. When you create a
     * message that's based on the template, you can override these defaults with message-specific
     * and address-specific variables and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-defaultsubstitutions)
     *
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     *   message variables in the message template.
     */
    public fun defaultSubstitutions(defaultSubstitutions: String) {
        cdkBuilder.defaultSubstitutions(defaultSubstitutions)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    /**
     * A custom description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-templatedescription)
     *
     * @param templateDescription A custom description of the message template.
     */
    public fun templateDescription(templateDescription: String) {
        cdkBuilder.templateDescription(templateDescription)
    }

    /**
     * The name of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-templatename)
     *
     * @param templateName The name of the message template.
     */
    public fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
    }

    public fun build(): CfnSmsTemplate = cdkBuilder.build()
}
