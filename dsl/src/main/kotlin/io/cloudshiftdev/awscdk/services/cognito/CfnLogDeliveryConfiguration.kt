package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLogDeliveryConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration,
) : CfnResource(cdkObject), IInspectable {
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The detailed activity logging destination of a user pool.
   */
  public open fun logConfigurations(): Any? = unwrap(this).getLogConfigurations()

  /**
   * The detailed activity logging destination of a user pool.
   */
  public open fun logConfigurations(`value`: IResolvable) {
    unwrap(this).setLogConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * The detailed activity logging destination of a user pool.
   */
  public open fun logConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setLogConfigurations(__idx_ac66f0)
  }

  /**
   * The detailed activity logging destination of a user pool.
   */
  public open fun logConfigurations(vararg __idx_ac66f0: Any): Unit =
      logConfigurations(__idx_ac66f0.toList())

  /**
   * The ID of the user pool where you configured detailed activity logging.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The ID of the user pool where you configured detailed activity logging.
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
     * The detailed activity logging destination of a user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations The detailed activity logging destination of a user pool. 
     */
    public fun logConfigurations(logConfigurations: IResolvable)

    /**
     * The detailed activity logging destination of a user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations The detailed activity logging destination of a user pool. 
     */
    public fun logConfigurations(logConfigurations: List<Any>)

    /**
     * The detailed activity logging destination of a user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations The detailed activity logging destination of a user pool. 
     */
    public fun logConfigurations(vararg logConfigurations: Any)

    /**
     * The ID of the user pool where you configured detailed activity logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-userpoolid)
     * @param userPoolId The ID of the user pool where you configured detailed activity logging. 
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
     * The detailed activity logging destination of a user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations The detailed activity logging destination of a user pool. 
     */
    override fun logConfigurations(logConfigurations: IResolvable) {
      cdkBuilder.logConfigurations(logConfigurations.let(IResolvable::unwrap))
    }

    /**
     * The detailed activity logging destination of a user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations The detailed activity logging destination of a user pool. 
     */
    override fun logConfigurations(logConfigurations: List<Any>) {
      cdkBuilder.logConfigurations(logConfigurations)
    }

    /**
     * The detailed activity logging destination of a user pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfigurations)
     * @param logConfigurations The detailed activity logging destination of a user pool. 
     */
    override fun logConfigurations(vararg logConfigurations: Any): Unit =
        logConfigurations(logConfigurations.toList())

    /**
     * The ID of the user pool where you configured detailed activity logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-logdeliveryconfiguration.html#cfn-cognito-logdeliveryconfiguration-userpoolid)
     * @param userPoolId The ID of the user pool where you configured detailed activity logging. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration = wrapped.cdkObject
  }

  public interface LogConfigurationProperty {
    /**
     * The CloudWatch logging destination of a user pool detailed activity logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-cloudwatchlogsconfiguration)
     */
    public fun cloudWatchLogsConfiguration(): Any? = unwrap(this).getCloudWatchLogsConfiguration()

    /**
     * The source of events that your user pool sends for detailed activity logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-eventsource)
     */
    public fun eventSource(): String? = unwrap(this).getEventSource()

    /**
     * The `errorlevel` selection of logs that a user pool sends for detailed activity logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-loglevel)
     */
    public fun logLevel(): String? = unwrap(this).getLogLevel()

    /**
     * A builder for [LogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsConfiguration The CloudWatch logging destination of a user pool
       * detailed activity logging configuration.
       */
      public fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: IResolvable)

      /**
       * @param cloudWatchLogsConfiguration The CloudWatch logging destination of a user pool
       * detailed activity logging configuration.
       */
      public
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty)

      /**
       * @param cloudWatchLogsConfiguration The CloudWatch logging destination of a user pool
       * detailed activity logging configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c72dbd13231f18ec304bbe35965e946d533d687a2d96901fa93fa1a35c6cc0d")
      public
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty.Builder.() -> Unit)

      /**
       * @param eventSource The source of events that your user pool sends for detailed activity
       * logging.
       */
      public fun eventSource(eventSource: String)

      /**
       * @param logLevel The `errorlevel` selection of logs that a user pool sends for detailed
       * activity logging.
       */
      public fun logLevel(logLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty.builder()

      /**
       * @param cloudWatchLogsConfiguration The CloudWatch logging destination of a user pool
       * detailed activity logging configuration.
       */
      override fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: IResolvable) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLogsConfiguration The CloudWatch logging destination of a user pool
       * detailed activity logging configuration.
       */
      override
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration.let(CloudWatchLogsConfigurationProperty::unwrap))
      }

      /**
       * @param cloudWatchLogsConfiguration The CloudWatch logging destination of a user pool
       * detailed activity logging configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c72dbd13231f18ec304bbe35965e946d533d687a2d96901fa93fa1a35c6cc0d")
      override
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogsConfiguration(CloudWatchLogsConfigurationProperty(cloudWatchLogsConfiguration))

      /**
       * @param eventSource The source of events that your user pool sends for detailed activity
       * logging.
       */
      override fun eventSource(eventSource: String) {
        cdkBuilder.eventSource(eventSource)
      }

      /**
       * @param logLevel The `errorlevel` selection of logs that a user pool sends for detailed
       * activity logging.
       */
      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty,
    ) : LogConfigurationProperty {
      /**
       * The CloudWatch logging destination of a user pool detailed activity logging configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-cloudwatchlogsconfiguration)
       */
      override fun cloudWatchLogsConfiguration(): Any? =
          unwrap(this).getCloudWatchLogsConfiguration()

      /**
       * The source of events that your user pool sends for detailed activity logging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-eventsource)
       */
      override fun eventSource(): String? = unwrap(this).getEventSource()

      /**
       * The `errorlevel` selection of logs that a user pool sends for detailed activity logging.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html#cfn-cognito-logdeliveryconfiguration-logconfiguration-loglevel)
       */
      override fun logLevel(): String? = unwrap(this).getLogLevel()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty):
          LogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty,
    ) : CloudWatchLogsConfigurationProperty {
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
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty):
          CloudWatchLogsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
