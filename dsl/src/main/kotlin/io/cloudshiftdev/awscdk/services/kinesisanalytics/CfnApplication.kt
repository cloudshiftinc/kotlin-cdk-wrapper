package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication,
) : CfnResource(cdkObject), IInspectable {
  /**
   * One or more SQL statements that read input data, transform it, and generate output.
   */
  public open fun applicationCode(): String? = unwrap(this).getApplicationCode()

  /**
   * One or more SQL statements that read input data, transform it, and generate output.
   */
  public open fun applicationCode(`value`: String) {
    unwrap(this).setApplicationCode(`value`)
  }

  /**
   * Summary description of the application.
   */
  public open fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

  /**
   * Summary description of the application.
   */
  public open fun applicationDescription(`value`: String) {
    unwrap(this).setApplicationDescription(`value`)
  }

  /**
   * Name of your Amazon Kinesis Analytics application (for example, `sample-app` ).
   */
  public open fun applicationName(): String? = unwrap(this).getApplicationName()

  /**
   * Name of your Amazon Kinesis Analytics application (for example, `sample-app` ).
   */
  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Use this parameter to configure the application input.
   */
  public open fun inputs(): Any = unwrap(this).getInputs()

  /**
   * Use this parameter to configure the application input.
   */
  public open fun inputs(`value`: IResolvable) {
    unwrap(this).setInputs(`value`.let(IResolvable::unwrap))
  }

  /**
   * Use this parameter to configure the application input.
   */
  public open fun inputs(__idx_ac66f0: List<Any>) {
    unwrap(this).setInputs(__idx_ac66f0)
  }

  /**
   * Use this parameter to configure the application input.
   */
  public open fun inputs(vararg __idx_ac66f0: Any): Unit = inputs(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesisanalytics.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * One or more SQL statements that read input data, transform it, and generate output.
     *
     * For example, you can write a SQL statement that reads data from one in-application stream,
     * generates a running average of the number of advertisement clicks by vendor, and insert
     * resulting rows in another in-application stream using pumps. For more information about the
     * typical pattern, see [Application
     * Code](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-app-code.html) .
     *
     * You can provide such series of SQL statements, where output of one statement can be used as
     * the input for the next statement. You store intermediate results by creating in-application
     * streams and pumps.
     *
     * Note that the application code must create the streams with names specified in the `Outputs`
     * . For example, if your `Outputs` defines output streams named `ExampleOutputStream1` and
     * `ExampleOutputStream2` , then your application code must create these streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationcode)
     * @param applicationCode One or more SQL statements that read input data, transform it, and
     * generate output. 
     */
    public fun applicationCode(applicationCode: String)

    /**
     * Summary description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationdescription)
     * @param applicationDescription Summary description of the application. 
     */
    public fun applicationDescription(applicationDescription: String)

    /**
     * Name of your Amazon Kinesis Analytics application (for example, `sample-app` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationname)
     * @param applicationName Name of your Amazon Kinesis Analytics application (for example,
     * `sample-app` ). 
     */
    public fun applicationName(applicationName: String)

    /**
     * Use this parameter to configure the application input.
     *
     * You can configure your application to receive input from a single streaming source. In this
     * configuration, you map this streaming source to an in-application stream that is created. Your
     * application code can then query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     *
     * For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on
     * the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to read this stream on your behalf.
     *
     * To create the in-application stream, you need to specify a schema to transform your data into
     * a schematized version used in SQL. In the schema, you provide the necessary mapping of the data
     * elements in the streaming source to record columns in the in-app stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs)
     * @param inputs Use this parameter to configure the application input. 
     */
    public fun inputs(inputs: IResolvable)

    /**
     * Use this parameter to configure the application input.
     *
     * You can configure your application to receive input from a single streaming source. In this
     * configuration, you map this streaming source to an in-application stream that is created. Your
     * application code can then query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     *
     * For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on
     * the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to read this stream on your behalf.
     *
     * To create the in-application stream, you need to specify a schema to transform your data into
     * a schematized version used in SQL. In the schema, you provide the necessary mapping of the data
     * elements in the streaming source to record columns in the in-app stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs)
     * @param inputs Use this parameter to configure the application input. 
     */
    public fun inputs(inputs: List<Any>)

    /**
     * Use this parameter to configure the application input.
     *
     * You can configure your application to receive input from a single streaming source. In this
     * configuration, you map this streaming source to an in-application stream that is created. Your
     * application code can then query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     *
     * For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on
     * the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to read this stream on your behalf.
     *
     * To create the in-application stream, you need to specify a schema to transform your data into
     * a schematized version used in SQL. In the schema, you provide the necessary mapping of the data
     * elements in the streaming source to record columns in the in-app stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs)
     * @param inputs Use this parameter to configure the application input. 
     */
    public fun inputs(vararg inputs: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.Builder
        = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.Builder.create(scope, id)

    /**
     * One or more SQL statements that read input data, transform it, and generate output.
     *
     * For example, you can write a SQL statement that reads data from one in-application stream,
     * generates a running average of the number of advertisement clicks by vendor, and insert
     * resulting rows in another in-application stream using pumps. For more information about the
     * typical pattern, see [Application
     * Code](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-app-code.html) .
     *
     * You can provide such series of SQL statements, where output of one statement can be used as
     * the input for the next statement. You store intermediate results by creating in-application
     * streams and pumps.
     *
     * Note that the application code must create the streams with names specified in the `Outputs`
     * . For example, if your `Outputs` defines output streams named `ExampleOutputStream1` and
     * `ExampleOutputStream2` , then your application code must create these streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationcode)
     * @param applicationCode One or more SQL statements that read input data, transform it, and
     * generate output. 
     */
    override fun applicationCode(applicationCode: String) {
      cdkBuilder.applicationCode(applicationCode)
    }

    /**
     * Summary description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationdescription)
     * @param applicationDescription Summary description of the application. 
     */
    override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    /**
     * Name of your Amazon Kinesis Analytics application (for example, `sample-app` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-applicationname)
     * @param applicationName Name of your Amazon Kinesis Analytics application (for example,
     * `sample-app` ). 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * Use this parameter to configure the application input.
     *
     * You can configure your application to receive input from a single streaming source. In this
     * configuration, you map this streaming source to an in-application stream that is created. Your
     * application code can then query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     *
     * For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on
     * the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to read this stream on your behalf.
     *
     * To create the in-application stream, you need to specify a schema to transform your data into
     * a schematized version used in SQL. In the schema, you provide the necessary mapping of the data
     * elements in the streaming source to record columns in the in-app stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs)
     * @param inputs Use this parameter to configure the application input. 
     */
    override fun inputs(inputs: IResolvable) {
      cdkBuilder.inputs(inputs.let(IResolvable::unwrap))
    }

    /**
     * Use this parameter to configure the application input.
     *
     * You can configure your application to receive input from a single streaming source. In this
     * configuration, you map this streaming source to an in-application stream that is created. Your
     * application code can then query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     *
     * For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on
     * the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to read this stream on your behalf.
     *
     * To create the in-application stream, you need to specify a schema to transform your data into
     * a schematized version used in SQL. In the schema, you provide the necessary mapping of the data
     * elements in the streaming source to record columns in the in-app stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs)
     * @param inputs Use this parameter to configure the application input. 
     */
    override fun inputs(inputs: List<Any>) {
      cdkBuilder.inputs(inputs)
    }

    /**
     * Use this parameter to configure the application input.
     *
     * You can configure your application to receive input from a single streaming source. In this
     * configuration, you map this streaming source to an in-application stream that is created. Your
     * application code can then query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     *
     * For the streaming source, you provide its Amazon Resource Name (ARN) and format of data on
     * the stream (for example, JSON, CSV, etc.). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to read this stream on your behalf.
     *
     * To create the in-application stream, you need to specify a schema to transform your data into
     * a schematized version used in SQL. In the schema, you provide the necessary mapping of the data
     * elements in the streaming source to record columns in the in-app stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-application.html#cfn-kinesisanalytics-application-inputs)
     * @param inputs Use this parameter to configure the application input. 
     */
    override fun inputs(vararg inputs: Any): Unit = inputs(inputs.toList())

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplication = wrapped.cdkObject
  }

  public interface MappingParametersProperty {
    /**
     * Provides additional mapping information when the record format uses delimiters (for example,
     * CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-csvmappingparameters)
     */
    public fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

    /**
     * Provides additional mapping information when JSON is the record format on the streaming
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-jsonmappingparameters)
     */
    public fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()

    /**
     * A builder for [MappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      public fun csvMappingParameters(csvMappingParameters: IResolvable)

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      public fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty)

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71603913f441a14fff1edb084e4fe4d97caad4d8fe61bc2d3a57b40ba26e2d78")
      public
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit)

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      public fun jsonMappingParameters(jsonMappingParameters: IResolvable)

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      public fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty)

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("180124263f709d356d579515a3b1136b6826dc1cb855a4e2b52bd528765b49c9")
      public
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.builder()

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      override fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(IResolvable::unwrap))
      }

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      override fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(CSVMappingParametersProperty::unwrap))
      }

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71603913f441a14fff1edb084e4fe4d97caad4d8fe61bc2d3a57b40ba26e2d78")
      override
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit):
          Unit = csvMappingParameters(CSVMappingParametersProperty(csvMappingParameters))

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      override fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(IResolvable::unwrap))
      }

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      override fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(JSONMappingParametersProperty::unwrap))
      }

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("180124263f709d356d579515a3b1136b6826dc1cb855a4e2b52bd528765b49c9")
      override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit):
          Unit = jsonMappingParameters(JSONMappingParametersProperty(jsonMappingParameters))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty,
    ) : MappingParametersProperty {
      /**
       * Provides additional mapping information when the record format uses delimiters (for
       * example, CSV).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-csvmappingparameters)
       */
      override fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

      /**
       * Provides additional mapping information when JSON is the record format on the streaming
       * source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html#cfn-kinesisanalytics-application-mappingparameters-jsonmappingparameters)
       */
      override fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty):
          MappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputParallelismProperty {
    /**
     * Number of in-application streams to create.
     *
     * For more information, see
     * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html#cfn-kinesisanalytics-application-inputparallelism-count)
     */
    public fun count(): Number? = unwrap(this).getCount()

    /**
     * A builder for [InputParallelismProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param count Number of in-application streams to create.
       * For more information, see
       * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
       */
      public fun count(count: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty.builder()

      /**
       * @param count Number of in-application streams to create.
       * For more information, see
       * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
       */
      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty,
    ) : InputParallelismProperty {
      /**
       * Number of in-application streams to create.
       *
       * For more information, see
       * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html#cfn-kinesisanalytics-application-inputparallelism-count)
       */
      override fun count(): Number? = unwrap(this).getCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputParallelismProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty):
          InputParallelismProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputParallelismProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputSchemaProperty {
    /**
     * A list of `RecordColumn` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordcolumns)
     */
    public fun recordColumns(): Any

    /**
     * Specifies the encoding of the records in the streaming source.
     *
     * For example, UTF-8.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordencoding)
     */
    public fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

    /**
     * Specifies the format of the records on the streaming source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordformat)
     */
    public fun recordFormat(): Any

    /**
     * A builder for [InputSchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      public fun recordColumns(recordColumns: IResolvable)

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      public fun recordColumns(recordColumns: List<Any>)

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      public fun recordColumns(vararg recordColumns: Any)

      /**
       * @param recordEncoding Specifies the encoding of the records in the streaming source.
       * For example, UTF-8.
       */
      public fun recordEncoding(recordEncoding: String)

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      public fun recordFormat(recordFormat: IResolvable)

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      public fun recordFormat(recordFormat: RecordFormatProperty)

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ff787489b02d04f0997a1e4cc9c0dc9e2f0320ca7207ed654730401ebfded77")
      public fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.builder()

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      override fun recordColumns(recordColumns: IResolvable) {
        cdkBuilder.recordColumns(recordColumns.let(IResolvable::unwrap))
      }

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      override fun recordColumns(recordColumns: List<Any>) {
        cdkBuilder.recordColumns(recordColumns)
      }

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      override fun recordColumns(vararg recordColumns: Any): Unit =
          recordColumns(recordColumns.toList())

      /**
       * @param recordEncoding Specifies the encoding of the records in the streaming source.
       * For example, UTF-8.
       */
      override fun recordEncoding(recordEncoding: String) {
        cdkBuilder.recordEncoding(recordEncoding)
      }

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      override fun recordFormat(recordFormat: IResolvable) {
        cdkBuilder.recordFormat(recordFormat.let(IResolvable::unwrap))
      }

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      override fun recordFormat(recordFormat: RecordFormatProperty) {
        cdkBuilder.recordFormat(recordFormat.let(RecordFormatProperty::unwrap))
      }

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ff787489b02d04f0997a1e4cc9c0dc9e2f0320ca7207ed654730401ebfded77")
      override fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit): Unit =
          recordFormat(RecordFormatProperty(recordFormat))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty,
    ) : InputSchemaProperty {
      /**
       * A list of `RecordColumn` objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordcolumns)
       */
      override fun recordColumns(): Any = unwrap(this).getRecordColumns()

      /**
       * Specifies the encoding of the records in the streaming source.
       *
       * For example, UTF-8.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordencoding)
       */
      override fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

      /**
       * Specifies the format of the records on the streaming source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordformat)
       */
      override fun recordFormat(): Any = unwrap(this).getRecordFormat()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty):
          InputSchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSchemaProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface JSONMappingParametersProperty {
    /**
     * Path to the top-level parent that contains the records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html#cfn-kinesisanalytics-application-jsonmappingparameters-recordrowpath)
     */
    public fun recordRowPath(): String

    /**
     * A builder for [JSONMappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordRowPath Path to the top-level parent that contains the records. 
       */
      public fun recordRowPath(recordRowPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty.builder()

      /**
       * @param recordRowPath Path to the top-level parent that contains the records. 
       */
      override fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty,
    ) : JSONMappingParametersProperty {
      /**
       * Path to the top-level parent that contains the records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html#cfn-kinesisanalytics-application-jsonmappingparameters-recordrowpath)
       */
      override fun recordRowPath(): String = unwrap(this).getRecordRowPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JSONMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty):
          JSONMappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JSONMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisStreamsInputProperty {
    /**
     * ARN of the input Amazon Kinesis stream to read.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your
     * behalf.
     *
     * You need to grant the necessary permissions to this role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [KinesisStreamsInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn ARN of the input Amazon Kinesis stream to read. 
       */
      public fun resourceArn(resourceArn: String)

      /**
       * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to access the
       * stream on your behalf. 
       * You need to grant the necessary permissions to this role.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.builder()

      /**
       * @param resourceArn ARN of the input Amazon Kinesis stream to read. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      /**
       * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to access the
       * stream on your behalf. 
       * You need to grant the necessary permissions to this role.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty,
    ) : KinesisStreamsInputProperty {
      /**
       * ARN of the input Amazon Kinesis stream to read.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()

      /**
       * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your
       * behalf.
       *
       * You need to grant the necessary permissions to this role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisstreamsinput.html#cfn-kinesisanalytics-application-kinesisstreamsinput-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamsInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty):
          KinesisStreamsInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamsInputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputProcessingConfigurationProperty {
    /**
     * The
     * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
     * that is used to preprocess the records in the stream before being processed by your application
     * code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html#cfn-kinesisanalytics-application-inputprocessingconfiguration-inputlambdaprocessor)
     */
    public fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()

    /**
     * A builder for [InputProcessingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable)

      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      public fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty)

      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22e43a8df1a42aa9a14bded8d9c61d5f72c2a6d3882c2cea963c9f6a6f2282f4")
      public
          fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty.builder()

      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      override fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(IResolvable::unwrap))
      }

      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      override fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(InputLambdaProcessorProperty::unwrap))
      }

      /**
       * @param inputLambdaProcessor The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22e43a8df1a42aa9a14bded8d9c61d5f72c2a6d3882c2cea963c9f6a6f2282f4")
      override
          fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit):
          Unit = inputLambdaProcessor(InputLambdaProcessorProperty(inputLambdaProcessor))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty,
    ) : InputProcessingConfigurationProperty {
      /**
       * The
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * that is used to preprocess the records in the stream before being processed by your
       * application code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html#cfn-kinesisanalytics-application-inputprocessingconfiguration-inputlambdaprocessor)
       */
      override fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InputProcessingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty):
          InputProcessingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProcessingConfigurationProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisFirehoseInputProperty {
    /**
     * ARN of the input delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your
     * behalf.
     *
     * You need to make sure that the role has the necessary permissions to access the stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [KinesisFirehoseInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn ARN of the input delivery stream. 
       */
      public fun resourceArn(resourceArn: String)

      /**
       * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to access the
       * stream on your behalf. 
       * You need to make sure that the role has the necessary permissions to access the stream.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.builder()

      /**
       * @param resourceArn ARN of the input delivery stream. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      /**
       * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to access the
       * stream on your behalf. 
       * You need to make sure that the role has the necessary permissions to access the stream.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty,
    ) : KinesisFirehoseInputProperty {
      /**
       * ARN of the input delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()

      /**
       * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your
       * behalf.
       *
       * You need to make sure that the role has the necessary permissions to access the stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-kinesisfirehoseinput.html#cfn-kinesisanalytics-application-kinesisfirehoseinput-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty):
          KinesisFirehoseInputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseInputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputProperty {
    /**
     * Describes the number of in-application streams to create.
     *
     * Data from your source is routed to these in-application input streams.
     *
     * See [Configuring Application
     * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputparallelism)
     */
    public fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

    /**
     * The
     * [InputProcessingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
     * for the input. An input processor transforms records as they are received from the stream,
     * before the application's SQL code executes. Currently, the only input processing configuration
     * available is
     * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputprocessingconfiguration)
     */
    public fun inputProcessingConfiguration(): Any? = unwrap(this).getInputProcessingConfiguration()

    /**
     * Describes the format of the data in the streaming source, and how each data element maps to
     * corresponding columns in the in-application stream that is being created.
     *
     * Also used to describe the format of the reference data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputschema)
     */
    public fun inputSchema(): Any

    /**
     * If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the
     * delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream
     * on your behalf.
     *
     * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisfirehoseinput)
     */
    public fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

    /**
     * If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource
     * Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to access the stream on your
     * behalf.
     *
     * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisstreamsinput)
     */
    public fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

    /**
     * Name prefix to use when creating an in-application stream.
     *
     * Suppose that you specify a prefix "MyInApplicationStream." Amazon Kinesis Analytics then
     * creates one or more (as per the `InputParallelism` count you specified) in-application streams
     * with names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-nameprefix)
     */
    public fun namePrefix(): String

    /**
     * A builder for [InputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       * Data from your source is routed to these in-application input streams.
       *
       * See [Configuring Application
       * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
       */
      public fun inputParallelism(inputParallelism: IResolvable)

      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       * Data from your source is routed to these in-application input streams.
       *
       * See [Configuring Application
       * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
       */
      public fun inputParallelism(inputParallelism: InputParallelismProperty)

      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       * Data from your source is routed to these in-application input streams.
       *
       * See [Configuring Application
       * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71e01be074f1eaad282d9ad1dff2a53f90f02c257cc7cfba406a03e7396883ea")
      public fun inputParallelism(inputParallelism: InputParallelismProperty.Builder.() -> Unit)

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * .
       */
      public fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable)

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * .
       */
      public
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty)

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d1e1e4aa2b4726f7b62131cd424666d0bac429f10cb8d0b5d2489446117e15d")
      public
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty.Builder.() -> Unit)

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      public fun inputSchema(inputSchema: IResolvable)

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      public fun inputSchema(inputSchema: InputSchemaProperty)

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0a5940c935c711763cd1ef3389f18317ef887ca177ebe88178c6a223cc8ef0c")
      public fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit)

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Firehose delivery
       * stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis
       * Analytics to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      public fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable)

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Firehose delivery
       * stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis
       * Analytics to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      public fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty)

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Firehose delivery
       * stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis
       * Analytics to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96080edf84cea30048b0079f0daad73d6bade4dd50469508b99bbe4a3dd61721")
      public
          fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit)

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis stream, identifies
       * the stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics
       * to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      public fun kinesisStreamsInput(kinesisStreamsInput: IResolvable)

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis stream, identifies
       * the stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics
       * to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      public fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty)

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis stream, identifies
       * the stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics
       * to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37ce89a38cc91defa2b2713c9cd91911e1788e93cc804d3cbfaa55d53eb5a73e")
      public
          fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit)

      /**
       * @param namePrefix Name prefix to use when creating an in-application stream. 
       * Suppose that you specify a prefix "MyInApplicationStream." Amazon Kinesis Analytics then
       * creates one or more (as per the `InputParallelism` count you specified) in-application streams
       * with names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on.
       */
      public fun namePrefix(namePrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.builder()

      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       * Data from your source is routed to these in-application input streams.
       *
       * See [Configuring Application
       * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
       */
      override fun inputParallelism(inputParallelism: IResolvable) {
        cdkBuilder.inputParallelism(inputParallelism.let(IResolvable::unwrap))
      }

      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       * Data from your source is routed to these in-application input streams.
       *
       * See [Configuring Application
       * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
       */
      override fun inputParallelism(inputParallelism: InputParallelismProperty) {
        cdkBuilder.inputParallelism(inputParallelism.let(InputParallelismProperty::unwrap))
      }

      /**
       * @param inputParallelism Describes the number of in-application streams to create.
       * Data from your source is routed to these in-application input streams.
       *
       * See [Configuring Application
       * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71e01be074f1eaad282d9ad1dff2a53f90f02c257cc7cfba406a03e7396883ea")
      override fun inputParallelism(inputParallelism: InputParallelismProperty.Builder.() -> Unit):
          Unit = inputParallelism(InputParallelismProperty(inputParallelism))

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * .
       */
      override fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * .
       */
      override
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration.let(InputProcessingConfigurationProperty::unwrap))
      }

      /**
       * @param inputProcessingConfiguration The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d1e1e4aa2b4726f7b62131cd424666d0bac429f10cb8d0b5d2489446117e15d")
      override
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty.Builder.() -> Unit):
          Unit =
          inputProcessingConfiguration(InputProcessingConfigurationProperty(inputProcessingConfiguration))

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      override fun inputSchema(inputSchema: IResolvable) {
        cdkBuilder.inputSchema(inputSchema.let(IResolvable::unwrap))
      }

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      override fun inputSchema(inputSchema: InputSchemaProperty) {
        cdkBuilder.inputSchema(inputSchema.let(InputSchemaProperty::unwrap))
      }

      /**
       * @param inputSchema Describes the format of the data in the streaming source, and how each
       * data element maps to corresponding columns in the in-application stream that is being created.
       * 
       * Also used to describe the format of the reference data source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0a5940c935c711763cd1ef3389f18317ef887ca177ebe88178c6a223cc8ef0c")
      override fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit): Unit =
          inputSchema(InputSchemaProperty(inputSchema))

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Firehose delivery
       * stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis
       * Analytics to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      override fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Firehose delivery
       * stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis
       * Analytics to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      override fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(KinesisFirehoseInputProperty::unwrap))
      }

      /**
       * @param kinesisFirehoseInput If the streaming source is an Amazon Kinesis Firehose delivery
       * stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis
       * Analytics to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96080edf84cea30048b0079f0daad73d6bade4dd50469508b99bbe4a3dd61721")
      override
          fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit):
          Unit = kinesisFirehoseInput(KinesisFirehoseInputProperty(kinesisFirehoseInput))

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis stream, identifies
       * the stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics
       * to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      override fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis stream, identifies
       * the stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics
       * to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      override fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(KinesisStreamsInputProperty::unwrap))
      }

      /**
       * @param kinesisStreamsInput If the streaming source is an Amazon Kinesis stream, identifies
       * the stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics
       * to access the stream on your behalf.
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37ce89a38cc91defa2b2713c9cd91911e1788e93cc804d3cbfaa55d53eb5a73e")
      override
          fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit):
          Unit = kinesisStreamsInput(KinesisStreamsInputProperty(kinesisStreamsInput))

      /**
       * @param namePrefix Name prefix to use when creating an in-application stream. 
       * Suppose that you specify a prefix "MyInApplicationStream." Amazon Kinesis Analytics then
       * creates one or more (as per the `InputParallelism` count you specified) in-application streams
       * with names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on.
       */
      override fun namePrefix(namePrefix: String) {
        cdkBuilder.namePrefix(namePrefix)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty,
    ) : InputProperty {
      /**
       * Describes the number of in-application streams to create.
       *
       * Data from your source is routed to these in-application input streams.
       *
       * See [Configuring Application
       * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputparallelism)
       */
      override fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

      /**
       * The
       * [InputProcessingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputprocessingconfiguration.html)
       * for the input. An input processor transforms records as they are received from the stream,
       * before the application's SQL code executes. Currently, the only input processing configuration
       * available is
       * [InputLambdaProcessor](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputprocessingconfiguration)
       */
      override fun inputProcessingConfiguration(): Any? =
          unwrap(this).getInputProcessingConfiguration()

      /**
       * Describes the format of the data in the streaming source, and how each data element maps to
       * corresponding columns in the in-application stream that is being created.
       *
       * Also used to describe the format of the reference data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-inputschema)
       */
      override fun inputSchema(): Any = unwrap(this).getInputSchema()

      /**
       * If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the
       * delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics to access the
       * stream on your behalf.
       *
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisfirehoseinput)
       */
      override fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

      /**
       * If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon
       * Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to access the stream
       * on your behalf.
       *
       * Note: Either `KinesisStreamsInput` or `KinesisFirehoseInput` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-kinesisstreamsinput)
       */
      override fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

      /**
       * Name prefix to use when creating an in-application stream.
       *
       * Suppose that you specify a prefix "MyInApplicationStream." Amazon Kinesis Analytics then
       * creates one or more (as per the `InputParallelism` count you specified) in-application streams
       * with names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-input.html#cfn-kinesisanalytics-application-input-nameprefix)
       */
      override fun namePrefix(): String = unwrap(this).getNamePrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty):
          InputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RecordColumnProperty {
    /**
     * Reference to the data element in the streaming input or the reference data source.
     *
     * This element is required if the
     * [RecordFormatType](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_RecordFormat.html#analytics-Type-RecordFormat-RecordFormatTypel)
     * is `JSON` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-mapping)
     */
    public fun mapping(): String? = unwrap(this).getMapping()

    /**
     * Name of the column created in the in-application input stream or reference table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-name)
     */
    public fun name(): String

    /**
     * Type of column created in the in-application input stream or reference table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-sqltype)
     */
    public fun sqlType(): String

    /**
     * A builder for [RecordColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mapping Reference to the data element in the streaming input or the reference data
       * source.
       * This element is required if the
       * [RecordFormatType](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_RecordFormat.html#analytics-Type-RecordFormat-RecordFormatTypel)
       * is `JSON` .
       */
      public fun mapping(mapping: String)

      /**
       * @param name Name of the column created in the in-application input stream or reference
       * table. 
       */
      public fun name(name: String)

      /**
       * @param sqlType Type of column created in the in-application input stream or reference
       * table. 
       */
      public fun sqlType(sqlType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.builder()

      /**
       * @param mapping Reference to the data element in the streaming input or the reference data
       * source.
       * This element is required if the
       * [RecordFormatType](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_RecordFormat.html#analytics-Type-RecordFormat-RecordFormatTypel)
       * is `JSON` .
       */
      override fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
      }

      /**
       * @param name Name of the column created in the in-application input stream or reference
       * table. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param sqlType Type of column created in the in-application input stream or reference
       * table. 
       */
      override fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty,
    ) : RecordColumnProperty {
      /**
       * Reference to the data element in the streaming input or the reference data source.
       *
       * This element is required if the
       * [RecordFormatType](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_RecordFormat.html#analytics-Type-RecordFormat-RecordFormatTypel)
       * is `JSON` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-mapping)
       */
      override fun mapping(): String? = unwrap(this).getMapping()

      /**
       * Name of the column created in the in-application input stream or reference table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Type of column created in the in-application input stream or reference table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordcolumn.html#cfn-kinesisanalytics-application-recordcolumn-sqltype)
       */
      override fun sqlType(): String = unwrap(this).getSqlType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty):
          RecordColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordColumnProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CSVMappingParametersProperty {
    /**
     * Column delimiter.
     *
     * For example, in a CSV format, a comma (",") is the typical column delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordcolumndelimiter)
     */
    public fun recordColumnDelimiter(): String

    /**
     * Row delimiter.
     *
     * For example, in a CSV format, *'\n'* is the typical row delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordrowdelimiter)
     */
    public fun recordRowDelimiter(): String

    /**
     * A builder for [CSVMappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordColumnDelimiter Column delimiter. 
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       */
      public fun recordColumnDelimiter(recordColumnDelimiter: String)

      /**
       * @param recordRowDelimiter Row delimiter. 
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       */
      public fun recordRowDelimiter(recordRowDelimiter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.builder()

      /**
       * @param recordColumnDelimiter Column delimiter. 
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       */
      override fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
      }

      /**
       * @param recordRowDelimiter Row delimiter. 
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       */
      override fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty,
    ) : CSVMappingParametersProperty {
      /**
       * Column delimiter.
       *
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordcolumndelimiter)
       */
      override fun recordColumnDelimiter(): String = unwrap(this).getRecordColumnDelimiter()

      /**
       * Row delimiter.
       *
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordrowdelimiter)
       */
      override fun recordRowDelimiter(): String = unwrap(this).getRecordRowDelimiter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CSVMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty):
          CSVMappingParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CSVMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RecordFormatProperty {
    /**
     * When configuring application input at the time of creating or updating an application,
     * provides additional mapping information specific to the record format (such as JSON, CSV, or
     * record fields delimited by some delimiter) on the streaming source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-mappingparameters)
     */
    public fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

    /**
     * The type of record format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-recordformattype)
     */
    public fun recordFormatType(): String

    /**
     * A builder for [RecordFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      public fun mappingParameters(mappingParameters: IResolvable)

      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      public fun mappingParameters(mappingParameters: MappingParametersProperty)

      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fdf8cd5ed4b9cde9795d4dc6d060ef31328ba8d291c8761a7a03e037b149bfb")
      public fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit)

      /**
       * @param recordFormatType The type of record format. 
       */
      public fun recordFormatType(recordFormatType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.builder()

      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      override fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters.let(IResolvable::unwrap))
      }

      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      override fun mappingParameters(mappingParameters: MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters.let(MappingParametersProperty::unwrap))
      }

      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fdf8cd5ed4b9cde9795d4dc6d060ef31328ba8d291c8761a7a03e037b149bfb")
      override
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit):
          Unit = mappingParameters(MappingParametersProperty(mappingParameters))

      /**
       * @param recordFormatType The type of record format. 
       */
      override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty,
    ) : RecordFormatProperty {
      /**
       * When configuring application input at the time of creating or updating an application,
       * provides additional mapping information specific to the record format (such as JSON, CSV, or
       * record fields delimited by some delimiter) on the streaming source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-mappingparameters)
       */
      override fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

      /**
       * The type of record format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-recordformattype)
       */
      override fun recordFormatType(): String = unwrap(this).getRecordFormatType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecordFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty):
          RecordFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordFormatProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InputLambdaProcessorProperty {
    /**
     * The ARN of the [AWS Lambda](https://docs.aws.amazon.com/lambda/) function that operates on
     * records in the stream.
     *
     *
     * To specify an earlier version of the Lambda function than the latest, include the Lambda
     * function version in the Lambda function ARN. For more information about Lambda ARNs, see
     * [Example ARNs: AWS
     * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * The ARN of the IAM role that is used to access the AWS Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [InputLambdaProcessorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn The ARN of the [AWS Lambda](https://docs.aws.amazon.com/lambda/)
       * function that operates on records in the stream. 
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: AWS
       * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       */
      public fun resourceArn(resourceArn: String)

      /**
       * @param roleArn The ARN of the IAM role that is used to access the AWS Lambda function. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.builder()

      /**
       * @param resourceArn The ARN of the [AWS Lambda](https://docs.aws.amazon.com/lambda/)
       * function that operates on records in the stream. 
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
       * @param roleArn The ARN of the IAM role that is used to access the AWS Lambda function. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty,
    ) : InputLambdaProcessorProperty {
      /**
       * The ARN of the [AWS Lambda](https://docs.aws.amazon.com/lambda/) function that operates on
       * records in the stream.
       *
       *
       * To specify an earlier version of the Lambda function than the latest, include the Lambda
       * function version in the Lambda function ARN. For more information about Lambda ARNs, see
       * [Example ARNs: AWS
       * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()

      /**
       * The ARN of the IAM role that is used to access the AWS Lambda function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputlambdaprocessor.html#cfn-kinesisanalytics-application-inputlambdaprocessor-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputLambdaProcessorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty):
          InputLambdaProcessorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputLambdaProcessorProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
