@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

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
 * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application.
 *
 * If you want Kinesis Data Analytics to deliver data from an in-application stream within your
 * application to an external destination (such as an Kinesis data stream, a Kinesis Data Firehose
 * delivery stream, or an Amazon Lambda function), you add the relevant configuration to your
 * application using this operation. You can configure one or more outputs for your application. Each
 * output configuration maps an in-application stream and an external destination.
 *
 * You can use one of the output configurations to deliver data from your in-application error
 * stream to an external destination so that you can analyze the errors.
 *
 * Any configuration update, including adding a streaming source using this operation, results in a
 * new version of the application. You can use the
 * [DescribeApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_DescribeApplication.html)
 * operation to find the current application version.
 *
 *
 * Creation of multiple outputs should be sequential (use of DependsOn) to avoid a problem with a
 * stale application version ( *ConcurrentModificationException* ).
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
 * CfnApplicationOutputV2 cfnApplicationOutputV2 = CfnApplicationOutputV2.Builder.create(this,
 * "MyCfnApplicationOutputV2")
 * .applicationName("applicationName")
 * .output(OutputProperty.builder()
 * .destinationSchema(DestinationSchemaProperty.builder()
 * .recordFormatType("recordFormatType")
 * .build())
 * // the properties below are optional
 * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .lambdaOutput(LambdaOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .build())
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html)
 */
