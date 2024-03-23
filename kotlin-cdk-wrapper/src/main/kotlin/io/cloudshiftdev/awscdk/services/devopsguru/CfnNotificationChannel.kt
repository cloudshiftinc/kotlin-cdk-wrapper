@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devopsguru

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
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds a notification channel to DevOps Guru.
 *
 * A notification channel is used to notify you about important DevOps Guru events, such as when an
 * insight is generated.
 *
 * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants
 * DevOps Guru permission to send it notifications. DevOps Guru adds the required policy on your behalf
 * to send notifications using Amazon SNS in your account. DevOps Guru only supports standard SNS
 * topics. For more information, see [Permissions for Amazon SNS
 * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html) .
 *
 * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
 * customer-managed key (CMK), then you must add permissions to the CMK. For more information, see
 * [Permissions for AWS KMS–encrypted Amazon SNS
 * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devopsguru.*;
 * CfnNotificationChannel cfnNotificationChannel = CfnNotificationChannel.Builder.create(this,
 * "MyCfnNotificationChannel")
 * .config(NotificationChannelConfigProperty.builder()
 * .filters(NotificationFilterConfigProperty.builder()
 * .messageTypes(List.of("messageTypes"))
 * .severities(List.of("severities"))
 * .build())
 * .sns(SnsChannelConfigProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html)
 */
public open class CfnNotificationChannel internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.devopsguru.CfnNotificationChannel,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNotificationChannelProps,
  ) :
      this(software.amazon.awscdk.services.devopsguru.CfnNotificationChannel(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnNotificationChannelProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNotificationChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNotificationChannelProps(props)
  )

  /**
   * The ID of the notification channel.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A `NotificationChannelConfig` object that contains information about configured notification
   * channels.
   */
  public open fun config(): Any = unwrap(this).getConfig()

  /**
   * A `NotificationChannelConfig` object that contains information about configured notification
   * channels.
   */
  public open fun config(`value`: IResolvable) {
    unwrap(this).setConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A `NotificationChannelConfig` object that contains information about configured notification
   * channels.
   */
  public open fun config(`value`: NotificationChannelConfigProperty) {
    unwrap(this).setConfig(`value`.let(NotificationChannelConfigProperty::unwrap))
  }

  /**
   * A `NotificationChannelConfig` object that contains information about configured notification
   * channels.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bbc1f33de0fe350c59559bd01e3e13d163d6bd2f59bf8c9832bb7960709b4945")
  public open fun config(`value`: NotificationChannelConfigProperty.Builder.() -> Unit): Unit =
      config(NotificationChannelConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.devopsguru.CfnNotificationChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A `NotificationChannelConfig` object that contains information about configured notification
     * channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    public fun config(config: IResolvable)

    /**
     * A `NotificationChannelConfig` object that contains information about configured notification
     * channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    public fun config(config: NotificationChannelConfigProperty)

    /**
     * A `NotificationChannelConfig` object that contains information about configured notification
     * channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ee7a5ab933661560d32f0bc4b1ecb8c9e8ddfa70c3abb985c8669ed42dcb7e5")
    public fun config(config: NotificationChannelConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.Builder =
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.Builder.create(scope, id)

    /**
     * A `NotificationChannelConfig` object that contains information about configured notification
     * channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    /**
     * A `NotificationChannelConfig` object that contains information about configured notification
     * channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    override fun config(config: NotificationChannelConfigProperty) {
      cdkBuilder.config(config.let(NotificationChannelConfigProperty::unwrap))
    }

    /**
     * A `NotificationChannelConfig` object that contains information about configured notification
     * channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ee7a5ab933661560d32f0bc4b1ecb8c9e8ddfa70c3abb985c8669ed42dcb7e5")
    override fun config(config: NotificationChannelConfigProperty.Builder.() -> Unit): Unit =
        config(NotificationChannelConfigProperty(config))

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnNotificationChannel =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNotificationChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNotificationChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel):
        CfnNotificationChannel = CfnNotificationChannel(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationChannel):
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannel = wrapped.cdkObject
  }

  /**
   * Information about notification channels you have configured with DevOps Guru.
   *
   * The one supported notification channel is Amazon Simple Notification Service (Amazon SNS).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.devopsguru.*;
   * NotificationChannelConfigProperty notificationChannelConfigProperty =
   * NotificationChannelConfigProperty.builder()
   * .filters(NotificationFilterConfigProperty.builder()
   * .messageTypes(List.of("messageTypes"))
   * .severities(List.of("severities"))
   * .build())
   * .sns(SnsChannelConfigProperty.builder()
   * .topicArn("topicArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationchannelconfig.html)
   */
  public interface NotificationChannelConfigProperty {
    /**
     * The filter configurations for the Amazon SNS notification topic you use with DevOps Guru.
     *
     * If you do not provide filter configurations, the default configurations are to receive
     * notifications for all message types of `High` or `Medium` severity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationchannelconfig.html#cfn-devopsguru-notificationchannel-notificationchannelconfig-filters)
     */
    public fun filters(): Any? = unwrap(this).getFilters()

    /**
     * Information about a notification channel configured in DevOps Guru to send notifications when
     * insights are created.
     *
     * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants
     * DevOps Guru permission to send it notifications. DevOps Guru adds the required policy on your
     * behalf to send notifications using Amazon SNS in your account. DevOps Guru only supports
     * standard SNS topics. For more information, see [Permissions for Amazon SNS
     * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
     * .
     *
     * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
     * customer-managed key (CMK), then you must add permissions to the CMK. For more information, see
     * [Permissions for AWS KMS–encrypted Amazon SNS
     * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationchannelconfig.html#cfn-devopsguru-notificationchannel-notificationchannelconfig-sns)
     */
    public fun sns(): Any? = unwrap(this).getSns()

    /**
     * A builder for [NotificationChannelConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filters The filter configurations for the Amazon SNS notification topic you use with
       * DevOps Guru.
       * If you do not provide filter configurations, the default configurations are to receive
       * notifications for all message types of `High` or `Medium` severity.
       */
      public fun filters(filters: IResolvable)

      /**
       * @param filters The filter configurations for the Amazon SNS notification topic you use with
       * DevOps Guru.
       * If you do not provide filter configurations, the default configurations are to receive
       * notifications for all message types of `High` or `Medium` severity.
       */
      public fun filters(filters: NotificationFilterConfigProperty)

      /**
       * @param filters The filter configurations for the Amazon SNS notification topic you use with
       * DevOps Guru.
       * If you do not provide filter configurations, the default configurations are to receive
       * notifications for all message types of `High` or `Medium` severity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45a6598eb4c4f3b86436cc52c7dbd55fb7b4a5abcfe8733b7290f45f2f3227dd")
      public fun filters(filters: NotificationFilterConfigProperty.Builder.() -> Unit)

      /**
       * @param sns Information about a notification channel configured in DevOps Guru to send
       * notifications when insights are created.
       * If you use an Amazon SNS topic in another account, you must attach a policy to it that
       * grants DevOps Guru permission to send it notifications. DevOps Guru adds the required policy
       * on your behalf to send notifications using Amazon SNS in your account. DevOps Guru only
       * supports standard SNS topics. For more information, see [Permissions for Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
       * .
       *
       * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
       * customer-managed key (CMK), then you must add permissions to the CMK. For more information,
       * see [Permissions for AWS KMS–encrypted Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
       */
      public fun sns(sns: IResolvable)

      /**
       * @param sns Information about a notification channel configured in DevOps Guru to send
       * notifications when insights are created.
       * If you use an Amazon SNS topic in another account, you must attach a policy to it that
       * grants DevOps Guru permission to send it notifications. DevOps Guru adds the required policy
       * on your behalf to send notifications using Amazon SNS in your account. DevOps Guru only
       * supports standard SNS topics. For more information, see [Permissions for Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
       * .
       *
       * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
       * customer-managed key (CMK), then you must add permissions to the CMK. For more information,
       * see [Permissions for AWS KMS–encrypted Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
       */
      public fun sns(sns: SnsChannelConfigProperty)

      /**
       * @param sns Information about a notification channel configured in DevOps Guru to send
       * notifications when insights are created.
       * If you use an Amazon SNS topic in another account, you must attach a policy to it that
       * grants DevOps Guru permission to send it notifications. DevOps Guru adds the required policy
       * on your behalf to send notifications using Amazon SNS in your account. DevOps Guru only
       * supports standard SNS topics. For more information, see [Permissions for Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
       * .
       *
       * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
       * customer-managed key (CMK), then you must add permissions to the CMK. For more information,
       * see [Permissions for AWS KMS–encrypted Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58a795a7aae4312066872a05c81d7e16e31913fd0387c72972646cc2d13f2418")
      public fun sns(sns: SnsChannelConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty.builder()

      /**
       * @param filters The filter configurations for the Amazon SNS notification topic you use with
       * DevOps Guru.
       * If you do not provide filter configurations, the default configurations are to receive
       * notifications for all message types of `High` or `Medium` severity.
       */
      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      /**
       * @param filters The filter configurations for the Amazon SNS notification topic you use with
       * DevOps Guru.
       * If you do not provide filter configurations, the default configurations are to receive
       * notifications for all message types of `High` or `Medium` severity.
       */
      override fun filters(filters: NotificationFilterConfigProperty) {
        cdkBuilder.filters(filters.let(NotificationFilterConfigProperty::unwrap))
      }

      /**
       * @param filters The filter configurations for the Amazon SNS notification topic you use with
       * DevOps Guru.
       * If you do not provide filter configurations, the default configurations are to receive
       * notifications for all message types of `High` or `Medium` severity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45a6598eb4c4f3b86436cc52c7dbd55fb7b4a5abcfe8733b7290f45f2f3227dd")
      override fun filters(filters: NotificationFilterConfigProperty.Builder.() -> Unit): Unit =
          filters(NotificationFilterConfigProperty(filters))

      /**
       * @param sns Information about a notification channel configured in DevOps Guru to send
       * notifications when insights are created.
       * If you use an Amazon SNS topic in another account, you must attach a policy to it that
       * grants DevOps Guru permission to send it notifications. DevOps Guru adds the required policy
       * on your behalf to send notifications using Amazon SNS in your account. DevOps Guru only
       * supports standard SNS topics. For more information, see [Permissions for Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
       * .
       *
       * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
       * customer-managed key (CMK), then you must add permissions to the CMK. For more information,
       * see [Permissions for AWS KMS–encrypted Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
       */
      override fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns.let(IResolvable::unwrap))
      }

      /**
       * @param sns Information about a notification channel configured in DevOps Guru to send
       * notifications when insights are created.
       * If you use an Amazon SNS topic in another account, you must attach a policy to it that
       * grants DevOps Guru permission to send it notifications. DevOps Guru adds the required policy
       * on your behalf to send notifications using Amazon SNS in your account. DevOps Guru only
       * supports standard SNS topics. For more information, see [Permissions for Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
       * .
       *
       * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
       * customer-managed key (CMK), then you must add permissions to the CMK. For more information,
       * see [Permissions for AWS KMS–encrypted Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
       */
      override fun sns(sns: SnsChannelConfigProperty) {
        cdkBuilder.sns(sns.let(SnsChannelConfigProperty::unwrap))
      }

      /**
       * @param sns Information about a notification channel configured in DevOps Guru to send
       * notifications when insights are created.
       * If you use an Amazon SNS topic in another account, you must attach a policy to it that
       * grants DevOps Guru permission to send it notifications. DevOps Guru adds the required policy
       * on your behalf to send notifications using Amazon SNS in your account. DevOps Guru only
       * supports standard SNS topics. For more information, see [Permissions for Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
       * .
       *
       * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
       * customer-managed key (CMK), then you must add permissions to the CMK. For more information,
       * see [Permissions for AWS KMS–encrypted Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58a795a7aae4312066872a05c81d7e16e31913fd0387c72972646cc2d13f2418")
      override fun sns(sns: SnsChannelConfigProperty.Builder.() -> Unit): Unit =
          sns(SnsChannelConfigProperty(sns))

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty,
    ) : CdkObject(cdkObject), NotificationChannelConfigProperty {
      /**
       * The filter configurations for the Amazon SNS notification topic you use with DevOps Guru.
       *
       * If you do not provide filter configurations, the default configurations are to receive
       * notifications for all message types of `High` or `Medium` severity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationchannelconfig.html#cfn-devopsguru-notificationchannel-notificationchannelconfig-filters)
       */
      override fun filters(): Any? = unwrap(this).getFilters()

      /**
       * Information about a notification channel configured in DevOps Guru to send notifications
       * when insights are created.
       *
       * If you use an Amazon SNS topic in another account, you must attach a policy to it that
       * grants DevOps Guru permission to send it notifications. DevOps Guru adds the required policy
       * on your behalf to send notifications using Amazon SNS in your account. DevOps Guru only
       * supports standard SNS topics. For more information, see [Permissions for Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
       * .
       *
       * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
       * customer-managed key (CMK), then you must add permissions to the CMK. For more information,
       * see [Permissions for AWS KMS–encrypted Amazon SNS
       * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationchannelconfig.html#cfn-devopsguru-notificationchannel-notificationchannelconfig-sns)
       */
      override fun sns(): Any? = unwrap(this).getSns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationChannelConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty):
          NotificationChannelConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NotificationChannelConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationChannelConfigProperty):
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty
    }
  }

  /**
   * The filter configurations for the Amazon SNS notification topic you use with DevOps Guru.
   *
   * You can choose to specify which events or message types to receive notifications for. You can
   * also choose to specify which severity levels to receive notifications for.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.devopsguru.*;
   * NotificationFilterConfigProperty notificationFilterConfigProperty =
   * NotificationFilterConfigProperty.builder()
   * .messageTypes(List.of("messageTypes"))
   * .severities(List.of("severities"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationfilterconfig.html)
   */
  public interface NotificationFilterConfigProperty {
    /**
     * The events that you want to receive notifications for.
     *
     * For example, you can choose to receive notifications only when the severity level is upgraded
     * or a new insight is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationfilterconfig.html#cfn-devopsguru-notificationchannel-notificationfilterconfig-messagetypes)
     */
    public fun messageTypes(): List<String> = unwrap(this).getMessageTypes() ?: emptyList()

    /**
     * The severity levels that you want to receive notifications for.
     *
     * For example, you can choose to receive notifications only for insights with `HIGH` and
     * `MEDIUM` severity levels. For more information, see [Understanding insight
     * severities](https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationfilterconfig.html#cfn-devopsguru-notificationchannel-notificationfilterconfig-severities)
     */
    public fun severities(): List<String> = unwrap(this).getSeverities() ?: emptyList()

    /**
     * A builder for [NotificationFilterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param messageTypes The events that you want to receive notifications for.
       * For example, you can choose to receive notifications only when the severity level is
       * upgraded or a new insight is created.
       */
      public fun messageTypes(messageTypes: List<String>)

      /**
       * @param messageTypes The events that you want to receive notifications for.
       * For example, you can choose to receive notifications only when the severity level is
       * upgraded or a new insight is created.
       */
      public fun messageTypes(vararg messageTypes: String)

      /**
       * @param severities The severity levels that you want to receive notifications for.
       * For example, you can choose to receive notifications only for insights with `HIGH` and
       * `MEDIUM` severity levels. For more information, see [Understanding insight
       * severities](https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities)
       * .
       */
      public fun severities(severities: List<String>)

      /**
       * @param severities The severity levels that you want to receive notifications for.
       * For example, you can choose to receive notifications only for insights with `HIGH` and
       * `MEDIUM` severity levels. For more information, see [Understanding insight
       * severities](https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities)
       * .
       */
      public fun severities(vararg severities: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty.builder()

      /**
       * @param messageTypes The events that you want to receive notifications for.
       * For example, you can choose to receive notifications only when the severity level is
       * upgraded or a new insight is created.
       */
      override fun messageTypes(messageTypes: List<String>) {
        cdkBuilder.messageTypes(messageTypes)
      }

      /**
       * @param messageTypes The events that you want to receive notifications for.
       * For example, you can choose to receive notifications only when the severity level is
       * upgraded or a new insight is created.
       */
      override fun messageTypes(vararg messageTypes: String): Unit =
          messageTypes(messageTypes.toList())

      /**
       * @param severities The severity levels that you want to receive notifications for.
       * For example, you can choose to receive notifications only for insights with `HIGH` and
       * `MEDIUM` severity levels. For more information, see [Understanding insight
       * severities](https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities)
       * .
       */
      override fun severities(severities: List<String>) {
        cdkBuilder.severities(severities)
      }

      /**
       * @param severities The severity levels that you want to receive notifications for.
       * For example, you can choose to receive notifications only for insights with `HIGH` and
       * `MEDIUM` severity levels. For more information, see [Understanding insight
       * severities](https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities)
       * .
       */
      override fun severities(vararg severities: String): Unit = severities(severities.toList())

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty,
    ) : CdkObject(cdkObject), NotificationFilterConfigProperty {
      /**
       * The events that you want to receive notifications for.
       *
       * For example, you can choose to receive notifications only when the severity level is
       * upgraded or a new insight is created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationfilterconfig.html#cfn-devopsguru-notificationchannel-notificationfilterconfig-messagetypes)
       */
      override fun messageTypes(): List<String> = unwrap(this).getMessageTypes() ?: emptyList()

      /**
       * The severity levels that you want to receive notifications for.
       *
       * For example, you can choose to receive notifications only for insights with `HIGH` and
       * `MEDIUM` severity levels. For more information, see [Understanding insight
       * severities](https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationfilterconfig.html#cfn-devopsguru-notificationchannel-notificationfilterconfig-severities)
       */
      override fun severities(): List<String> = unwrap(this).getSeverities() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationFilterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty):
          NotificationFilterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NotificationFilterConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationFilterConfigProperty):
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationFilterConfigProperty
    }
  }

  /**
   * Contains the Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
   *
   * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants
   * DevOps Guru permission to send it notifications. DevOps Guru adds the required policy on your
   * behalf to send notifications using Amazon SNS in your account. DevOps Guru only supports standard
   * SNS topics. For more information, see [Permissions for Amazon SNS
   * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html) .
   *
   * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
   * customer-managed key (CMK), then you must add permissions to the CMK. For more information, see
   * [Permissions for AWS KMS–encrypted Amazon SNS
   * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.devopsguru.*;
   * SnsChannelConfigProperty snsChannelConfigProperty = SnsChannelConfigProperty.builder()
   * .topicArn("topicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-snschannelconfig.html)
   */
  public interface SnsChannelConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-snschannelconfig.html#cfn-devopsguru-notificationchannel-snschannelconfig-topicarn)
     */
    public fun topicArn(): String? = unwrap(this).getTopicArn()

    /**
     * A builder for [SnsChannelConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param topicArn The Amazon Resource Name (ARN) of an Amazon Simple Notification Service
       * topic.
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty.Builder
          =
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty.builder()

      /**
       * @param topicArn The Amazon Resource Name (ARN) of an Amazon Simple Notification Service
       * topic.
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty,
    ) : CdkObject(cdkObject), SnsChannelConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-snschannelconfig.html#cfn-devopsguru-notificationchannel-snschannelconfig-topicarn)
       */
      override fun topicArn(): String? = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnsChannelConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty):
          SnsChannelConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? SnsChannelConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsChannelConfigProperty):
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty
    }
  }
}
