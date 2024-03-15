@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public open class BooleanAttribute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.BooleanAttribute,
) : CdkObject(cdkObject), ICustomAttribute {
  public override fun bind(): CustomAttributeConfig =
      unwrap(this).bind().let(CustomAttributeConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.BooleanAttribute.Builder =
        software.amazon.awscdk.services.cognito.BooleanAttribute.Builder.create()

    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.cognito.BooleanAttribute =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BooleanAttribute {
      val builderImpl = BuilderImpl()
      return BooleanAttribute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.BooleanAttribute):
        BooleanAttribute = BooleanAttribute(cdkObject)

    internal fun unwrap(wrapped: BooleanAttribute):
        software.amazon.awscdk.services.cognito.BooleanAttribute = wrapped.cdkObject
  }
}
