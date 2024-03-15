@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface StringAttributeProps : StringAttributeConstraints, CustomAttributeProps {
  @CdkDslMarker
  public interface Builder {
    public fun maxLen(maxLen: Number)

    public fun minLen(minLen: Number)

    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StringAttributeProps.Builder =
        software.amazon.awscdk.services.cognito.StringAttributeProps.builder()

    override fun maxLen(maxLen: Number) {
      cdkBuilder.maxLen(maxLen)
    }

    override fun minLen(minLen: Number) {
      cdkBuilder.minLen(minLen)
    }

    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.cognito.StringAttributeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.StringAttributeProps,
  ) : CdkObject(cdkObject), StringAttributeProps {
    override fun maxLen(): Number? = unwrap(this).getMaxLen()

    override fun minLen(): Number? = unwrap(this).getMinLen()

    override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringAttributeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StringAttributeProps):
        StringAttributeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringAttributeProps):
        software.amazon.awscdk.services.cognito.StringAttributeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.StringAttributeProps
  }
}
