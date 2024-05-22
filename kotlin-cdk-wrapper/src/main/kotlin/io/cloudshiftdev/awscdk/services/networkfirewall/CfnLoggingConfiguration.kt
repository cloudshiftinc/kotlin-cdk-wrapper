@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `LoggingConfiguration` to define the destinations and logging options for an `Firewall` .
 *
 * You must change the logging configuration by changing one `LogDestinationConfig` setting at a
 * time in your `LogDestinationConfigs` .
 *
 * You can make only one of the following changes to your `LoggingConfiguration` resource:
 *
 * * Create a new log destination object by adding a single `LogDestinationConfig` array element to
 * `LogDestinationConfigs` .
 * * Delete a log destination object by removing a single `LogDestinationConfig` array element from
 * `LogDestinationConfigs` .
 * * Change the `LogDestination` setting in a single `LogDestinationConfig` array element.
 *
 * You can't change the `LogDestinationType` or `LogType` in a `LogDestinationConfig` . To change
 * these settings, delete the existing `LogDestinationConfig` object and create a new one, in two
 * separate modifications.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
 * CfnLoggingConfiguration cfnLoggingConfiguration = CfnLoggingConfiguration.Builder.create(this,
 * "MyCfnLoggingConfiguration")
 * .firewallArn("firewallArn")
 * .loggingConfiguration(LoggingConfigurationProperty.builder()
 * .logDestinationConfigs(List.of(LogDestinationConfigProperty.builder()
 * .logDestination(Map.of(
 * "logDestinationKey", "logDestination"))
 * .logDestinationType("logDestinationType")
 * .logType("logType")
 * .build()))
 * .build())
 * // the properties below are optional
 * .firewallName("firewallName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html)
 */
public open class CfnLoggingConfiguration(
  cdkObject: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLoggingConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLoggingConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLoggingConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLoggingConfigurationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `Firewall` that the logging configuration is associated
   * with.
   */
  public open fun firewallArn(): String = unwrap(this).getFirewallArn()

  /**
   * The Amazon Resource Name (ARN) of the `Firewall` that the logging configuration is associated
   * with.
   */
  public open fun firewallArn(`value`: String) {
    unwrap(this).setFirewallArn(`value`)
  }

  /**
   * The name of the firewall that the logging configuration is associated with.
   */
  public open fun firewallName(): String? = unwrap(this).getFirewallName()

  /**
   * The name of the firewall that the logging configuration is associated with.
   */
  public open fun firewallName(`value`: String) {
    unwrap(this).setFirewallName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Defines how AWS Network Firewall performs logging for a `Firewall` .
   */
  public open fun loggingConfiguration(): Any = unwrap(this).getLoggingConfiguration()

  /**
   * Defines how AWS Network Firewall performs logging for a `Firewall` .
   */
  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Defines how AWS Network Firewall performs logging for a `Firewall` .
   */
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty.Companion::unwrap))
  }

  /**
   * Defines how AWS Network Firewall performs logging for a `Firewall` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("185760fcc632f78f1be64eaf8a3ecbe8ff303cc2f061109b8299ad48e6492b96")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.networkfirewall.CfnLoggingConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the `Firewall` that the logging configuration is associated
     * with.
     *
     * You can't change the firewall specification after you create the logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-firewallarn)
     * @param firewallArn The Amazon Resource Name (ARN) of the `Firewall` that the logging
     * configuration is associated with. 
     */
    public fun firewallArn(firewallArn: String)

    /**
     * The name of the firewall that the logging configuration is associated with.
     *
     * You can't change the firewall specification after you create the logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-firewallname)
     * @param firewallName The name of the firewall that the logging configuration is associated
     * with. 
     */
    public fun firewallName(firewallName: String)

    /**
     * Defines how AWS Network Firewall performs logging for a `Firewall` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration)
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    /**
     * Defines how AWS Network Firewall performs logging for a `Firewall` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration)
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty)

    /**
     * Defines how AWS Network Firewall performs logging for a `Firewall` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration)
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4df15cf2f8b365e2efb5e9098a896046bc1524f972d46c534dff35fcc5548328")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.Builder.create(scope,
        id)

    /**
     * The Amazon Resource Name (ARN) of the `Firewall` that the logging configuration is associated
     * with.
     *
     * You can't change the firewall specification after you create the logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-firewallarn)
     * @param firewallArn The Amazon Resource Name (ARN) of the `Firewall` that the logging
     * configuration is associated with. 
     */
    override fun firewallArn(firewallArn: String) {
      cdkBuilder.firewallArn(firewallArn)
    }

    /**
     * The name of the firewall that the logging configuration is associated with.
     *
     * You can't change the firewall specification after you create the logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-firewallname)
     * @param firewallName The name of the firewall that the logging configuration is associated
     * with. 
     */
    override fun firewallName(firewallName: String) {
      cdkBuilder.firewallName(firewallName)
    }

    /**
     * Defines how AWS Network Firewall performs logging for a `Firewall` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration)
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Defines how AWS Network Firewall performs logging for a `Firewall` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration)
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty.Companion::unwrap))
    }

    /**
     * Defines how AWS Network Firewall performs logging for a `Firewall` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration)
     * @param loggingConfiguration Defines how AWS Network Firewall performs logging for a
     * `Firewall` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4df15cf2f8b365e2efb5e9098a896046bc1524f972d46c534dff35fcc5548328")
    override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggingConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration):
        CfnLoggingConfiguration = CfnLoggingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfiguration):
        software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration = wrapped.cdkObject
        as software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
  }

  /**
   * Defines where AWS Network Firewall sends logs for the firewall for one log type.
   *
   * This is used in `LoggingConfiguration` . You can send each type of log to an Amazon S3 bucket,
   * a CloudWatch log group, or a Kinesis Data Firehose delivery stream.
   *
   * Network Firewall generates logs for stateful rule groups. You can save alert and flow log
   * types. The stateful rules engine records flow logs for all network traffic that it receives. It
   * records alert logs for traffic that matches stateful rules that have the rule action set to `DROP`
   * or `ALERT` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * LogDestinationConfigProperty logDestinationConfigProperty =
   * LogDestinationConfigProperty.builder()
   * .logDestination(Map.of(
   * "logDestinationKey", "logDestination"))
   * .logDestinationType("logDestinationType")
   * .logType("logType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-logdestinationconfig.html)
   */
  public interface LogDestinationConfigProperty {
    /**
     * The named location for the logs, provided in a key:value mapping that is specific to the
     * chosen destination type.
     *
     * * For an Amazon S3 bucket, provide the name of the bucket, with key `bucketName` , and
     * optionally provide a prefix, with key `prefix` . The following example specifies an Amazon S3
     * bucket named `DOC-EXAMPLE-BUCKET` and the prefix `alerts` :
     *
     * `"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }`
     *
     * * For a CloudWatch log group, provide the name of the CloudWatch log group, with key
     * `logGroup` . The following example specifies a log group named `alert-log-group` :
     *
     * `"LogDestination": { "logGroup": "alert-log-group" }`
     *
     * * For a Firehose delivery stream, provide the name of the delivery stream, with key
     * `deliveryStream` . The following example specifies a delivery stream named
     * `alert-delivery-stream` :
     *
     * `"LogDestination": { "deliveryStream": "alert-delivery-stream" }`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-logdestinationconfig.html#cfn-networkfirewall-loggingconfiguration-logdestinationconfig-logdestination)
     */
    public fun logDestination(): Any

    /**
     * The type of storage destination to send these logs to.
     *
     * You can send logs to an Amazon S3 bucket, a CloudWatch log group, or a Firehose delivery
     * stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-logdestinationconfig.html#cfn-networkfirewall-loggingconfiguration-logdestinationconfig-logdestinationtype)
     */
    public fun logDestinationType(): String

    /**
     * The type of log to send.
     *
     * Alert logs report traffic that matches a stateful rule with an action setting that sends an
     * alert log message. Flow logs are standard network traffic flow logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-logdestinationconfig.html#cfn-networkfirewall-loggingconfiguration-logdestinationconfig-logtype)
     */
    public fun logType(): String

    /**
     * A builder for [LogDestinationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logDestination The named location for the logs, provided in a key:value mapping that
       * is specific to the chosen destination type. 
       * * For an Amazon S3 bucket, provide the name of the bucket, with key `bucketName` , and
       * optionally provide a prefix, with key `prefix` . The following example specifies an Amazon S3
       * bucket named `DOC-EXAMPLE-BUCKET` and the prefix `alerts` :
       *
       * `"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }`
       *
       * * For a CloudWatch log group, provide the name of the CloudWatch log group, with key
       * `logGroup` . The following example specifies a log group named `alert-log-group` :
       *
       * `"LogDestination": { "logGroup": "alert-log-group" }`
       *
       * * For a Firehose delivery stream, provide the name of the delivery stream, with key
       * `deliveryStream` . The following example specifies a delivery stream named
       * `alert-delivery-stream` :
       *
       * `"LogDestination": { "deliveryStream": "alert-delivery-stream" }`
       */
      public fun logDestination(logDestination: IResolvable)

      /**
       * @param logDestination The named location for the logs, provided in a key:value mapping that
       * is specific to the chosen destination type. 
       * * For an Amazon S3 bucket, provide the name of the bucket, with key `bucketName` , and
       * optionally provide a prefix, with key `prefix` . The following example specifies an Amazon S3
       * bucket named `DOC-EXAMPLE-BUCKET` and the prefix `alerts` :
       *
       * `"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }`
       *
       * * For a CloudWatch log group, provide the name of the CloudWatch log group, with key
       * `logGroup` . The following example specifies a log group named `alert-log-group` :
       *
       * `"LogDestination": { "logGroup": "alert-log-group" }`
       *
       * * For a Firehose delivery stream, provide the name of the delivery stream, with key
       * `deliveryStream` . The following example specifies a delivery stream named
       * `alert-delivery-stream` :
       *
       * `"LogDestination": { "deliveryStream": "alert-delivery-stream" }`
       */
      public fun logDestination(logDestination: Map<String, String>)

      /**
       * @param logDestinationType The type of storage destination to send these logs to. 
       * You can send logs to an Amazon S3 bucket, a CloudWatch log group, or a Firehose delivery
       * stream.
       */
      public fun logDestinationType(logDestinationType: String)

      /**
       * @param logType The type of log to send. 
       * Alert logs report traffic that matches a stateful rule with an action setting that sends an
       * alert log message. Flow logs are standard network traffic flow logs.
       */
      public fun logType(logType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty.builder()

      /**
       * @param logDestination The named location for the logs, provided in a key:value mapping that
       * is specific to the chosen destination type. 
       * * For an Amazon S3 bucket, provide the name of the bucket, with key `bucketName` , and
       * optionally provide a prefix, with key `prefix` . The following example specifies an Amazon S3
       * bucket named `DOC-EXAMPLE-BUCKET` and the prefix `alerts` :
       *
       * `"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }`
       *
       * * For a CloudWatch log group, provide the name of the CloudWatch log group, with key
       * `logGroup` . The following example specifies a log group named `alert-log-group` :
       *
       * `"LogDestination": { "logGroup": "alert-log-group" }`
       *
       * * For a Firehose delivery stream, provide the name of the delivery stream, with key
       * `deliveryStream` . The following example specifies a delivery stream named
       * `alert-delivery-stream` :
       *
       * `"LogDestination": { "deliveryStream": "alert-delivery-stream" }`
       */
      override fun logDestination(logDestination: IResolvable) {
        cdkBuilder.logDestination(logDestination.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logDestination The named location for the logs, provided in a key:value mapping that
       * is specific to the chosen destination type. 
       * * For an Amazon S3 bucket, provide the name of the bucket, with key `bucketName` , and
       * optionally provide a prefix, with key `prefix` . The following example specifies an Amazon S3
       * bucket named `DOC-EXAMPLE-BUCKET` and the prefix `alerts` :
       *
       * `"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }`
       *
       * * For a CloudWatch log group, provide the name of the CloudWatch log group, with key
       * `logGroup` . The following example specifies a log group named `alert-log-group` :
       *
       * `"LogDestination": { "logGroup": "alert-log-group" }`
       *
       * * For a Firehose delivery stream, provide the name of the delivery stream, with key
       * `deliveryStream` . The following example specifies a delivery stream named
       * `alert-delivery-stream` :
       *
       * `"LogDestination": { "deliveryStream": "alert-delivery-stream" }`
       */
      override fun logDestination(logDestination: Map<String, String>) {
        cdkBuilder.logDestination(logDestination)
      }

      /**
       * @param logDestinationType The type of storage destination to send these logs to. 
       * You can send logs to an Amazon S3 bucket, a CloudWatch log group, or a Firehose delivery
       * stream.
       */
      override fun logDestinationType(logDestinationType: String) {
        cdkBuilder.logDestinationType(logDestinationType)
      }

      /**
       * @param logType The type of log to send. 
       * Alert logs report traffic that matches a stateful rule with an action setting that sends an
       * alert log message. Flow logs are standard network traffic flow logs.
       */
      override fun logType(logType: String) {
        cdkBuilder.logType(logType)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty,
    ) : CdkObject(cdkObject), LogDestinationConfigProperty {
      /**
       * The named location for the logs, provided in a key:value mapping that is specific to the
       * chosen destination type.
       *
       * * For an Amazon S3 bucket, provide the name of the bucket, with key `bucketName` , and
       * optionally provide a prefix, with key `prefix` . The following example specifies an Amazon S3
       * bucket named `DOC-EXAMPLE-BUCKET` and the prefix `alerts` :
       *
       * `"LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }`
       *
       * * For a CloudWatch log group, provide the name of the CloudWatch log group, with key
       * `logGroup` . The following example specifies a log group named `alert-log-group` :
       *
       * `"LogDestination": { "logGroup": "alert-log-group" }`
       *
       * * For a Firehose delivery stream, provide the name of the delivery stream, with key
       * `deliveryStream` . The following example specifies a delivery stream named
       * `alert-delivery-stream` :
       *
       * `"LogDestination": { "deliveryStream": "alert-delivery-stream" }`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-logdestinationconfig.html#cfn-networkfirewall-loggingconfiguration-logdestinationconfig-logdestination)
       */
      override fun logDestination(): Any = unwrap(this).getLogDestination()

      /**
       * The type of storage destination to send these logs to.
       *
       * You can send logs to an Amazon S3 bucket, a CloudWatch log group, or a Firehose delivery
       * stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-logdestinationconfig.html#cfn-networkfirewall-loggingconfiguration-logdestinationconfig-logdestinationtype)
       */
      override fun logDestinationType(): String = unwrap(this).getLogDestinationType()

      /**
       * The type of log to send.
       *
       * Alert logs report traffic that matches a stateful rule with an action setting that sends an
       * alert log message. Flow logs are standard network traffic flow logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-logdestinationconfig.html#cfn-networkfirewall-loggingconfiguration-logdestinationconfig-logtype)
       */
      override fun logType(): String = unwrap(this).getLogType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogDestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty):
          LogDestinationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LogDestinationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDestinationConfigProperty):
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LogDestinationConfigProperty
    }
  }

  /**
   * Defines how AWS Network Firewall performs logging for a `Firewall` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * LoggingConfigurationProperty loggingConfigurationProperty =
   * LoggingConfigurationProperty.builder()
   * .logDestinationConfigs(List.of(LogDestinationConfigProperty.builder()
   * .logDestination(Map.of(
   * "logDestinationKey", "logDestination"))
   * .logDestinationType("logDestinationType")
   * .logType("logType")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-loggingconfiguration.html)
   */
  public interface LoggingConfigurationProperty {
    /**
     * Defines the logging destinations for the logs for a firewall.
     *
     * Network Firewall generates logs for stateful rule groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration-logdestinationconfigs)
     */
    public fun logDestinationConfigs(): Any

    /**
     * A builder for [LoggingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logDestinationConfigs Defines the logging destinations for the logs for a firewall. 
       * Network Firewall generates logs for stateful rule groups.
       */
      public fun logDestinationConfigs(logDestinationConfigs: IResolvable)

      /**
       * @param logDestinationConfigs Defines the logging destinations for the logs for a firewall. 
       * Network Firewall generates logs for stateful rule groups.
       */
      public fun logDestinationConfigs(logDestinationConfigs: List<Any>)

      /**
       * @param logDestinationConfigs Defines the logging destinations for the logs for a firewall. 
       * Network Firewall generates logs for stateful rule groups.
       */
      public fun logDestinationConfigs(vararg logDestinationConfigs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty.builder()

      /**
       * @param logDestinationConfigs Defines the logging destinations for the logs for a firewall. 
       * Network Firewall generates logs for stateful rule groups.
       */
      override fun logDestinationConfigs(logDestinationConfigs: IResolvable) {
        cdkBuilder.logDestinationConfigs(logDestinationConfigs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param logDestinationConfigs Defines the logging destinations for the logs for a firewall. 
       * Network Firewall generates logs for stateful rule groups.
       */
      override fun logDestinationConfigs(logDestinationConfigs: List<Any>) {
        cdkBuilder.logDestinationConfigs(logDestinationConfigs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param logDestinationConfigs Defines the logging destinations for the logs for a firewall. 
       * Network Firewall generates logs for stateful rule groups.
       */
      override fun logDestinationConfigs(vararg logDestinationConfigs: Any): Unit =
          logDestinationConfigs(logDestinationConfigs.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty,
    ) : CdkObject(cdkObject), LoggingConfigurationProperty {
      /**
       * Defines the logging destinations for the logs for a firewall.
       *
       * Network Firewall generates logs for stateful rule groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-loggingconfiguration.html#cfn-networkfirewall-loggingconfiguration-loggingconfiguration-logdestinationconfigs)
       */
      override fun logDestinationConfigs(): Any = unwrap(this).getLogDestinationConfigs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty):
          LoggingConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LoggingConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration.LoggingConfigurationProperty
    }
  }
}
