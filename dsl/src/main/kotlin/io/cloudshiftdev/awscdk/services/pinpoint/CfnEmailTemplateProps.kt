package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnEmailTemplateProps {
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
   */
  public fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

  /**
   * The message body, in HTML format, to use in email messages that are based on the message
   * template.
   *
   * We recommend using HTML format for email clients that render HTML content. You can include
   * links, formatted text, and more in an HTML message.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-htmlpart)
   */
  public fun htmlPart(): String? = unwrap(this).getHtmlPart()

  /**
   * The subject line, or title, to use in email messages that are based on the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-subject)
   */
  public fun subject(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A custom description of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatedescription)
   */
  public fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  /**
   * The name of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatename)
   */
  public fun templateName(): String

  /**
   * The message body, in plain text format, to use in email messages that are based on the message
   * template.
   *
   * We recommend using plain text format for email clients that don't render HTML content and
   * clients that are connected to high-latency networks, such as mobile devices.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-textpart)
   */
  public fun textPart(): String? = unwrap(this).getTextPart()

  /**
   * A builder for [CfnEmailTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     * message variables in the message template.
     * This object is a set of key-value pairs. Each key defines a message variable in the template.
     * The corresponding value defines the default value for that variable. When you create a message
     * that's based on the template, you can override these defaults with message-specific and
     * address-specific variables and values.
     */
    public fun defaultSubstitutions(defaultSubstitutions: String)

    /**
     * @param htmlPart The message body, in HTML format, to use in email messages that are based on
     * the message template.
     * We recommend using HTML format for email clients that render HTML content. You can include
     * links, formatted text, and more in an HTML message.
     */
    public fun htmlPart(htmlPart: String)

    /**
     * @param subject The subject line, or title, to use in email messages that are based on the
     * message template. 
     */
    public fun subject(subject: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Any)

    /**
     * @param templateDescription A custom description of the message template.
     */
    public fun templateDescription(templateDescription: String)

    /**
     * @param templateName The name of the message template. 
     */
    public fun templateName(templateName: String)

    /**
     * @param textPart The message body, in plain text format, to use in email messages that are
     * based on the message template.
     * We recommend using plain text format for email clients that don't render HTML content and
     * clients that are connected to high-latency networks, such as mobile devices.
     */
    public fun textPart(textPart: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps.builder()

    /**
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     * message variables in the message template.
     * This object is a set of key-value pairs. Each key defines a message variable in the template.
     * The corresponding value defines the default value for that variable. When you create a message
     * that's based on the template, you can override these defaults with message-specific and
     * address-specific variables and values.
     */
    override fun defaultSubstitutions(defaultSubstitutions: String) {
      cdkBuilder.defaultSubstitutions(defaultSubstitutions)
    }

    /**
     * @param htmlPart The message body, in HTML format, to use in email messages that are based on
     * the message template.
     * We recommend using HTML format for email clients that render HTML content. You can include
     * links, formatted text, and more in an HTML message.
     */
    override fun htmlPart(htmlPart: String) {
      cdkBuilder.htmlPart(htmlPart)
    }

    /**
     * @param subject The subject line, or title, to use in email messages that are based on the
     * message template. 
     */
    override fun subject(subject: String) {
      cdkBuilder.subject(subject)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param templateDescription A custom description of the message template.
     */
    override fun templateDescription(templateDescription: String) {
      cdkBuilder.templateDescription(templateDescription)
    }

    /**
     * @param templateName The name of the message template. 
     */
    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    /**
     * @param textPart The message body, in plain text format, to use in email messages that are
     * based on the message template.
     * We recommend using plain text format for email clients that don't render HTML content and
     * clients that are connected to high-latency networks, such as mobile devices.
     */
    override fun textPart(textPart: String) {
      cdkBuilder.textPart(textPart)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps,
  ) : CdkObject(cdkObject), CfnEmailTemplateProps {
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
     */
    override fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

    /**
     * The message body, in HTML format, to use in email messages that are based on the message
     * template.
     *
     * We recommend using HTML format for email clients that render HTML content. You can include
     * links, formatted text, and more in an HTML message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-htmlpart)
     */
    override fun htmlPart(): String? = unwrap(this).getHtmlPart()

    /**
     * The subject line, or title, to use in email messages that are based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-subject)
     */
    override fun subject(): String = unwrap(this).getSubject()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * A custom description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatedescription)
     */
    override fun templateDescription(): String? = unwrap(this).getTemplateDescription()

    /**
     * The name of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatename)
     */
    override fun templateName(): String = unwrap(this).getTemplateName()

    /**
     * The message body, in plain text format, to use in email messages that are based on the
     * message template.
     *
     * We recommend using plain text format for email clients that don't render HTML content and
     * clients that are connected to high-latency networks, such as mobile devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-textpart)
     */
    override fun textPart(): String? = unwrap(this).getTextPart()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEmailTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps):
        CfnEmailTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEmailTemplateProps):
        software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps
  }
}
