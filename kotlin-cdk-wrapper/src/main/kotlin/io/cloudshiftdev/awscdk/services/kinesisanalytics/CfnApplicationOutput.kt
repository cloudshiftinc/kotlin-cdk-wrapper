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
 * Adds an external destination to your Amazon Kinesis Analytics application.
 *
 * If you want Amazon Kinesis Analytics to deliver data from an in-application stream within your
 * application to an external destination (such as an Amazon Kinesis stream, an Amazon Kinesis Firehose
 * delivery stream, or an Amazon Lambda function), you add the relevant configuration to your
 * application using this operation. You can configure one or more outputs for your application. Each
 * output configuration maps an in-application stream and an external destination.
 *
 * You can use one of the output configurations to deliver data from your in-application error
 * stream to an external destination so that you can analyze the errors. For more information, see
 * [Understanding Application Output
 * (Destination)](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
 *
 * Any configuration update, including adding a streaming source using this operation, results in a
 * new version of the application. You can use the `DescribeApplication` operation to find the current
 * application version.
 *
 * For the limits on the number of application inputs and outputs you can configure, see
 * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
 *
 * This operation requires permissions to perform the `kinesisanalytics:AddApplicationOutput`
 * action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
 * CfnApplicationOutput cfnApplicationOutput = CfnApplicationOutput.Builder.create(this,
 * "MyCfnApplicationOutput")
 * .applicationName("applicationName")
 * .output(OutputProperty.builder()
 * .destinationSchema(DestinationSchemaProperty.builder()
 * .recordFormatType("recordFormatType")
 * .build())
 * // the properties below are optional
 * .kinesisFirehoseOutput(KinesisFirehoseOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build())
 * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build())
 * .lambdaOutput(LambdaOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build())
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html)
 */
