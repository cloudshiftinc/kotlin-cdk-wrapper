@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securitylake

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
 * Notifies the subscriber when new data is written to the data lake for the sources that the
 * subscriber consumes in Security Lake.
 *
 * You can create only one subscriber notification per subscriber.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securitylake.*;
 * Object sqsNotificationConfiguration;
 * CfnSubscriberNotification cfnSubscriberNotification =
 * CfnSubscriberNotification.Builder.create(this, "MyCfnSubscriberNotification")
 * .notificationConfiguration(NotificationConfigurationProperty.builder()
 * .httpsNotificationConfiguration(HttpsNotificationConfigurationProperty.builder()
 * .endpoint("endpoint")
 * .targetRoleArn("targetRoleArn")
 * // the properties below are optional
 * .authorizationApiKeyName("authorizationApiKeyName")
 * .authorizationApiKeyValue("authorizationApiKeyValue")
 * .httpMethod("httpMethod")
 * .build())
 * .sqsNotificationConfiguration(sqsNotificationConfiguration)
 * .build())
 * .subscriberArn("subscriberArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html)
 */
public open class CfnSubscriberNotification(
  cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriberNotification,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubscriberNotificationProps,
  ) :
      this(software.amazon.awscdk.services.securitylake.CfnSubscriberNotification(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSubscriberNotificationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubscriberNotificationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSubscriberNotificationProps(props)
  )

  /**
   * The endpoint the subscriber should listen to for notifications.
   */
  public open fun attrSubscriberEndpoint(): String = unwrap(this).getAttrSubscriberEndpoint()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specify the configurations you want to use for subscriber notification.
   */
  public open fun notificationConfiguration(): Any = unwrap(this).getNotificationConfiguration()

  /**
   * Specify the configurations you want to use for subscriber notification.
   */
  public open fun notificationConfiguration(`value`: IResolvable) {
    unwrap(this).setNotificationConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specify the configurations you want to use for subscriber notification.
   */
  public open fun notificationConfiguration(`value`: NotificationConfigurationProperty) {
    unwrap(this).setNotificationConfiguration(`value`.let(NotificationConfigurationProperty.Companion::unwrap))
  }

  /**
   * Specify the configurations you want to use for subscriber notification.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b1dcfcc3923ca06269ea2783998dcce7ceaf2868ddb231ac2b0b5eca57cfb756")
  public open
      fun notificationConfiguration(`value`: NotificationConfigurationProperty.Builder.() -> Unit):
      Unit = notificationConfiguration(NotificationConfigurationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the Security Lake subscriber.
   */
  public open fun subscriberArn(): String = unwrap(this).getSubscriberArn()

  /**
   * The Amazon Resource Name (ARN) of the Security Lake subscriber.
   */
  public open fun subscriberArn(`value`: String) {
    unwrap(this).setSubscriberArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securitylake.CfnSubscriberNotification].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specify the configurations you want to use for subscriber notification.
     *
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-notificationconfiguration)
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     */
    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    /**
     * Specify the configurations you want to use for subscriber notification.
     *
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-notificationconfiguration)
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     */
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty)

    /**
     * Specify the configurations you want to use for subscriber notification.
     *
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-notificationconfiguration)
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c58da8abb7f0fbde900d72436c39291fa324e5bdcb36f15b1031f1fc5c801a4")
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the Security Lake subscriber.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-subscriberarn)
     * @param subscriberArn The Amazon Resource Name (ARN) of the Security Lake subscriber. 
     */
    public fun subscriberArn(subscriberArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.Builder =
        software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.Builder.create(scope,
        id)

    /**
     * Specify the configurations you want to use for subscriber notification.
     *
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-notificationconfiguration)
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     */
    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specify the configurations you want to use for subscriber notification.
     *
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-notificationconfiguration)
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     */
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(NotificationConfigurationProperty.Companion::unwrap))
    }

    /**
     * Specify the configurations you want to use for subscriber notification.
     *
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-notificationconfiguration)
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c58da8abb7f0fbde900d72436c39291fa324e5bdcb36f15b1031f1fc5c801a4")
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(NotificationConfigurationProperty(notificationConfiguration))

    /**
     * The Amazon Resource Name (ARN) of the Security Lake subscriber.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-subscriberarn)
     * @param subscriberArn The Amazon Resource Name (ARN) of the Security Lake subscriber. 
     */
    override fun subscriberArn(subscriberArn: String) {
      cdkBuilder.subscriberArn(subscriberArn)
    }

    public fun build(): software.amazon.awscdk.services.securitylake.CfnSubscriberNotification =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscriberNotification {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscriberNotification(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriberNotification):
        CfnSubscriberNotification = CfnSubscriberNotification(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriberNotification):
        software.amazon.awscdk.services.securitylake.CfnSubscriberNotification = wrapped.cdkObject
        as software.amazon.awscdk.services.securitylake.CfnSubscriberNotification
  }

  /**
   * Specify the configurations you want to use for HTTPS subscriber notification.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * HttpsNotificationConfigurationProperty httpsNotificationConfigurationProperty =
   * HttpsNotificationConfigurationProperty.builder()
   * .endpoint("endpoint")
   * .targetRoleArn("targetRoleArn")
   * // the properties below are optional
   * .authorizationApiKeyName("authorizationApiKeyName")
   * .authorizationApiKeyValue("authorizationApiKeyValue")
   * .httpMethod("httpMethod")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html)
   */
  public interface HttpsNotificationConfigurationProperty {
    /**
     * The key name for the notification subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html#cfn-securitylake-subscribernotification-httpsnotificationconfiguration-authorizationapikeyname)
     */
    public fun authorizationApiKeyName(): String? = unwrap(this).getAuthorizationApiKeyName()

    /**
     * The key value for the notification subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html#cfn-securitylake-subscribernotification-httpsnotificationconfiguration-authorizationapikeyvalue)
     */
    public fun authorizationApiKeyValue(): String? = unwrap(this).getAuthorizationApiKeyValue()

    /**
     * The subscription endpoint in Security Lake .
     *
     * If you prefer notification with an HTTPS endpoint, populate this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html#cfn-securitylake-subscribernotification-httpsnotificationconfiguration-endpoint)
     */
    public fun endpoint(): String

    /**
     * The HTTPS method used for the notification subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html#cfn-securitylake-subscribernotification-httpsnotificationconfiguration-httpmethod)
     */
    public fun httpMethod(): String? = unwrap(this).getHttpMethod()

    /**
     * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created.
     *
     * For more information about ARNs and how to use them in policies, see [Managing data
     * access](https://docs.aws.amazon.com///security-lake/latest/userguide/subscriber-data-access.html)
     * and [AWS Managed
     * Policies](https://docs.aws.amazon.com//security-lake/latest/userguide/security-iam-awsmanpol.html)
     * in the *Amazon Security Lake User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html#cfn-securitylake-subscribernotification-httpsnotificationconfiguration-targetrolearn)
     */
    public fun targetRoleArn(): String

    /**
     * A builder for [HttpsNotificationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationApiKeyName The key name for the notification subscription.
       */
      public fun authorizationApiKeyName(authorizationApiKeyName: String)

      /**
       * @param authorizationApiKeyValue The key value for the notification subscription.
       */
      public fun authorizationApiKeyValue(authorizationApiKeyValue: String)

      /**
       * @param endpoint The subscription endpoint in Security Lake . 
       * If you prefer notification with an HTTPS endpoint, populate this field.
       */
      public fun endpoint(endpoint: String)

      /**
       * @param httpMethod The HTTPS method used for the notification subscription.
       */
      public fun httpMethod(httpMethod: String)

      /**
       * @param targetRoleArn The Amazon Resource Name (ARN) of the EventBridge API destinations IAM
       * role that you created. 
       * For more information about ARNs and how to use them in policies, see [Managing data
       * access](https://docs.aws.amazon.com///security-lake/latest/userguide/subscriber-data-access.html)
       * and [AWS Managed
       * Policies](https://docs.aws.amazon.com//security-lake/latest/userguide/security-iam-awsmanpol.html)
       * in the *Amazon Security Lake User Guide* .
       */
      public fun targetRoleArn(targetRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.HttpsNotificationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.HttpsNotificationConfigurationProperty.builder()

      /**
       * @param authorizationApiKeyName The key name for the notification subscription.
       */
      override fun authorizationApiKeyName(authorizationApiKeyName: String) {
        cdkBuilder.authorizationApiKeyName(authorizationApiKeyName)
      }

      /**
       * @param authorizationApiKeyValue The key value for the notification subscription.
       */
      override fun authorizationApiKeyValue(authorizationApiKeyValue: String) {
        cdkBuilder.authorizationApiKeyValue(authorizationApiKeyValue)
      }

      /**
       * @param endpoint The subscription endpoint in Security Lake . 
       * If you prefer notification with an HTTPS endpoint, populate this field.
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      /**
       * @param httpMethod The HTTPS method used for the notification subscription.
       */
      override fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
      }

      /**
       * @param targetRoleArn The Amazon Resource Name (ARN) of the EventBridge API destinations IAM
       * role that you created. 
       * For more information about ARNs and how to use them in policies, see [Managing data
       * access](https://docs.aws.amazon.com///security-lake/latest/userguide/subscriber-data-access.html)
       * and [AWS Managed
       * Policies](https://docs.aws.amazon.com//security-lake/latest/userguide/security-iam-awsmanpol.html)
       * in the *Amazon Security Lake User Guide* .
       */
      override fun targetRoleArn(targetRoleArn: String) {
        cdkBuilder.targetRoleArn(targetRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.HttpsNotificationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.HttpsNotificationConfigurationProperty,
    ) : CdkObject(cdkObject),
        HttpsNotificationConfigurationProperty {
      /**
       * The key name for the notification subscription.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html#cfn-securitylake-subscribernotification-httpsnotificationconfiguration-authorizationapikeyname)
       */
      override fun authorizationApiKeyName(): String? = unwrap(this).getAuthorizationApiKeyName()

      /**
       * The key value for the notification subscription.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html#cfn-securitylake-subscribernotification-httpsnotificationconfiguration-authorizationapikeyvalue)
       */
      override fun authorizationApiKeyValue(): String? = unwrap(this).getAuthorizationApiKeyValue()

      /**
       * The subscription endpoint in Security Lake .
       *
       * If you prefer notification with an HTTPS endpoint, populate this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html#cfn-securitylake-subscribernotification-httpsnotificationconfiguration-endpoint)
       */
      override fun endpoint(): String = unwrap(this).getEndpoint()

      /**
       * The HTTPS method used for the notification subscription.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html#cfn-securitylake-subscribernotification-httpsnotificationconfiguration-httpmethod)
       */
      override fun httpMethod(): String? = unwrap(this).getHttpMethod()

      /**
       * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you
       * created.
       *
       * For more information about ARNs and how to use them in policies, see [Managing data
       * access](https://docs.aws.amazon.com///security-lake/latest/userguide/subscriber-data-access.html)
       * and [AWS Managed
       * Policies](https://docs.aws.amazon.com//security-lake/latest/userguide/security-iam-awsmanpol.html)
       * in the *Amazon Security Lake User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-httpsnotificationconfiguration.html#cfn-securitylake-subscribernotification-httpsnotificationconfiguration-targetrolearn)
       */
      override fun targetRoleArn(): String = unwrap(this).getTargetRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpsNotificationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.HttpsNotificationConfigurationProperty):
          HttpsNotificationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HttpsNotificationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpsNotificationConfigurationProperty):
          software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.HttpsNotificationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.HttpsNotificationConfigurationProperty
    }
  }

  /**
   * Specify the configurations you want to use for subscriber notification.
   *
   * The subscriber is notified when new data is written to the data lake for sources that the
   * subscriber consumes in Security Lake .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.securitylake.*;
   * Object sqsNotificationConfiguration;
   * NotificationConfigurationProperty notificationConfigurationProperty =
   * NotificationConfigurationProperty.builder()
   * .httpsNotificationConfiguration(HttpsNotificationConfigurationProperty.builder()
   * .endpoint("endpoint")
   * .targetRoleArn("targetRoleArn")
   * // the properties below are optional
   * .authorizationApiKeyName("authorizationApiKeyName")
   * .authorizationApiKeyValue("authorizationApiKeyValue")
   * .httpMethod("httpMethod")
   * .build())
   * .sqsNotificationConfiguration(sqsNotificationConfiguration)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-notificationconfiguration.html)
   */
  public interface NotificationConfigurationProperty {
    /**
     * The configurations used for HTTPS subscriber notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-notificationconfiguration.html#cfn-securitylake-subscribernotification-notificationconfiguration-httpsnotificationconfiguration)
     */
    public fun httpsNotificationConfiguration(): Any? =
        unwrap(this).getHttpsNotificationConfiguration()

    /**
     * The configurations for SQS subscriber notification.
     *
     * The members of this structure are context-dependent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-notificationconfiguration.html#cfn-securitylake-subscribernotification-notificationconfiguration-sqsnotificationconfiguration)
     */
    public fun sqsNotificationConfiguration(): Any? = unwrap(this).getSqsNotificationConfiguration()

    /**
     * A builder for [NotificationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpsNotificationConfiguration The configurations used for HTTPS subscriber
       * notification.
       */
      public fun httpsNotificationConfiguration(httpsNotificationConfiguration: IResolvable)

      /**
       * @param httpsNotificationConfiguration The configurations used for HTTPS subscriber
       * notification.
       */
      public
          fun httpsNotificationConfiguration(httpsNotificationConfiguration: HttpsNotificationConfigurationProperty)

      /**
       * @param httpsNotificationConfiguration The configurations used for HTTPS subscriber
       * notification.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4638443802d3192966e47fcafc39dafce49c68f4adafb0d669370d3629833c39")
      public
          fun httpsNotificationConfiguration(httpsNotificationConfiguration: HttpsNotificationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param sqsNotificationConfiguration The configurations for SQS subscriber notification.
       * The members of this structure are context-dependent.
       */
      public fun sqsNotificationConfiguration(sqsNotificationConfiguration: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.NotificationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.NotificationConfigurationProperty.builder()

      /**
       * @param httpsNotificationConfiguration The configurations used for HTTPS subscriber
       * notification.
       */
      override fun httpsNotificationConfiguration(httpsNotificationConfiguration: IResolvable) {
        cdkBuilder.httpsNotificationConfiguration(httpsNotificationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param httpsNotificationConfiguration The configurations used for HTTPS subscriber
       * notification.
       */
      override
          fun httpsNotificationConfiguration(httpsNotificationConfiguration: HttpsNotificationConfigurationProperty) {
        cdkBuilder.httpsNotificationConfiguration(httpsNotificationConfiguration.let(HttpsNotificationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param httpsNotificationConfiguration The configurations used for HTTPS subscriber
       * notification.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4638443802d3192966e47fcafc39dafce49c68f4adafb0d669370d3629833c39")
      override
          fun httpsNotificationConfiguration(httpsNotificationConfiguration: HttpsNotificationConfigurationProperty.Builder.() -> Unit):
          Unit =
          httpsNotificationConfiguration(HttpsNotificationConfigurationProperty(httpsNotificationConfiguration))

      /**
       * @param sqsNotificationConfiguration The configurations for SQS subscriber notification.
       * The members of this structure are context-dependent.
       */
      override fun sqsNotificationConfiguration(sqsNotificationConfiguration: Any) {
        cdkBuilder.sqsNotificationConfiguration(sqsNotificationConfiguration)
      }

      public fun build():
          software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.NotificationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.NotificationConfigurationProperty,
    ) : CdkObject(cdkObject),
        NotificationConfigurationProperty {
      /**
       * The configurations used for HTTPS subscriber notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-notificationconfiguration.html#cfn-securitylake-subscribernotification-notificationconfiguration-httpsnotificationconfiguration)
       */
      override fun httpsNotificationConfiguration(): Any? =
          unwrap(this).getHttpsNotificationConfiguration()

      /**
       * The configurations for SQS subscriber notification.
       *
       * The members of this structure are context-dependent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securitylake-subscribernotification-notificationconfiguration.html#cfn-securitylake-subscribernotification-notificationconfiguration-sqsnotificationconfiguration)
       */
      override fun sqsNotificationConfiguration(): Any? =
          unwrap(this).getSqsNotificationConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.NotificationConfigurationProperty):
          NotificationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NotificationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationConfigurationProperty):
          software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.NotificationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.securitylake.CfnSubscriberNotification.NotificationConfigurationProperty
    }
  }
}
