@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a message template that you can use to send in-app messages.
 *
 * A message template is a set of content and settings that you can define, save, and reuse in
 * messages for any of your Amazon Pinpoint applications. The In-App channel is unavailable in AWS
 * GovCloud (US).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * Object customConfig;
 * Object tags;
 * CfnInAppTemplate cfnInAppTemplate = CfnInAppTemplate.Builder.create(this, "MyCfnInAppTemplate")
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
public open class CfnInAppTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the message template.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * An object that contains information about the content of an in-app message, including its title
   * and body text, text colors, background colors, images, buttons, and behaviors.
   */
  public open fun content(): Any? = unwrap(this).getContent()

  /**
   * An object that contains information about the content of an in-app message, including its title
   * and body text, text colors, background colors, images, buttons, and behaviors.
   */
  public open fun content(`value`: IResolvable) {
    unwrap(this).setContent(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that contains information about the content of an in-app message, including its title
   * and body text, text colors, background colors, images, buttons, and behaviors.
   */
  public open fun content(`value`: List<Any>) {
    unwrap(this).setContent(`value`)
  }

  /**
   * An object that contains information about the content of an in-app message, including its title
   * and body text, text colors, background colors, images, buttons, and behaviors.
   */
  public open fun content(vararg `value`: Any): Unit = content(`value`.toList())

  /**
   * Custom data, in the form of key-value pairs, that is included in an in-app messaging payload.
   */
  public open fun customConfig(): Any? = unwrap(this).getCustomConfig()

  /**
   * Custom data, in the form of key-value pairs, that is included in an in-app messaging payload.
   */
  public open fun customConfig(`value`: Any) {
    unwrap(this).setCustomConfig(`value`)
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
   * A string that determines the appearance of the in-app message.
   *
   * You can specify one of the following:.
   */
  public open fun layout(): String? = unwrap(this).getLayout()

  /**
   * A string that determines the appearance of the in-app message.
   *
   * You can specify one of the following:.
   */
  public open fun layout(`value`: String) {
    unwrap(this).setLayout(`value`)
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
   * An optional description of the in-app template.
   */
  public open fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  /**
   * An optional description of the in-app template.
   */
  public open fun templateDescription(`value`: String) {
    unwrap(this).setTemplateDescription(`value`)
  }

  /**
   * The name of the in-app message template.
   */
  public open fun templateName(): String = unwrap(this).getTemplateName()

  /**
   * The name of the in-app message template.
   */
  public open fun templateName(`value`: String) {
    unwrap(this).setTemplateName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnInAppTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An object that contains information about the content of an in-app message, including its
     * title and body text, text colors, background colors, images, buttons, and behaviors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors. 
     */
    public fun content(content: IResolvable)

    /**
     * An object that contains information about the content of an in-app message, including its
     * title and body text, text colors, background colors, images, buttons, and behaviors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors. 
     */
    public fun content(content: List<Any>)

    /**
     * An object that contains information about the content of an in-app message, including its
     * title and body text, text colors, background colors, images, buttons, and behaviors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors. 
     */
    public fun content(vararg content: Any)

    /**
     * Custom data, in the form of key-value pairs, that is included in an in-app messaging payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-customconfig)
     * @param customConfig Custom data, in the form of key-value pairs, that is included in an
     * in-app messaging payload. 
     */
    public fun customConfig(customConfig: Any)

    /**
     * A string that determines the appearance of the in-app message. You can specify one of the
     * following:.
     *
     * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
     * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
     * * `OVERLAYS` – a message that covers entire screen.
     * * `MOBILE_FEED` – a message that appears in a window in front of the page.
     * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
     * * `CAROUSEL` – a scrollable layout of up to five unique messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-layout)
     * @param layout A string that determines the appearance of the in-app message. You can specify
     * one of the following:. 
     */
    public fun layout(layout: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Any)

    /**
     * An optional description of the in-app template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-templatedescription)
     * @param templateDescription An optional description of the in-app template. 
     */
    public fun templateDescription(templateDescription: String)

    /**
     * The name of the in-app message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-templatename)
     * @param templateName The name of the in-app message template. 
     */
    public fun templateName(templateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.Builder =
        software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.Builder.create(scope, id)

    /**
     * An object that contains information about the content of an in-app message, including its
     * title and body text, text colors, background colors, images, buttons, and behaviors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors. 
     */
    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    /**
     * An object that contains information about the content of an in-app message, including its
     * title and body text, text colors, background colors, images, buttons, and behaviors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors. 
     */
    override fun content(content: List<Any>) {
      cdkBuilder.content(content)
    }

    /**
     * An object that contains information about the content of an in-app message, including its
     * title and body text, text colors, background colors, images, buttons, and behaviors.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-content)
     * @param content An object that contains information about the content of an in-app message,
     * including its title and body text, text colors, background colors, images, buttons, and
     * behaviors. 
     */
    override fun content(vararg content: Any): Unit = content(content.toList())

    /**
     * Custom data, in the form of key-value pairs, that is included in an in-app messaging payload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-customconfig)
     * @param customConfig Custom data, in the form of key-value pairs, that is included in an
     * in-app messaging payload. 
     */
    override fun customConfig(customConfig: Any) {
      cdkBuilder.customConfig(customConfig)
    }

    /**
     * A string that determines the appearance of the in-app message. You can specify one of the
     * following:.
     *
     * * `BOTTOM_BANNER` – a message that appears as a banner at the bottom of the page.
     * * `TOP_BANNER` – a message that appears as a banner at the top of the page.
     * * `OVERLAYS` – a message that covers entire screen.
     * * `MOBILE_FEED` – a message that appears in a window in front of the page.
     * * `MIDDLE_BANNER` – a message that appears as a banner in the middle of the page.
     * * `CAROUSEL` – a scrollable layout of up to five unique messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-layout)
     * @param layout A string that determines the appearance of the in-app message. You can specify
     * one of the following:. 
     */
    override fun layout(layout: String) {
      cdkBuilder.layout(layout)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * An optional description of the in-app template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-templatedescription)
     * @param templateDescription An optional description of the in-app template. 
     */
    override fun templateDescription(templateDescription: String) {
      cdkBuilder.templateDescription(templateDescription)
    }

    /**
     * The name of the in-app message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-inapptemplate.html#cfn-pinpoint-inapptemplate-templatename)
     * @param templateName The name of the in-app message template. 
     */
    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnInAppTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInAppTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInAppTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate):
        CfnInAppTemplate = CfnInAppTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnInAppTemplate):
        software.amazon.awscdk.services.pinpoint.CfnInAppTemplate = wrapped.cdkObject
  }

  /**
   * Specifies the configuration of an in-app message, including its header, body, buttons, colors,
   * and images.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * InAppMessageContentProperty inAppMessageContentProperty = InAppMessageContentProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html)
   */
  public interface InAppMessageContentProperty {
    /**
     * The background color for an in-app message banner, expressed as a hex color code (such as
     * #000000 for black).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-backgroundcolor)
     */
    public fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

    /**
     * An object that contains configuration information about the header or title text of the
     * in-app message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-bodyconfig)
     */
    public fun bodyConfig(): Any? = unwrap(this).getBodyConfig()

    /**
     * An object that contains configuration information about the header or title text of the
     * in-app message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-headerconfig)
     */
    public fun headerConfig(): Any? = unwrap(this).getHeaderConfig()

    /**
     * The URL of the image that appears on an in-app message banner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-imageurl)
     */
    public fun imageUrl(): String? = unwrap(this).getImageUrl()

    /**
     * An object that contains configuration information about the primary button in an in-app
     * message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-primarybtn)
     */
    public fun primaryBtn(): Any? = unwrap(this).getPrimaryBtn()

    /**
     * An object that contains configuration information about the secondary button in an in-app
     * message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-secondarybtn)
     */
    public fun secondaryBtn(): Any? = unwrap(this).getSecondaryBtn()

    /**
     * A builder for [InAppMessageContentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param backgroundColor The background color for an in-app message banner, expressed as a
       * hex color code (such as #000000 for black).
       */
      public fun backgroundColor(backgroundColor: String)

      /**
       * @param bodyConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      public fun bodyConfig(bodyConfig: IResolvable)

      /**
       * @param bodyConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      public fun bodyConfig(bodyConfig: BodyConfigProperty)

      /**
       * @param bodyConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2479de21a04690559cc4670eb0c9d6482bde68d7f4a47b3efc0ae67e5488d597")
      public fun bodyConfig(bodyConfig: BodyConfigProperty.Builder.() -> Unit)

      /**
       * @param headerConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      public fun headerConfig(headerConfig: IResolvable)

      /**
       * @param headerConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      public fun headerConfig(headerConfig: HeaderConfigProperty)

      /**
       * @param headerConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("365e1110395eb940721a86faf9af727ac6d8d774c85cc42f0734c6396c8df06e")
      public fun headerConfig(headerConfig: HeaderConfigProperty.Builder.() -> Unit)

      /**
       * @param imageUrl The URL of the image that appears on an in-app message banner.
       */
      public fun imageUrl(imageUrl: String)

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      public fun primaryBtn(primaryBtn: IResolvable)

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      public fun primaryBtn(primaryBtn: ButtonConfigProperty)

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e55e629d616959e6e36a18e1a6ad549e12fc5337eb4dbef59eda51ef08e1dd1d")
      public fun primaryBtn(primaryBtn: ButtonConfigProperty.Builder.() -> Unit)

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      public fun secondaryBtn(secondaryBtn: IResolvable)

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      public fun secondaryBtn(secondaryBtn: ButtonConfigProperty)

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("234b6b86f473b96be475830f85312730a4e7b77a6dab32954fbbbd839e24d313")
      public fun secondaryBtn(secondaryBtn: ButtonConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty.builder()

      /**
       * @param backgroundColor The background color for an in-app message banner, expressed as a
       * hex color code (such as #000000 for black).
       */
      override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      /**
       * @param bodyConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      override fun bodyConfig(bodyConfig: IResolvable) {
        cdkBuilder.bodyConfig(bodyConfig.let(IResolvable::unwrap))
      }

      /**
       * @param bodyConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      override fun bodyConfig(bodyConfig: BodyConfigProperty) {
        cdkBuilder.bodyConfig(bodyConfig.let(BodyConfigProperty::unwrap))
      }

      /**
       * @param bodyConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2479de21a04690559cc4670eb0c9d6482bde68d7f4a47b3efc0ae67e5488d597")
      override fun bodyConfig(bodyConfig: BodyConfigProperty.Builder.() -> Unit): Unit =
          bodyConfig(BodyConfigProperty(bodyConfig))

      /**
       * @param headerConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      override fun headerConfig(headerConfig: IResolvable) {
        cdkBuilder.headerConfig(headerConfig.let(IResolvable::unwrap))
      }

      /**
       * @param headerConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      override fun headerConfig(headerConfig: HeaderConfigProperty) {
        cdkBuilder.headerConfig(headerConfig.let(HeaderConfigProperty::unwrap))
      }

      /**
       * @param headerConfig An object that contains configuration information about the header or
       * title text of the in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("365e1110395eb940721a86faf9af727ac6d8d774c85cc42f0734c6396c8df06e")
      override fun headerConfig(headerConfig: HeaderConfigProperty.Builder.() -> Unit): Unit =
          headerConfig(HeaderConfigProperty(headerConfig))

      /**
       * @param imageUrl The URL of the image that appears on an in-app message banner.
       */
      override fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
      }

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      override fun primaryBtn(primaryBtn: IResolvable) {
        cdkBuilder.primaryBtn(primaryBtn.let(IResolvable::unwrap))
      }

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      override fun primaryBtn(primaryBtn: ButtonConfigProperty) {
        cdkBuilder.primaryBtn(primaryBtn.let(ButtonConfigProperty::unwrap))
      }

      /**
       * @param primaryBtn An object that contains configuration information about the primary
       * button in an in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e55e629d616959e6e36a18e1a6ad549e12fc5337eb4dbef59eda51ef08e1dd1d")
      override fun primaryBtn(primaryBtn: ButtonConfigProperty.Builder.() -> Unit): Unit =
          primaryBtn(ButtonConfigProperty(primaryBtn))

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      override fun secondaryBtn(secondaryBtn: IResolvable) {
        cdkBuilder.secondaryBtn(secondaryBtn.let(IResolvable::unwrap))
      }

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      override fun secondaryBtn(secondaryBtn: ButtonConfigProperty) {
        cdkBuilder.secondaryBtn(secondaryBtn.let(ButtonConfigProperty::unwrap))
      }

      /**
       * @param secondaryBtn An object that contains configuration information about the secondary
       * button in an in-app message.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("234b6b86f473b96be475830f85312730a4e7b77a6dab32954fbbbd839e24d313")
      override fun secondaryBtn(secondaryBtn: ButtonConfigProperty.Builder.() -> Unit): Unit =
          secondaryBtn(ButtonConfigProperty(secondaryBtn))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty,
    ) : CdkObject(cdkObject), InAppMessageContentProperty {
      /**
       * The background color for an in-app message banner, expressed as a hex color code (such as
       * #000000 for black).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-backgroundcolor)
       */
      override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      /**
       * An object that contains configuration information about the header or title text of the
       * in-app message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-bodyconfig)
       */
      override fun bodyConfig(): Any? = unwrap(this).getBodyConfig()

      /**
       * An object that contains configuration information about the header or title text of the
       * in-app message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-headerconfig)
       */
      override fun headerConfig(): Any? = unwrap(this).getHeaderConfig()

      /**
       * The URL of the image that appears on an in-app message banner.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-imageurl)
       */
      override fun imageUrl(): String? = unwrap(this).getImageUrl()

      /**
       * An object that contains configuration information about the primary button in an in-app
       * message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-primarybtn)
       */
      override fun primaryBtn(): Any? = unwrap(this).getPrimaryBtn()

      /**
       * An object that contains configuration information about the secondary button in an in-app
       * message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-inappmessagecontent.html#cfn-pinpoint-inapptemplate-inappmessagecontent-secondarybtn)
       */
      override fun secondaryBtn(): Any? = unwrap(this).getSecondaryBtn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InAppMessageContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty):
          InAppMessageContentProperty = CdkObjectWrappers.wrap(cdkObject) as
          InAppMessageContentProperty

      internal fun unwrap(wrapped: InAppMessageContentProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.InAppMessageContentProperty
    }
  }

  /**
   * Specifies the configuration of the main body text of the in-app message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * BodyConfigProperty bodyConfigProperty = BodyConfigProperty.builder()
   * .alignment("alignment")
   * .body("body")
   * .textColor("textColor")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-bodyconfig.html)
   */
  public interface BodyConfigProperty {
    /**
     * The text alignment of the main body text of the message.
     *
     * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-bodyconfig.html#cfn-pinpoint-inapptemplate-bodyconfig-alignment)
     */
    public fun alignment(): String? = unwrap(this).getAlignment()

    /**
     * The main body text of the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-bodyconfig.html#cfn-pinpoint-inapptemplate-bodyconfig-body)
     */
    public fun body(): String? = unwrap(this).getBody()

    /**
     * The color of the body text, expressed as a hex color code (such as #000000 for black).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-bodyconfig.html#cfn-pinpoint-inapptemplate-bodyconfig-textcolor)
     */
    public fun textColor(): String? = unwrap(this).getTextColor()

    /**
     * A builder for [BodyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alignment The text alignment of the main body text of the message.
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       */
      public fun alignment(alignment: String)

      /**
       * @param body The main body text of the message.
       */
      public fun body(body: String)

      /**
       * @param textColor The color of the body text, expressed as a hex color code (such as #000000
       * for black).
       */
      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty.builder()

      /**
       * @param alignment The text alignment of the main body text of the message.
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       */
      override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      /**
       * @param body The main body text of the message.
       */
      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      /**
       * @param textColor The color of the body text, expressed as a hex color code (such as #000000
       * for black).
       */
      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty,
    ) : CdkObject(cdkObject), BodyConfigProperty {
      /**
       * The text alignment of the main body text of the message.
       *
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-bodyconfig.html#cfn-pinpoint-inapptemplate-bodyconfig-alignment)
       */
      override fun alignment(): String? = unwrap(this).getAlignment()

      /**
       * The main body text of the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-bodyconfig.html#cfn-pinpoint-inapptemplate-bodyconfig-body)
       */
      override fun body(): String? = unwrap(this).getBody()

      /**
       * The color of the body text, expressed as a hex color code (such as #000000 for black).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-bodyconfig.html#cfn-pinpoint-inapptemplate-bodyconfig-textcolor)
       */
      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BodyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty):
          BodyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as BodyConfigProperty

      internal fun unwrap(wrapped: BodyConfigProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.BodyConfigProperty
    }
  }

  /**
   * Specifies the default behavior of a button that appears in an in-app message.
   *
   * You can optionally add button configurations that specifically apply to iOS, Android, or web
   * browser users.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * DefaultButtonConfigurationProperty defaultButtonConfigurationProperty =
   * DefaultButtonConfigurationProperty.builder()
   * .backgroundColor("backgroundColor")
   * .borderRadius(123)
   * .buttonAction("buttonAction")
   * .link("link")
   * .text("text")
   * .textColor("textColor")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html)
   */
  public interface DefaultButtonConfigurationProperty {
    /**
     * The background color of a button, expressed as a hex color code (such as #000000 for black).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-backgroundcolor)
     */
    public fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

    /**
     * The border radius of a button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-borderradius)
     */
    public fun borderRadius(): Number? = unwrap(this).getBorderRadius()

    /**
     * The action that occurs when a recipient chooses a button in an in-app message.
     *
     * You can specify one of the following:
     *
     * * `LINK` – A link to a web destination.
     * * `DEEP_LINK` – A link to a specific page in an application.
     * * `CLOSE` – Dismisses the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-buttonaction)
     */
    public fun buttonAction(): String? = unwrap(this).getButtonAction()

    /**
     * The destination (such as a URL) for a button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-link)
     */
    public fun link(): String? = unwrap(this).getLink()

    /**
     * The text that appears on a button in an in-app message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-text)
     */
    public fun text(): String? = unwrap(this).getText()

    /**
     * The color of the body text in a button, expressed as a hex color code (such as #000000 for
     * black).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-textcolor)
     */
    public fun textColor(): String? = unwrap(this).getTextColor()

    /**
     * A builder for [DefaultButtonConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param backgroundColor The background color of a button, expressed as a hex color code
       * (such as #000000 for black).
       */
      public fun backgroundColor(backgroundColor: String)

      /**
       * @param borderRadius The border radius of a button.
       */
      public fun borderRadius(borderRadius: Number)

      /**
       * @param buttonAction The action that occurs when a recipient chooses a button in an in-app
       * message.
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       */
      public fun buttonAction(buttonAction: String)

      /**
       * @param link The destination (such as a URL) for a button.
       */
      public fun link(link: String)

      /**
       * @param text The text that appears on a button in an in-app message.
       */
      public fun text(text: String)

      /**
       * @param textColor The color of the body text in a button, expressed as a hex color code
       * (such as #000000 for black).
       */
      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty.builder()

      /**
       * @param backgroundColor The background color of a button, expressed as a hex color code
       * (such as #000000 for black).
       */
      override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      /**
       * @param borderRadius The border radius of a button.
       */
      override fun borderRadius(borderRadius: Number) {
        cdkBuilder.borderRadius(borderRadius)
      }

      /**
       * @param buttonAction The action that occurs when a recipient chooses a button in an in-app
       * message.
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       */
      override fun buttonAction(buttonAction: String) {
        cdkBuilder.buttonAction(buttonAction)
      }

      /**
       * @param link The destination (such as a URL) for a button.
       */
      override fun link(link: String) {
        cdkBuilder.link(link)
      }

      /**
       * @param text The text that appears on a button in an in-app message.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      /**
       * @param textColor The color of the body text in a button, expressed as a hex color code
       * (such as #000000 for black).
       */
      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty,
    ) : CdkObject(cdkObject), DefaultButtonConfigurationProperty {
      /**
       * The background color of a button, expressed as a hex color code (such as #000000 for
       * black).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-backgroundcolor)
       */
      override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      /**
       * The border radius of a button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-borderradius)
       */
      override fun borderRadius(): Number? = unwrap(this).getBorderRadius()

      /**
       * The action that occurs when a recipient chooses a button in an in-app message.
       *
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-buttonaction)
       */
      override fun buttonAction(): String? = unwrap(this).getButtonAction()

      /**
       * The destination (such as a URL) for a button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-link)
       */
      override fun link(): String? = unwrap(this).getLink()

      /**
       * The text that appears on a button in an in-app message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-text)
       */
      override fun text(): String? = unwrap(this).getText()

      /**
       * The color of the body text in a button, expressed as a hex color code (such as #000000 for
       * black).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-defaultbuttonconfiguration.html#cfn-pinpoint-inapptemplate-defaultbuttonconfiguration-textcolor)
       */
      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultButtonConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty):
          DefaultButtonConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          DefaultButtonConfigurationProperty

      internal fun unwrap(wrapped: DefaultButtonConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.DefaultButtonConfigurationProperty
    }
  }

  /**
   * Specifies the configuration of a button with settings that are specific to a certain device
   * type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * OverrideButtonConfigurationProperty overrideButtonConfigurationProperty =
   * OverrideButtonConfigurationProperty.builder()
   * .buttonAction("buttonAction")
   * .link("link")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-overridebuttonconfiguration.html)
   */
  public interface OverrideButtonConfigurationProperty {
    /**
     * The action that occurs when a recipient chooses a button in an in-app message.
     *
     * You can specify one of the following:
     *
     * * `LINK` – A link to a web destination.
     * * `DEEP_LINK` – A link to a specific page in an application.
     * * `CLOSE` – Dismisses the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-overridebuttonconfiguration.html#cfn-pinpoint-inapptemplate-overridebuttonconfiguration-buttonaction)
     */
    public fun buttonAction(): String? = unwrap(this).getButtonAction()

    /**
     * The destination (such as a URL) for a button.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-overridebuttonconfiguration.html#cfn-pinpoint-inapptemplate-overridebuttonconfiguration-link)
     */
    public fun link(): String? = unwrap(this).getLink()

    /**
     * A builder for [OverrideButtonConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param buttonAction The action that occurs when a recipient chooses a button in an in-app
       * message.
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       */
      public fun buttonAction(buttonAction: String)

      /**
       * @param link The destination (such as a URL) for a button.
       */
      public fun link(link: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty.builder()

      /**
       * @param buttonAction The action that occurs when a recipient chooses a button in an in-app
       * message.
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       */
      override fun buttonAction(buttonAction: String) {
        cdkBuilder.buttonAction(buttonAction)
      }

      /**
       * @param link The destination (such as a URL) for a button.
       */
      override fun link(link: String) {
        cdkBuilder.link(link)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty,
    ) : CdkObject(cdkObject), OverrideButtonConfigurationProperty {
      /**
       * The action that occurs when a recipient chooses a button in an in-app message.
       *
       * You can specify one of the following:
       *
       * * `LINK` – A link to a web destination.
       * * `DEEP_LINK` – A link to a specific page in an application.
       * * `CLOSE` – Dismisses the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-overridebuttonconfiguration.html#cfn-pinpoint-inapptemplate-overridebuttonconfiguration-buttonaction)
       */
      override fun buttonAction(): String? = unwrap(this).getButtonAction()

      /**
       * The destination (such as a URL) for a button.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-overridebuttonconfiguration.html#cfn-pinpoint-inapptemplate-overridebuttonconfiguration-link)
       */
      override fun link(): String? = unwrap(this).getLink()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OverrideButtonConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty):
          OverrideButtonConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          OverrideButtonConfigurationProperty

      internal fun unwrap(wrapped: OverrideButtonConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.OverrideButtonConfigurationProperty
    }
  }

  /**
   * Specifies the configuration and content of the header or title text of the in-app message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * HeaderConfigProperty headerConfigProperty = HeaderConfigProperty.builder()
   * .alignment("alignment")
   * .header("header")
   * .textColor("textColor")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-headerconfig.html)
   */
  public interface HeaderConfigProperty {
    /**
     * The text alignment of the title of the message.
     *
     * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-headerconfig.html#cfn-pinpoint-inapptemplate-headerconfig-alignment)
     */
    public fun alignment(): String? = unwrap(this).getAlignment()

    /**
     * The title text of the in-app message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-headerconfig.html#cfn-pinpoint-inapptemplate-headerconfig-header)
     */
    public fun `header`(): String? = unwrap(this).getHeader()

    /**
     * The color of the title text, expressed as a hex color code (such as #000000 for black).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-headerconfig.html#cfn-pinpoint-inapptemplate-headerconfig-textcolor)
     */
    public fun textColor(): String? = unwrap(this).getTextColor()

    /**
     * A builder for [HeaderConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param alignment The text alignment of the title of the message.
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       */
      public fun alignment(alignment: String)

      /**
       * @param header The title text of the in-app message.
       */
      public fun `header`(`header`: String)

      /**
       * @param textColor The color of the title text, expressed as a hex color code (such as
       * #000000 for black).
       */
      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty.builder()

      /**
       * @param alignment The text alignment of the title of the message.
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       */
      override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      /**
       * @param header The title text of the in-app message.
       */
      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      /**
       * @param textColor The color of the title text, expressed as a hex color code (such as
       * #000000 for black).
       */
      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty,
    ) : CdkObject(cdkObject), HeaderConfigProperty {
      /**
       * The text alignment of the title of the message.
       *
       * Acceptable values: `LEFT` , `CENTER` , `RIGHT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-headerconfig.html#cfn-pinpoint-inapptemplate-headerconfig-alignment)
       */
      override fun alignment(): String? = unwrap(this).getAlignment()

      /**
       * The title text of the in-app message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-headerconfig.html#cfn-pinpoint-inapptemplate-headerconfig-header)
       */
      override fun `header`(): String? = unwrap(this).getHeader()

      /**
       * The color of the title text, expressed as a hex color code (such as #000000 for black).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-headerconfig.html#cfn-pinpoint-inapptemplate-headerconfig-textcolor)
       */
      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty):
          HeaderConfigProperty = CdkObjectWrappers.wrap(cdkObject) as HeaderConfigProperty

      internal fun unwrap(wrapped: HeaderConfigProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.HeaderConfigProperty
    }
  }

  /**
   * Specifies the behavior of buttons that appear in an in-app message template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * ButtonConfigProperty buttonConfigProperty = ButtonConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html)
   */
  public interface ButtonConfigProperty {
    /**
     * Optional button configuration to use for in-app messages sent to Android devices.
     *
     * This button configuration overrides the default button configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html#cfn-pinpoint-inapptemplate-buttonconfig-android)
     */
    public fun android(): Any? = unwrap(this).getAndroid()

    /**
     * Specifies the default behavior of a button that appears in an in-app message.
     *
     * You can optionally add button configurations that specifically apply to iOS, Android, or web
     * browser users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html#cfn-pinpoint-inapptemplate-buttonconfig-defaultconfig)
     */
    public fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

    /**
     * Optional button configuration to use for in-app messages sent to iOS devices.
     *
     * This button configuration overrides the default button configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html#cfn-pinpoint-inapptemplate-buttonconfig-ios)
     */
    public fun ios(): Any? = unwrap(this).getIos()

    /**
     * Optional button configuration to use for in-app messages sent to web applications.
     *
     * This button configuration overrides the default button configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html#cfn-pinpoint-inapptemplate-buttonconfig-web)
     */
    public fun web(): Any? = unwrap(this).getWeb()

    /**
     * A builder for [ButtonConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param android Optional button configuration to use for in-app messages sent to Android
       * devices.
       * This button configuration overrides the default button configuration.
       */
      public fun android(android: IResolvable)

      /**
       * @param android Optional button configuration to use for in-app messages sent to Android
       * devices.
       * This button configuration overrides the default button configuration.
       */
      public fun android(android: OverrideButtonConfigurationProperty)

      /**
       * @param android Optional button configuration to use for in-app messages sent to Android
       * devices.
       * This button configuration overrides the default button configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88a38b25b4684566e7079a422699d84fd408979eb8cfb373aec91408a4e9bcd6")
      public fun android(android: OverrideButtonConfigurationProperty.Builder.() -> Unit)

      /**
       * @param defaultConfig Specifies the default behavior of a button that appears in an in-app
       * message.
       * You can optionally add button configurations that specifically apply to iOS, Android, or
       * web browser users.
       */
      public fun defaultConfig(defaultConfig: IResolvable)

      /**
       * @param defaultConfig Specifies the default behavior of a button that appears in an in-app
       * message.
       * You can optionally add button configurations that specifically apply to iOS, Android, or
       * web browser users.
       */
      public fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty)

      /**
       * @param defaultConfig Specifies the default behavior of a button that appears in an in-app
       * message.
       * You can optionally add button configurations that specifically apply to iOS, Android, or
       * web browser users.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de7b26fb3703b3caf476965cf7702f104885ef6807115a346f49bace39d5bac9")
      public fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty.Builder.() -> Unit)

      /**
       * @param ios Optional button configuration to use for in-app messages sent to iOS devices.
       * This button configuration overrides the default button configuration.
       */
      public fun ios(ios: IResolvable)

      /**
       * @param ios Optional button configuration to use for in-app messages sent to iOS devices.
       * This button configuration overrides the default button configuration.
       */
      public fun ios(ios: OverrideButtonConfigurationProperty)

      /**
       * @param ios Optional button configuration to use for in-app messages sent to iOS devices.
       * This button configuration overrides the default button configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0aea58ea9a80bca6bf68327d5ce114eee486702e9606d34ca4290f7daa88296")
      public fun ios(ios: OverrideButtonConfigurationProperty.Builder.() -> Unit)

      /**
       * @param web Optional button configuration to use for in-app messages sent to web
       * applications.
       * This button configuration overrides the default button configuration.
       */
      public fun web(web: IResolvable)

      /**
       * @param web Optional button configuration to use for in-app messages sent to web
       * applications.
       * This button configuration overrides the default button configuration.
       */
      public fun web(web: OverrideButtonConfigurationProperty)

      /**
       * @param web Optional button configuration to use for in-app messages sent to web
       * applications.
       * This button configuration overrides the default button configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b1ad297153e0dea8130af040c61521e27aff5bf44f0addd08ce7d1876021523")
      public fun web(web: OverrideButtonConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty.builder()

      /**
       * @param android Optional button configuration to use for in-app messages sent to Android
       * devices.
       * This button configuration overrides the default button configuration.
       */
      override fun android(android: IResolvable) {
        cdkBuilder.android(android.let(IResolvable::unwrap))
      }

      /**
       * @param android Optional button configuration to use for in-app messages sent to Android
       * devices.
       * This button configuration overrides the default button configuration.
       */
      override fun android(android: OverrideButtonConfigurationProperty) {
        cdkBuilder.android(android.let(OverrideButtonConfigurationProperty::unwrap))
      }

      /**
       * @param android Optional button configuration to use for in-app messages sent to Android
       * devices.
       * This button configuration overrides the default button configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88a38b25b4684566e7079a422699d84fd408979eb8cfb373aec91408a4e9bcd6")
      override fun android(android: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          android(OverrideButtonConfigurationProperty(android))

      /**
       * @param defaultConfig Specifies the default behavior of a button that appears in an in-app
       * message.
       * You can optionally add button configurations that specifically apply to iOS, Android, or
       * web browser users.
       */
      override fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig.let(IResolvable::unwrap))
      }

      /**
       * @param defaultConfig Specifies the default behavior of a button that appears in an in-app
       * message.
       * You can optionally add button configurations that specifically apply to iOS, Android, or
       * web browser users.
       */
      override fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty) {
        cdkBuilder.defaultConfig(defaultConfig.let(DefaultButtonConfigurationProperty::unwrap))
      }

      /**
       * @param defaultConfig Specifies the default behavior of a button that appears in an in-app
       * message.
       * You can optionally add button configurations that specifically apply to iOS, Android, or
       * web browser users.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("de7b26fb3703b3caf476965cf7702f104885ef6807115a346f49bace39d5bac9")
      override
          fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty.Builder.() -> Unit):
          Unit = defaultConfig(DefaultButtonConfigurationProperty(defaultConfig))

      /**
       * @param ios Optional button configuration to use for in-app messages sent to iOS devices.
       * This button configuration overrides the default button configuration.
       */
      override fun ios(ios: IResolvable) {
        cdkBuilder.ios(ios.let(IResolvable::unwrap))
      }

      /**
       * @param ios Optional button configuration to use for in-app messages sent to iOS devices.
       * This button configuration overrides the default button configuration.
       */
      override fun ios(ios: OverrideButtonConfigurationProperty) {
        cdkBuilder.ios(ios.let(OverrideButtonConfigurationProperty::unwrap))
      }

      /**
       * @param ios Optional button configuration to use for in-app messages sent to iOS devices.
       * This button configuration overrides the default button configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0aea58ea9a80bca6bf68327d5ce114eee486702e9606d34ca4290f7daa88296")
      override fun ios(ios: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          ios(OverrideButtonConfigurationProperty(ios))

      /**
       * @param web Optional button configuration to use for in-app messages sent to web
       * applications.
       * This button configuration overrides the default button configuration.
       */
      override fun web(web: IResolvable) {
        cdkBuilder.web(web.let(IResolvable::unwrap))
      }

      /**
       * @param web Optional button configuration to use for in-app messages sent to web
       * applications.
       * This button configuration overrides the default button configuration.
       */
      override fun web(web: OverrideButtonConfigurationProperty) {
        cdkBuilder.web(web.let(OverrideButtonConfigurationProperty::unwrap))
      }

      /**
       * @param web Optional button configuration to use for in-app messages sent to web
       * applications.
       * This button configuration overrides the default button configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b1ad297153e0dea8130af040c61521e27aff5bf44f0addd08ce7d1876021523")
      override fun web(web: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          web(OverrideButtonConfigurationProperty(web))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty,
    ) : CdkObject(cdkObject), ButtonConfigProperty {
      /**
       * Optional button configuration to use for in-app messages sent to Android devices.
       *
       * This button configuration overrides the default button configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html#cfn-pinpoint-inapptemplate-buttonconfig-android)
       */
      override fun android(): Any? = unwrap(this).getAndroid()

      /**
       * Specifies the default behavior of a button that appears in an in-app message.
       *
       * You can optionally add button configurations that specifically apply to iOS, Android, or
       * web browser users.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html#cfn-pinpoint-inapptemplate-buttonconfig-defaultconfig)
       */
      override fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

      /**
       * Optional button configuration to use for in-app messages sent to iOS devices.
       *
       * This button configuration overrides the default button configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html#cfn-pinpoint-inapptemplate-buttonconfig-ios)
       */
      override fun ios(): Any? = unwrap(this).getIos()

      /**
       * Optional button configuration to use for in-app messages sent to web applications.
       *
       * This button configuration overrides the default button configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-inapptemplate-buttonconfig.html#cfn-pinpoint-inapptemplate-buttonconfig-web)
       */
      override fun web(): Any? = unwrap(this).getWeb()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ButtonConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty):
          ButtonConfigProperty = CdkObjectWrappers.wrap(cdkObject) as ButtonConfigProperty

      internal fun unwrap(wrapped: ButtonConfigProperty):
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnInAppTemplate.ButtonConfigProperty
    }
  }
}
