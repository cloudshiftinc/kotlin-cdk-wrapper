@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public open class StringAttribute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.StringAttribute,
) : CdkObject(cdkObject), ICustomAttribute {
  public override fun bind(): CustomAttributeConfig =
      unwrap(this).bind().let(CustomAttributeConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun maxLen(maxLen: Number)

    public fun minLen(minLen: Number)

    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StringAttribute.Builder =
        software.amazon.awscdk.services.cognito.StringAttribute.Builder.create()

    override fun maxLen(maxLen: Number) {
      cdkBuilder.maxLen(maxLen)
    }

    override fun minLen(minLen: Number) {
      cdkBuilder.minLen(minLen)
    }

    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.cognito.StringAttribute = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringAttribute {
      val builderImpl = BuilderImpl()
      return StringAttribute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StringAttribute):
        StringAttribute = StringAttribute(cdkObject)

    internal fun unwrap(wrapped: StringAttribute):
        software.amazon.awscdk.services.cognito.StringAttribute = wrapped.cdkObject
  }
}
