@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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
 * A real-time log configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnRealtimeLogConfig cfnRealtimeLogConfig = CfnRealtimeLogConfig.Builder.create(this,
 * "MyCfnRealtimeLogConfig")
 * .endPoints(List.of(EndPointProperty.builder()
 * .kinesisStreamConfig(KinesisStreamConfigProperty.builder()
 * .roleArn("roleArn")
 * .streamArn("streamArn")
 * .build())
 * .streamType("streamType")
 * .build()))
 * .fields(List.of("fields"))
 * .name("name")
 * .samplingRate(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html)
 */
public open class CfnRealtimeLogConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRealtimeLogConfigProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRealtimeLogConfigProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRealtimeLogConfigProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRealtimeLogConfigProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the real-time log configuration.
   *
   * For example:
   * `arn:aws:cloudfront::111122223333:realtime-log-config/ExampleNameForRealtimeLogConfig` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Contains information about the Amazon Kinesis data stream where you are sending real-time log
   * data for this real-time log configuration.
   */
  public open fun endPoints(): Any = unwrap(this).getEndPoints()

  /**
   * Contains information about the Amazon Kinesis data stream where you are sending real-time log
   * data for this real-time log configuration.
   */
  public open fun endPoints(`value`: IResolvable) {
    unwrap(this).setEndPoints(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains information about the Amazon Kinesis data stream where you are sending real-time log
   * data for this real-time log configuration.
   */
  public open fun endPoints(`value`: List<Any>) {
    unwrap(this).setEndPoints(`value`)
  }

  /**
   * Contains information about the Amazon Kinesis data stream where you are sending real-time log
   * data for this real-time log configuration.
   */
  public open fun endPoints(vararg `value`: Any): Unit = endPoints(`value`.toList())

  /**
   * A list of fields that are included in each real-time log record.
   */
  public open fun fields(): List<String> = unwrap(this).getFields()

  /**
   * A list of fields that are included in each real-time log record.
   */
  public open fun fields(`value`: List<String>) {
    unwrap(this).setFields(`value`)
  }

  /**
   * A list of fields that are included in each real-time log record.
   */
  public open fun fields(vararg `value`: String): Unit = fields(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The unique name of this real-time log configuration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The unique name of this real-time log configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The sampling rate for this real-time log configuration.
   */
  public open fun samplingRate(): Number = unwrap(this).getSamplingRate()

  /**
   * The sampling rate for this real-time log configuration.
   */
  public open fun samplingRate(`value`: Number) {
    unwrap(this).setSamplingRate(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnRealtimeLogConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-endpoints)
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    public fun endPoints(endPoints: IResolvable)

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-endpoints)
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    public fun endPoints(endPoints: List<Any>)

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-endpoints)
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    public fun endPoints(vararg endPoints: Any)

    /**
     * A list of fields that are included in each real-time log record.
     *
     * In an API response, the fields are provided in the same order in which they are sent to the
     * Amazon Kinesis data stream.
     *
     * For more information about fields, see [Real-time log configuration
     * fields](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-fields)
     * @param fields A list of fields that are included in each real-time log record. 
     */
    public fun fields(fields: List<String>)

    /**
     * A list of fields that are included in each real-time log record.
     *
     * In an API response, the fields are provided in the same order in which they are sent to the
     * Amazon Kinesis data stream.
     *
     * For more information about fields, see [Real-time log configuration
     * fields](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-fields)
     * @param fields A list of fields that are included in each real-time log record. 
     */
    public fun fields(vararg fields: String)

    /**
     * The unique name of this real-time log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-name)
     * @param name The unique name of this real-time log configuration. 
     */
    public fun name(name: String)

    /**
     * The sampling rate for this real-time log configuration.
     *
     * The sampling rate determines the percentage of viewer requests that are represented in the
     * real-time log data. The sampling rate is an integer between 1 and 100, inclusive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-samplingrate)
     * @param samplingRate The sampling rate for this real-time log configuration. 
     */
    public fun samplingRate(samplingRate: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.Builder
        = software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.Builder.create(scope, id)

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-endpoints)
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    override fun endPoints(endPoints: IResolvable) {
      cdkBuilder.endPoints(endPoints.let(IResolvable::unwrap))
    }

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-endpoints)
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    override fun endPoints(endPoints: List<Any>) {
      cdkBuilder.endPoints(endPoints)
    }

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data for this real-time log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-endpoints)
     * @param endPoints Contains information about the Amazon Kinesis data stream where you are
     * sending real-time log data for this real-time log configuration. 
     */
    override fun endPoints(vararg endPoints: Any): Unit = endPoints(endPoints.toList())

    /**
     * A list of fields that are included in each real-time log record.
     *
     * In an API response, the fields are provided in the same order in which they are sent to the
     * Amazon Kinesis data stream.
     *
     * For more information about fields, see [Real-time log configuration
     * fields](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-fields)
     * @param fields A list of fields that are included in each real-time log record. 
     */
    override fun fields(fields: List<String>) {
      cdkBuilder.fields(fields)
    }

    /**
     * A list of fields that are included in each real-time log record.
     *
     * In an API response, the fields are provided in the same order in which they are sent to the
     * Amazon Kinesis data stream.
     *
     * For more information about fields, see [Real-time log configuration
     * fields](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-fields)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-fields)
     * @param fields A list of fields that are included in each real-time log record. 
     */
    override fun fields(vararg fields: String): Unit = fields(fields.toList())

    /**
     * The unique name of this real-time log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-name)
     * @param name The unique name of this real-time log configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The sampling rate for this real-time log configuration.
     *
     * The sampling rate determines the percentage of viewer requests that are represented in the
     * real-time log data. The sampling rate is an integer between 1 and 100, inclusive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html#cfn-cloudfront-realtimelogconfig-samplingrate)
     * @param samplingRate The sampling rate for this real-time log configuration. 
     */
    override fun samplingRate(samplingRate: Number) {
      cdkBuilder.samplingRate(samplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRealtimeLogConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRealtimeLogConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig):
        CfnRealtimeLogConfig = CfnRealtimeLogConfig(cdkObject)

    internal fun unwrap(wrapped: CfnRealtimeLogConfig):
        software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig = wrapped.cdkObject
  }

  /**
   * Contains information about the Amazon Kinesis data stream where you are sending real-time log
   * data in a real-time log configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * EndPointProperty endPointProperty = EndPointProperty.builder()
   * .kinesisStreamConfig(KinesisStreamConfigProperty.builder()
   * .roleArn("roleArn")
   * .streamArn("streamArn")
   * .build())
   * .streamType("streamType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-endpoint.html)
   */
  public interface EndPointProperty {
    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-endpoint.html#cfn-cloudfront-realtimelogconfig-endpoint-kinesisstreamconfig)
     */
    public fun kinesisStreamConfig(): Any

    /**
     * The type of data stream where you are sending real-time log data.
     *
     * The only valid value is `Kinesis` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-endpoint.html#cfn-cloudfront-realtimelogconfig-endpoint-streamtype)
     */
    public fun streamType(): String

    /**
     * A builder for [EndPointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kinesisStreamConfig Contains information about the Amazon Kinesis data stream where
       * you are sending real-time log data. 
       */
      public fun kinesisStreamConfig(kinesisStreamConfig: IResolvable)

      /**
       * @param kinesisStreamConfig Contains information about the Amazon Kinesis data stream where
       * you are sending real-time log data. 
       */
      public fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty)

      /**
       * @param kinesisStreamConfig Contains information about the Amazon Kinesis data stream where
       * you are sending real-time log data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21e06eb0d0db3e46cab2d6c2972df2baca66b17c976eb901ccf7465cf00c8344")
      public
          fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty.Builder.() -> Unit)

      /**
       * @param streamType The type of data stream where you are sending real-time log data. 
       * The only valid value is `Kinesis` .
       */
      public fun streamType(streamType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty.builder()

      /**
       * @param kinesisStreamConfig Contains information about the Amazon Kinesis data stream where
       * you are sending real-time log data. 
       */
      override fun kinesisStreamConfig(kinesisStreamConfig: IResolvable) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisStreamConfig Contains information about the Amazon Kinesis data stream where
       * you are sending real-time log data. 
       */
      override fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty) {
        cdkBuilder.kinesisStreamConfig(kinesisStreamConfig.let(KinesisStreamConfigProperty::unwrap))
      }

      /**
       * @param kinesisStreamConfig Contains information about the Amazon Kinesis data stream where
       * you are sending real-time log data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21e06eb0d0db3e46cab2d6c2972df2baca66b17c976eb901ccf7465cf00c8344")
      override
          fun kinesisStreamConfig(kinesisStreamConfig: KinesisStreamConfigProperty.Builder.() -> Unit):
          Unit = kinesisStreamConfig(KinesisStreamConfigProperty(kinesisStreamConfig))

      /**
       * @param streamType The type of data stream where you are sending real-time log data. 
       * The only valid value is `Kinesis` .
       */
      override fun streamType(streamType: String) {
        cdkBuilder.streamType(streamType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty,
    ) : CdkObject(cdkObject), EndPointProperty {
      /**
       * Contains information about the Amazon Kinesis data stream where you are sending real-time
       * log data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-endpoint.html#cfn-cloudfront-realtimelogconfig-endpoint-kinesisstreamconfig)
       */
      override fun kinesisStreamConfig(): Any = unwrap(this).getKinesisStreamConfig()

      /**
       * The type of data stream where you are sending real-time log data.
       *
       * The only valid value is `Kinesis` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-endpoint.html#cfn-cloudfront-realtimelogconfig-endpoint-streamtype)
       */
      override fun streamType(): String = unwrap(this).getStreamType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndPointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty):
          EndPointProperty = CdkObjectWrappers.wrap(cdkObject) as? EndPointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndPointProperty):
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.EndPointProperty
    }
  }

  /**
   * Contains information about the Amazon Kinesis data stream where you are sending real-time log
   * data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * KinesisStreamConfigProperty kinesisStreamConfigProperty = KinesisStreamConfigProperty.builder()
   * .roleArn("roleArn")
   * .streamArn("streamArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-kinesisstreamconfig.html)
   */
  public interface KinesisStreamConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that
     * CloudFront can use to send real-time log data to your Kinesis data stream.
     *
     * For more information the IAM role, see [Real-time log configuration IAM
     * role](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-kinesisstreamconfig.html#cfn-cloudfront-realtimelogconfig-kinesisstreamconfig-rolearn)
     */
    public fun roleArn(): String

    /**
     * The Amazon Resource Name (ARN) of the Kinesis data stream where you are sending real-time log
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-kinesisstreamconfig.html#cfn-cloudfront-realtimelogconfig-kinesisstreamconfig-streamarn)
     */
    public fun streamArn(): String

    /**
     * A builder for [KinesisStreamConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn The Amazon Resource Name (ARN) of an AWS Identity and Access Management
       * (IAM) role that CloudFront can use to send real-time log data to your Kinesis data stream. 
       * For more information the IAM role, see [Real-time log configuration IAM
       * role](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun roleArn(roleArn: String)

      /**
       * @param streamArn The Amazon Resource Name (ARN) of the Kinesis data stream where you are
       * sending real-time log data. 
       */
      public fun streamArn(streamArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty.builder()

      /**
       * @param roleArn The Amazon Resource Name (ARN) of an AWS Identity and Access Management
       * (IAM) role that CloudFront can use to send real-time log data to your Kinesis data stream. 
       * For more information the IAM role, see [Real-time log configuration IAM
       * role](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param streamArn The Amazon Resource Name (ARN) of the Kinesis data stream where you are
       * sending real-time log data. 
       */
      override fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty,
    ) : CdkObject(cdkObject), KinesisStreamConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that
       * CloudFront can use to send real-time log data to your Kinesis data stream.
       *
       * For more information the IAM role, see [Real-time log configuration IAM
       * role](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-kinesisstreamconfig.html#cfn-cloudfront-realtimelogconfig-kinesisstreamconfig-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The Amazon Resource Name (ARN) of the Kinesis data stream where you are sending real-time
       * log data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-kinesisstreamconfig.html#cfn-cloudfront-realtimelogconfig-kinesisstreamconfig-streamarn)
       */
      override fun streamArn(): String = unwrap(this).getStreamArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty):
          KinesisStreamConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisStreamConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig.KinesisStreamConfigProperty
    }
  }
}
