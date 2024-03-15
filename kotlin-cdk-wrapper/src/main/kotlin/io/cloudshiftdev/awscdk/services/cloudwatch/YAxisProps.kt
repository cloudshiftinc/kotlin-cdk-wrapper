@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface YAxisProps {
  public fun label(): String? = unwrap(this).getLabel()

  public fun max(): Number? = unwrap(this).getMax()

  public fun min(): Number? = unwrap(this).getMin()

  public fun showUnits(): Boolean? = unwrap(this).getShowUnits()

  @CdkDslMarker
  public interface Builder {
    public fun label(label: String)

    public fun max(max: Number)

    public fun min(min: Number)

    public fun showUnits(showUnits: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.YAxisProps.Builder =
        software.amazon.awscdk.services.cloudwatch.YAxisProps.builder()

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    override fun max(max: Number) {
      cdkBuilder.max(max)
    }

    override fun min(min: Number) {
      cdkBuilder.min(min)
    }

    override fun showUnits(showUnits: Boolean) {
      cdkBuilder.showUnits(showUnits)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.YAxisProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.YAxisProps,
  ) : CdkObject(cdkObject), YAxisProps {
    override fun label(): String? = unwrap(this).getLabel()

    override fun max(): Number? = unwrap(this).getMax()

    override fun min(): Number? = unwrap(this).getMin()

    override fun showUnits(): Boolean? = unwrap(this).getShowUnits()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): YAxisProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.YAxisProps): YAxisProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: YAxisProps): software.amazon.awscdk.services.cloudwatch.YAxisProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.YAxisProps
  }
}