public open class CfnApplicationOutput internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationOutputProps,
  ) :
      this(software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnApplicationOutputProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationOutputProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationOutputProps(props)
  )

  /**
   * Name of the application to which you want to add the output configuration.
   */
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  /**
   * Name of the application to which you want to add the output configuration.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An array of objects, each describing one output configuration.
   */
  public open fun output(): Any = unwrap(this).getOutput()

  /**
   * An array of objects, each describing one output configuration.
   */
  public open fun output(`value`: IResolvable) {
    unwrap(this).setOutput(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of objects, each describing one output configuration.
   */
  public open fun output(`value`: OutputProperty) {
    unwrap(this).setOutput(`value`.let(OutputProperty::unwrap))
  }

  /**
   * An array of objects, each describing one output configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1773b4060b6a5fb649c25dcf180319faada39022351f1a481cc74d89d2d4786e")
  public open fun output(`value`: OutputProperty.Builder.() -> Unit): Unit =
      output(OutputProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesisanalytics.CfnApplicationOutput].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Name of the application to which you want to add the output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-applicationname)
     * @param applicationName Name of the application to which you want to add the output
     * configuration. 
     */
    public fun applicationName(applicationName: String)

    /**
     * An array of objects, each describing one output configuration.
     *
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
     * @param output An array of objects, each describing one output configuration. 
     */
    public fun output(output: IResolvable)

    /**
     * An array of objects, each describing one output configuration.
     *
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
     * @param output An array of objects, each describing one output configuration. 
     */
    public fun output(output: OutputProperty)

    /**
     * An array of objects, each describing one output configuration.
     *
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
     * @param output An array of objects, each describing one output configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9d4b57354a0dd7846a5437f4c042adf864d66a3f4b6a87a110a9c4368623faf")
    public fun output(output: OutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.Builder.create(scope,
        id)

    /**
     * Name of the application to which you want to add the output configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-applicationname)
     * @param applicationName Name of the application to which you want to add the output
     * configuration. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * An array of objects, each describing one output configuration.
     *
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
     * @param output An array of objects, each describing one output configuration. 
     */
    override fun output(output: IResolvable) {
      cdkBuilder.output(output.let(IResolvable::unwrap))
    }

    /**
     * An array of objects, each describing one output configuration.
     *
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
     * @param output An array of objects, each describing one output configuration. 
     */
    override fun output(output: OutputProperty) {
      cdkBuilder.output(output.let(OutputProperty::unwrap))
    }

    /**
     * An array of objects, each describing one output configuration.
     *
     * In the output configuration, you specify the name of an in-application stream, a destination
     * (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda
     * function), and record the formation to use when writing to the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationoutput.html#cfn-kinesisanalytics-applicationoutput-output)
     * @param output An array of objects, each describing one output configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9d4b57354a0dd7846a5437f4c042adf864d66a3f4b6a87a110a9c4368623faf")
    override fun output(output: OutputProperty.Builder.() -> Unit): Unit =
        output(OutputProperty(output))

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationOutput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationOutput(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput):
        CfnApplicationOutput = CfnApplicationOutput(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationOutput):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput = wrapped.cdkObject
  }

  /**
   * Describes the data format when records are written to the destination.
   *
   * For more information, see [Configuring Application
   * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html)
   */
  public interface DestinationSchemaProperty {
    /**
     * Specifies the format of the records on the output stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html#cfn-kinesisanalytics-applicationoutput-destinationschema-recordformattype)
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
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty.builder()

      /**
       * @param recordFormatType Specifies the format of the records on the output stream.
       */
      override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty,
    ) : CdkObject(cdkObject), DestinationSchemaProperty {
      /**
       * Specifies the format of the records on the output stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-destinationschema.html#cfn-kinesisanalytics-applicationoutput-destinationschema-recordformattype)
       */
      override fun recordFormatType(): String? = unwrap(this).getRecordFormatType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty):
          DestinationSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationSchemaProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationSchemaProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty
    }
  }

  /**
   * When configuring application output, identifies an Amazon Kinesis stream as the destination.
   *
   * You provide the stream Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis
   * Analytics can use to write to the stream on your behalf.
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
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html)
   */
  public interface KinesisStreamsOutputProperty {
    /**
     * ARN of the destination Amazon Kinesis stream to write to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination
     * stream on your behalf.
     *
     * You need to grant the necessary permissions to this role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [KinesisStreamsOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn ARN of the destination Amazon Kinesis stream to write to. 
       */
      public fun resourceArn(resourceArn: String)

      /**
       * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the
       * destination stream on your behalf. 
       * You need to grant the necessary permissions to this role.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.builder()

      /**
       * @param resourceArn ARN of the destination Amazon Kinesis stream to write to. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      /**
       * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the
       * destination stream on your behalf. 
       * You need to grant the necessary permissions to this role.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty,
    ) : CdkObject(cdkObject), KinesisStreamsOutputProperty {
      /**
       * ARN of the destination Amazon Kinesis stream to write to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()

      /**
       * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination
       * stream on your behalf.
       *
       * You need to grant the necessary permissions to this role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisstreamsoutput-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamsOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty):
          KinesisStreamsOutputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisStreamsOutputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamsOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty
    }
  }

  /**
   * Describes application output configuration in which you identify an in-application stream and a
   * destination where you want the in-application stream data to be written.
   *
   * The destination can be an Amazon Kinesis stream or an Amazon Kinesis Firehose delivery stream.
   *
   * For limits on how many destinations an application can write and other limitations, see
   * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
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
   * .roleArn("roleArn")
   * .build())
   * .kinesisStreamsOutput(KinesisStreamsOutputProperty.builder()
   * .resourceArn("resourceArn")
   * .roleArn("roleArn")
   * .build())
   * .lambdaOutput(LambdaOutputProperty.builder()
   * .resourceArn("resourceArn")
   * .roleArn("roleArn")
   * .build())
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html)
   */
  public interface OutputProperty {
    /**
     * Describes the data format when records are written to the destination.
     *
     * For more information, see [Configuring Application
     * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-destinationschema)
     */
    public fun destinationSchema(): Any

    /**
     * Identifies an Amazon Kinesis Firehose delivery stream as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisfirehoseoutput)
     */
    public fun kinesisFirehoseOutput(): Any? = unwrap(this).getKinesisFirehoseOutput()

    /**
     * Identifies an Amazon Kinesis stream as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisstreamsoutput)
     */
    public fun kinesisStreamsOutput(): Any? = unwrap(this).getKinesisStreamsOutput()

    /**
     * Identifies an AWS Lambda function as the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-lambdaoutput)
     */
    public fun lambdaOutput(): Any? = unwrap(this).getLambdaOutput()

    /**
     * Name of the in-application stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name)
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
       * For more information, see [Configuring Application
       * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
       */
      public fun destinationSchema(destinationSchema: IResolvable)

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       * For more information, see [Configuring Application
       * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
       */
      public fun destinationSchema(destinationSchema: DestinationSchemaProperty)

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       * For more information, see [Configuring Application
       * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed57bf0989507d124ac3e68c92223c9d3573f229cff0a0a20aa74031d27b9483")
      public fun destinationSchema(destinationSchema: DestinationSchemaProperty.Builder.() -> Unit)

      /**
       * @param kinesisFirehoseOutput Identifies an Amazon Kinesis Firehose delivery stream as the
       * destination.
       */
      public fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable)

      /**
       * @param kinesisFirehoseOutput Identifies an Amazon Kinesis Firehose delivery stream as the
       * destination.
       */
      public fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty)

      /**
       * @param kinesisFirehoseOutput Identifies an Amazon Kinesis Firehose delivery stream as the
       * destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76c7046a9c50c86a9577ec431bf36d12eeb870190a63cb9240527b227d74ccb8")
      public
          fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty.Builder.() -> Unit)

      /**
       * @param kinesisStreamsOutput Identifies an Amazon Kinesis stream as the destination.
       */
      public fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable)

      /**
       * @param kinesisStreamsOutput Identifies an Amazon Kinesis stream as the destination.
       */
      public fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty)

      /**
       * @param kinesisStreamsOutput Identifies an Amazon Kinesis stream as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb46a3f10ac4e629e90925bd5b55dd73632801b9090eccd5453b8b4911f75b6b")
      public
          fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty.Builder.() -> Unit)

      /**
       * @param lambdaOutput Identifies an AWS Lambda function as the destination.
       */
      public fun lambdaOutput(lambdaOutput: IResolvable)

      /**
       * @param lambdaOutput Identifies an AWS Lambda function as the destination.
       */
      public fun lambdaOutput(lambdaOutput: LambdaOutputProperty)

      /**
       * @param lambdaOutput Identifies an AWS Lambda function as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("866e9705a6feeadd0f7146d9ecebdae2c408da1fbab99058bc47e2ce663323ba")
      public fun lambdaOutput(lambdaOutput: LambdaOutputProperty.Builder.() -> Unit)

      /**
       * @param name Name of the in-application stream.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.builder()

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       * For more information, see [Configuring Application
       * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
       */
      override fun destinationSchema(destinationSchema: IResolvable) {
        cdkBuilder.destinationSchema(destinationSchema.let(IResolvable::unwrap))
      }

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       * For more information, see [Configuring Application
       * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
       */
      override fun destinationSchema(destinationSchema: DestinationSchemaProperty) {
        cdkBuilder.destinationSchema(destinationSchema.let(DestinationSchemaProperty::unwrap))
      }

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       * For more information, see [Configuring Application
       * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed57bf0989507d124ac3e68c92223c9d3573f229cff0a0a20aa74031d27b9483")
      override
          fun destinationSchema(destinationSchema: DestinationSchemaProperty.Builder.() -> Unit):
          Unit = destinationSchema(DestinationSchemaProperty(destinationSchema))

      /**
       * @param kinesisFirehoseOutput Identifies an Amazon Kinesis Firehose delivery stream as the
       * destination.
       */
      override fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisFirehoseOutput Identifies an Amazon Kinesis Firehose delivery stream as the
       * destination.
       */
      override fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput.let(KinesisFirehoseOutputProperty::unwrap))
      }

      /**
       * @param kinesisFirehoseOutput Identifies an Amazon Kinesis Firehose delivery stream as the
       * destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76c7046a9c50c86a9577ec431bf36d12eeb870190a63cb9240527b227d74ccb8")
      override
          fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty.Builder.() -> Unit):
          Unit = kinesisFirehoseOutput(KinesisFirehoseOutputProperty(kinesisFirehoseOutput))

      /**
       * @param kinesisStreamsOutput Identifies an Amazon Kinesis stream as the destination.
       */
      override fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisStreamsOutput Identifies an Amazon Kinesis stream as the destination.
       */
      override fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput.let(KinesisStreamsOutputProperty::unwrap))
      }

      /**
       * @param kinesisStreamsOutput Identifies an Amazon Kinesis stream as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb46a3f10ac4e629e90925bd5b55dd73632801b9090eccd5453b8b4911f75b6b")
      override
          fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty.Builder.() -> Unit):
          Unit = kinesisStreamsOutput(KinesisStreamsOutputProperty(kinesisStreamsOutput))

      /**
       * @param lambdaOutput Identifies an AWS Lambda function as the destination.
       */
      override fun lambdaOutput(lambdaOutput: IResolvable) {
        cdkBuilder.lambdaOutput(lambdaOutput.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaOutput Identifies an AWS Lambda function as the destination.
       */
      override fun lambdaOutput(lambdaOutput: LambdaOutputProperty) {
        cdkBuilder.lambdaOutput(lambdaOutput.let(LambdaOutputProperty::unwrap))
      }

      /**
       * @param lambdaOutput Identifies an AWS Lambda function as the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("866e9705a6feeadd0f7146d9ecebdae2c408da1fbab99058bc47e2ce663323ba")
      override fun lambdaOutput(lambdaOutput: LambdaOutputProperty.Builder.() -> Unit): Unit =
          lambdaOutput(LambdaOutputProperty(lambdaOutput))

      /**
       * @param name Name of the in-application stream.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty,
    ) : CdkObject(cdkObject), OutputProperty {
      /**
       * Describes the data format when records are written to the destination.
       *
       * For more information, see [Configuring Application
       * Output](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-destinationschema)
       */
      override fun destinationSchema(): Any = unwrap(this).getDestinationSchema()

      /**
       * Identifies an Amazon Kinesis Firehose delivery stream as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisfirehoseoutput)
       */
      override fun kinesisFirehoseOutput(): Any? = unwrap(this).getKinesisFirehoseOutput()

      /**
       * Identifies an Amazon Kinesis stream as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-kinesisstreamsoutput)
       */
      override fun kinesisStreamsOutput(): Any? = unwrap(this).getKinesisStreamsOutput()

      /**
       * Identifies an AWS Lambda function as the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-lambdaoutput)
       */
      override fun lambdaOutput(): Any? = unwrap(this).getLambdaOutput()

      /**
       * Name of the in-application stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-output.html#cfn-kinesisanalytics-applicationoutput-output-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty):
          OutputProperty = CdkObjectWrappers.wrap(cdkObject) as? OutputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty
    }
  }

  /**
   * When configuring application output, identifies an Amazon Kinesis Firehose delivery stream as
   * the destination.
   *
   * You provide the stream Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis
   * Analytics to write to the stream on your behalf.
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
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html)
   */
  public interface KinesisFirehoseOutputProperty {
    /**
     * ARN of the destination Amazon Kinesis Firehose delivery stream to write to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination
     * stream on your behalf.
     *
     * You need to grant the necessary permissions to this role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [KinesisFirehoseOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn ARN of the destination Amazon Kinesis Firehose delivery stream to write
       * to. 
       */
      public fun resourceArn(resourceArn: String)

      /**
       * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the
       * destination stream on your behalf. 
       * You need to grant the necessary permissions to this role.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.builder()

      /**
       * @param resourceArn ARN of the destination Amazon Kinesis Firehose delivery stream to write
       * to. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      /**
       * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the
       * destination stream on your behalf. 
       * You need to grant the necessary permissions to this role.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty,
    ) : CdkObject(cdkObject), KinesisFirehoseOutputProperty {
      /**
       * ARN of the destination Amazon Kinesis Firehose delivery stream to write to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()

      /**
       * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination
       * stream on your behalf.
       *
       * You need to grant the necessary permissions to this role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalytics-applicationoutput-kinesisfirehoseoutput-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty):
          KinesisFirehoseOutputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisFirehoseOutputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty
    }
  }

  /**
   * When configuring application output, identifies an AWS Lambda function as the destination.
   *
   * You provide the function Amazon Resource Name (ARN) and also an IAM role ARN that Amazon
   * Kinesis Analytics can use to write to the function on your behalf.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * LambdaOutputProperty lambdaOutputProperty = LambdaOutputProperty.builder()
   * .resourceArn("resourceArn")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html)
   */
  public interface LambdaOutputProperty {
    /**
     * Amazon Resource Name (ARN) of the destination Lambda function to write to.
     *
     *
     * To specify an earlier version of the Lambda function than the latest, include the Lambda
     * function version in the Lambda function ARN. For more information about Lambda ARNs, see
     * [Example ARNs: AWS
     * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination
     * function on your behalf.
     *
     * You need to grant the necessary permissions to this role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [LambdaOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn Amazon Resource Name (ARN) of the destination Lambda function to write
       * to. 
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: AWS
       * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       */
      public fun resourceArn(resourceArn: String)

      /**
       * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the
       * destination function on your behalf. 
       * You need to grant the necessary permissions to this role.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.builder()

      /**
       * @param resourceArn Amazon Resource Name (ARN) of the destination Lambda function to write
       * to. 
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: AWS
       * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      /**
       * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the
       * destination function on your behalf. 
       * You need to grant the necessary permissions to this role.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty,
    ) : CdkObject(cdkObject), LambdaOutputProperty {
      /**
       * Amazon Resource Name (ARN) of the destination Lambda function to write to.
       *
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: AWS
       * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()

      /**
       * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination
       * function on your behalf.
       *
       * You need to grant the necessary permissions to this role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html#cfn-kinesisanalytics-applicationoutput-lambdaoutput-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty):
          LambdaOutputProperty = CdkObjectWrappers.wrap(cdkObject) as? LambdaOutputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty
    }
  }
}
