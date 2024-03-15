@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ParameterOptions {
  public fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

  public fun description(): String? = unwrap(this).getDescription()

  public fun parameterName(): String? = unwrap(this).getParameterName()

  public fun simpleName(): Boolean? = unwrap(this).getSimpleName()

  public fun tier(): ParameterTier? = unwrap(this).getTier()?.let(ParameterTier::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun allowedPattern(allowedPattern: String)

    public fun description(description: String)

    public fun parameterName(parameterName: String)

    public fun simpleName(simpleName: Boolean)

    public fun tier(tier: ParameterTier)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.ParameterOptions.Builder =
        software.amazon.awscdk.services.ssm.ParameterOptions.builder()

    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
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

    override fun tier(tier: ParameterTier) {
      cdkBuilder.tier(tier.let(ParameterTier::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssm.ParameterOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.ParameterOptions,
  ) : CdkObject(cdkObject), ParameterOptions {
    override fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

    override fun description(): String? = unwrap(this).getDescription()

    override fun parameterName(): String? = unwrap(this).getParameterName()

    override fun simpleName(): Boolean? = unwrap(this).getSimpleName()

    override fun tier(): ParameterTier? = unwrap(this).getTier()?.let(ParameterTier::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.ParameterOptions):
        ParameterOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParameterOptions):
        software.amazon.awscdk.services.ssm.ParameterOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ssm.ParameterOptions
  }
}
