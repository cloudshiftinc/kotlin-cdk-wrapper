@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies an email template.
 *
 * Email templates enable you to send personalized email to one or more destinations in a single API
 * operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnTemplate cfnTemplate = CfnTemplate.Builder.create(this, "MyCfnTemplate")
 * .template(TemplateProperty.builder()
 * .subjectPart("subjectPart")
 * // the properties below are optional
 * .htmlPart("htmlPart")
 * .templateName("templateName")
 * .textPart("textPart")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html)
 */
public open class CfnTemplate(
  cdkObject: software.amazon.awscdk.services.ses.CfnTemplate,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ses.CfnTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTemplateProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnTemplate(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTemplateProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTemplateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTemplateProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The content of the email, composed of a subject line and either an HTML part or a text-only
   * part.
   */
  public open fun template(): Any? = unwrap(this).getTemplate()

  /**
   * The content of the email, composed of a subject line and either an HTML part or a text-only
   * part.
   */
  public open fun template(`value`: IResolvable) {
    unwrap(this).setTemplate(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The content of the email, composed of a subject line and either an HTML part or a text-only
   * part.
   */
  public open fun template(`value`: TemplateProperty) {
    unwrap(this).setTemplate(`value`.let(TemplateProperty.Companion::unwrap))
  }

  /**
   * The content of the email, composed of a subject line and either an HTML part or a text-only
   * part.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("57f6de4491d980050e3f3d30941f0e0f693cabcc717af8906ad79a609cd784fe")
  public open fun template(`value`: TemplateProperty.Builder.() -> Unit): Unit =
      template(TemplateProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The content of the email, composed of a subject line and either an HTML part or a text-only
     * part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part. 
     */
    public fun template(template: IResolvable)

    /**
     * The content of the email, composed of a subject line and either an HTML part or a text-only
     * part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part. 
     */
    public fun template(template: TemplateProperty)

    /**
     * The content of the email, composed of a subject line and either an HTML part or a text-only
     * part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cddd8ef62379e20dc50fd9f980b0aed4918a48b7c1a2aa51a0ff288116c8f0ff")
    public fun template(template: TemplateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnTemplate.Builder =
        software.amazon.awscdk.services.ses.CfnTemplate.Builder.create(scope, id)

    /**
     * The content of the email, composed of a subject line and either an HTML part or a text-only
     * part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part. 
     */
    override fun template(template: IResolvable) {
      cdkBuilder.template(template.let(IResolvable.Companion::unwrap))
    }

    /**
     * The content of the email, composed of a subject line and either an HTML part or a text-only
     * part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part. 
     */
    override fun template(template: TemplateProperty) {
      cdkBuilder.template(template.let(TemplateProperty.Companion::unwrap))
    }

    /**
     * The content of the email, composed of a subject line and either an HTML part or a text-only
     * part.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-template.html#cfn-ses-template-template)
     * @param template The content of the email, composed of a subject line and either an HTML part
     * or a text-only part. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cddd8ef62379e20dc50fd9f980b0aed4918a48b7c1a2aa51a0ff288116c8f0ff")
    override fun template(template: TemplateProperty.Builder.() -> Unit): Unit =
        template(TemplateProperty(template))

    public fun build(): software.amazon.awscdk.services.ses.CfnTemplate = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnTemplate): CfnTemplate =
        CfnTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnTemplate): software.amazon.awscdk.services.ses.CfnTemplate =
        wrapped.cdkObject as software.amazon.awscdk.services.ses.CfnTemplate
  }

  /**
   * An object that defines the email template to use for an email message, and the values to use
   * for any message variables in that template.
   *
   * An *email template* is a type of message template that contains content that you want to
   * define, save, and reuse in email messages that you send.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * TemplateProperty templateProperty = TemplateProperty.builder()
   * .subjectPart("subjectPart")
   * // the properties below are optional
   * .htmlPart("htmlPart")
   * .templateName("templateName")
   * .textPart("textPart")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html)
   */
  public interface TemplateProperty {
    /**
     * The HTML body of the email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart)
     */
    public fun htmlPart(): String? = unwrap(this).getHtmlPart()

    /**
     * The subject line of the email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart)
     */
    public fun subjectPart(): String

    /**
     * The name of the template.
     *
     * You will refer to this name when you send email using the `SendTemplatedEmail` or
     * `SendBulkTemplatedEmail` operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename)
     */
    public fun templateName(): String? = unwrap(this).getTemplateName()

    /**
     * The email body that is visible to recipients whose email clients do not display HTML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart)
     */
    public fun textPart(): String? = unwrap(this).getTextPart()

    /**
     * A builder for [TemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param htmlPart The HTML body of the email.
       */
      public fun htmlPart(htmlPart: String)

      /**
       * @param subjectPart The subject line of the email. 
       */
      public fun subjectPart(subjectPart: String)

      /**
       * @param templateName The name of the template.
       * You will refer to this name when you send email using the `SendTemplatedEmail` or
       * `SendBulkTemplatedEmail` operations.
       */
      public fun templateName(templateName: String)

      /**
       * @param textPart The email body that is visible to recipients whose email clients do not
       * display HTML content.
       */
      public fun textPart(textPart: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty.Builder =
          software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty.builder()

      /**
       * @param htmlPart The HTML body of the email.
       */
      override fun htmlPart(htmlPart: String) {
        cdkBuilder.htmlPart(htmlPart)
      }

      /**
       * @param subjectPart The subject line of the email. 
       */
      override fun subjectPart(subjectPart: String) {
        cdkBuilder.subjectPart(subjectPart)
      }

      /**
       * @param templateName The name of the template.
       * You will refer to this name when you send email using the `SendTemplatedEmail` or
       * `SendBulkTemplatedEmail` operations.
       */
      override fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
      }

      /**
       * @param textPart The email body that is visible to recipients whose email clients do not
       * display HTML content.
       */
      override fun textPart(textPart: String) {
        cdkBuilder.textPart(textPart)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty,
    ) : CdkObject(cdkObject),
        TemplateProperty {
      /**
       * The HTML body of the email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-htmlpart)
       */
      override fun htmlPart(): String? = unwrap(this).getHtmlPart()

      /**
       * The subject line of the email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-subjectpart)
       */
      override fun subjectPart(): String = unwrap(this).getSubjectPart()

      /**
       * The name of the template.
       *
       * You will refer to this name when you send email using the `SendTemplatedEmail` or
       * `SendBulkTemplatedEmail` operations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-templatename)
       */
      override fun templateName(): String? = unwrap(this).getTemplateName()

      /**
       * The email body that is visible to recipients whose email clients do not display HTML
       * content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-template-template.html#cfn-ses-template-template-textpart)
       */
      override fun textPart(): String? = unwrap(this).getTextPart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty):
          TemplateProperty = CdkObjectWrappers.wrap(cdkObject) as? TemplateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateProperty):
          software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnTemplate.TemplateProperty
    }
  }
}
