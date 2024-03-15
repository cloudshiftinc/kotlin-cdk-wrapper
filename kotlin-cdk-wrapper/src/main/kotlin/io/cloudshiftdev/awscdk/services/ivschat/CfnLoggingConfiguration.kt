@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivschat

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::IVSChat::LoggingConfiguration` resource specifies an  logging configuration that allows
 * clients to store and record sent messages.
 *
 * For more information, see
 * [CreateLoggingConfiguration](https://docs.aws.amazon.com/ivs/latest/ChatAPIReference/API_CreateLoggingConfiguration.html)
 * in the *Amazon Interactive Video Service Chat API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivschat.*;
 * CfnLoggingConfiguration cfnLoggingConfiguration = CfnLoggingConfiguration.Builder.create(this,
 * "MyCfnLoggingConfiguration")
 * .destinationConfiguration(DestinationConfigurationProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsDestinationConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build())
 * .firehose(FirehoseDestinationConfigurationProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * .build())
 * .s3(S3DestinationConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .build())
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html)
 */
public open class CfnLoggingConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The logging-configuration ARN.
   *
   * For example: `arn:aws:ivschat:us-west-2:123456789012:logging-configuration/abcdABCDefgh`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The logging-configuration ID.
   *
   * For example: `abcdABCDefgh`
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Indicates the current state of the logging configuration.
   *
   * When the state is `ACTIVE` , the configuration is ready to log a chat session. Valid values:
   * `CREATING` | `CREATE_FAILED` | `DELETING` | `DELETE_FAILED` | `UPDATING` | `UPDATE_FAILED` |
   * `ACTIVE` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The DestinationConfiguration is a complex type that contains information about where chat
   * content will be logged.
   */
  public open fun destinationConfiguration(): Any = unwrap(this).getDestinationConfiguration()

  /**
   * The DestinationConfiguration is a complex type that contains information about where chat
   * content will be logged.
   */
  public open fun destinationConfiguration(`value`: IResolvable) {
    unwrap(this).setDestinationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The DestinationConfiguration is a complex type that contains information about where chat
   * content will be logged.
   */
  public open fun destinationConfiguration(`value`: DestinationConfigurationProperty) {
    unwrap(this).setDestinationConfiguration(`value`.let(DestinationConfigurationProperty::unwrap))
  }

  /**
   * The DestinationConfiguration is a complex type that contains information about where chat
   * content will be logged.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb8803b76214424d9d7ba44fb4c29105aea5a7b60d31a5615f2c7607904e1171")
  public open
      fun destinationConfiguration(`value`: DestinationConfigurationProperty.Builder.() -> Unit):
      Unit = destinationConfiguration(DestinationConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Logging-configuration name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Logging-configuration name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivschat.CfnLoggingConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The DestinationConfiguration is a complex type that contains information about where chat
     * content will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration)
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    public fun destinationConfiguration(destinationConfiguration: IResolvable)

    /**
     * The DestinationConfiguration is a complex type that contains information about where chat
     * content will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration)
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    public fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty)

    /**
     * The DestinationConfiguration is a complex type that contains information about where chat
     * content will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration)
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18eb57c632a1391c6a0d20056d1ab98d9496299c5c2cd11e1bc8805249aef694")
    public
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * Logging-configuration name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-name)
     * @param name Logging-configuration name. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.Builder
        = software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.Builder.create(scope, id)

    /**
     * The DestinationConfiguration is a complex type that contains information about where chat
     * content will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration)
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    override fun destinationConfiguration(destinationConfiguration: IResolvable) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The DestinationConfiguration is a complex type that contains information about where chat
     * content will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration)
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    override
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(DestinationConfigurationProperty::unwrap))
    }

    /**
     * The DestinationConfiguration is a complex type that contains information about where chat
     * content will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration)
     * @param destinationConfiguration The DestinationConfiguration is a complex type that contains
     * information about where chat content will be logged. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18eb57c632a1391c6a0d20056d1ab98d9496299c5c2cd11e1bc8805249aef694")
    override
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty.Builder.() -> Unit):
        Unit = destinationConfiguration(DestinationConfigurationProperty(destinationConfiguration))

    /**
     * Logging-configuration name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-name)
     * @param name Logging-configuration name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivschat-loggingconfiguration.html#cfn-ivschat-loggingconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggingConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration):
        CfnLoggingConfiguration = CfnLoggingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfiguration):
        software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration = wrapped.cdkObject
  }

  /**
   * The CloudWatchLogsDestinationConfiguration property type specifies a CloudWatch Logs location
   * where chat logs will be stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivschat.*;
   * CloudWatchLogsDestinationConfigurationProperty cloudWatchLogsDestinationConfigurationProperty =
   * CloudWatchLogsDestinationConfigurationProperty.builder()
   * .logGroupName("logGroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-cloudwatchlogsdestinationconfiguration.html)
   */
  public interface CloudWatchLogsDestinationConfigurationProperty {
    /**
     * Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-cloudwatchlogsdestinationconfiguration.html#cfn-ivschat-loggingconfiguration-cloudwatchlogsdestinationconfiguration-loggroupname)
     */
    public fun logGroupName(): String

    /**
     * A builder for [CloudWatchLogsDestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupName Name of the Amazon Cloudwatch Logs destination where chat activity will
       * be logged. 
       */
      public fun logGroupName(logGroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty.builder()

      /**
       * @param logGroupName Name of the Amazon Cloudwatch Logs destination where chat activity will
       * be logged. 
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsDestinationConfigurationProperty {
      /**
       * Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-cloudwatchlogsdestinationconfiguration.html#cfn-ivschat-loggingconfiguration-cloudwatchlogsdestinationconfiguration-loggroupname)
       */
      override fun logGroupName(): String = unwrap(this).getLogGroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty):
          CloudWatchLogsDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsDestinationConfigurationProperty):
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty
    }
  }

  /**
   * The FirehoseDestinationConfiguration property type specifies a Kinesis Firehose location where
   * chat logs will be stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivschat.*;
   * FirehoseDestinationConfigurationProperty firehoseDestinationConfigurationProperty =
   * FirehoseDestinationConfigurationProperty.builder()
   * .deliveryStreamName("deliveryStreamName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-firehosedestinationconfiguration.html)
   */
  public interface FirehoseDestinationConfigurationProperty {
    /**
     * Name of the Amazon Kinesis Firehose delivery stream where chat activity will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-firehosedestinationconfiguration.html#cfn-ivschat-loggingconfiguration-firehosedestinationconfiguration-deliverystreamname)
     */
    public fun deliveryStreamName(): String

    /**
     * A builder for [FirehoseDestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStreamName Name of the Amazon Kinesis Firehose delivery stream where chat
       * activity will be logged. 
       */
      public fun deliveryStreamName(deliveryStreamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.builder()

      /**
       * @param deliveryStreamName Name of the Amazon Kinesis Firehose delivery stream where chat
       * activity will be logged. 
       */
      override fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
      }

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty,
    ) : CdkObject(cdkObject), FirehoseDestinationConfigurationProperty {
      /**
       * Name of the Amazon Kinesis Firehose delivery stream where chat activity will be logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-firehosedestinationconfiguration.html#cfn-ivschat-loggingconfiguration-firehosedestinationconfiguration-deliverystreamname)
       */
      override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FirehoseDestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty):
          FirehoseDestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirehoseDestinationConfigurationProperty):
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty
    }
  }

  /**
   * The DestinationConfiguration property type describes a location where chat logs will be stored.
   *
   * Each member represents the configuration of one log destination. For logging, you define only
   * one type of destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivschat.*;
   * DestinationConfigurationProperty destinationConfigurationProperty =
   * DestinationConfigurationProperty.builder()
   * .cloudWatchLogs(CloudWatchLogsDestinationConfigurationProperty.builder()
   * .logGroupName("logGroupName")
   * .build())
   * .firehose(FirehoseDestinationConfigurationProperty.builder()
   * .deliveryStreamName("deliveryStreamName")
   * .build())
   * .s3(S3DestinationConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-destinationconfiguration.html)
   */
  public interface DestinationConfigurationProperty {
    /**
     * An Amazon CloudWatch Logs destination configuration where chat activity will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-destinationconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration-cloudwatchlogs)
     */
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    /**
     * An Amazon Kinesis Data Firehose destination configuration where chat activity will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-destinationconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration-firehose)
     */
    public fun firehose(): Any? = unwrap(this).getFirehose()

    /**
     * An Amazon S3 destination configuration where chat activity will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-destinationconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [DestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogs An Amazon CloudWatch Logs destination configuration where chat
       * activity will be logged.
       */
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable)

      /**
       * @param cloudWatchLogs An Amazon CloudWatch Logs destination configuration where chat
       * activity will be logged.
       */
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsDestinationConfigurationProperty)

      /**
       * @param cloudWatchLogs An Amazon CloudWatch Logs destination configuration where chat
       * activity will be logged.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3968e85bcc2c237bcec17c819acdc83e32d3ffadd52380cabcb56b86085b3fef")
      public
          fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsDestinationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param firehose An Amazon Kinesis Data Firehose destination configuration where chat
       * activity will be logged.
       */
      public fun firehose(firehose: IResolvable)

      /**
       * @param firehose An Amazon Kinesis Data Firehose destination configuration where chat
       * activity will be logged.
       */
      public fun firehose(firehose: FirehoseDestinationConfigurationProperty)

      /**
       * @param firehose An Amazon Kinesis Data Firehose destination configuration where chat
       * activity will be logged.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5833b0964624baeda12c696042c032ca461b193e07f2a8a9ca7a9ff2c58cd6a")
      public fun firehose(firehose: FirehoseDestinationConfigurationProperty.Builder.() -> Unit)

      /**
       * @param s3 An Amazon S3 destination configuration where chat activity will be logged.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 An Amazon S3 destination configuration where chat activity will be logged.
       */
      public fun s3(s3: S3DestinationConfigurationProperty)

      /**
       * @param s3 An Amazon S3 destination configuration where chat activity will be logged.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93a3f0da321aee205bede398975e578ba3c4c961686a7cb73d1cce27830adf22")
      public fun s3(s3: S3DestinationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty.builder()

      /**
       * @param cloudWatchLogs An Amazon CloudWatch Logs destination configuration where chat
       * activity will be logged.
       */
      override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLogs An Amazon CloudWatch Logs destination configuration where chat
       * activity will be logged.
       */
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsDestinationConfigurationProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsDestinationConfigurationProperty::unwrap))
      }

      /**
       * @param cloudWatchLogs An Amazon CloudWatch Logs destination configuration where chat
       * activity will be logged.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3968e85bcc2c237bcec17c819acdc83e32d3ffadd52380cabcb56b86085b3fef")
      override
          fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsDestinationConfigurationProperty.Builder.() -> Unit):
          Unit = cloudWatchLogs(CloudWatchLogsDestinationConfigurationProperty(cloudWatchLogs))

      /**
       * @param firehose An Amazon Kinesis Data Firehose destination configuration where chat
       * activity will be logged.
       */
      override fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose.let(IResolvable::unwrap))
      }

      /**
       * @param firehose An Amazon Kinesis Data Firehose destination configuration where chat
       * activity will be logged.
       */
      override fun firehose(firehose: FirehoseDestinationConfigurationProperty) {
        cdkBuilder.firehose(firehose.let(FirehoseDestinationConfigurationProperty::unwrap))
      }

      /**
       * @param firehose An Amazon Kinesis Data Firehose destination configuration where chat
       * activity will be logged.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a5833b0964624baeda12c696042c032ca461b193e07f2a8a9ca7a9ff2c58cd6a")
      override fun firehose(firehose: FirehoseDestinationConfigurationProperty.Builder.() -> Unit):
          Unit = firehose(FirehoseDestinationConfigurationProperty(firehose))

      /**
       * @param s3 An Amazon S3 destination configuration where chat activity will be logged.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      /**
       * @param s3 An Amazon S3 destination configuration where chat activity will be logged.
       */
      override fun s3(s3: S3DestinationConfigurationProperty) {
        cdkBuilder.s3(s3.let(S3DestinationConfigurationProperty::unwrap))
      }

      /**
       * @param s3 An Amazon S3 destination configuration where chat activity will be logged.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("93a3f0da321aee205bede398975e578ba3c4c961686a7cb73d1cce27830adf22")
      override fun s3(s3: S3DestinationConfigurationProperty.Builder.() -> Unit): Unit =
          s3(S3DestinationConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty,
    ) : CdkObject(cdkObject), DestinationConfigurationProperty {
      /**
       * An Amazon CloudWatch Logs destination configuration where chat activity will be logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-destinationconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration-cloudwatchlogs)
       */
      override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      /**
       * An Amazon Kinesis Data Firehose destination configuration where chat activity will be
       * logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-destinationconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration-firehose)
       */
      override fun firehose(): Any? = unwrap(this).getFirehose()

      /**
       * An Amazon S3 destination configuration where chat activity will be logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-destinationconfiguration.html#cfn-ivschat-loggingconfiguration-destinationconfiguration-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty):
          DestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigurationProperty):
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.DestinationConfigurationProperty
    }
  }

  /**
   * The S3DestinationConfiguration property type specifies an S3 location where chat logs will be
   * stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivschat.*;
   * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
   * S3DestinationConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-s3destinationconfiguration.html)
   */
  public interface S3DestinationConfigurationProperty {
    /**
     * Name of the Amazon S3 bucket where chat activity will be logged.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-s3destinationconfiguration.html#cfn-ivschat-loggingconfiguration-s3destinationconfiguration-bucketname)
     */
    public fun bucketName(): String

    /**
     * A builder for [S3DestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName Name of the Amazon S3 bucket where chat activity will be logged. 
       */
      public fun bucketName(bucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty.builder()

      /**
       * @param bucketName Name of the Amazon S3 bucket where chat activity will be logged. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty,
    ) : CdkObject(cdkObject), S3DestinationConfigurationProperty {
      /**
       * Name of the Amazon S3 bucket where chat activity will be logged.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-s3destinationconfiguration.html#cfn-ivschat-loggingconfiguration-s3destinationconfiguration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty):
          S3DestinationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationConfigurationProperty):
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration.S3DestinationConfigurationProperty
    }
  }
}
