@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPushTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * Object tags;
 * CfnPushTemplateProps cfnPushTemplateProps = CfnPushTemplateProps.builder()
 * .templateName("templateName")
 * // the properties below are optional
 * .adm(AndroidPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageUrl("imageUrl")
 * .smallImageIconUrl("smallImageIconUrl")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build())
 * .apns(APNSPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .mediaUrl("mediaUrl")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build())
 * .baidu(AndroidPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageUrl("imageUrl")
 * .smallImageIconUrl("smallImageIconUrl")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build())
 * .default(DefaultPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build())
 * .defaultSubstitutions("defaultSubstitutions")
 * .gcm(AndroidPushNotificationTemplateProperty.builder()
 * .action("action")
 * .body("body")
 * .imageIconUrl("imageIconUrl")
 * .imageUrl("imageUrl")
 * .smallImageIconUrl("smallImageIconUrl")
 * .sound("sound")
 * .title("title")
 * .url("url")
 * .build())
 * .tags(tags)
 * .templateDescription("templateDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html)
 */
public interface CfnPushTemplateProps {
  /**
   * The message template to use for the ADM (Amazon Device Messaging) channel.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-adm)
   */
  public fun adm(): Any? = unwrap(this).getAdm()

  /**
   * The message template to use for the APNs (Apple Push Notification service) channel.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-apns)
   */
  public fun apns(): Any? = unwrap(this).getApns()

  /**
   * The message template to use for the Baidu (Baidu Cloud Push) channel.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-baidu)
   */
  public fun baidu(): Any? = unwrap(this).getBaidu()

  /**
   * A JSON object that specifies the default values to use for message variables in the message
   * template.
   *
   * This object is a set of key-value pairs. Each key defines a message variable in the template.
   * The corresponding value defines the default value for that variable. When you create a message
   * that's based on the template, you can override these defaults with message-specific and
   * address-specific variables and values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-defaultsubstitutions)
   */
  public fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

  /**
   * The default message template to use for push notification channels.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-default)
   */
  public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

  /**
   * The message template to use for the GCM channel, which is used to send notifications through
   * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
   *
   * This message template overrides the default template for push notification channels ( `Default`
   * ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-gcm)
   */
  public fun gcm(): Any? = unwrap(this).getGcm()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A custom description of the message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatedescription)
   */
  public fun templateDescription(): String? = unwrap(this).getTemplateDescription()

  /**
   * The name of the message template to use for the message.
   *
   * If specified, this value must match the name of an existing message template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatename)
   */
  public fun templateName(): String

  /**
   * A builder for [CfnPushTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    public fun adm(adm: IResolvable)

    /**
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    public fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty)

    /**
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b95a5cc9a26ee4236f57589353c12efa7d4689b7333b1164940dce415244f7fe")
    public fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

    /**
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    public fun apns(apns: IResolvable)

    /**
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    public fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty)

    /**
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("140fe6aaa3b7fcedb1514f88b9eed4f44f6e4ce11f306c55a26909382e8253e8")
    public fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty.Builder.() -> Unit)

    /**
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    public fun baidu(baidu: IResolvable)

    /**
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    public fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty)

    /**
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7891851045ad24b6beddf38bca495a87e2e09fa66092605aa695058504c584ad")
    public
        fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

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
     * @param defaultValue The default message template to use for push notification channels.
     */
    public fun defaultValue(defaultValue: IResolvable)

    /**
     * @param defaultValue The default message template to use for push notification channels.
     */
    public fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty)

    /**
     * @param defaultValue The default message template to use for push notification channels.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78b17775c310d8a9a49630ab206f326aa7edb82f87db0145dceda18ac73b81fa")
    public
        fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty.Builder.() -> Unit)

    /**
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    public fun gcm(gcm: IResolvable)

    /**
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    public fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty)

    /**
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9f8a4b02a981bf8d3f22c523e365181ff7a689420b198807a43963e762bcecb")
    public fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

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
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps.builder()

    /**
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    override fun adm(adm: IResolvable) {
      cdkBuilder.adm(adm.let(IResolvable::unwrap))
    }

    /**
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    override fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
      cdkBuilder.adm(adm.let(CfnPushTemplate.AndroidPushNotificationTemplateProperty::unwrap))
    }

    /**
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b95a5cc9a26ee4236f57589353c12efa7d4689b7333b1164940dce415244f7fe")
    override
        fun adm(adm: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = adm(CfnPushTemplate.AndroidPushNotificationTemplateProperty(adm))

    /**
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    override fun apns(apns: IResolvable) {
      cdkBuilder.apns(apns.let(IResolvable::unwrap))
    }

    /**
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    override fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty) {
      cdkBuilder.apns(apns.let(CfnPushTemplate.APNSPushNotificationTemplateProperty::unwrap))
    }

    /**
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("140fe6aaa3b7fcedb1514f88b9eed4f44f6e4ce11f306c55a26909382e8253e8")
    override
        fun apns(apns: CfnPushTemplate.APNSPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = apns(CfnPushTemplate.APNSPushNotificationTemplateProperty(apns))

    /**
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    override fun baidu(baidu: IResolvable) {
      cdkBuilder.baidu(baidu.let(IResolvable::unwrap))
    }

    /**
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    override fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
      cdkBuilder.baidu(baidu.let(CfnPushTemplate.AndroidPushNotificationTemplateProperty::unwrap))
    }

    /**
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7891851045ad24b6beddf38bca495a87e2e09fa66092605aa695058504c584ad")
    override
        fun baidu(baidu: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = baidu(CfnPushTemplate.AndroidPushNotificationTemplateProperty(baidu))

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
     * @param defaultValue The default message template to use for push notification channels.
     */
    override fun defaultValue(defaultValue: IResolvable) {
      cdkBuilder.defaultValue(defaultValue.let(IResolvable::unwrap))
    }

    /**
     * @param defaultValue The default message template to use for push notification channels.
     */
    override
        fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty) {
      cdkBuilder.defaultValue(defaultValue.let(CfnPushTemplate.DefaultPushNotificationTemplateProperty::unwrap))
    }

    /**
     * @param defaultValue The default message template to use for push notification channels.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78b17775c310d8a9a49630ab206f326aa7edb82f87db0145dceda18ac73b81fa")
    override
        fun defaultValue(defaultValue: CfnPushTemplate.DefaultPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = defaultValue(CfnPushTemplate.DefaultPushNotificationTemplateProperty(defaultValue))

    /**
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    override fun gcm(gcm: IResolvable) {
      cdkBuilder.gcm(gcm.let(IResolvable::unwrap))
    }

    /**
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    override fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty) {
      cdkBuilder.gcm(gcm.let(CfnPushTemplate.AndroidPushNotificationTemplateProperty::unwrap))
    }

    /**
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service.
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d9f8a4b02a981bf8d3f22c523e365181ff7a689420b198807a43963e762bcecb")
    override
        fun gcm(gcm: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = gcm(CfnPushTemplate.AndroidPushNotificationTemplateProperty(gcm))

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

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps,
  ) : CdkObject(cdkObject), CfnPushTemplateProps {
    /**
     * The message template to use for the ADM (Amazon Device Messaging) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-adm)
     */
    override fun adm(): Any? = unwrap(this).getAdm()

    /**
     * The message template to use for the APNs (Apple Push Notification service) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-apns)
     */
    override fun apns(): Any? = unwrap(this).getApns()

    /**
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-baidu)
     */
    override fun baidu(): Any? = unwrap(this).getBaidu()

    /**
     * A JSON object that specifies the default values to use for message variables in the message
     * template.
     *
     * This object is a set of key-value pairs. Each key defines a message variable in the template.
     * The corresponding value defines the default value for that variable. When you create a message
     * that's based on the template, you can override these defaults with message-specific and
     * address-specific variables and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-defaultsubstitutions)
     */
    override fun defaultSubstitutions(): String? = unwrap(this).getDefaultSubstitutions()

    /**
     * The default message template to use for push notification channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-default)
     */
    override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    /**
     * The message template to use for the GCM channel, which is used to send notifications through
     * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-gcm)
     */
    override fun gcm(): Any? = unwrap(this).getGcm()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * A custom description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatedescription)
     */
    override fun templateDescription(): String? = unwrap(this).getTemplateDescription()

    /**
     * The name of the message template to use for the message.
     *
     * If specified, this value must match the name of an existing message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatename)
     */
    override fun templateName(): String = unwrap(this).getTemplateName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPushTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps):
        CfnPushTemplateProps = CdkObjectWrappers.wrap(cdkObject) as CfnPushTemplateProps

    internal fun unwrap(wrapped: CfnPushTemplateProps):
        software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps
  }
}
