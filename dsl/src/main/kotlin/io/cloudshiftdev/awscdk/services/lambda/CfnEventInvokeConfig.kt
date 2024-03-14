package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEventInvokeConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

  public open fun destinationConfig(`value`: IResolvable) {
    unwrap(this).setDestinationConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun destinationConfig(`value`: DestinationConfigProperty) {
    unwrap(this).setDestinationConfig(`value`.let(DestinationConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51071391ab2065c4a85e885ccafae73dcc98625e9f12ff0498b83b2a1bc7898d")
  public open fun destinationConfig(`value`: DestinationConfigProperty.Builder.() -> Unit): Unit =
      destinationConfig(DestinationConfigProperty(`value`))

  public open fun functionName(): String = unwrap(this).getFunctionName()

  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

  public open fun maximumEventAgeInSeconds(`value`: Number) {
    unwrap(this).setMaximumEventAgeInSeconds(`value`)
  }

  public open fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

  public open fun maximumRetryAttempts(`value`: Number) {
    unwrap(this).setMaximumRetryAttempts(`value`)
  }

  public open fun qualifier(): String = unwrap(this).getQualifier()

  public open fun qualifier(`value`: String) {
    unwrap(this).setQualifier(`value`)
  }

  public interface Builder {
    public fun destinationConfig(destinationConfig: IResolvable)

    public fun destinationConfig(destinationConfig: DestinationConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca885fb89db3d06474f73cc9783d10f31ac516380983e476d8f99f36065cb22b")
    public fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit)

    public fun functionName(functionName: String)

    public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number)

    public fun maximumRetryAttempts(maximumRetryAttempts: Number)

    public fun qualifier(qualifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.Builder =
        software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.Builder.create(scope, id)

    override fun destinationConfig(destinationConfig: IResolvable) {
      cdkBuilder.destinationConfig(destinationConfig.let(IResolvable::unwrap))
    }

    override fun destinationConfig(destinationConfig: DestinationConfigProperty) {
      cdkBuilder.destinationConfig(destinationConfig.let(DestinationConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca885fb89db3d06474f73cc9783d10f31ac516380983e476d8f99f36065cb22b")
    override fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit):
        Unit = destinationConfig(DestinationConfigProperty(destinationConfig))

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
      cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
    }

    override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnEventInvokeConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventInvokeConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventInvokeConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig):
        CfnEventInvokeConfig = CfnEventInvokeConfig(cdkObject)

    internal fun unwrap(wrapped: CfnEventInvokeConfig):
        software.amazon.awscdk.services.lambda.CfnEventInvokeConfig = wrapped.cdkObject
  }

  public interface OnFailureProperty {
    public fun destination(): String

    public interface Builder {
      public fun destination(destination: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty.builder()

      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty,
    ) : OnFailureProperty {
      override fun destination(): String = unwrap(this).getDestination()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OnFailureProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty):
          OnFailureProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnFailureProperty):
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DestinationConfigProperty {
    public fun onFailure(): Any? = unwrap(this).getOnFailure()

    public fun onSuccess(): Any? = unwrap(this).getOnSuccess()

    public interface Builder {
      public fun onFailure(onFailure: IResolvable)

      public fun onFailure(onFailure: OnFailureProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dbdff09ea3f6ad25eed2fd3d1089285979e928fe6db4b712232e789e38d983e")
      public fun onFailure(onFailure: OnFailureProperty.Builder.() -> Unit)

      public fun onSuccess(onSuccess: IResolvable)

      public fun onSuccess(onSuccess: OnSuccessProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28faf1b795b060a72e364409fac9a5a0f08d96ec620d72677131ccf7b582231f")
      public fun onSuccess(onSuccess: OnSuccessProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty.builder()

      override fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure.let(IResolvable::unwrap))
      }

      override fun onFailure(onFailure: OnFailureProperty) {
        cdkBuilder.onFailure(onFailure.let(OnFailureProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3dbdff09ea3f6ad25eed2fd3d1089285979e928fe6db4b712232e789e38d983e")
      override fun onFailure(onFailure: OnFailureProperty.Builder.() -> Unit): Unit =
          onFailure(OnFailureProperty(onFailure))

      override fun onSuccess(onSuccess: IResolvable) {
        cdkBuilder.onSuccess(onSuccess.let(IResolvable::unwrap))
      }

      override fun onSuccess(onSuccess: OnSuccessProperty) {
        cdkBuilder.onSuccess(onSuccess.let(OnSuccessProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28faf1b795b060a72e364409fac9a5a0f08d96ec620d72677131ccf7b582231f")
      override fun onSuccess(onSuccess: OnSuccessProperty.Builder.() -> Unit): Unit =
          onSuccess(OnSuccessProperty(onSuccess))

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty,
    ) : DestinationConfigProperty {
      override fun onFailure(): Any? = unwrap(this).getOnFailure()

      override fun onSuccess(): Any? = unwrap(this).getOnSuccess()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty):
          DestinationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.DestinationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OnSuccessProperty {
    public fun destination(): String

    public interface Builder {
      public fun destination(destination: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty.builder()

      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty,
    ) : OnSuccessProperty {
      override fun destination(): String = unwrap(this).getDestination()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OnSuccessProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty):
          OnSuccessProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnSuccessProperty):
          software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
