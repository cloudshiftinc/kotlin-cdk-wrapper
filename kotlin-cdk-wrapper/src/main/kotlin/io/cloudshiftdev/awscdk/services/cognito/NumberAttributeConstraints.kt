@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface NumberAttributeConstraints {
  public fun max(): Number? = unwrap(this).getMax()

  public fun min(): Number? = unwrap(this).getMin()

  @CdkDslMarker
  public interface Builder {
    public fun max(max: Number)

    public fun min(min: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints.Builder =
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints.builder()

    override fun max(max: Number) {
      cdkBuilder.max(max)
    }

    override fun min(min: Number) {
      cdkBuilder.min(min)
    }

    public fun build(): software.amazon.awscdk.services.cognito.NumberAttributeConstraints =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeConstraints,
  ) : CdkObject(cdkObject), NumberAttributeConstraints {
    override fun max(): Number? = unwrap(this).getMax()

    override fun min(): Number? = unwrap(this).getMin()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NumberAttributeConstraints {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeConstraints):
        NumberAttributeConstraints = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NumberAttributeConstraints):
        software.amazon.awscdk.services.cognito.NumberAttributeConstraints = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.NumberAttributeConstraints
  }
}
