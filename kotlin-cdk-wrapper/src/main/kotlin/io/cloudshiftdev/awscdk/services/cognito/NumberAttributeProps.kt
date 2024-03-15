@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface NumberAttributeProps : NumberAttributeConstraints, CustomAttributeProps {
  @CdkDslMarker
  public interface Builder {
    public fun max(max: Number)

    public fun min(min: Number)

    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.NumberAttributeProps.Builder =
        software.amazon.awscdk.services.cognito.NumberAttributeProps.builder()

    override fun max(max: Number) {
      cdkBuilder.max(max)
    }

    override fun min(min: Number) {
      cdkBuilder.min(min)
    }

    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.cognito.NumberAttributeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeProps,
  ) : CdkObject(cdkObject), NumberAttributeProps {
    override fun max(): Number? = unwrap(this).getMax()

    override fun min(): Number? = unwrap(this).getMin()

    override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NumberAttributeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeProps):
        NumberAttributeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NumberAttributeProps):
        software.amazon.awscdk.services.cognito.NumberAttributeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.NumberAttributeProps
  }
}
