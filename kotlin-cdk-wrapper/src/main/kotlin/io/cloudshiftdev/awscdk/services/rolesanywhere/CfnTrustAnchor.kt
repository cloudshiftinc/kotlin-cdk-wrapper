@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rolesanywhere

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a TrustAnchor.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rolesanywhere.*;
 * CfnTrustAnchor cfnTrustAnchor = CfnTrustAnchor.Builder.create(this, "MyCfnTrustAnchor")
 * .name("name")
 * .source(SourceProperty.builder()
 * .sourceData(SourceDataProperty.builder()
 * .acmPcaArn("acmPcaArn")
 * .x509CertificateData("x509CertificateData")
 * .build())
 * .sourceType("sourceType")
 * .build())
 * // the properties below are optional
 * .enabled(false)
 * .notificationSettings(List.of(NotificationSettingProperty.builder()
 * .enabled(false)
 * .event("event")
 * // the properties below are optional
 * .channel("channel")
 * .threshold(123)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html)
 */
public open class CfnTrustAnchor internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the trust anchor.
   */
  public open fun attrTrustAnchorArn(): String = unwrap(this).getAttrTrustAnchorArn()

  /**
   * The unique identifier of the trust anchor.
   */
  public open fun attrTrustAnchorId(): String = unwrap(this).getAttrTrustAnchorId()

  /**
   * Indicates whether the trust anchor is enabled.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Indicates whether the trust anchor is enabled.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Indicates whether the trust anchor is enabled.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
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
   * The name of the trust anchor.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the trust anchor.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of notification settings to be associated to the trust anchor.
   */
  public open fun notificationSettings(): Any? = unwrap(this).getNotificationSettings()

  /**
   * A list of notification settings to be associated to the trust anchor.
   */
  public open fun notificationSettings(`value`: IResolvable) {
    unwrap(this).setNotificationSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of notification settings to be associated to the trust anchor.
   */
  public open fun notificationSettings(`value`: List<Any>) {
    unwrap(this).setNotificationSettings(`value`)
  }

  /**
   * A list of notification settings to be associated to the trust anchor.
   */
  public open fun notificationSettings(vararg `value`: Any): Unit =
      notificationSettings(`value`.toList())

  /**
   * The trust anchor type and its related certificate data.
   */
  public open fun source(): Any = unwrap(this).getSource()

  /**
   * The trust anchor type and its related certificate data.
   */
  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * The trust anchor type and its related certificate data.
   */
  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty::unwrap))
  }

  /**
   * The trust anchor type and its related certificate data.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e516ff46f9e2a15313b50a1d701f49e5feaa84eb47f6df45ffb20734355a5e5")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to attach to the trust anchor.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to attach to the trust anchor.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to attach to the trust anchor.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rolesanywhere.CfnTrustAnchor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether the trust anchor is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-enabled)
     * @param enabled Indicates whether the trust anchor is enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Indicates whether the trust anchor is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-enabled)
     * @param enabled Indicates whether the trust anchor is enabled. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * The name of the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-name)
     * @param name The name of the trust anchor. 
     */
    public fun name(name: String)

    /**
     * A list of notification settings to be associated to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-notificationsettings)
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor. 
     */
    public fun notificationSettings(notificationSettings: IResolvable)

    /**
     * A list of notification settings to be associated to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-notificationsettings)
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor. 
     */
    public fun notificationSettings(notificationSettings: List<Any>)

    /**
     * A list of notification settings to be associated to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-notificationsettings)
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor. 
     */
    public fun notificationSettings(vararg notificationSettings: Any)

    /**
     * The trust anchor type and its related certificate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-source)
     * @param source The trust anchor type and its related certificate data. 
     */
    public fun source(source: IResolvable)

    /**
     * The trust anchor type and its related certificate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-source)
     * @param source The trust anchor type and its related certificate data. 
     */
    public fun source(source: SourceProperty)

    /**
     * The trust anchor type and its related certificate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-source)
     * @param source The trust anchor type and its related certificate data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73cdafd30f11ea0f3f26b5a9a7461217ecb4f5a1582cd00a959b41f8cba00c28")
    public fun source(source: SourceProperty.Builder.() -> Unit)

    /**
     * The tags to attach to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-tags)
     * @param tags The tags to attach to the trust anchor. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to attach to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-tags)
     * @param tags The tags to attach to the trust anchor. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.Builder.create(scope, id)

    /**
     * Indicates whether the trust anchor is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-enabled)
     * @param enabled Indicates whether the trust anchor is enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Indicates whether the trust anchor is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-enabled)
     * @param enabled Indicates whether the trust anchor is enabled. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * The name of the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-name)
     * @param name The name of the trust anchor. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of notification settings to be associated to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-notificationsettings)
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor. 
     */
    override fun notificationSettings(notificationSettings: IResolvable) {
      cdkBuilder.notificationSettings(notificationSettings.let(IResolvable::unwrap))
    }

    /**
     * A list of notification settings to be associated to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-notificationsettings)
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor. 
     */
    override fun notificationSettings(notificationSettings: List<Any>) {
      cdkBuilder.notificationSettings(notificationSettings)
    }

    /**
     * A list of notification settings to be associated to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-notificationsettings)
     * @param notificationSettings A list of notification settings to be associated to the trust
     * anchor. 
     */
    override fun notificationSettings(vararg notificationSettings: Any): Unit =
        notificationSettings(notificationSettings.toList())

    /**
     * The trust anchor type and its related certificate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-source)
     * @param source The trust anchor type and its related certificate data. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    /**
     * The trust anchor type and its related certificate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-source)
     * @param source The trust anchor type and its related certificate data. 
     */
    override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty::unwrap))
    }

    /**
     * The trust anchor type and its related certificate data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-source)
     * @param source The trust anchor type and its related certificate data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73cdafd30f11ea0f3f26b5a9a7461217ecb4f5a1582cd00a959b41f8cba00c28")
    override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    /**
     * The tags to attach to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-tags)
     * @param tags The tags to attach to the trust anchor. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to attach to the trust anchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-trustanchor.html#cfn-rolesanywhere-trustanchor-tags)
     * @param tags The tags to attach to the trust anchor. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrustAnchor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrustAnchor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor):
        CfnTrustAnchor = CfnTrustAnchor(cdkObject)

    internal fun unwrap(wrapped: CfnTrustAnchor):
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor = wrapped.cdkObject
  }

  /**
   * A union object representing the data field of the TrustAnchor depending on its type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rolesanywhere.*;
   * SourceDataProperty sourceDataProperty = SourceDataProperty.builder()
   * .acmPcaArn("acmPcaArn")
   * .x509CertificateData("x509CertificateData")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-sourcedata.html)
   */
  public interface SourceDataProperty {
    /**
     * The root certificate of the AWS Private Certificate Authority specified by this ARN is used
     * in trust validation for temporary credential requests.
     *
     * Included for trust anchors of type `AWS_ACM_PCA` .
     *
     *
     * This field is not supported in your region.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-sourcedata.html#cfn-rolesanywhere-trustanchor-sourcedata-acmpcaarn)
     */
    public fun acmPcaArn(): String? = unwrap(this).getAcmPcaArn()

    /**
     * The PEM-encoded data for the certificate anchor.
     *
     * Included for trust anchors of type `CERTIFICATE_BUNDLE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-sourcedata.html#cfn-rolesanywhere-trustanchor-sourcedata-x509certificatedata)
     */
    public fun x509CertificateData(): String? = unwrap(this).getX509CertificateData()

    /**
     * A builder for [SourceDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acmPcaArn The root certificate of the AWS Private Certificate Authority specified by
       * this ARN is used in trust validation for temporary credential requests.
       * Included for trust anchors of type `AWS_ACM_PCA` .
       *
       *
       * This field is not supported in your region.
       */
      public fun acmPcaArn(acmPcaArn: String)

      /**
       * @param x509CertificateData The PEM-encoded data for the certificate anchor.
       * Included for trust anchors of type `CERTIFICATE_BUNDLE` .
       */
      public fun x509CertificateData(x509CertificateData: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty.Builder =
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty.builder()

      /**
       * @param acmPcaArn The root certificate of the AWS Private Certificate Authority specified by
       * this ARN is used in trust validation for temporary credential requests.
       * Included for trust anchors of type `AWS_ACM_PCA` .
       *
       *
       * This field is not supported in your region.
       */
      override fun acmPcaArn(acmPcaArn: String) {
        cdkBuilder.acmPcaArn(acmPcaArn)
      }

      /**
       * @param x509CertificateData The PEM-encoded data for the certificate anchor.
       * Included for trust anchors of type `CERTIFICATE_BUNDLE` .
       */
      override fun x509CertificateData(x509CertificateData: String) {
        cdkBuilder.x509CertificateData(x509CertificateData)
      }

      public fun build():
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty,
    ) : CdkObject(cdkObject), SourceDataProperty {
      /**
       * The root certificate of the AWS Private Certificate Authority specified by this ARN is used
       * in trust validation for temporary credential requests.
       *
       * Included for trust anchors of type `AWS_ACM_PCA` .
       *
       *
       * This field is not supported in your region.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-sourcedata.html#cfn-rolesanywhere-trustanchor-sourcedata-acmpcaarn)
       */
      override fun acmPcaArn(): String? = unwrap(this).getAcmPcaArn()

      /**
       * The PEM-encoded data for the certificate anchor.
       *
       * Included for trust anchors of type `CERTIFICATE_BUNDLE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-sourcedata.html#cfn-rolesanywhere-trustanchor-sourcedata-x509certificatedata)
       */
      override fun x509CertificateData(): String? = unwrap(this).getX509CertificateData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty):
          SourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceDataProperty):
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty
    }
  }

  /**
   * Customizable notification settings that will be applied to notification events.
   *
   * IAM Roles Anywhere consumes these settings while notifying across multiple channels -
   * CloudWatch metrics, EventBridge , and AWS Health Dashboard .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rolesanywhere.*;
   * NotificationSettingProperty notificationSettingProperty = NotificationSettingProperty.builder()
   * .enabled(false)
   * .event("event")
   * // the properties below are optional
   * .channel("channel")
   * .threshold(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-notificationsetting.html)
   */
  public interface NotificationSettingProperty {
    /**
     * The specified channel of notification.
     *
     * IAM Roles Anywhere uses CloudWatch metrics, EventBridge , and AWS Health Dashboard to notify
     * for an event.
     *
     *
     * In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL'
     * channels.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-notificationsetting.html#cfn-rolesanywhere-trustanchor-notificationsetting-channel)
     */
    public fun channel(): String? = unwrap(this).getChannel()

    /**
     * Indicates whether the notification setting is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-notificationsetting.html#cfn-rolesanywhere-trustanchor-notificationsetting-enabled)
     */
    public fun enabled(): Any

    /**
     * The event to which this notification setting is applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-notificationsetting.html#cfn-rolesanywhere-trustanchor-notificationsetting-event)
     */
    public fun event(): String

    /**
     * The number of days before a notification event.
     *
     * This value is required for a notification setting that is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-notificationsetting.html#cfn-rolesanywhere-trustanchor-notificationsetting-threshold)
     */
    public fun threshold(): Number? = unwrap(this).getThreshold()

    /**
     * A builder for [NotificationSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param channel The specified channel of notification.
       * IAM Roles Anywhere uses CloudWatch metrics, EventBridge , and AWS Health Dashboard to
       * notify for an event.
       *
       *
       * In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL'
       * channels.
       */
      public fun channel(channel: String)

      /**
       * @param enabled Indicates whether the notification setting is enabled. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether the notification setting is enabled. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param event The event to which this notification setting is applied. 
       */
      public fun event(event: String)

      /**
       * @param threshold The number of days before a notification event.
       * This value is required for a notification setting that is enabled.
       */
      public fun threshold(threshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty.Builder
          =
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty.builder()

      /**
       * @param channel The specified channel of notification.
       * IAM Roles Anywhere uses CloudWatch metrics, EventBridge , and AWS Health Dashboard to
       * notify for an event.
       *
       *
       * In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL'
       * channels.
       */
      override fun channel(channel: String) {
        cdkBuilder.channel(channel)
      }

      /**
       * @param enabled Indicates whether the notification setting is enabled. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether the notification setting is enabled. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param event The event to which this notification setting is applied. 
       */
      override fun event(event: String) {
        cdkBuilder.event(event)
      }

      /**
       * @param threshold The number of days before a notification event.
       * This value is required for a notification setting that is enabled.
       */
      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      public fun build():
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty,
    ) : CdkObject(cdkObject), NotificationSettingProperty {
      /**
       * The specified channel of notification.
       *
       * IAM Roles Anywhere uses CloudWatch metrics, EventBridge , and AWS Health Dashboard to
       * notify for an event.
       *
       *
       * In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL'
       * channels.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-notificationsetting.html#cfn-rolesanywhere-trustanchor-notificationsetting-channel)
       */
      override fun channel(): String? = unwrap(this).getChannel()

      /**
       * Indicates whether the notification setting is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-notificationsetting.html#cfn-rolesanywhere-trustanchor-notificationsetting-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The event to which this notification setting is applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-notificationsetting.html#cfn-rolesanywhere-trustanchor-notificationsetting-event)
       */
      override fun event(): String = unwrap(this).getEvent()

      /**
       * The number of days before a notification event.
       *
       * This value is required for a notification setting that is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-notificationsetting.html#cfn-rolesanywhere-trustanchor-notificationsetting-threshold)
       */
      override fun threshold(): Number? = unwrap(this).getThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty):
          NotificationSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationSettingProperty):
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty
    }
  }

  /**
   * Object representing the TrustAnchor type and its related certificate data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rolesanywhere.*;
   * SourceProperty sourceProperty = SourceProperty.builder()
   * .sourceData(SourceDataProperty.builder()
   * .acmPcaArn("acmPcaArn")
   * .x509CertificateData("x509CertificateData")
   * .build())
   * .sourceType("sourceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-source.html)
   */
  public interface SourceProperty {
    /**
     * A union object representing the data field of the TrustAnchor depending on its type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-source.html#cfn-rolesanywhere-trustanchor-source-sourcedata)
     */
    public fun sourceData(): Any? = unwrap(this).getSourceData()

    /**
     * The type of the TrustAnchor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-source.html#cfn-rolesanywhere-trustanchor-source-sourcetype)
     */
    public fun sourceType(): String? = unwrap(this).getSourceType()

    /**
     * A builder for [SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceData A union object representing the data field of the TrustAnchor depending
       * on its type.
       */
      public fun sourceData(sourceData: IResolvable)

      /**
       * @param sourceData A union object representing the data field of the TrustAnchor depending
       * on its type.
       */
      public fun sourceData(sourceData: SourceDataProperty)

      /**
       * @param sourceData A union object representing the data field of the TrustAnchor depending
       * on its type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67dcf808ea62ad5bd45b3233e85ec02737844c3fe2796855e264f638ead6bc52")
      public fun sourceData(sourceData: SourceDataProperty.Builder.() -> Unit)

      /**
       * @param sourceType The type of the TrustAnchor.
       */
      public fun sourceType(sourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty.Builder =
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty.builder()

      /**
       * @param sourceData A union object representing the data field of the TrustAnchor depending
       * on its type.
       */
      override fun sourceData(sourceData: IResolvable) {
        cdkBuilder.sourceData(sourceData.let(IResolvable::unwrap))
      }

      /**
       * @param sourceData A union object representing the data field of the TrustAnchor depending
       * on its type.
       */
      override fun sourceData(sourceData: SourceDataProperty) {
        cdkBuilder.sourceData(sourceData.let(SourceDataProperty::unwrap))
      }

      /**
       * @param sourceData A union object representing the data field of the TrustAnchor depending
       * on its type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67dcf808ea62ad5bd45b3233e85ec02737844c3fe2796855e264f638ead6bc52")
      override fun sourceData(sourceData: SourceDataProperty.Builder.() -> Unit): Unit =
          sourceData(SourceDataProperty(sourceData))

      /**
       * @param sourceType The type of the TrustAnchor.
       */
      override fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
      }

      public fun build():
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty,
    ) : CdkObject(cdkObject), SourceProperty {
      /**
       * A union object representing the data field of the TrustAnchor depending on its type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-source.html#cfn-rolesanywhere-trustanchor-source-sourcedata)
       */
      override fun sourceData(): Any? = unwrap(this).getSourceData()

      /**
       * The type of the TrustAnchor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-source.html#cfn-rolesanywhere-trustanchor-source-sourcetype)
       */
      override fun sourceType(): String? = unwrap(this).getSourceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty):
          SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty
    }
  }
}
