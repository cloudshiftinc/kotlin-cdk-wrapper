@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
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
public open class CfnEmailTemplate(
  cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEmailTemplateProps,
  ) :
      this(software.amazon.awscdk.services.pinpoint.CfnEmailTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEmailTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEmailTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEmailTemplateProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the message template.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A JSON object that specifies the default values to use for message variables in the message
   * template.
   */
  public open fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

  /**
   * A JSON object that specifies the default values to use for message variables in the message
   * template.
   */
  public open fun defaultSubstitutions(`value`: String) {
    unwrap(this).setDefaultSubstitutions(`value`)
  }

  /**
   * The message body, in HTML format, to use in email messages that are based on the message
   * template.
   */
  public open fun htmlPart(): String? = unwrap(this).getHtmlPart()

  /**
   * The message body, in HTML format, to use in email messages that are based on the message
   * template.
   */
  public open fun htmlPart(`value`: String) {
    unwrap(this).setHtmlPart(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The subject line, or title, to use in email messages that are based on the message template.
   */
  public open fun subject(): String = unwrap(this).getSubject()

  /**
   * The subject line, or title, to use in email messages that are based on the message template.
   */
  public open fun subject(`value`: String) {
    unwrap(this).setSubject(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A custom description of the message template.
   */
  public open fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  /**
   * A custom description of the message template.
   */
  public open fun templateDescription(`value`: String) {
    unwrap(this).setTemplateDescription(`value`)
  }

  /**
   * The name of the message template.
   */
  public open fun templateName(): String = unwrap(this).getTemplateName()

  /**
   * The name of the message template.
   */
  public open fun templateName(`value`: String) {
    unwrap(this).setTemplateName(`value`)
  }

  /**
   * The message body, in plain text format, to use in email messages that are based on the message
   * template.
   */
  public open fun textPart(): String? = unwrap(this).getTextPart()

  /**
   * The message body, in plain text format, to use in email messages that are based on the message
   * template.
   */
  public open fun textPart(`value`: String) {
    unwrap(this).setTextPart(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnEmailTemplate].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     * message variables in the message template. 
     */
    public fun defaultSubstitutions(defaultSubstitutions: String)

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
    public fun htmlPart(htmlPart: String)

    /**
     * The subject line, or title, to use in email messages that are based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-subject)
     * @param subject The subject line, or title, to use in email messages that are based on the
     * message template. 
     */
    public fun subject(subject: String)

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
    public fun tags(tags: Any)

    /**
     * A custom description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatedescription)
     * @param templateDescription A custom description of the message template. 
     */
    public fun templateDescription(templateDescription: String)

    /**
     * The name of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatename)
     * @param templateName The name of the message template. 
     */
    public fun templateName(templateName: String)

    /**
     * The message body, in plain text format, to use in email messages that are based on the
     * message template.
     *
     * We recommend using plain text format for email clients that don't render HTML content and
     * clients that are connected to high-latency networks, such as mobile devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-textpart)
     * @param textPart The message body, in plain text format, to use in email messages that are
     * based on the message template. 
     */
    public fun textPart(textPart: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEmailTemplate.Builder =
        software.amazon.awscdk.services.pinpoint.CfnEmailTemplate.Builder.create(scope, id)

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
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     * message variables in the message template. 
     */
    override fun defaultSubstitutions(defaultSubstitutions: String) {
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
    override fun htmlPart(htmlPart: String) {
      cdkBuilder.htmlPart(htmlPart)
    }

    /**
     * The subject line, or title, to use in email messages that are based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-subject)
     * @param subject The subject line, or title, to use in email messages that are based on the
     * message template. 
     */
    override fun subject(subject: String) {
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
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * A custom description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatedescription)
     * @param templateDescription A custom description of the message template. 
     */
    override fun templateDescription(templateDescription: String) {
      cdkBuilder.templateDescription(templateDescription)
    }

    /**
     * The name of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-templatename)
     * @param templateName The name of the message template. 
     */
    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    /**
     * The message body, in plain text format, to use in email messages that are based on the
     * message template.
     *
     * We recommend using plain text format for email clients that don't render HTML content and
     * clients that are connected to high-latency networks, such as mobile devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailtemplate.html#cfn-pinpoint-emailtemplate-textpart)
     * @param textPart The message body, in plain text format, to use in email messages that are
     * based on the message template. 
     */
    override fun textPart(textPart: String) {
      cdkBuilder.textPart(textPart)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnEmailTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnEmailTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEmailTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEmailTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailTemplate):
        CfnEmailTemplate = CfnEmailTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnEmailTemplate):
        software.amazon.awscdk.services.pinpoint.CfnEmailTemplate = wrapped.cdkObject as
        software.amazon.awscdk.services.pinpoint.CfnEmailTemplate
  }
}
