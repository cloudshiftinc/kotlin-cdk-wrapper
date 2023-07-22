@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps

@CdkDslMarker
public class CfnEmailTemplatePropsDsl {
  private val cdkBuilder: CfnEmailTemplateProps.Builder = CfnEmailTemplateProps.builder()

  /**
   * @param defaultSubstitutions A JSON object that specifies the default values to use for message
   * variables in the message template.
   * This object is a set of key-value pairs. Each key defines a message variable in the template.
   * The corresponding value defines the default value for that variable. When you create a message
   * that's based on the template, you can override these defaults with message-specific and
   * address-specific variables and values.
   */
  public fun defaultSubstitutions(defaultSubstitutions: String) {
    cdkBuilder.defaultSubstitutions(defaultSubstitutions)
  }

  /**
   * @param htmlPart The message body, in HTML format, to use in email messages that are based on
   * the message template.
   * We recommend using HTML format for email clients that render HTML content. You can include
   * links, formatted text, and more in an HTML message.
   */
  public fun htmlPart(htmlPart: String) {
    cdkBuilder.htmlPart(htmlPart)
  }

  /**
   * @param subject The subject line, or title, to use in email messages that are based on the
   * message template. 
   */
  public fun subject(subject: String) {
    cdkBuilder.subject(subject)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param templateDescription A custom description of the message template.
   */
  public fun templateDescription(templateDescription: String) {
    cdkBuilder.templateDescription(templateDescription)
  }

  /**
   * @param templateName The name of the message template. 
   */
  public fun templateName(templateName: String) {
    cdkBuilder.templateName(templateName)
  }

  /**
   * @param textPart The message body, in plain text format, to use in email messages that are based
   * on the message template.
   * We recommend using plain text format for email clients that don't render HTML content and
   * clients that are connected to high-latency networks, such as mobile devices.
   */
  public fun textPart(textPart: String) {
    cdkBuilder.textPart(textPart)
  }

  public fun build(): CfnEmailTemplateProps = cdkBuilder.build()
}
