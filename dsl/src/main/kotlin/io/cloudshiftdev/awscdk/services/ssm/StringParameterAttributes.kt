package io.cloudshiftdev.awscdk.services.ssm

import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface StringParameterAttributes : CommonStringParameterAttributes {
  public fun forceDynamicReference(): Boolean? = unwrap(this).getForceDynamicReference()

  @Deprecated(message = "deprecated in CDK")
  public fun type(): ParameterType? = unwrap(this).getType()?.let(ParameterType::wrap)

  public fun valueType(): ParameterValueType? =
      unwrap(this).getValueType()?.let(ParameterValueType::wrap)

  public fun version(): Number? = unwrap(this).getVersion()

  public interface Builder {
    public fun forceDynamicReference(forceDynamicReference: Boolean) {
    }

    public fun parameterName(parameterName: String) {
    }

    public fun simpleName(simpleName: Boolean) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun type(type: ParameterType) {
    }

    public fun valueType(valueType: ParameterValueType) {
    }

    public fun version(version: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.StringParameterAttributes.Builder =
        software.amazon.awscdk.services.ssm.StringParameterAttributes.builder()

    public override fun forceDynamicReference(forceDynamicReference: Boolean) {
      cdkBuilder.forceDynamicReference(forceDynamicReference)
    }

    public override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    public override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun type(type: ParameterType) {
      cdkBuilder.type(type.let(ParameterType::unwrap))
    }

    public override fun valueType(valueType: ParameterValueType) {
      cdkBuilder.valueType(valueType.let(ParameterValueType::unwrap))
    }

    public override fun version(version: Number) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.ssm.StringParameterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ssm.StringParameterAttributes,
  ) : StringParameterAttributes {
    public override fun forceDynamicReference(): Boolean? = unwrap(this).getForceDynamicReference()

    public override fun parameterName(): String = unwrap(this).getParameterName()

    public override fun simpleName(): Boolean? = unwrap(this).getSimpleName()

    @Deprecated(message = "deprecated in CDK")
    public override fun type(): ParameterType? = unwrap(this).getType()?.let(ParameterType::wrap)

    public override fun valueType(): ParameterValueType? =
        unwrap(this).getValueType()?.let(ParameterValueType::wrap)

    public override fun version(): Number? = unwrap(this).getVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StringParameterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.StringParameterAttributes):
        StringParameterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringParameterAttributes):
        software.amazon.awscdk.services.ssm.StringParameterAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
