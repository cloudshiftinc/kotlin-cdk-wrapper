@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplate
import software.constructs.Construct

/**
 * Creates a message template that you can use in messages that are sent through the email channel.
 *
 * A *message template* is a set of content and settings that you can define, save, and reuse in
 * messages for any of your Amazon Pinpoint applications.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * Object tags;
 * CfnEmailTemplate cfnEmailTemplate = CfnEmailTemplate.Builder.create(this, "MyCfnEmailTemplate")
 * .subject("subject")
 * .templateName("templateName")
 * // the properties below are optional
 * .defaultSubstitutions("defaultSubstitutions")
 * .htmlPart("htmlPart")
 * .tags(tags)
 * .templateDescription("templateDescription")
 * .textPart("textPart")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html)
 */
@CdkDslMarker
public class CfnEmailTemplateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEmailTemplate.Builder = CfnEmailTemplate.Builder.create(scope, id)

  /**
   * A JSON object that specifies the default values to use for message variables in the message
   * template.
   *
   * This object is a set of key-value pairs. Each key defines a message variable in the template.
   * The corresponding value defines the default value for that variable. When you create a message
   * that's based on the template, you can override these defaults with message-specific and
   * address-specific variables and values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-defaultsubstitutions)
   * @param defaultSubstitutions A JSON object that specifies the default values to use for message
   * variables in the message template. 
   */
  public fun defaultSubstitutions(defaultSubstitutions: String) {
    cdkBuilder.defaultSubstitutions(defaultSubstitutions)
  }

  /**
   * The message body, in HTML format, to use in email messages that are based on the message
   * template.
   *
   * We recommend using HTML format for email clients that render HTML content. You can include
   * links, formatted text, and more in an HTML message.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-htmlpart)
   * @param htmlPart The message body, in HTML format, to use in email messages that are based on
   * the message template. 
   */
  public fun htmlPart(htmlPart: String) {
    cdkBuilder.htmlPart(htmlPart)
  }

  /**
   * The subject line, or title, to use in email messages that are based on the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-subject)
   * @param subject The subject line, or title, to use in email messages that are based on the
   * message template. 
   */
  public fun subject(subject: String) {
    cdkBuilder.subject(subject)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-tags)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * A custom description of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatedescription)
   * @param templateDescription A custom description of the message template. 
   */
  public fun templateDescription(templateDescription: String) {
    cdkBuilder.templateDescription(templateDescription)
  }

  /**
   * The name of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatename)
   * @param templateName The name of the message template. 
   */
  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  /**
   * The message body, in plain text format, to use in email messages that are based on the message
   * template.
   *
   * We recommend using plain text format for email clients that don't render HTML content and
   * clients that are connected to high-latency networks, such as mobile devices.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-textpart)
   * @param textPart The message body, in plain text format, to use in email messages that are based
   * on the message template. 
   */
  public fun textPart(textPart: String) {
    cdkBuilder.textPart(textPart)
  }

  public fun build(): CfnEmailTemplate = cdkBuilder.build()
}
