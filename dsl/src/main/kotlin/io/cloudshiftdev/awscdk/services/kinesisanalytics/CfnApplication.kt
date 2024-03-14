package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
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
  public open fun applicationCode(): String? = unwrap(this).getApplicationCode()

  public open fun applicationCode(`value`: String) {
    unwrap(this).setApplicationCode(`value`)
  }

  public open fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

  public open fun applicationDescription(`value`: String) {
    unwrap(this).setApplicationDescription(`value`)
  }

  public open fun applicationName(): String? = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun inputs(): Any = unwrap(this).getInputs()

  public open fun inputs(`value`: IResolvable) {
    unwrap(this).setInputs(`value`.let(IResolvable::unwrap))
  }

  public open fun inputs(__idx_ac66f0: List<Any>) {
    unwrap(this).setInputs(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun applicationCode(applicationCode: String) {
    }

    public fun applicationDescription(applicationDescription: String) {
    }

    public fun applicationName(applicationName: String) {
    }

    public fun inputs(inputs: IResolvable) {
    }

    public fun inputs(inputs: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesisanalytics.CfnApplication.Builder
        = software.amazon.awscdk.services.kinesisanalytics.CfnApplication.Builder.create(scope, id)

    public override fun applicationCode(applicationCode: String) {
      cdkBuilder.applicationCode(applicationCode)
    }

    public override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    public override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public override fun inputs(inputs: IResolvable) {
      cdkBuilder.inputs(inputs.let(IResolvable::unwrap))
    }

    public override fun inputs(inputs: List<Any>) {
      cdkBuilder.inputs(inputs)
    }

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
    public fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

    public fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()

    public interface Builder {
      public fun csvMappingParameters(csvMappingParameters: IResolvable) {
      }

      public fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71603913f441a14fff1edb084e4fe4d97caad4d8fe61bc2d3a57b40ba26e2d78")
      public
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit) {
      }

      public fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
      }

      public fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("180124263f709d356d579515a3b1136b6826dc1cb855a4e2b52bd528765b49c9")
      public
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.MappingParametersProperty.builder()

      public override fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(IResolvable::unwrap))
      }

      public override fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(CSVMappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71603913f441a14fff1edb084e4fe4d97caad4d8fe61bc2d3a57b40ba26e2d78")
      public override
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit):
          Unit = csvMappingParameters(CSVMappingParametersProperty(csvMappingParameters))

      public override fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(IResolvable::unwrap))
      }

      public override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(JSONMappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("180124263f709d356d579515a3b1136b6826dc1cb855a4e2b52bd528765b49c9")
      public override
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
      public override fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

      public override fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()
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
    public fun count(): Number? = unwrap(this).getCount()

    public interface Builder {
      public fun count(count: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputParallelismProperty.builder()

      public override fun count(count: Number) {
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
      public override fun count(): Number? = unwrap(this).getCount()
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
    public fun recordColumns(): Any

    public fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

    public fun recordFormat(): Any

    public interface Builder {
      public fun recordColumns(recordColumns: IResolvable) {
      }

      public fun recordColumns(recordColumns: List<Any>) {
      }

      public fun recordEncoding(recordEncoding: String) {
      }

      public fun recordFormat(recordFormat: IResolvable) {
      }

      public fun recordFormat(recordFormat: RecordFormatProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ff787489b02d04f0997a1e4cc9c0dc9e2f0320ca7207ed654730401ebfded77")
      public fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty.builder()

      public override fun recordColumns(recordColumns: IResolvable) {
        cdkBuilder.recordColumns(recordColumns.let(IResolvable::unwrap))
      }

      public override fun recordColumns(recordColumns: List<Any>) {
        cdkBuilder.recordColumns(recordColumns)
      }

      public override fun recordEncoding(recordEncoding: String) {
        cdkBuilder.recordEncoding(recordEncoding)
      }

      public override fun recordFormat(recordFormat: IResolvable) {
        cdkBuilder.recordFormat(recordFormat.let(IResolvable::unwrap))
      }

      public override fun recordFormat(recordFormat: RecordFormatProperty) {
        cdkBuilder.recordFormat(recordFormat.let(RecordFormatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0ff787489b02d04f0997a1e4cc9c0dc9e2f0320ca7207ed654730401ebfded77")
      public override fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit): Unit
          = recordFormat(RecordFormatProperty(recordFormat))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputSchemaProperty,
    ) : InputSchemaProperty {
      public override fun recordColumns(): Any = unwrap(this).getRecordColumns()

      public override fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

      public override fun recordFormat(): Any = unwrap(this).getRecordFormat()
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
    public fun recordRowPath(): String

    public interface Builder {
      public fun recordRowPath(recordRowPath: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.JSONMappingParametersProperty.builder()

      public override fun recordRowPath(recordRowPath: String) {
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
      public override fun recordRowPath(): String = unwrap(this).getRecordRowPath()
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
    public fun resourceArn(): String

    public fun roleArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisStreamsInputProperty.builder()

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public override fun roleArn(roleArn: String) {
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
      public override fun resourceArn(): String = unwrap(this).getResourceArn()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
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
    public fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()

    public interface Builder {
      public fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
      }

      public fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22e43a8df1a42aa9a14bded8d9c61d5f72c2a6d3882c2cea963c9f6a6f2282f4")
      public
          fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProcessingConfigurationProperty.builder()

      public override fun inputLambdaProcessor(inputLambdaProcessor: IResolvable) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(IResolvable::unwrap))
      }

      public override fun inputLambdaProcessor(inputLambdaProcessor: InputLambdaProcessorProperty) {
        cdkBuilder.inputLambdaProcessor(inputLambdaProcessor.let(InputLambdaProcessorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22e43a8df1a42aa9a14bded8d9c61d5f72c2a6d3882c2cea963c9f6a6f2282f4")
      public override
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
      public override fun inputLambdaProcessor(): Any? = unwrap(this).getInputLambdaProcessor()
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
    public fun resourceArn(): String

    public fun roleArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.KinesisFirehoseInputProperty.builder()

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public override fun roleArn(roleArn: String) {
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
      public override fun resourceArn(): String = unwrap(this).getResourceArn()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
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
    public fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

    public fun inputProcessingConfiguration(): Any? = unwrap(this).getInputProcessingConfiguration()

    public fun inputSchema(): Any

    public fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

    public fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

    public fun namePrefix(): String

    public interface Builder {
      public fun inputParallelism(inputParallelism: IResolvable) {
      }

      public fun inputParallelism(inputParallelism: InputParallelismProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71e01be074f1eaad282d9ad1dff2a53f90f02c257cc7cfba406a03e7396883ea")
      public fun inputParallelism(inputParallelism: InputParallelismProperty.Builder.() -> Unit) {
      }

      public fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
      }

      public
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d1e1e4aa2b4726f7b62131cd424666d0bac429f10cb8d0b5d2489446117e15d")
      public
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty.Builder.() -> Unit) {
      }

      public fun inputSchema(inputSchema: IResolvable) {
      }

      public fun inputSchema(inputSchema: InputSchemaProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0a5940c935c711763cd1ef3389f18317ef887ca177ebe88178c6a223cc8ef0c")
      public fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit) {
      }

      public fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
      }

      public fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96080edf84cea30048b0079f0daad73d6bade4dd50469508b99bbe4a3dd61721")
      public
          fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit) {
      }

      public fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
      }

      public fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37ce89a38cc91defa2b2713c9cd91911e1788e93cc804d3cbfaa55d53eb5a73e")
      public
          fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit) {
      }

      public fun namePrefix(namePrefix: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.Builder =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputProperty.builder()

      public override fun inputParallelism(inputParallelism: IResolvable) {
        cdkBuilder.inputParallelism(inputParallelism.let(IResolvable::unwrap))
      }

      public override fun inputParallelism(inputParallelism: InputParallelismProperty) {
        cdkBuilder.inputParallelism(inputParallelism.let(InputParallelismProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("71e01be074f1eaad282d9ad1dff2a53f90f02c257cc7cfba406a03e7396883ea")
      public override
          fun inputParallelism(inputParallelism: InputParallelismProperty.Builder.() -> Unit): Unit
          = inputParallelism(InputParallelismProperty(inputParallelism))

      public override fun inputProcessingConfiguration(inputProcessingConfiguration: IResolvable) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty) {
        cdkBuilder.inputProcessingConfiguration(inputProcessingConfiguration.let(InputProcessingConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d1e1e4aa2b4726f7b62131cd424666d0bac429f10cb8d0b5d2489446117e15d")
      public override
          fun inputProcessingConfiguration(inputProcessingConfiguration: InputProcessingConfigurationProperty.Builder.() -> Unit):
          Unit =
          inputProcessingConfiguration(InputProcessingConfigurationProperty(inputProcessingConfiguration))

      public override fun inputSchema(inputSchema: IResolvable) {
        cdkBuilder.inputSchema(inputSchema.let(IResolvable::unwrap))
      }

      public override fun inputSchema(inputSchema: InputSchemaProperty) {
        cdkBuilder.inputSchema(inputSchema.let(InputSchemaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0a5940c935c711763cd1ef3389f18317ef887ca177ebe88178c6a223cc8ef0c")
      public override fun inputSchema(inputSchema: InputSchemaProperty.Builder.() -> Unit): Unit =
          inputSchema(InputSchemaProperty(inputSchema))

      public override fun kinesisFirehoseInput(kinesisFirehoseInput: IResolvable) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(IResolvable::unwrap))
      }

      public override fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty) {
        cdkBuilder.kinesisFirehoseInput(kinesisFirehoseInput.let(KinesisFirehoseInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96080edf84cea30048b0079f0daad73d6bade4dd50469508b99bbe4a3dd61721")
      public override
          fun kinesisFirehoseInput(kinesisFirehoseInput: KinesisFirehoseInputProperty.Builder.() -> Unit):
          Unit = kinesisFirehoseInput(KinesisFirehoseInputProperty(kinesisFirehoseInput))

      public override fun kinesisStreamsInput(kinesisStreamsInput: IResolvable) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(IResolvable::unwrap))
      }

      public override fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty) {
        cdkBuilder.kinesisStreamsInput(kinesisStreamsInput.let(KinesisStreamsInputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37ce89a38cc91defa2b2713c9cd91911e1788e93cc804d3cbfaa55d53eb5a73e")
      public override
          fun kinesisStreamsInput(kinesisStreamsInput: KinesisStreamsInputProperty.Builder.() -> Unit):
          Unit = kinesisStreamsInput(KinesisStreamsInputProperty(kinesisStreamsInput))

      public override fun namePrefix(namePrefix: String) {
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
      public override fun inputParallelism(): Any? = unwrap(this).getInputParallelism()

      public override fun inputProcessingConfiguration(): Any? =
          unwrap(this).getInputProcessingConfiguration()

      public override fun inputSchema(): Any = unwrap(this).getInputSchema()

      public override fun kinesisFirehoseInput(): Any? = unwrap(this).getKinesisFirehoseInput()

      public override fun kinesisStreamsInput(): Any? = unwrap(this).getKinesisStreamsInput()

      public override fun namePrefix(): String = unwrap(this).getNamePrefix()
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
    public fun mapping(): String? = unwrap(this).getMapping()

    public fun name(): String

    public fun sqlType(): String

    public interface Builder {
      public fun mapping(mapping: String) {
      }

      public fun name(name: String) {
      }

      public fun sqlType(sqlType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordColumnProperty.builder()

      public override fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun sqlType(sqlType: String) {
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
      public override fun mapping(): String? = unwrap(this).getMapping()

      public override fun name(): String = unwrap(this).getName()

      public override fun sqlType(): String = unwrap(this).getSqlType()
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
    public fun recordColumnDelimiter(): String

    public fun recordRowDelimiter(): String

    public interface Builder {
      public fun recordColumnDelimiter(recordColumnDelimiter: String) {
      }

      public fun recordRowDelimiter(recordRowDelimiter: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.CSVMappingParametersProperty.builder()

      public override fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
      }

      public override fun recordRowDelimiter(recordRowDelimiter: String) {
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
      public override fun recordColumnDelimiter(): String = unwrap(this).getRecordColumnDelimiter()

      public override fun recordRowDelimiter(): String = unwrap(this).getRecordRowDelimiter()
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
    public fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

    public fun recordFormatType(): String

    public interface Builder {
      public fun mappingParameters(mappingParameters: IResolvable) {
      }

      public fun mappingParameters(mappingParameters: MappingParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fdf8cd5ed4b9cde9795d4dc6d060ef31328ba8d291c8761a7a03e037b149bfb")
      public
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit) {
      }

      public fun recordFormatType(recordFormatType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.RecordFormatProperty.builder()

      public override fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters.let(IResolvable::unwrap))
      }

      public override fun mappingParameters(mappingParameters: MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters.let(MappingParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fdf8cd5ed4b9cde9795d4dc6d060ef31328ba8d291c8761a7a03e037b149bfb")
      public override
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit):
          Unit = mappingParameters(MappingParametersProperty(mappingParameters))

      public override fun recordFormatType(recordFormatType: String) {
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
      public override fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

      public override fun recordFormatType(): String = unwrap(this).getRecordFormatType()
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
    public fun resourceArn(): String

    public fun roleArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplication.InputLambdaProcessorProperty.builder()

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public override fun roleArn(roleArn: String) {
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
      public override fun resourceArn(): String = unwrap(this).getResourceArn()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
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
