@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSmsTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
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
public interface CfnSmsTemplateProps {
  /**
   * The message body to use in text messages that are based on the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-body)
   */
  public fun body(): String

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
   */
  public fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A custom description of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-templatedescription)
   */
  public fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  /**
   * The name of the message template to use for the message.
   *
   * If specified, this value must match the name of an existing message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-templatename)
   */
  public fun templateName(): String

  /**
   * A builder for [CfnSmsTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param body The message body to use in text messages that are based on the message template. 
     */
    public fun body(body: String)

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
     * @param templateName The name of the message template to use for the message. 
     * If specified, this value must match the name of an existing message template.
     */
    public fun templateName(templateName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps.builder()

    /**
     * @param body The message body to use in text messages that are based on the message template. 
     */
    override fun body(body: String) {
      cdkBuilder.body(body)
    }

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
     * @param templateName The name of the message template to use for the message. 
     * If specified, this value must match the name of an existing message template.
     */
    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps,
  ) : CdkObject(cdkObject), CfnSmsTemplateProps {
    /**
     * The message body to use in text messages that are based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-body)
     */
    override fun body(): String = unwrap(this).getBody()

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
     */
    override fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * A custom description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-templatedescription)
     */
    override fun templateDescription(): String? = unwrap(this).getTemplateDescription()

    /**
     * The name of the message template to use for the message.
     *
     * If specified, this value must match the name of an existing message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smstemplate.html#cfn-pinpoint-smstemplate-templatename)
     */
    override fun templateName(): String = unwrap(this).getTemplateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSmsTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps):
        CfnSmsTemplateProps = CdkObjectWrappers.wrap(cdkObject) as CfnSmsTemplateProps

    internal fun unwrap(wrapped: CfnSmsTemplateProps):
        software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps
  }
}
