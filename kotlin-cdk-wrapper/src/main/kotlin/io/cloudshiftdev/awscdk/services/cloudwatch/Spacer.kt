@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public open class Spacer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.Spacer,
) : CdkObject(cdkObject), IWidget {
  public override fun height(): Number = unwrap(this).getHeight()

  public override fun position(_x: Number, _y: Number) {
    unwrap(this).position(_x, _y)
  }

  public override fun toJson(): List<Any> = unwrap(this).toJson()

  public override fun width(): Number = unwrap(this).getWidth()

  @CdkDslMarker
  public interface Builder {
    public fun height(height: Number)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.Spacer.Builder =
        software.amazon.awscdk.services.cloudwatch.Spacer.Builder.create()

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.Spacer = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Spacer {
      val builderImpl = BuilderImpl()
      return Spacer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Spacer): Spacer =
        Spacer(cdkObject)

    internal fun unwrap(wrapped: Spacer): software.amazon.awscdk.services.cloudwatch.Spacer =
        wrapped.cdkObject
  }
}
