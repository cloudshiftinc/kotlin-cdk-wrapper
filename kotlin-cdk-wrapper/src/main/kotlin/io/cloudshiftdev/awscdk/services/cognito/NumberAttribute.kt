@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public open class NumberAttribute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.NumberAttribute,
) : CdkObject(cdkObject), ICustomAttribute {
  public override fun bind(): CustomAttributeConfig =
      unwrap(this).bind().let(CustomAttributeConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun max(max: Number)

    public fun min(min: Number)

    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.NumberAttribute.Builder =
        software.amazon.awscdk.services.cognito.NumberAttribute.Builder.create()

    override fun max(max: Number) {
      cdkBuilder.max(max)
    }

    override fun min(min: Number) {
      cdkBuilder.min(min)
    }

    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.cognito.NumberAttribute = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NumberAttribute {
      val builderImpl = BuilderImpl()
      return NumberAttribute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.NumberAttribute):
        NumberAttribute = NumberAttribute(cdkObject)

    internal fun unwrap(wrapped: NumberAttribute):
        software.amazon.awscdk.services.cognito.NumberAttribute = wrapped.cdkObject
  }
}
