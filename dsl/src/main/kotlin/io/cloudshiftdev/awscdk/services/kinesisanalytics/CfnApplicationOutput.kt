package io.cloudshiftdev.awscdk.services.kinesisanalytics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationOutput internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun output(): Any = unwrap(this).getOutput()

  public open fun output(`value`: IResolvable) {
    unwrap(this).setOutput(`value`.let(IResolvable::unwrap))
  }

  public open fun output(`value`: OutputProperty) {
    unwrap(this).setOutput(`value`.let(OutputProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1773b4060b6a5fb649c25dcf180319faada39022351f1a481cc74d89d2d4786e")
  public open fun output(`value`: OutputProperty.Builder.() -> Unit): Unit =
      output(OutputProperty(`value`))

  public interface Builder {
    public fun applicationName(applicationName: String) {
    }

    public fun output(output: IResolvable) {
    }

    public fun output(output: OutputProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9d4b57354a0dd7846a5437f4c042adf864d66a3f4b6a87a110a9c4368623faf")
    public fun output(output: OutputProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.Builder.create(scope,
        id)

    public override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public override fun output(output: IResolvable) {
      cdkBuilder.output(output.let(IResolvable::unwrap))
    }

    public override fun output(output: OutputProperty) {
      cdkBuilder.output(output.let(OutputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9d4b57354a0dd7846a5437f4c042adf864d66a3f4b6a87a110a9c4368623faf")
    public override fun output(output: OutputProperty.Builder.() -> Unit): Unit =
        output(OutputProperty(output))

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput =
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
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput):
        CfnApplicationOutput = CfnApplicationOutput(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationOutput):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput = wrapped.cdkObject
  }

  public interface DestinationSchemaProperty {
    public fun recordFormatType(): String? = unwrap(this).getRecordFormatType()

    public interface Builder {
      public fun recordFormatType(recordFormatType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty.builder()

      public override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty,
    ) : DestinationSchemaProperty {
      public override fun recordFormatType(): String? = unwrap(this).getRecordFormatType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty):
          DestinationSchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationSchemaProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.DestinationSchemaProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisStreamsOutputProperty {
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
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty.builder()

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty,
    ) : KinesisStreamsOutputProperty {
      public override fun resourceArn(): String = unwrap(this).getResourceArn()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamsOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty):
          KinesisStreamsOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamsOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisStreamsOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface OutputProperty {
    public fun destinationSchema(): Any

    public fun kinesisFirehoseOutput(): Any? = unwrap(this).getKinesisFirehoseOutput()

    public fun kinesisStreamsOutput(): Any? = unwrap(this).getKinesisStreamsOutput()

    public fun lambdaOutput(): Any? = unwrap(this).getLambdaOutput()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun destinationSchema(destinationSchema: IResolvable) {
      }

      public fun destinationSchema(destinationSchema: DestinationSchemaProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed57bf0989507d124ac3e68c92223c9d3573f229cff0a0a20aa74031d27b9483")
      public
          fun destinationSchema(destinationSchema: DestinationSchemaProperty.Builder.() -> Unit) {
      }

      public fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
      }

      public fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76c7046a9c50c86a9577ec431bf36d12eeb870190a63cb9240527b227d74ccb8")
      public
          fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty.Builder.() -> Unit) {
      }

      public fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
      }

      public fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb46a3f10ac4e629e90925bd5b55dd73632801b9090eccd5453b8b4911f75b6b")
      public
          fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty.Builder.() -> Unit) {
      }

      public fun lambdaOutput(lambdaOutput: IResolvable) {
      }

      public fun lambdaOutput(lambdaOutput: LambdaOutputProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("866e9705a6feeadd0f7146d9ecebdae2c408da1fbab99058bc47e2ce663323ba")
      public fun lambdaOutput(lambdaOutput: LambdaOutputProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty.builder()

      public override fun destinationSchema(destinationSchema: IResolvable) {
        cdkBuilder.destinationSchema(destinationSchema.let(IResolvable::unwrap))
      }

      public override fun destinationSchema(destinationSchema: DestinationSchemaProperty) {
        cdkBuilder.destinationSchema(destinationSchema.let(DestinationSchemaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed57bf0989507d124ac3e68c92223c9d3573f229cff0a0a20aa74031d27b9483")
      public override
          fun destinationSchema(destinationSchema: DestinationSchemaProperty.Builder.() -> Unit):
          Unit = destinationSchema(DestinationSchemaProperty(destinationSchema))

      public override fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput.let(IResolvable::unwrap))
      }

      public override
          fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput.let(KinesisFirehoseOutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76c7046a9c50c86a9577ec431bf36d12eeb870190a63cb9240527b227d74ccb8")
      public override
          fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty.Builder.() -> Unit):
          Unit = kinesisFirehoseOutput(KinesisFirehoseOutputProperty(kinesisFirehoseOutput))

      public override fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput.let(IResolvable::unwrap))
      }

      public override fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput.let(KinesisStreamsOutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cb46a3f10ac4e629e90925bd5b55dd73632801b9090eccd5453b8b4911f75b6b")
      public override
          fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty.Builder.() -> Unit):
          Unit = kinesisStreamsOutput(KinesisStreamsOutputProperty(kinesisStreamsOutput))

      public override fun lambdaOutput(lambdaOutput: IResolvable) {
        cdkBuilder.lambdaOutput(lambdaOutput.let(IResolvable::unwrap))
      }

      public override fun lambdaOutput(lambdaOutput: LambdaOutputProperty) {
        cdkBuilder.lambdaOutput(lambdaOutput.let(LambdaOutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("866e9705a6feeadd0f7146d9ecebdae2c408da1fbab99058bc47e2ce663323ba")
      public override fun lambdaOutput(lambdaOutput: LambdaOutputProperty.Builder.() -> Unit): Unit
          = lambdaOutput(LambdaOutputProperty(lambdaOutput))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty,
    ) : OutputProperty {
      public override fun destinationSchema(): Any = unwrap(this).getDestinationSchema()

      public override fun kinesisFirehoseOutput(): Any? = unwrap(this).getKinesisFirehoseOutput()

      public override fun kinesisStreamsOutput(): Any? = unwrap(this).getKinesisStreamsOutput()

      public override fun lambdaOutput(): Any? = unwrap(this).getLambdaOutput()

      public override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty):
          OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.OutputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisFirehoseOutputProperty {
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
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty.builder()

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty,
    ) : KinesisFirehoseOutputProperty {
      public override fun resourceArn(): String = unwrap(this).getResourceArn()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty):
          KinesisFirehoseOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.KinesisFirehoseOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaOutputProperty {
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
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty.builder()

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty,
    ) : LambdaOutputProperty {
      public override fun resourceArn(): String = unwrap(this).getResourceArn()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty):
          LambdaOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput.LambdaOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
