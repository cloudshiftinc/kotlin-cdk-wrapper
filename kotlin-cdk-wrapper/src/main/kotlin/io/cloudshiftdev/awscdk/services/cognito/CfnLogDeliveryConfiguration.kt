@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

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
 * Sets up or modifies the logging configuration of a user pool.
 *
 * User pools can export user notification logs and advanced security features user activity logs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CfnLogDeliveryConfiguration cfnLogDeliveryConfiguration =
 * CfnLogDeliveryConfiguration.Builder.create(this, "MyCfnLogDeliveryConfiguration")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .logConfigurations(List.of(LogConfigurationProperty.builder()
 * .cloudWatchLogsConfiguration(CloudWatchLogsConfigurationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .eventSource("eventSource")
 * .firehoseConfiguration(FirehoseConfigurationProperty.builder()
 * .streamArn("streamArn")
 * .build())
 * .logLevel("logLevel")
 * .s3Configuration(S3ConfigurationProperty.builder()
 * .bucketArn("bucketArn")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html)
 */
public open class CfnLogDeliveryConfiguration(
  cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLogDeliveryConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLogDeliveryConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLogDeliveryConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLogDeliveryConfigurationProps(props)
  )

  /**
   * A user pool ID, for example `us-east-1_EXAMPLE` .
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
   * A logging destination of a user pool.
   */
  public open fun logConfigurations(): Any? = unwrap(this).getLogConfigurations()

  /**
   * A logging destination of a user pool.
   */
  public open fun logConfigurations(`value`: IResolvable) {
    unwrap(this).setLogConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A logging destination of a user pool.
   */
  public open fun logConfigurations(`value`: List<Any>) {
    unwrap(this).setLogConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A logging destination of a user pool.
   */
  public open fun logConfigurations(vararg `value`: Any): Unit = logConfigurations(`value`.toList())

  /**
   * The ID of the user pool where you configured logging.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The ID of the user pool where you configured logging.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnLogDeliveryConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A logging destination of a user pool.
     *
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations A logging destination of a user pool. 
     */
    public fun logConfigurations(logConfigurations: IResolvable)

    /**
     * A logging destination of a user pool.
     *
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations A logging destination of a user pool. 
     */
    public fun logConfigurations(logConfigurations: List<Any>)

    /**
     * A logging destination of a user pool.
     *
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations A logging destination of a user pool. 
     */
    public fun logConfigurations(vararg logConfigurations: Any)

    /**
     * The ID of the user pool where you configured logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-userpoolid)
     * @param userPoolId The ID of the user pool where you configured logging. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.Builder =
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.Builder.create(scope,
        id)

    /**
     * A logging destination of a user pool.
     *
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations A logging destination of a user pool. 
     */
    override fun logConfigurations(logConfigurations: IResolvable) {
      cdkBuilder.logConfigurations(logConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * A logging destination of a user pool.
     *
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations A logging destination of a user pool. 
     */
    override fun logConfigurations(logConfigurations: List<Any>) {
      cdkBuilder.logConfigurations(logConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A logging destination of a user pool.
     *
     * User pools can have multiple logging destinations for message-delivery and user-activity
     * logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations A logging destination of a user pool. 
     */
    override fun logConfigurations(vararg logConfigurations: Any): Unit =
        logConfigurations(logConfigurations.toList())

    /**
     * The ID of the user pool where you configured logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-userpoolid)
     * @param userPoolId The ID of the user pool where you configured logging. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogDeliveryConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogDeliveryConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration):
        CfnLogDeliveryConfiguration = CfnLogDeliveryConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLogDeliveryConfiguration):
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration
  }

  /**
   * Configuration for the CloudWatch log group destination of user pool detailed activity logging,
   * or of user activity log export with advanced security features.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * CloudWatchLogsConfigurationProperty cloudWatchLogsConfigurationProperty =
   * CloudWatchLogsConfigurationProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-cloudwatchlogsconfiguration.html)
   */
  public interface CloudWatchLogsConfigurationProperty {
    /**
     * The Amazon Resource Name (arn) of a CloudWatch Logs log group where your user pool sends
     * logs.
     *
     * The log group must not be encrypted with AWS Key Management Service and must be in the same
     * AWS account as your user pool.
     *
     * To send logs to log groups with a resource policy of a size greater than 5120 characters,
     * configure a log group with a path that starts with `/aws/vendedlogs` . For more information, see
     * [Enabling logging from certain AWS
     * services](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-cloudwatchlogsconfiguration.html#cfn-cognito-logdeliveryconfiguration-cloudwatchlogsconfiguration-loggrouparn)
     */
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    /**
     * A builder for [CloudWatchLogsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupArn The Amazon Resource Name (arn) of a CloudWatch Logs log group where your
       * user pool sends logs.
       * The log group must not be encrypted with AWS Key Management Service and must be in the same
       * AWS account as your user pool.
       *
       * To send logs to log groups with a resource policy of a size greater than 5120 characters,
       * configure a log group with a path that starts with `/aws/vendedlogs` . For more information,
       * see [Enabling logging from certain AWS
       * services](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html)
       * .
       */
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty.builder()

      /**
       * @param logGroupArn The Amazon Resource Name (arn) of a CloudWatch Logs log group where your
       * user pool sends logs.
       * The log group must not be encrypted with AWS Key Management Service and must be in the same
       * AWS account as your user pool.
       *
       * To send logs to log groups with a resource policy of a size greater than 5120 characters,
       * configure a log group with a path that starts with `/aws/vendedlogs` . For more information,
       * see [Enabling logging from certain AWS
       * services](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html)
       * .
       */
      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty,
    ) : CdkObject(cdkObject),
        CloudWatchLogsConfigurationProperty {
      /**
       * The Amazon Resource Name (arn) of a CloudWatch Logs log group where your user pool sends
       * logs.
       *
       * The log group must not be encrypted with AWS Key Management Service and must be in the same
       * AWS account as your user pool.
       *
       * To send logs to log groups with a resource policy of a size greater than 5120 characters,
       * configure a log group with a path that starts with `/aws/vendedlogs` . For more information,
       * see [Enabling logging from certain AWS
       * services](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-cloudwatchlogsconfiguration.html#cfn-cognito-logdeliveryconfiguration-cloudwatchlogsconfiguration-loggrouparn)
       */
      override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty):
          CloudWatchLogsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty
    }
  }

  /**
   * Configuration for the Amazon Data Firehose stream destination of user activity log export with
   * advanced security features.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * FirehoseConfigurationProperty firehoseConfigurationProperty =
   * FirehoseConfigurationProperty.builder()
   * .streamArn("streamArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-firehoseconfiguration.html)
   */
  public interface FirehoseConfigurationProperty {
    /**
     * The ARN of an Amazon Data Firehose stream that's the destination for advanced security
     * features log export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-firehoseconfiguration.html#cfn-cognito-logdeliveryconfiguration-firehoseconfiguration-streamarn)
     */
    public fun streamArn(): String? = unwrap(this).getStreamArn()

    /**
     * A builder for [FirehoseConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param streamArn The ARN of an Amazon Data Firehose stream that's the destination for
       * advanced security features log export.
       */
      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.FirehoseConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.FirehoseConfigurationProperty.builder()

      /**
       * @param streamArn The ARN of an Amazon Data Firehose stream that's the destination for
       * advanced security features log export.
       */
      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.FirehoseConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.FirehoseConfigurationProperty,
    ) : CdkObject(cdkObject),
        FirehoseConfigurationProperty {
      /**
       * The ARN of an Amazon Data Firehose stream that's the destination for advanced security
       * features log export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-firehoseconfiguration.html#cfn-cognito-logdeliveryconfiguration-firehoseconfiguration-streamarn)
       */
      override fun streamArn(): String? = unwrap(this).getStreamArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FirehoseConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.FirehoseConfigurationProperty):
          FirehoseConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FirehoseConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.FirehoseConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.FirehoseConfigurationProperty
    }
  }

  /**
   * The configuration of user event logs to an external AWS service like Amazon Data Firehose,
   * Amazon S3, or Amazon CloudWatch Logs.
   *
   * This data type is a request parameter of
   * [SetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetLogDeliveryConfiguration.html)
   * and a response parameter of
   * [GetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetLogDeliveryConfiguration.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
   * .cloudWatchLogsConfiguration(CloudWatchLogsConfigurationProperty.builder()
   * .logGroupArn("logGroupArn")
   * .build())
   * .eventSource("eventSource")
   * .firehoseConfiguration(FirehoseConfigurationProperty.builder()
   * .streamArn("streamArn")
   * .build())
   * .logLevel("logLevel")
   * .s3Configuration(S3ConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html)
   */
  public interface LogConfigurationProperty {
    /**
     * Configuration for the CloudWatch log group destination of user pool detailed activity
     * logging, or of user activity log export with advanced security features.
     *
     * This data type is a request parameter of
     * [SetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetLogDeliveryConfiguration.html)
     * and a response parameter of
     * [GetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetLogDeliveryConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-cloudwatchlogsconfiguration)
     */
    public fun cloudWatchLogsConfiguration(): Any? = unwrap(this).getCloudWatchLogsConfiguration()

    /**
     * The source of events that your user pool sends for logging.
     *
     * To send error-level logs about user notification activity, set to `userNotification` . To
     * send info-level logs about advanced security features user activity, set to `userAuthEvents` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-eventsource)
     */
    public fun eventSource(): String? = unwrap(this).getEventSource()

    /**
     * Configuration for the Amazon Data Firehose stream destination of user activity log export
     * with advanced security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-firehoseconfiguration)
     */
    public fun firehoseConfiguration(): Any? = unwrap(this).getFirehoseConfiguration()

    /**
     * The `errorlevel` selection of logs that a user pool sends for detailed activity logging.
     *
     * To send `userNotification` activity with [information about message
     * delivery](https://docs.aws.amazon.com/cognito/latest/developerguide/tracking-quotas-and-usage-in-cloud-watch-logs.html)
     * , choose `ERROR` with `CloudWatchLogsConfiguration` . To send `userAuthEvents` activity with
     * user logs from advanced security features, choose `INFO` with one of
     * `CloudWatchLogsConfiguration` , `FirehoseConfiguration` , or `S3Configuration` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-loglevel)
     */
    public fun logLevel(): String? = unwrap(this).getLogLevel()

    /**
     * Configuration for the Amazon S3 bucket destination of user activity log export with advanced
     * security features.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-s3configuration)
     */
    public fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

    /**
     * A builder for [LogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsConfiguration Configuration for the CloudWatch log group destination
       * of user pool detailed activity logging, or of user activity log export with advanced security
       * features.
       * This data type is a request parameter of
       * [SetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetLogDeliveryConfiguration.html)
       * and a response parameter of
       * [GetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetLogDeliveryConfiguration.html)
       * .
       */
      public fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: IResolvable)

      /**
       * @param cloudWatchLogsConfiguration Configuration for the CloudWatch log group destination
       * of user pool detailed activity logging, or of user activity log export with advanced security
       * features.
       * This data type is a request parameter of
       * [SetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetLogDeliveryConfiguration.html)
       * and a response parameter of
       * [GetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetLogDeliveryConfiguration.html)
       * .
       */
      public
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty)

      /**
       * @param cloudWatchLogsConfiguration Configuration for the CloudWatch log group destination
       * of user pool detailed activity logging, or of user activity log export with advanced security
       * features.
       * This data type is a request parameter of
       * [SetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetLogDeliveryConfiguration.html)
       * and a response parameter of
       * [GetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetLogDeliveryConfiguration.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c72dbd13231f18ec304bbe35965e946d533d687a2d96901fa93fa1a35c6cc0d")
      public
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param eventSource The source of events that your user pool sends for logging.
       * To send error-level logs about user notification activity, set to `userNotification` . To
       * send info-level logs about advanced security features user activity, set to `userAuthEvents` .
       */
      public fun eventSource(eventSource: String)

      /**
       * @param firehoseConfiguration Configuration for the Amazon Data Firehose stream destination
       * of user activity log export with advanced security features.
       */
      public fun firehoseConfiguration(firehoseConfiguration: IResolvable)

      /**
       * @param firehoseConfiguration Configuration for the Amazon Data Firehose stream destination
       * of user activity log export with advanced security features.
       */
      public fun firehoseConfiguration(firehoseConfiguration: FirehoseConfigurationProperty)

      /**
       * @param firehoseConfiguration Configuration for the Amazon Data Firehose stream destination
       * of user activity log export with advanced security features.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d2a3cc91104ab8b9f2fcc2767846cd8ef79a5a1e7e6d52f16005fd363a0fdfc")
      public
          fun firehoseConfiguration(firehoseConfiguration: FirehoseConfigurationProperty.Builder.() -> Unit)

      /**
       * @param logLevel The `errorlevel` selection of logs that a user pool sends for detailed
       * activity logging.
       * To send `userNotification` activity with [information about message
       * delivery](https://docs.aws.amazon.com/cognito/latest/developerguide/tracking-quotas-and-usage-in-cloud-watch-logs.html)
       * , choose `ERROR` with `CloudWatchLogsConfiguration` . To send `userAuthEvents` activity with
       * user logs from advanced security features, choose `INFO` with one of
       * `CloudWatchLogsConfiguration` , `FirehoseConfiguration` , or `S3Configuration` .
       */
      public fun logLevel(logLevel: String)

      /**
       * @param s3Configuration Configuration for the Amazon S3 bucket destination of user activity
       * log export with advanced security features.
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration Configuration for the Amazon S3 bucket destination of user activity
       * log export with advanced security features.
       */
      public fun s3Configuration(s3Configuration: S3ConfigurationProperty)

      /**
       * @param s3Configuration Configuration for the Amazon S3 bucket destination of user activity
       * log export with advanced security features.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70aeb6ab0d57c7f8f4989bc440112ed5e9586c7e17180aa3f909c0b89c399a98")
      public fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty.builder()

      /**
       * @param cloudWatchLogsConfiguration Configuration for the CloudWatch log group destination
       * of user pool detailed activity logging, or of user activity log export with advanced security
       * features.
       * This data type is a request parameter of
       * [SetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetLogDeliveryConfiguration.html)
       * and a response parameter of
       * [GetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetLogDeliveryConfiguration.html)
       * .
       */
      override fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: IResolvable) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogsConfiguration Configuration for the CloudWatch log group destination
       * of user pool detailed activity logging, or of user activity log export with advanced security
       * features.
       * This data type is a request parameter of
       * [SetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetLogDeliveryConfiguration.html)
       * and a response parameter of
       * [GetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetLogDeliveryConfiguration.html)
       * .
       */
      override
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration.let(CloudWatchLogsConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param cloudWatchLogsConfiguration Configuration for the CloudWatch log group destination
       * of user pool detailed activity logging, or of user activity log export with advanced security
       * features.
       * This data type is a request parameter of
       * [SetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetLogDeliveryConfiguration.html)
       * and a response parameter of
       * [GetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetLogDeliveryConfiguration.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c72dbd13231f18ec304bbe35965e946d533d687a2d96901fa93fa1a35c6cc0d")
      override
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogsConfiguration(CloudWatchLogsConfigurationProperty(cloudWatchLogsConfiguration))

      /**
       * @param eventSource The source of events that your user pool sends for logging.
       * To send error-level logs about user notification activity, set to `userNotification` . To
       * send info-level logs about advanced security features user activity, set to `userAuthEvents` .
       */
      override fun eventSource(eventSource: String) {
        cdkBuilder.eventSource(eventSource)
      }

      /**
       * @param firehoseConfiguration Configuration for the Amazon Data Firehose stream destination
       * of user activity log export with advanced security features.
       */
      override fun firehoseConfiguration(firehoseConfiguration: IResolvable) {
        cdkBuilder.firehoseConfiguration(firehoseConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param firehoseConfiguration Configuration for the Amazon Data Firehose stream destination
       * of user activity log export with advanced security features.
       */
      override fun firehoseConfiguration(firehoseConfiguration: FirehoseConfigurationProperty) {
        cdkBuilder.firehoseConfiguration(firehoseConfiguration.let(FirehoseConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param firehoseConfiguration Configuration for the Amazon Data Firehose stream destination
       * of user activity log export with advanced security features.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d2a3cc91104ab8b9f2fcc2767846cd8ef79a5a1e7e6d52f16005fd363a0fdfc")
      override
          fun firehoseConfiguration(firehoseConfiguration: FirehoseConfigurationProperty.Builder.() -> Unit):
          Unit = firehoseConfiguration(FirehoseConfigurationProperty(firehoseConfiguration))

      /**
       * @param logLevel The `errorlevel` selection of logs that a user pool sends for detailed
       * activity logging.
       * To send `userNotification` activity with [information about message
       * delivery](https://docs.aws.amazon.com/cognito/latest/developerguide/tracking-quotas-and-usage-in-cloud-watch-logs.html)
       * , choose `ERROR` with `CloudWatchLogsConfiguration` . To send `userAuthEvents` activity with
       * user logs from advanced security features, choose `INFO` with one of
       * `CloudWatchLogsConfiguration` , `FirehoseConfiguration` , or `S3Configuration` .
       */
      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      /**
       * @param s3Configuration Configuration for the Amazon S3 bucket destination of user activity
       * log export with advanced security features.
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Configuration Configuration for the Amazon S3 bucket destination of user activity
       * log export with advanced security features.
       */
      override fun s3Configuration(s3Configuration: S3ConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3ConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param s3Configuration Configuration for the Amazon S3 bucket destination of user activity
       * log export with advanced security features.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70aeb6ab0d57c7f8f4989bc440112ed5e9586c7e17180aa3f909c0b89c399a98")
      override fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3ConfigurationProperty(s3Configuration))

      public fun build():
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty,
    ) : CdkObject(cdkObject),
        LogConfigurationProperty {
      /**
       * Configuration for the CloudWatch log group destination of user pool detailed activity
       * logging, or of user activity log export with advanced security features.
       *
       * This data type is a request parameter of
       * [SetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetLogDeliveryConfiguration.html)
       * and a response parameter of
       * [GetLogDeliveryConfiguration](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_GetLogDeliveryConfiguration.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-cloudwatchlogsconfiguration)
       */
      override fun cloudWatchLogsConfiguration(): Any? =
          unwrap(this).getCloudWatchLogsConfiguration()

      /**
       * The source of events that your user pool sends for logging.
       *
       * To send error-level logs about user notification activity, set to `userNotification` . To
       * send info-level logs about advanced security features user activity, set to `userAuthEvents` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-eventsource)
       */
      override fun eventSource(): String? = unwrap(this).getEventSource()

      /**
       * Configuration for the Amazon Data Firehose stream destination of user activity log export
       * with advanced security features.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-firehoseconfiguration)
       */
      override fun firehoseConfiguration(): Any? = unwrap(this).getFirehoseConfiguration()

      /**
       * The `errorlevel` selection of logs that a user pool sends for detailed activity logging.
       *
       * To send `userNotification` activity with [information about message
       * delivery](https://docs.aws.amazon.com/cognito/latest/developerguide/tracking-quotas-and-usage-in-cloud-watch-logs.html)
       * , choose `ERROR` with `CloudWatchLogsConfiguration` . To send `userAuthEvents` activity with
       * user logs from advanced security features, choose `INFO` with one of
       * `CloudWatchLogsConfiguration` , `FirehoseConfiguration` , or `S3Configuration` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-loglevel)
       */
      override fun logLevel(): String? = unwrap(this).getLogLevel()

      /**
       * Configuration for the Amazon S3 bucket destination of user activity log export with
       * advanced security features.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-s3configuration)
       */
      override fun s3Configuration(): Any? = unwrap(this).getS3Configuration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty):
          LogConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? LogConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty
    }
  }

  /**
   * Configuration for the Amazon S3 bucket destination of user activity log export with advanced
   * security features.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cognito.*;
   * S3ConfigurationProperty s3ConfigurationProperty = S3ConfigurationProperty.builder()
   * .bucketArn("bucketArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-s3configuration.html)
   */
  public interface S3ConfigurationProperty {
    /**
     * The ARN of an Amazon S3 bucket that's the destination for advanced security features log
     * export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-s3configuration.html#cfn-cognito-logdeliveryconfiguration-s3configuration-bucketarn)
     */
    public fun bucketArn(): String? = unwrap(this).getBucketArn()

    /**
     * A builder for [S3ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketArn The ARN of an Amazon S3 bucket that's the destination for advanced
       * security features log export.
       */
      public fun bucketArn(bucketArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.S3ConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.S3ConfigurationProperty.builder()

      /**
       * @param bucketArn The ARN of an Amazon S3 bucket that's the destination for advanced
       * security features log export.
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.S3ConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.S3ConfigurationProperty,
    ) : CdkObject(cdkObject),
        S3ConfigurationProperty {
      /**
       * The ARN of an Amazon S3 bucket that's the destination for advanced security features log
       * export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-s3configuration.html#cfn-cognito-logdeliveryconfiguration-s3configuration-bucketarn)
       */
      override fun bucketArn(): String? = unwrap(this).getBucketArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.S3ConfigurationProperty):
          S3ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3ConfigurationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.S3ConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.S3ConfigurationProperty
    }
  }
}
