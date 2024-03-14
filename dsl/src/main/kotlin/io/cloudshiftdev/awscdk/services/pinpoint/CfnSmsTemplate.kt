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

public open class CfnSmsTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSmsTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the message template.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The message body to use in text messages that are based on the message template.
   */
  public open fun body(): String = unwrap(this).getBody()

  /**
   * The message body to use in text messages that are based on the message template.
   */
  public open fun body(`value`: String) {
    unwrap(this).setBody(`value`)
  }

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
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
   * The name of the message template to use for the message.
   */
  public open fun templateName(): String = unwrap(this).getTemplateName()

  /**
   * The name of the message template to use for the message.
   */
  public open fun templateName(`value`: String) {
    unwrap(this).setTemplateName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnSmsTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The message body to use in text messages that are based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-body)
     * @param body The message body to use in text messages that are based on the message template. 
     */
    public fun body(body: String)

    /**
     * A JSON object that specifies the default values to use for message variables in the message
     * template.
     *
     * This object is a set of key-value pairs. Each key defines a message variable in the template.
     * The corresponding value defines the default value for that variable. When you create a message
     * that's based on the template, you can override these defaults with message-specific and
     * address-specific variables and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-defaultsubstitutions)
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     * message variables in the message template. 
     */
    public fun defaultSubstitutions(defaultSubstitutions: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Any)

    /**
     * A custom description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-templatedescription)
     * @param templateDescription A custom description of the message template. 
     */
    public fun templateDescription(templateDescription: String)

    /**
     * The name of the message template to use for the message.
     *
     * If specified, this value must match the name of an existing message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-templatename)
     * @param templateName The name of the message template to use for the message. 
     */
    public fun templateName(templateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSmsTemplate.Builder =
        software.amazon.awscdk.services.pinpoint.CfnSmsTemplate.Builder.create(scope, id)

    /**
     * The message body to use in text messages that are based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-body)
     * @param body The message body to use in text messages that are based on the message template. 
     */
    override fun body(body: String) {
      cdkBuilder.body(body)
    }

    /**
     * A JSON object that specifies the default values to use for message variables in the message
     * template.
     *
     * This object is a set of key-value pairs. Each key defines a message variable in the template.
     * The corresponding value defines the default value for that variable. When you create a message
     * that's based on the template, you can override these defaults with message-specific and
     * address-specific variables and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-defaultsubstitutions)
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     * message variables in the message template. 
     */
    override fun defaultSubstitutions(defaultSubstitutions: String) {
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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * A custom description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-templatedescription)
     * @param templateDescription A custom description of the message template. 
     */
    override fun templateDescription(templateDescription: String) {
      cdkBuilder.templateDescription(templateDescription)
    }

    /**
     * The name of the message template to use for the message.
     *
     * If specified, this value must match the name of an existing message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-templatename)
     * @param templateName The name of the message template to use for the message. 
     */
    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnSmsTemplate = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnSmsTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSmsTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSmsTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSmsTemplate):
        CfnSmsTemplate = CfnSmsTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnSmsTemplate):
        software.amazon.awscdk.services.pinpoint.CfnSmsTemplate = wrapped.cdkObject
  }
}
