@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface StandardAttribute {
  public fun mutable(): Boolean? = unwrap(this).getMutable()

  public fun required(): Boolean? = unwrap(this).getRequired()

  @CdkDslMarker
  public interface Builder {
    public fun mutable(mutable: Boolean)

    public fun required(required: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StandardAttribute.Builder =
        software.amazon.awscdk.services.cognito.StandardAttribute.builder()

    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    override fun required(required: Boolean) {
      cdkBuilder.required(required)
    }

    public fun build(): software.amazon.awscdk.services.cognito.StandardAttribute =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.StandardAttribute,
  ) : CdkObject(cdkObject), StandardAttribute {
    override fun mutable(): Boolean? = unwrap(this).getMutable()

    override fun required(): Boolean? = unwrap(this).getRequired()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StandardAttribute {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StandardAttribute):
        StandardAttribute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StandardAttribute):
        software.amazon.awscdk.services.cognito.StandardAttribute = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.StandardAttribute
  }
}
