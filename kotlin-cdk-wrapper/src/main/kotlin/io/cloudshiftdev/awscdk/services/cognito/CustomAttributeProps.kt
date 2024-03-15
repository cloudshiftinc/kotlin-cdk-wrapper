@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface CustomAttributeProps {
  public fun mutable(): Boolean? = unwrap(this).getMutable()

  @CdkDslMarker
  public interface Builder {
    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CustomAttributeProps.Builder =
        software.amazon.awscdk.services.cognito.CustomAttributeProps.builder()

    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CustomAttributeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CustomAttributeProps,
  ) : CdkObject(cdkObject), CustomAttributeProps {
    override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomAttributeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CustomAttributeProps):
        CustomAttributeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomAttributeProps):
        software.amazon.awscdk.services.cognito.CustomAttributeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CustomAttributeProps
  }
}
