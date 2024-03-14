package io.cloudshiftdev.awscdk.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationOutput internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput,
) : CfnResource(cdkObject), IInspectable {
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
   * which you identify an in-application stream and a destination where you want the in-application
   * stream data to be written.
   */
  public open fun output(): Any = unwrap(this).getOutput()

  /**
   * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
   * which you identify an in-application stream and a destination where you want the in-application
   * stream data to be written.
   */
  public open fun output(`value`: IResolvable) {
    unwrap(this).setOutput(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
   * which you identify an in-application stream and a destination where you want the in-application
   * stream data to be written.
   */
  public open fun output(`value`: OutputProperty) {
    unwrap(this).setOutput(`value`.let(OutputProperty::unwrap))
  }

  /**
   * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
   * which you identify an in-application stream and a destination where you want the in-application
   * stream data to be written.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d614209d4ed192b9890035b521e5e299a73477b3e7feb007bf03c155d3d5146c")
  public open fun output(`value`: OutputProperty.Builder.() -> Unit): Unit =
      output(OutputProperty(`value`))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput].
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
     * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
     * which you identify an in-application stream and a destination where you want the in-application
     * stream data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    public fun output(output: IResolvable)

    /**
     * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
     * which you identify an in-application stream and a destination where you want the in-application
     * stream data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    public fun output(output: OutputProperty)

    /**
     * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
     * which you identify an in-application stream and a destination where you want the in-application
     * stream data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("992464f9b498ca92ac99f58583a408b80b254246bb61b772ffa84a60e9fa617e")
    public fun output(output: OutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.Builder =
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.Builder.create(scope,
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
     * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
     * which you identify an in-application stream and a destination where you want the in-application
     * stream data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    override fun output(output: IResolvable) {
      cdkBuilder.output(output.let(IResolvable::unwrap))
    }

    /**
     * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
     * which you identify an in-application stream and a destination where you want the in-application
     * stream data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    override fun output(output: OutputProperty) {
      cdkBuilder.output(output.let(OutputProperty::unwrap))
    }

    /**
     * Describes a SQL-based Managed Service for Apache Flink application's output configuration, in
     * which you identify an in-application stream and a destination where you want the in-application
     * stream data to be written.
     *
     * The destination can be a Kinesis data stream or a Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationoutput.html#cfn-kinesisanalyticsv2-applicationoutput-output)
     * @param output Describes a SQL-based Managed Service for Apache Flink application's output
     * configuration, in which you identify an in-application stream and a destination where you want
     * the in-application stream data to be written. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("992464f9b498ca92ac99f58583a408b80b254246bb61b772ffa84a60e9fa617e")
    override fun output(output: OutputProperty.Builder.() -> Unit): Unit =
        output(OutputProperty(output))

    public fun build(): software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationOutput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationOutput(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput):
        CfnApplicationOutput = CfnApplicationOutput(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationOutput):
        software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput = wrapped.cdkObject
  }

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
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.DestinationSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.DestinationSchemaProperty.builder()

      /**
       * @param recordFormatType Specifies the format of the records on the output stream.
       */
      override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.DestinationSchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.DestinationSchemaProperty,
    ) : DestinationSchemaProperty {
      /**
       * Specifies the format of the records on the output stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html#cfn-kinesisanalyticsv2-applicationoutput-destinationschema-recordformattype)
       */
      override fun recordFormatType(): String? = unwrap(this).getRecordFormatType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.DestinationSchemaProperty):
          DestinationSchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationSchemaProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.DestinationSchemaProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisStreamsOutputProperty.builder()

      /**
       * @param resourceArn The ARN of the destination Kinesis data stream to write to. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisStreamsOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisStreamsOutputProperty,
    ) : KinesisStreamsOutputProperty {
      /**
       * The ARN of the destination Kinesis data stream to write to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput.html#cfn-kinesisanalyticsv2-applicationoutput-kinesisstreamsoutput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamsOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisStreamsOutputProperty):
          KinesisStreamsOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamsOutputProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisStreamsOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43c5222f39a078dbc48f9a4630c71e5527a14036c63cb30612b836495c5e8b84")
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ddca7eed72ed56a3e61d54fabc41324125463ed6fc674822ec7f0d23c2fa25e")
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a3f757690c98eaa87ccf93c1cdb7defbad1dd220b9ffe6fa63449033654ac1e")
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a3c83defc385c5dbb0f17ec993a9ec6441c174788caf38e7d5c15029f6f81a41")
      public fun lambdaOutput(lambdaOutput: LambdaOutputProperty.Builder.() -> Unit)

      /**
       * @param name The name of the in-application stream.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.OutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.OutputProperty.builder()

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       */
      override fun destinationSchema(destinationSchema: IResolvable) {
        cdkBuilder.destinationSchema(destinationSchema.let(IResolvable::unwrap))
      }

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       */
      override fun destinationSchema(destinationSchema: DestinationSchemaProperty) {
        cdkBuilder.destinationSchema(destinationSchema.let(DestinationSchemaProperty::unwrap))
      }

      /**
       * @param destinationSchema Describes the data format when records are written to the
       * destination. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43c5222f39a078dbc48f9a4630c71e5527a14036c63cb30612b836495c5e8b84")
      override
          fun destinationSchema(destinationSchema: DestinationSchemaProperty.Builder.() -> Unit):
          Unit = destinationSchema(DestinationSchemaProperty(destinationSchema))

      /**
       * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
       * destination.
       */
      override fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
       * destination.
       */
      override fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput.let(KinesisFirehoseOutputProperty::unwrap))
      }

      /**
       * @param kinesisFirehoseOutput Identifies a Kinesis Data Firehose delivery stream as the
       * destination.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ddca7eed72ed56a3e61d54fabc41324125463ed6fc674822ec7f0d23c2fa25e")
      override
          fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty.Builder.() -> Unit):
          Unit = kinesisFirehoseOutput(KinesisFirehoseOutputProperty(kinesisFirehoseOutput))

      /**
       * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
       */
      override fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
       */
      override fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput.let(KinesisStreamsOutputProperty::unwrap))
      }

      /**
       * @param kinesisStreamsOutput Identifies a Kinesis data stream as the destination.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5a3f757690c98eaa87ccf93c1cdb7defbad1dd220b9ffe6fa63449033654ac1e")
      override
          fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty.Builder.() -> Unit):
          Unit = kinesisStreamsOutput(KinesisStreamsOutputProperty(kinesisStreamsOutput))

      /**
       * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
       */
      override fun lambdaOutput(lambdaOutput: IResolvable) {
        cdkBuilder.lambdaOutput(lambdaOutput.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
       */
      override fun lambdaOutput(lambdaOutput: LambdaOutputProperty) {
        cdkBuilder.lambdaOutput(lambdaOutput.let(LambdaOutputProperty::unwrap))
      }

      /**
       * @param lambdaOutput Identifies an Amazon Lambda function as the destination.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a3c83defc385c5dbb0f17ec993a9ec6441c174788caf38e7d5c15029f6f81a41")
      override fun lambdaOutput(lambdaOutput: LambdaOutputProperty.Builder.() -> Unit): Unit =
          lambdaOutput(LambdaOutputProperty(lambdaOutput))

      /**
       * @param name The name of the in-application stream.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.OutputProperty,
    ) : OutputProperty {
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
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.OutputProperty):
          OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.OutputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

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
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisFirehoseOutputProperty.builder()

      /**
       * @param resourceArn The ARN of the destination delivery stream to write to. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisFirehoseOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisFirehoseOutputProperty,
    ) : KinesisFirehoseOutputProperty {
      /**
       * The ARN of the destination delivery stream to write to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput.html#cfn-kinesisanalyticsv2-applicationoutput-kinesisfirehoseoutput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisFirehoseOutputProperty):
          KinesisFirehoseOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseOutputProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.KinesisFirehoseOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.LambdaOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.LambdaOutputProperty.builder()

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
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.LambdaOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.LambdaOutputProperty,
    ) : LambdaOutputProperty {
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
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.LambdaOutputProperty):
          LambdaOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaOutputProperty):
          software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput.LambdaOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
