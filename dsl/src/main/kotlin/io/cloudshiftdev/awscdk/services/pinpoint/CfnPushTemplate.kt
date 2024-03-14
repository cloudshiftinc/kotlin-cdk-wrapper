package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPushTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The message template to use for the ADM (Amazon Device Messaging) channel.
   */
  public open fun adm(): Any? = unwrap(this).getAdm()

  /**
   * The message template to use for the ADM (Amazon Device Messaging) channel.
   */
  public open fun adm(`value`: IResolvable) {
    unwrap(this).setAdm(`value`.let(IResolvable::unwrap))
  }

  /**
   * The message template to use for the ADM (Amazon Device Messaging) channel.
   */
  public open fun adm(`value`: AndroidPushNotificationTemplateProperty) {
    unwrap(this).setAdm(`value`.let(AndroidPushNotificationTemplateProperty::unwrap))
  }

  /**
   * The message template to use for the ADM (Amazon Device Messaging) channel.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eed3a20e717391ab5658b831e90da84d5355e14108319e838487174a600cdfde")
  public open fun adm(`value`: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
      adm(AndroidPushNotificationTemplateProperty(`value`))

  /**
   * The message template to use for the APNs (Apple Push Notification service) channel.
   */
  public open fun apns(): Any? = unwrap(this).getApns()

  /**
   * The message template to use for the APNs (Apple Push Notification service) channel.
   */
  public open fun apns(`value`: IResolvable) {
    unwrap(this).setApns(`value`.let(IResolvable::unwrap))
  }

  /**
   * The message template to use for the APNs (Apple Push Notification service) channel.
   */
  public open fun apns(`value`: APNSPushNotificationTemplateProperty) {
    unwrap(this).setApns(`value`.let(APNSPushNotificationTemplateProperty::unwrap))
  }

  /**
   * The message template to use for the APNs (Apple Push Notification service) channel.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6ad4a6a4610a7e3a8656d2046a0ad3e6c7081860e2adc31a8878606945b1615a")
  public open fun apns(`value`: APNSPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
      apns(APNSPushNotificationTemplateProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the message template.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The message template to use for the Baidu (Baidu Cloud Push) channel.
   */
  public open fun baidu(): Any? = unwrap(this).getBaidu()

  /**
   * The message template to use for the Baidu (Baidu Cloud Push) channel.
   */
  public open fun baidu(`value`: IResolvable) {
    unwrap(this).setBaidu(`value`.let(IResolvable::unwrap))
  }

  /**
   * The message template to use for the Baidu (Baidu Cloud Push) channel.
   */
  public open fun baidu(`value`: AndroidPushNotificationTemplateProperty) {
    unwrap(this).setBaidu(`value`.let(AndroidPushNotificationTemplateProperty::unwrap))
  }

  /**
   * The message template to use for the Baidu (Baidu Cloud Push) channel.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("80a8b5508ce69984be81bd07da037946307620f8ef133d2e60f9cdbccd66ca84")
  public open fun baidu(`value`: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
      baidu(AndroidPushNotificationTemplateProperty(`value`))

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
   * The default message template to use for push notification channels.
   */
  public open fun defaultValue(): Any? = unwrap(this).getDefaultValue()

  /**
   * The default message template to use for push notification channels.
   */
  public open fun defaultValue(`value`: IResolvable) {
    unwrap(this).setDefaultValue(`value`.let(IResolvable::unwrap))
  }

  /**
   * The default message template to use for push notification channels.
   */
  public open fun defaultValue(`value`: DefaultPushNotificationTemplateProperty) {
    unwrap(this).setDefaultValue(`value`.let(DefaultPushNotificationTemplateProperty::unwrap))
  }

  /**
   * The default message template to use for push notification channels.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df2cad8caa72232a99237c6fb9f7f643d3e480414e76742b9ae7e069286f76dc")
  public open fun defaultValue(`value`: DefaultPushNotificationTemplateProperty.Builder.() -> Unit):
      Unit = defaultValue(DefaultPushNotificationTemplateProperty(`value`))

  /**
   * The message template to use for the GCM channel, which is used to send notifications through
   * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
   */
  public open fun gcm(): Any? = unwrap(this).getGcm()

  /**
   * The message template to use for the GCM channel, which is used to send notifications through
   * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
   */
  public open fun gcm(`value`: IResolvable) {
    unwrap(this).setGcm(`value`.let(IResolvable::unwrap))
  }

  /**
   * The message template to use for the GCM channel, which is used to send notifications through
   * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
   */
  public open fun gcm(`value`: AndroidPushNotificationTemplateProperty) {
    unwrap(this).setGcm(`value`.let(AndroidPushNotificationTemplateProperty::unwrap))
  }

  /**
   * The message template to use for the GCM channel, which is used to send notifications through
   * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("16cfa5ea489598eee94b863507b16e0e23cb8c52d0b26cb5107656703275580e")
  public open fun gcm(`value`: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
      gcm(AndroidPushNotificationTemplateProperty(`value`))

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnPushTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The message template to use for the ADM (Amazon Device Messaging) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-adm)
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel. 
     */
    public fun adm(adm: IResolvable)

    /**
     * The message template to use for the ADM (Amazon Device Messaging) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-adm)
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel. 
     */
    public fun adm(adm: AndroidPushNotificationTemplateProperty)

    /**
     * The message template to use for the ADM (Amazon Device Messaging) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-adm)
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8736366f826fa0836f98e7a8e80e2c65765a4cae20b41ac956584a4aabd373e9")
    public fun adm(adm: AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

    /**
     * The message template to use for the APNs (Apple Push Notification service) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-apns)
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel. 
     */
    public fun apns(apns: IResolvable)

    /**
     * The message template to use for the APNs (Apple Push Notification service) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-apns)
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel. 
     */
    public fun apns(apns: APNSPushNotificationTemplateProperty)

    /**
     * The message template to use for the APNs (Apple Push Notification service) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-apns)
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6067c22e38a120431f1532d54a94bf205ebfc2c03c6477a9a85f487751c2227")
    public fun apns(apns: APNSPushNotificationTemplateProperty.Builder.() -> Unit)

    /**
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-baidu)
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel. 
     */
    public fun baidu(baidu: IResolvable)

    /**
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-baidu)
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel. 
     */
    public fun baidu(baidu: AndroidPushNotificationTemplateProperty)

    /**
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-baidu)
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc694eece0399854bffddc89d3dbd2d5a139541583ffe80e340afa48420aa17d")
    public fun baidu(baidu: AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

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
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     * message variables in the message template. 
     */
    public fun defaultSubstitutions(defaultSubstitutions: String)

    /**
     * The default message template to use for push notification channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-default)
     * @param defaultValue The default message template to use for push notification channels. 
     */
    public fun defaultValue(defaultValue: IResolvable)

    /**
     * The default message template to use for push notification channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-default)
     * @param defaultValue The default message template to use for push notification channels. 
     */
    public fun defaultValue(defaultValue: DefaultPushNotificationTemplateProperty)

    /**
     * The default message template to use for push notification channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-default)
     * @param defaultValue The default message template to use for push notification channels. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405c89e1287eef14060f58aac5cd607ec014bc5df4ea14ee5bc8927aa537d9e3")
    public
        fun defaultValue(defaultValue: DefaultPushNotificationTemplateProperty.Builder.() -> Unit)

    /**
     * The message template to use for the GCM channel, which is used to send notifications through
     * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-gcm)
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service. 
     */
    public fun gcm(gcm: IResolvable)

    /**
     * The message template to use for the GCM channel, which is used to send notifications through
     * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-gcm)
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service. 
     */
    public fun gcm(gcm: AndroidPushNotificationTemplateProperty)

    /**
     * The message template to use for the GCM channel, which is used to send notifications through
     * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-gcm)
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("703a749ec0a76a9c29c8ea53fe8c0b07876271194c7561f4d225d88d9cb8ab2a")
    public fun gcm(gcm: AndroidPushNotificationTemplateProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Any)

    /**
     * A custom description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatedescription)
     * @param templateDescription A custom description of the message template. 
     */
    public fun templateDescription(templateDescription: String)

    /**
     * The name of the message template to use for the message.
     *
     * If specified, this value must match the name of an existing message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatename)
     * @param templateName The name of the message template to use for the message. 
     */
    public fun templateName(templateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnPushTemplate.Builder =
        software.amazon.awscdk.services.pinpoint.CfnPushTemplate.Builder.create(scope, id)

    /**
     * The message template to use for the ADM (Amazon Device Messaging) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-adm)
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel. 
     */
    override fun adm(adm: IResolvable) {
      cdkBuilder.adm(adm.let(IResolvable::unwrap))
    }

    /**
     * The message template to use for the ADM (Amazon Device Messaging) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-adm)
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel. 
     */
    override fun adm(adm: AndroidPushNotificationTemplateProperty) {
      cdkBuilder.adm(adm.let(AndroidPushNotificationTemplateProperty::unwrap))
    }

    /**
     * The message template to use for the ADM (Amazon Device Messaging) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-adm)
     * @param adm The message template to use for the ADM (Amazon Device Messaging) channel. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8736366f826fa0836f98e7a8e80e2c65765a4cae20b41ac956584a4aabd373e9")
    override fun adm(adm: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
        adm(AndroidPushNotificationTemplateProperty(adm))

    /**
     * The message template to use for the APNs (Apple Push Notification service) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-apns)
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel. 
     */
    override fun apns(apns: IResolvable) {
      cdkBuilder.apns(apns.let(IResolvable::unwrap))
    }

    /**
     * The message template to use for the APNs (Apple Push Notification service) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-apns)
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel. 
     */
    override fun apns(apns: APNSPushNotificationTemplateProperty) {
      cdkBuilder.apns(apns.let(APNSPushNotificationTemplateProperty::unwrap))
    }

    /**
     * The message template to use for the APNs (Apple Push Notification service) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-apns)
     * @param apns The message template to use for the APNs (Apple Push Notification service)
     * channel. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6067c22e38a120431f1532d54a94bf205ebfc2c03c6477a9a85f487751c2227")
    override fun apns(apns: APNSPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
        apns(APNSPushNotificationTemplateProperty(apns))

    /**
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-baidu)
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel. 
     */
    override fun baidu(baidu: IResolvable) {
      cdkBuilder.baidu(baidu.let(IResolvable::unwrap))
    }

    /**
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-baidu)
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel. 
     */
    override fun baidu(baidu: AndroidPushNotificationTemplateProperty) {
      cdkBuilder.baidu(baidu.let(AndroidPushNotificationTemplateProperty::unwrap))
    }

    /**
     * The message template to use for the Baidu (Baidu Cloud Push) channel.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-baidu)
     * @param baidu The message template to use for the Baidu (Baidu Cloud Push) channel. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc694eece0399854bffddc89d3dbd2d5a139541583ffe80e340afa48420aa17d")
    override fun baidu(baidu: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
        baidu(AndroidPushNotificationTemplateProperty(baidu))

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
     * @param defaultSubstitutions A JSON object that specifies the default values to use for
     * message variables in the message template. 
     */
    override fun defaultSubstitutions(defaultSubstitutions: String) {
      cdkBuilder.defaultSubstitutions(defaultSubstitutions)
    }

    /**
     * The default message template to use for push notification channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-default)
     * @param defaultValue The default message template to use for push notification channels. 
     */
    override fun defaultValue(defaultValue: IResolvable) {
      cdkBuilder.defaultValue(defaultValue.let(IResolvable::unwrap))
    }

    /**
     * The default message template to use for push notification channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-default)
     * @param defaultValue The default message template to use for push notification channels. 
     */
    override fun defaultValue(defaultValue: DefaultPushNotificationTemplateProperty) {
      cdkBuilder.defaultValue(defaultValue.let(DefaultPushNotificationTemplateProperty::unwrap))
    }

    /**
     * The default message template to use for push notification channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-default)
     * @param defaultValue The default message template to use for push notification channels. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405c89e1287eef14060f58aac5cd607ec014bc5df4ea14ee5bc8927aa537d9e3")
    override
        fun defaultValue(defaultValue: DefaultPushNotificationTemplateProperty.Builder.() -> Unit):
        Unit = defaultValue(DefaultPushNotificationTemplateProperty(defaultValue))

    /**
     * The message template to use for the GCM channel, which is used to send notifications through
     * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-gcm)
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service. 
     */
    override fun gcm(gcm: IResolvable) {
      cdkBuilder.gcm(gcm.let(IResolvable::unwrap))
    }

    /**
     * The message template to use for the GCM channel, which is used to send notifications through
     * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-gcm)
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service. 
     */
    override fun gcm(gcm: AndroidPushNotificationTemplateProperty) {
      cdkBuilder.gcm(gcm.let(AndroidPushNotificationTemplateProperty::unwrap))
    }

    /**
     * The message template to use for the GCM channel, which is used to send notifications through
     * the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *
     * This message template overrides the default template for push notification channels (
     * `Default` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-gcm)
     * @param gcm The message template to use for the GCM channel, which is used to send
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM),
     * service. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("703a749ec0a76a9c29c8ea53fe8c0b07876271194c7561f4d225d88d9cb8ab2a")
    override fun gcm(gcm: AndroidPushNotificationTemplateProperty.Builder.() -> Unit): Unit =
        gcm(AndroidPushNotificationTemplateProperty(gcm))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * A custom description of the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatedescription)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-pushtemplate.html#cfn-pinpoint-pushtemplate-templatename)
     * @param templateName The name of the message template to use for the message. 
     */
    override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnPushTemplate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPushTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPushTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplate):
        CfnPushTemplate = CfnPushTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnPushTemplate):
        software.amazon.awscdk.services.pinpoint.CfnPushTemplate = wrapped.cdkObject
  }

  public interface DefaultPushNotificationTemplateProperty {
    /**
     * The action to occur if a recipient taps a push notification that's based on the message
     * template.
     *
     * Valid values are:
     *
     * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
     * background. This is the default action.
     * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
     * setting uses the deep-linking features of the iOS and Android platforms.
     * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
     * at a URL that you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-defaultpushnotificationtemplate-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * The message body to use in push notifications that are based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-defaultpushnotificationtemplate-body)
     */
    public fun body(): String? = unwrap(this).getBody()

    /**
     * The sound to play when a recipient receives a push notification that's based on the message
     * template.
     *
     * You can use the default stream or specify the file name of a sound resource that's bundled in
     * your app. On an Android platform, the sound file must reside in `/res/raw/` .
     *
     * For an iOS platform, this value is the key for the name of a sound file in your app's main
     * bundle or the `Library/Sounds` folder in your app's data container. If the sound file can't be
     * found or you specify `default` for the value, the system plays the default alert sound.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-defaultpushnotificationtemplate-sound)
     */
    public fun sound(): String? = unwrap(this).getSound()

    /**
     * The title to use in push notifications that are based on the message template.
     *
     * This title appears above the notification message on a recipient's device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-defaultpushnotificationtemplate-title)
     */
    public fun title(): String? = unwrap(this).getTitle()

    /**
     * The URL to open in a recipient's default mobile browser, if a recipient taps a push
     * notification that's based on the message template and the value of the `Action` property is
     * `URL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-defaultpushnotificationtemplate-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [DefaultPushNotificationTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action to occur if a recipient taps a push notification that's based on
       * the message template.
       * Valid values are:
       *
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * setting uses the deep-linking features of the iOS and Android platforms.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       */
      public fun action(action: String)

      /**
       * @param body The message body to use in push notifications that are based on the message
       * template.
       */
      public fun body(body: String)

      /**
       * @param sound The sound to play when a recipient receives a push notification that's based
       * on the message template.
       * You can use the default stream or specify the file name of a sound resource that's bundled
       * in your app. On an Android platform, the sound file must reside in `/res/raw/` .
       *
       * For an iOS platform, this value is the key for the name of a sound file in your app's main
       * bundle or the `Library/Sounds` folder in your app's data container. If the sound file can't be
       * found or you specify `default` for the value, the system plays the default alert sound.
       */
      public fun sound(sound: String)

      /**
       * @param title The title to use in push notifications that are based on the message template.
       * This title appears above the notification message on a recipient's device.
       */
      public fun title(title: String)

      /**
       * @param url The URL to open in a recipient's default mobile browser, if a recipient taps a
       * push notification that's based on the message template and the value of the `Action` property
       * is `URL` .
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty.builder()

      /**
       * @param action The action to occur if a recipient taps a push notification that's based on
       * the message template.
       * Valid values are:
       *
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * setting uses the deep-linking features of the iOS and Android platforms.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param body The message body to use in push notifications that are based on the message
       * template.
       */
      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      /**
       * @param sound The sound to play when a recipient receives a push notification that's based
       * on the message template.
       * You can use the default stream or specify the file name of a sound resource that's bundled
       * in your app. On an Android platform, the sound file must reside in `/res/raw/` .
       *
       * For an iOS platform, this value is the key for the name of a sound file in your app's main
       * bundle or the `Library/Sounds` folder in your app's data container. If the sound file can't be
       * found or you specify `default` for the value, the system plays the default alert sound.
       */
      override fun sound(sound: String) {
        cdkBuilder.sound(sound)
      }

      /**
       * @param title The title to use in push notifications that are based on the message template.
       * This title appears above the notification message on a recipient's device.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      /**
       * @param url The URL to open in a recipient's default mobile browser, if a recipient taps a
       * push notification that's based on the message template and the value of the `Action` property
       * is `URL` .
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty,
    ) : DefaultPushNotificationTemplateProperty {
      /**
       * The action to occur if a recipient taps a push notification that's based on the message
       * template.
       *
       * Valid values are:
       *
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * setting uses the deep-linking features of the iOS and Android platforms.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-defaultpushnotificationtemplate-action)
       */
      override fun action(): String? = unwrap(this).getAction()

      /**
       * The message body to use in push notifications that are based on the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-defaultpushnotificationtemplate-body)
       */
      override fun body(): String? = unwrap(this).getBody()

      /**
       * The sound to play when a recipient receives a push notification that's based on the message
       * template.
       *
       * You can use the default stream or specify the file name of a sound resource that's bundled
       * in your app. On an Android platform, the sound file must reside in `/res/raw/` .
       *
       * For an iOS platform, this value is the key for the name of a sound file in your app's main
       * bundle or the `Library/Sounds` folder in your app's data container. If the sound file can't be
       * found or you specify `default` for the value, the system plays the default alert sound.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-defaultpushnotificationtemplate-sound)
       */
      override fun sound(): String? = unwrap(this).getSound()

      /**
       * The title to use in push notifications that are based on the message template.
       *
       * This title appears above the notification message on a recipient's device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-defaultpushnotificationtemplate-title)
       */
      override fun title(): String? = unwrap(this).getTitle()

      /**
       * The URL to open in a recipient's default mobile browser, if a recipient taps a push
       * notification that's based on the message template and the value of the `Action` property is
       * `URL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-defaultpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-defaultpushnotificationtemplate-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultPushNotificationTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty):
          DefaultPushNotificationTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultPushNotificationTemplateProperty):
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.DefaultPushNotificationTemplateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AndroidPushNotificationTemplateProperty {
    /**
     * The action to occur if a recipient taps a push notification that's based on the message
     * template.
     *
     * Valid values are:
     *
     * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
     * background. This is the default action.
     * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
     * action uses the deep-linking features of the Android platform.
     * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
     * at a URL that you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * The message body to use in a push notification that's based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-body)
     */
    public fun body(): String? = unwrap(this).getBody()

    /**
     * The URL of the large icon image to display in the content view of a push notification that's
     * based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageiconurl)
     */
    public fun imageIconUrl(): String? = unwrap(this).getImageIconUrl()

    /**
     * The URL of an image to display in a push notification that's based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageurl)
     */
    public fun imageUrl(): String? = unwrap(this).getImageUrl()

    /**
     * The URL of the small icon image to display in the status bar and the content view of a push
     * notification that's based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-smallimageiconurl)
     */
    public fun smallImageIconUrl(): String? = unwrap(this).getSmallImageIconUrl()

    /**
     * The sound to play when a recipient receives a push notification that's based on the message
     * template.
     *
     * You can use the default stream or specify the file name of a sound resource that's bundled in
     * your app. On an Android platform, the sound file must reside in `/res/raw/` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-sound)
     */
    public fun sound(): String? = unwrap(this).getSound()

    /**
     * The title to use in a push notification that's based on the message template.
     *
     * This title appears above the notification message on a recipient's device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-title)
     */
    public fun title(): String? = unwrap(this).getTitle()

    /**
     * The URL to open in a recipient's default mobile browser, if a recipient taps a push
     * notification that's based on the message template and the value of the `Action` property is
     * `URL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [AndroidPushNotificationTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action to occur if a recipient taps a push notification that's based on
       * the message template.
       * Valid values are:
       *
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * action uses the deep-linking features of the Android platform.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       */
      public fun action(action: String)

      /**
       * @param body The message body to use in a push notification that's based on the message
       * template.
       */
      public fun body(body: String)

      /**
       * @param imageIconUrl The URL of the large icon image to display in the content view of a
       * push notification that's based on the message template.
       */
      public fun imageIconUrl(imageIconUrl: String)

      /**
       * @param imageUrl The URL of an image to display in a push notification that's based on the
       * message template.
       */
      public fun imageUrl(imageUrl: String)

      /**
       * @param smallImageIconUrl The URL of the small icon image to display in the status bar and
       * the content view of a push notification that's based on the message template.
       */
      public fun smallImageIconUrl(smallImageIconUrl: String)

      /**
       * @param sound The sound to play when a recipient receives a push notification that's based
       * on the message template.
       * You can use the default stream or specify the file name of a sound resource that's bundled
       * in your app. On an Android platform, the sound file must reside in `/res/raw/` .
       */
      public fun sound(sound: String)

      /**
       * @param title The title to use in a push notification that's based on the message template.
       * This title appears above the notification message on a recipient's device.
       */
      public fun title(title: String)

      /**
       * @param url The URL to open in a recipient's default mobile browser, if a recipient taps a
       * push notification that's based on the message template and the value of the `Action` property
       * is `URL` .
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty.builder()

      /**
       * @param action The action to occur if a recipient taps a push notification that's based on
       * the message template.
       * Valid values are:
       *
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * action uses the deep-linking features of the Android platform.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param body The message body to use in a push notification that's based on the message
       * template.
       */
      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      /**
       * @param imageIconUrl The URL of the large icon image to display in the content view of a
       * push notification that's based on the message template.
       */
      override fun imageIconUrl(imageIconUrl: String) {
        cdkBuilder.imageIconUrl(imageIconUrl)
      }

      /**
       * @param imageUrl The URL of an image to display in a push notification that's based on the
       * message template.
       */
      override fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
      }

      /**
       * @param smallImageIconUrl The URL of the small icon image to display in the status bar and
       * the content view of a push notification that's based on the message template.
       */
      override fun smallImageIconUrl(smallImageIconUrl: String) {
        cdkBuilder.smallImageIconUrl(smallImageIconUrl)
      }

      /**
       * @param sound The sound to play when a recipient receives a push notification that's based
       * on the message template.
       * You can use the default stream or specify the file name of a sound resource that's bundled
       * in your app. On an Android platform, the sound file must reside in `/res/raw/` .
       */
      override fun sound(sound: String) {
        cdkBuilder.sound(sound)
      }

      /**
       * @param title The title to use in a push notification that's based on the message template.
       * This title appears above the notification message on a recipient's device.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      /**
       * @param url The URL to open in a recipient's default mobile browser, if a recipient taps a
       * push notification that's based on the message template and the value of the `Action` property
       * is `URL` .
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty,
    ) : AndroidPushNotificationTemplateProperty {
      /**
       * The action to occur if a recipient taps a push notification that's based on the message
       * template.
       *
       * Valid values are:
       *
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * action uses the deep-linking features of the Android platform.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-action)
       */
      override fun action(): String? = unwrap(this).getAction()

      /**
       * The message body to use in a push notification that's based on the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-body)
       */
      override fun body(): String? = unwrap(this).getBody()

      /**
       * The URL of the large icon image to display in the content view of a push notification
       * that's based on the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageiconurl)
       */
      override fun imageIconUrl(): String? = unwrap(this).getImageIconUrl()

      /**
       * The URL of an image to display in a push notification that's based on the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-imageurl)
       */
      override fun imageUrl(): String? = unwrap(this).getImageUrl()

      /**
       * The URL of the small icon image to display in the status bar and the content view of a push
       * notification that's based on the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-smallimageiconurl)
       */
      override fun smallImageIconUrl(): String? = unwrap(this).getSmallImageIconUrl()

      /**
       * The sound to play when a recipient receives a push notification that's based on the message
       * template.
       *
       * You can use the default stream or specify the file name of a sound resource that's bundled
       * in your app. On an Android platform, the sound file must reside in `/res/raw/` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-sound)
       */
      override fun sound(): String? = unwrap(this).getSound()

      /**
       * The title to use in a push notification that's based on the message template.
       *
       * This title appears above the notification message on a recipient's device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-title)
       */
      override fun title(): String? = unwrap(this).getTitle()

      /**
       * The URL to open in a recipient's default mobile browser, if a recipient taps a push
       * notification that's based on the message template and the value of the `Action` property is
       * `URL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-androidpushnotificationtemplate.html#cfn-pinpoint-pushtemplate-androidpushnotificationtemplate-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AndroidPushNotificationTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty):
          AndroidPushNotificationTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AndroidPushNotificationTemplateProperty):
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.AndroidPushNotificationTemplateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface APNSPushNotificationTemplateProperty {
    /**
     * The action to occur if a recipient taps a push notification that's based on the message
     * template.
     *
     * Valid values are:
     *
     * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
     * background. This is the default action.
     * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
     * setting uses the deep-linking features of the iOS platform.
     * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
     * at a URL that you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-action)
     */
    public fun action(): String? = unwrap(this).getAction()

    /**
     * The message body to use in push notifications that are based on the message template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-body)
     */
    public fun body(): String? = unwrap(this).getBody()

    /**
     * The URL of an image or video to display in push notifications that are based on the message
     * template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-mediaurl)
     */
    public fun mediaUrl(): String? = unwrap(this).getMediaUrl()

    /**
     * The key for the sound to play when the recipient receives a push notification that's based on
     * the message template.
     *
     * The value for this key is the name of a sound file in your app's main bundle or the
     * `Library/Sounds` folder in your app's data container. If the sound file can't be found or you
     * specify `default` for the value, the system plays the default alert sound.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-sound)
     */
    public fun sound(): String? = unwrap(this).getSound()

    /**
     * The title to use in push notifications that are based on the message template.
     *
     * This title appears above the notification message on a recipient's device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-title)
     */
    public fun title(): String? = unwrap(this).getTitle()

    /**
     * The URL to open in the recipient's default mobile browser, if a recipient taps a push
     * notification that's based on the message template and the value of the `Action` property is
     * `URL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [APNSPushNotificationTemplateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action to occur if a recipient taps a push notification that's based on
       * the message template.
       * Valid values are:
       *
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * setting uses the deep-linking features of the iOS platform.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       */
      public fun action(action: String)

      /**
       * @param body The message body to use in push notifications that are based on the message
       * template.
       */
      public fun body(body: String)

      /**
       * @param mediaUrl The URL of an image or video to display in push notifications that are
       * based on the message template.
       */
      public fun mediaUrl(mediaUrl: String)

      /**
       * @param sound The key for the sound to play when the recipient receives a push notification
       * that's based on the message template.
       * The value for this key is the name of a sound file in your app's main bundle or the
       * `Library/Sounds` folder in your app's data container. If the sound file can't be found or you
       * specify `default` for the value, the system plays the default alert sound.
       */
      public fun sound(sound: String)

      /**
       * @param title The title to use in push notifications that are based on the message template.
       * This title appears above the notification message on a recipient's device.
       */
      public fun title(title: String)

      /**
       * @param url The URL to open in the recipient's default mobile browser, if a recipient taps a
       * push notification that's based on the message template and the value of the `Action` property
       * is `URL` .
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty.builder()

      /**
       * @param action The action to occur if a recipient taps a push notification that's based on
       * the message template.
       * Valid values are:
       *
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * setting uses the deep-linking features of the iOS platform.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param body The message body to use in push notifications that are based on the message
       * template.
       */
      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      /**
       * @param mediaUrl The URL of an image or video to display in push notifications that are
       * based on the message template.
       */
      override fun mediaUrl(mediaUrl: String) {
        cdkBuilder.mediaUrl(mediaUrl)
      }

      /**
       * @param sound The key for the sound to play when the recipient receives a push notification
       * that's based on the message template.
       * The value for this key is the name of a sound file in your app's main bundle or the
       * `Library/Sounds` folder in your app's data container. If the sound file can't be found or you
       * specify `default` for the value, the system plays the default alert sound.
       */
      override fun sound(sound: String) {
        cdkBuilder.sound(sound)
      }

      /**
       * @param title The title to use in push notifications that are based on the message template.
       * This title appears above the notification message on a recipient's device.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      /**
       * @param url The URL to open in the recipient's default mobile browser, if a recipient taps a
       * push notification that's based on the message template and the value of the `Action` property
       * is `URL` .
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty,
    ) : APNSPushNotificationTemplateProperty {
      /**
       * The action to occur if a recipient taps a push notification that's based on the message
       * template.
       *
       * Valid values are:
       *
       * * `OPEN_APP` – Your app opens or it becomes the foreground app if it was sent to the
       * background. This is the default action.
       * * `DEEP_LINK` – Your app opens and displays a designated user interface in the app. This
       * setting uses the deep-linking features of the iOS platform.
       * * `URL` – The default mobile browser on the recipient's device opens and loads the web page
       * at a URL that you specify.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-action)
       */
      override fun action(): String? = unwrap(this).getAction()

      /**
       * The message body to use in push notifications that are based on the message template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-body)
       */
      override fun body(): String? = unwrap(this).getBody()

      /**
       * The URL of an image or video to display in push notifications that are based on the message
       * template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-mediaurl)
       */
      override fun mediaUrl(): String? = unwrap(this).getMediaUrl()

      /**
       * The key for the sound to play when the recipient receives a push notification that's based
       * on the message template.
       *
       * The value for this key is the name of a sound file in your app's main bundle or the
       * `Library/Sounds` folder in your app's data container. If the sound file can't be found or you
       * specify `default` for the value, the system plays the default alert sound.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-sound)
       */
      override fun sound(): String? = unwrap(this).getSound()

      /**
       * The title to use in push notifications that are based on the message template.
       *
       * This title appears above the notification message on a recipient's device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-title)
       */
      override fun title(): String? = unwrap(this).getTitle()

      /**
       * The URL to open in the recipient's default mobile browser, if a recipient taps a push
       * notification that's based on the message template and the value of the `Action` property is
       * `URL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-pushtemplate-apnspushnotificationtemplate.html#cfn-pinpoint-pushtemplate-apnspushnotificationtemplate-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          APNSPushNotificationTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty):
          APNSPushNotificationTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: APNSPushNotificationTemplateProperty):
          software.amazon.awscdk.services.pinpoint.CfnPushTemplate.APNSPushNotificationTemplateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
