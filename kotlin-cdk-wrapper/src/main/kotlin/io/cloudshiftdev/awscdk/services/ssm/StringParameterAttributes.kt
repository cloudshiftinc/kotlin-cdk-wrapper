@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun forceDynamicReference(forceDynamicReference: Boolean)

    public fun parameterName(parameterName: String)

    public fun simpleName(simpleName: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun type(type: ParameterType)

    public fun valueType(valueType: ParameterValueType)

    public fun version(version: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.StringParameterAttributes.Builder =
        software.amazon.awscdk.services.ssm.StringParameterAttributes.builder()

    override fun forceDynamicReference(forceDynamicReference: Boolean) {
      cdkBuilder.forceDynamicReference(forceDynamicReference)
    }

    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun type(type: ParameterType) {
      cdkBuilder.type(type.let(ParameterType::unwrap))
    }

    override fun valueType(valueType: ParameterValueType) {
      cdkBuilder.valueType(valueType.let(ParameterValueType::unwrap))
    }

    override fun version(version: Number) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.ssm.StringParameterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.StringParameterAttributes,
  ) : CdkObject(cdkObject), StringParameterAttributes {
    override fun forceDynamicReference(): Boolean? = unwrap(this).getForceDynamicReference()

    override fun parameterName(): String = unwrap(this).getParameterName()

    override fun simpleName(): Boolean? = unwrap(this).getSimpleName()

    @Deprecated(message = "deprecated in CDK")
    override fun type(): ParameterType? = unwrap(this).getType()?.let(ParameterType::wrap)

    override fun valueType(): ParameterValueType? =
        unwrap(this).getValueType()?.let(ParameterValueType::wrap)

    override fun version(): Number? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringParameterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.StringParameterAttributes):
        StringParameterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringParameterAttributes):
        software.amazon.awscdk.services.ssm.StringParameterAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.StringParameterAttributes
  }
}
