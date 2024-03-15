@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface StringParameterProps : ParameterOptions {
  public fun dataType(): ParameterDataType? =
      unwrap(this).getDataType()?.let(ParameterDataType::wrap)

  public fun stringValue(): String

  @Deprecated(message = "deprecated in CDK")
  public fun type(): ParameterType? = unwrap(this).getType()?.let(ParameterType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun allowedPattern(allowedPattern: String)

    public fun dataType(dataType: ParameterDataType)

    public fun description(description: String)

    public fun parameterName(parameterName: String)

    public fun simpleName(simpleName: Boolean)

    public fun stringValue(stringValue: String)

    public fun tier(tier: ParameterTier)

    @Deprecated(message = "deprecated in CDK")
    public fun type(type: ParameterType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.StringParameterProps.Builder =
        software.amazon.awscdk.services.ssm.StringParameterProps.builder()

    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    override fun dataType(dataType: ParameterDataType) {
      cdkBuilder.dataType(dataType.let(ParameterDataType::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    override fun stringValue(stringValue: String) {
      cdkBuilder.stringValue(stringValue)
    }

    override fun tier(tier: ParameterTier) {
      cdkBuilder.tier(tier.let(ParameterTier::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun type(type: ParameterType) {
      cdkBuilder.type(type.let(ParameterType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssm.StringParameterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.StringParameterProps,
  ) : CdkObject(cdkObject), StringParameterProps {
    override fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

    override fun dataType(): ParameterDataType? =
        unwrap(this).getDataType()?.let(ParameterDataType::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun parameterName(): String? = unwrap(this).getParameterName()

    override fun simpleName(): Boolean? = unwrap(this).getSimpleName()

    override fun stringValue(): String = unwrap(this).getStringValue()

    override fun tier(): ParameterTier? = unwrap(this).getTier()?.let(ParameterTier::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun type(): ParameterType? = unwrap(this).getType()?.let(ParameterType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringParameterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.StringParameterProps):
        StringParameterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringParameterProps):
        software.amazon.awscdk.services.ssm.StringParameterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ssm.StringParameterProps
  }
}