public open class CfnApplicationOutputV2(
  cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationOutputV2Props,
  ) :
      this(software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationOutputV2Props.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationOutputV2Props.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationOutputV2Props(props)
  )

  /**
   * The name of the application.
   */
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  /**
   * The name of the application.
   */
  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  /**
   *
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
   * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
   * identify an in-application stream and a destination where you want the in-application stream data
   * to be written.
   */
  public open fun output(): Any = unwrap(this).getOutput()

  /**
   * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
   * identify an in-application stream and a destination where you want the in-application stream data
   * to be written.
   */
  public open fun output(`value`: IResolvable) {
    unwrap(this).setOutput(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
   * identify an in-application stream and a destination where you want the in-application stream data
   * to be written.
   */
  public open fun output(`value`: OutputProperty) {
    unwrap(this).setOutput(`value`.let(OutputProperty.Companion::unwrap))
  }

  /**
   * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
   * identify an in-application stream and a destination where you want the in-application stream data
   * to be written.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1fcf52fb5c05906617cacd530e99f97ba04d36dc214abe10c6e09e49001277a4")
  public open fun output(`value`: OutputProperty.Builder.() -> Unit): Unit =
      output(OutputProperty(`value`))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.kinesisanalytics.CfnApplicationOutputV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-applicationname)
     * @param applicationName The name of the application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
     * identify an in-application stream and a destination where you want the in-application stream
     * data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Kinesis Data Analytics application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    public fun output(output: IResolvable)

    /**
     * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
     * identify an in-application stream and a destination where you want the in-application stream
     * data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Kinesis Data Analytics application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    public fun output(output: OutputProperty)

    /**
     * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
     * identify an in-application stream and a destination where you want the in-application stream
     * data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Kinesis Data Analytics application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48c924cad691819a315f85bebf5ee57da3ad1ca794b856cc4a33c42bb866627c")
    public fun output(output: OutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.Builder.create(scope,
        id)

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-applicationname)
     * @param applicationName The name of the application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
     * identify an in-application stream and a destination where you want the in-application stream
     * data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Kinesis Data Analytics application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    override fun output(output: IResolvable) {
      cdkBuilder.output(output.let(IResolvable.Companion::unwrap))
    }

    /**
     * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
     * identify an in-application stream and a destination where you want the in-application stream
     * data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Kinesis Data Analytics application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    override fun output(output: OutputProperty) {
      cdkBuilder.output(output.let(OutputProperty.Companion::unwrap))
    }

    /**
     * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
     * identify an in-application stream and a destination where you want the in-application stream
     * data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Kinesis Data Analytics application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48c924cad691819a315f85bebf5ee57da3ad1ca794b856cc4a33c42bb866627c")
    override fun output(output: OutputProperty.Builder.() -> Unit): Unit =
        output(OutputProperty(output))

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2 =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationOutputV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationOutputV2(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2):
        CfnApplicationOutputV2 = CfnApplicationOutputV2(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationOutputV2):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2 = wrapped.cdkObject
        as software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
  }

  /**
   * Describes the data format when records are written to the destination in a SQL-based Kinesis
   * Data Analytics application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * DestinationSchemaProperty destinationSchemaProperty = DestinationSchemaProperty.builder()
   * .recordFormatType("recordFormatType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html)
   */
  public interface DestinationSchemaProperty {
    /**
     * Specifies the format of the records on the output stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html#cfn-kinesisanalyticsv2-applicationoutput-destinationschema-recordformattype)
     */
    public fun recordFormatType(): String? = unwrap(this).getRecordFormatType()

    /**
     * A builder for [DestinationSchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordFormatType Specifies the format of the records on the output stream.
       */
      public fun recordFormatType(recordFormatType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty.builder()

      /**
       * @param recordFormatType Specifies the format of the records on the output stream.
       */
      override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty,
    ) : CdkObject(cdkObject),
        DestinationSchemaProperty {
      /**
       * Specifies the format of the records on the output stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html#cfn-kinesisanalyticsv2-applicationoutput-destinationschema-recordformattype)
       */
      override fun recordFormatType(): String? = unwrap(this).getRecordFormatType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty):
          DestinationSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationSchemaProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationSchemaProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, when configuring application output,
   * identifies a Kinesis Data Firehose delivery stream as the destination.
   *
   * You provide the stream Amazon Resource Name (ARN) of the delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * KinesisFirehoseOutputProperty kinesisFirehoseOutputProperty =
   * KinesisFirehoseOutputProperty.builder()
   * .resourceArn("resourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html)
   */
  public interface KinesisFirehoseOutputProperty {
    /**
     * The ARN of the destination delivery stream to write to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * A builder for [KinesisFirehoseOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn The ARN of the destination delivery stream to write to. 
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty.builder()

      /**
       * @param resourceArn The ARN of the destination delivery stream to write to. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty,
    ) : CdkObject(cdkObject),
        KinesisFirehoseOutputProperty {
      /**
       * The ARN of the destination delivery stream to write to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty):
          KinesisFirehoseOutputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisFirehoseOutputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty
    }
  }

  /**
   * When you configure a SQL-based Kinesis Data Analytics application's output, identifies a
   * Kinesis data stream as the destination.
   *
   * You provide the stream Amazon Resource Name (ARN).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * KinesisStreamsOutputProperty kinesisStreamsOutputProperty =
   * KinesisStreamsOutputProperty.builder()
   * .resourceArn("resourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html)
   */
  public interface KinesisStreamsOutputProperty {
    /**
     * The ARN of the destination Kinesis data stream to write to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * A builder for [KinesisStreamsOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn The ARN of the destination Kinesis data stream to write to. 
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty.builder()

      /**
       * @param resourceArn The ARN of the destination Kinesis data stream to write to. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty,
    ) : CdkObject(cdkObject),
        KinesisStreamsOutputProperty {
      /**
       * The ARN of the destination Kinesis data stream to write to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamsOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty):
          KinesisStreamsOutputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisStreamsOutputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamsOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty
    }
  }

  /**
   * When you configure a SQL-based Kinesis Data Analytics application's output, identifies an
   * Amazon Lambda function as the destination.
   *
   * You provide the function Amazon Resource Name (ARN) of the Lambda function.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * LambdaOutputProperty lambdaOutputProperty = LambdaOutputProperty.builder()
   * .resourceArn("resourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html)
   */
  public interface LambdaOutputProperty {
    /**
     * The Amazon Resource Name (ARN) of the destination Lambda function to write to.
     *
     *
     * To specify an earlier version of the Lambda function than the latest, include the Lambda
     * function version in the Lambda function ARN. For more information about Lambda ARNs, see
     * [Example ARNs: Amazon
     * Lambda](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html#cfn-kinesisanalyticsv2-applicationoutput-lambdaoutput-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * A builder for [LambdaOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the destination Lambda function to
       * write to. 
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: Amazon
       * Lambda](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty.builder()

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the destination Lambda function to
       * write to. 
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: Amazon
       * Lambda](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty,
    ) : CdkObject(cdkObject),
        LambdaOutputProperty {
      /**
       * The Amazon Resource Name (ARN) of the destination Lambda function to write to.
       *
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: Amazon
       * Lambda](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-lambdaoutput.html#cfn-kinesisanalyticsv2-applicationoutput-lambdaoutput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty):
          LambdaOutputProperty = CdkObjectWrappers.wrap(cdkObject) as? LambdaOutputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty
    }
  }

  /**
   * Describes a SQL-based Kinesis Data Analytics application's output configuration, in which you
   * identify an in-application stream and a destination where you want the in-application stream data
   * to be written.
   *
   * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * OutputProperty outputProperty = OutputProperty.builder()
   * .destinationSchema(DestinationSchemaProperty.builder()
   * .recordFormatType("recordFormatType")
   * .build())
   * // the properties below are optional
   * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .lambdaOutput(LambdaOutputProperty.builder()
   * .resourceArn("resourceArn")
   * .build())
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html)
   */
  public interface OutputProperty {
    /**
     * Describes the data format when records are written to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-destinationschema)
     */
    public fun destinationSchema(): Any

    /**
     * Identifies a Kinesis Data Firehose delivery stream as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-kinesisfirehoseoutput)
     */
    public fun kinesisFirehoseOutput(): Any? = unwrap(this).getKinesisFirehoseOutput()

    /**
     * Identifies a Kinesis data stream as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-kinesisstreamsoutput)
     */
    public fun kinesisStreamsOutput(): Any? = unwrap(this).getKinesisStreamsOutput()

    /**
     * Identifies an Amazon Lambda function as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-lambdaoutput)
     */
    public fun lambdaOutput(): Any? = unwrap(this).getLambdaOutput()

    /**
     * The name of the in-application stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [OutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       */
      public fun destinationSchema(destinationSchema: IResolvable)

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       */
      public fun destinationSchema(destinationSchema: DestinationSchemaProperty)

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91db7e98310ca5542122f569c5226de205ab8581e37feba395c0909056368967")
      public fun destinationSchema(destinationSchema: DestinationSchemaProperty.Builder.() -> Unit)

      /**
       * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
       * destination.
       */
      public fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable)

      /**
       * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
       * destination.
       */
      public fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty)

      /**
       * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
       * destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ab7a0f9a0287599d91f1fde38836e53738eb5d7704c91285815d843376a8a8b")
      public
          fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty.Builder.() -> Unit)

      /**
       * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
       */
      public fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable)

      /**
       * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
       */
      public fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty)

      /**
       * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c694330ef81f9fd59f428bd7c6c72f2a3e0562237eeb961b179186cf4676ba03")
      public
          fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty.Builder.() -> Unit)

      /**
       * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
       */
      public fun lambdaOutput(lambdaOutput: IResolvable)

      /**
       * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
       */
      public fun lambdaOutput(lambdaOutput: LambdaOutputProperty)

      /**
       * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f129f7261e7be0d07f5c2ace8e6e7fccc64f964916cb805e2512631300011c02")
      public fun lambdaOutput(lambdaOutput: LambdaOutputProperty.Builder.() -> Unit)

      /**
       * @param name The name of the in-application stream.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.builder()

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       */
      override fun destinationSchema(destinationSchema: IResolvable) {
        cdkBuilder.destinationSchema(destinationSchema.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       */
      override fun destinationSchema(destinationSchema: DestinationSchemaProperty) {
        cdkBuilder.destinationSchema(destinationSchema.let(DestinationSchemaProperty.Companion::unwrap))
      }

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91db7e98310ca5542122f569c5226de205ab8581e37feba395c0909056368967")
      override
          fun destinationSchema(destinationSchema: DestinationSchemaProperty.Builder.() -> Unit):
          Unit = destinationSchema(DestinationSchemaProperty(destinationSchema))

      /**
       * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
       * destination.
       */
      override fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
       * destination.
       */
      override fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput.let(KinesisFirehoseOutputProperty.Companion::unwrap))
      }

      /**
       * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
       * destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ab7a0f9a0287599d91f1fde38836e53738eb5d7704c91285815d843376a8a8b")
      override
          fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty.Builder.() -> Unit):
          Unit = kinesisFirehoseOutput(KinesisFirehoseOutputProperty(kinesisFirehoseOutput))

      /**
       * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
       */
      override fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
       */
      override fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput.let(KinesisStreamsOutputProperty.Companion::unwrap))
      }

      /**
       * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c694330ef81f9fd59f428bd7c6c72f2a3e0562237eeb961b179186cf4676ba03")
      override
          fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty.Builder.() -> Unit):
          Unit = kinesisStreamsOutput(KinesisStreamsOutputProperty(kinesisStreamsOutput))

      /**
       * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
       */
      override fun lambdaOutput(lambdaOutput: IResolvable) {
        cdkBuilder.lambdaOutput(lambdaOutput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
       */
      override fun lambdaOutput(lambdaOutput: LambdaOutputProperty) {
        cdkBuilder.lambdaOutput(lambdaOutput.let(LambdaOutputProperty.Companion::unwrap))
      }

      /**
       * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f129f7261e7be0d07f5c2ace8e6e7fccc64f964916cb805e2512631300011c02")
      override fun lambdaOutput(lambdaOutput: LambdaOutputProperty.Builder.() -> Unit): Unit =
          lambdaOutput(LambdaOutputProperty(lambdaOutput))

      /**
       * @param name The name of the in-application stream.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty,
    ) : CdkObject(cdkObject),
        OutputProperty {
      /**
       * Describes the data format when records are written to the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-destinationschema)
       */
      override fun destinationSchema(): Any = unwrap(this).getDestinationSchema()

      /**
       * Identifies a Kinesis Data Firehose delivery stream as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-kinesisfirehoseoutput)
       */
      override fun kinesisFirehoseOutput(): Any? = unwrap(this).getKinesisFirehoseOutput()

      /**
       * Identifies a Kinesis data stream as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-kinesisstreamsoutput)
       */
      override fun kinesisStreamsOutput(): Any? = unwrap(this).getKinesisStreamsOutput()

      /**
       * Identifies an Amazon Lambda function as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-lambdaoutput)
       */
      override fun lambdaOutput(): Any? = unwrap(this).getLambdaOutput()

      /**
       * The name of the in-application stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-output.html#cfn-kinesisanalyticsv2-applicationoutput-output-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty):
          OutputProperty = CdkObjectWrappers.wrap(cdkObject) as? OutputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty
    }
  }
}
