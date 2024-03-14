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

public open class CfnApplicationOutputV2 internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2,
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
  @JvmName("1fcf52fb5c05906617cacd530e99f97ba04d36dc214abe10c6e09e49001277a4")
  public open fun output(`value`: OutputProperty.Builder.() -> Unit): Unit =
      output(OutputProperty(`value`))

  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun output(output: IResolvable)

    public fun output(output: OutputProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
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

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun output(output: IResolvable) {
      cdkBuilder.output(output.let(IResolvable::unwrap))
    }

    override fun output(output: OutputProperty) {
      cdkBuilder.output(output.let(OutputProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48c924cad691819a315f85bebf5ee57da3ad1ca794b856cc4a33c42bb866627c")
    override fun output(output: OutputProperty.Builder.() -> Unit): Unit =
        output(OutputProperty(output))

    public fun build(): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2 =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
  }

  public interface DestinationSchemaProperty {
    public fun recordFormatType(): String? = unwrap(this).getRecordFormatType()

    public interface Builder {
      public fun recordFormatType(recordFormatType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty.builder()

      override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty,
    ) : DestinationSchemaProperty {
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty):
          DestinationSchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationSchemaProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.DestinationSchemaProperty
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
      public fun destinationSchema(destinationSchema: IResolvable)

      public fun destinationSchema(destinationSchema: DestinationSchemaProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91db7e98310ca5542122f569c5226de205ab8581e37feba395c0909056368967")
      public fun destinationSchema(destinationSchema: DestinationSchemaProperty.Builder.() -> Unit)

      public fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable)

      public fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ab7a0f9a0287599d91f1fde38836e53738eb5d7704c91285815d843376a8a8b")
      public
          fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty.Builder.() -> Unit)

      public fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable)

      public fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c694330ef81f9fd59f428bd7c6c72f2a3e0562237eeb961b179186cf4676ba03")
      public
          fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty.Builder.() -> Unit)

      public fun lambdaOutput(lambdaOutput: IResolvable)

      public fun lambdaOutput(lambdaOutput: LambdaOutputProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f129f7261e7be0d07f5c2ace8e6e7fccc64f964916cb805e2512631300011c02")
      public fun lambdaOutput(lambdaOutput: LambdaOutputProperty.Builder.() -> Unit)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty.builder()

      override fun destinationSchema(destinationSchema: IResolvable) {
        cdkBuilder.destinationSchema(destinationSchema.let(IResolvable::unwrap))
      }

      override fun destinationSchema(destinationSchema: DestinationSchemaProperty) {
        cdkBuilder.destinationSchema(destinationSchema.let(DestinationSchemaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91db7e98310ca5542122f569c5226de205ab8581e37feba395c0909056368967")
      override
          fun destinationSchema(destinationSchema: DestinationSchemaProperty.Builder.() -> Unit):
          Unit = destinationSchema(DestinationSchemaProperty(destinationSchema))

      override fun kinesisFirehoseOutput(kinesisFirehoseOutput: IResolvable) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput.let(IResolvable::unwrap))
      }

      override fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty) {
        cdkBuilder.kinesisFirehoseOutput(kinesisFirehoseOutput.let(KinesisFirehoseOutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ab7a0f9a0287599d91f1fde38836e53738eb5d7704c91285815d843376a8a8b")
      override
          fun kinesisFirehoseOutput(kinesisFirehoseOutput: KinesisFirehoseOutputProperty.Builder.() -> Unit):
          Unit = kinesisFirehoseOutput(KinesisFirehoseOutputProperty(kinesisFirehoseOutput))

      override fun kinesisStreamsOutput(kinesisStreamsOutput: IResolvable) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput.let(IResolvable::unwrap))
      }

      override fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty) {
        cdkBuilder.kinesisStreamsOutput(kinesisStreamsOutput.let(KinesisStreamsOutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c694330ef81f9fd59f428bd7c6c72f2a3e0562237eeb961b179186cf4676ba03")
      override
          fun kinesisStreamsOutput(kinesisStreamsOutput: KinesisStreamsOutputProperty.Builder.() -> Unit):
          Unit = kinesisStreamsOutput(KinesisStreamsOutputProperty(kinesisStreamsOutput))

      override fun lambdaOutput(lambdaOutput: IResolvable) {
        cdkBuilder.lambdaOutput(lambdaOutput.let(IResolvable::unwrap))
      }

      override fun lambdaOutput(lambdaOutput: LambdaOutputProperty) {
        cdkBuilder.lambdaOutput(lambdaOutput.let(LambdaOutputProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f129f7261e7be0d07f5c2ace8e6e7fccc64f964916cb805e2512631300011c02")
      override fun lambdaOutput(lambdaOutput: LambdaOutputProperty.Builder.() -> Unit): Unit =
          lambdaOutput(LambdaOutputProperty(lambdaOutput))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty,
    ) : OutputProperty {
      override fun destinationSchema(): Any = unwrap(this).getDestinationSchema()

      override fun kinesisFirehoseOutput(): Any? = unwrap(this).getKinesisFirehoseOutput()

      override fun kinesisStreamsOutput(): Any? = unwrap(this).getKinesisStreamsOutput()

      override fun lambdaOutput(): Any? = unwrap(this).getLambdaOutput()

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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty):
          OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.OutputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisFirehoseOutputProperty {
    public fun resourceArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty.builder()

      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty,
    ) : KinesisFirehoseOutputProperty {
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty):
          KinesisFirehoseOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisFirehoseOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LambdaOutputProperty {
    public fun resourceArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty.builder()

      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty,
    ) : LambdaOutputProperty {
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty):
          LambdaOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.LambdaOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisStreamsOutputProperty {
    public fun resourceArn(): String

    public interface Builder {
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty.builder()

      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty,
    ) : KinesisStreamsOutputProperty {
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
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty):
          KinesisStreamsOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisStreamsOutputProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2.KinesisStreamsOutputProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
