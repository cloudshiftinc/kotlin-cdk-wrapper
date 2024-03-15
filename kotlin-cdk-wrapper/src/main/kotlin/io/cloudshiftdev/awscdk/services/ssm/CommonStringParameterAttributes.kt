@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CommonStringParameterAttributes {
  public fun parameterName(): String

  public fun simpleName(): Boolean? = unwrap(this).getSimpleName()

  @CdkDslMarker
  public interface Builder {
    public fun parameterName(parameterName: String)

    public fun simpleName(simpleName: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssm.CommonStringParameterAttributes.Builder =
        software.amazon.awscdk.services.ssm.CommonStringParameterAttributes.builder()

    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CommonStringParameterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CommonStringParameterAttributes,
  ) : CdkObject(cdkObject), CommonStringParameterAttributes {
    override fun parameterName(): String = unwrap(this).getParameterName()

    override fun simpleName(): Boolean? = unwrap(this).getSimpleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonStringParameterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CommonStringParameterAttributes):
        CommonStringParameterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonStringParameterAttributes):
        software.amazon.awscdk.services.ssm.CommonStringParameterAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CommonStringParameterAttributes
  }
}
