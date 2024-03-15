@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface MathExpressionOptions {
  public fun color(): String? = unwrap(this).getColor()

  public fun label(): String? = unwrap(this).getLabel()

  public fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

  public fun searchAccount(): String? = unwrap(this).getSearchAccount()

  public fun searchRegion(): String? = unwrap(this).getSearchRegion()

  @CdkDslMarker
  public interface Builder {
    public fun color(color: String)

    public fun label(label: String)

    public fun period(period: Duration)

    public fun searchAccount(searchAccount: String)

    public fun searchRegion(searchRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MathExpressionOptions.Builder
        = software.amazon.awscdk.services.cloudwatch.MathExpressionOptions.builder()

    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    override fun searchAccount(searchAccount: String) {
      cdkBuilder.searchAccount(searchAccount)
    }

    override fun searchRegion(searchRegion: String) {
      cdkBuilder.searchRegion(searchRegion)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MathExpressionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpressionOptions,
  ) : CdkObject(cdkObject), MathExpressionOptions {
    override fun color(): String? = unwrap(this).getColor()

    override fun label(): String? = unwrap(this).getLabel()

    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    override fun searchAccount(): String? = unwrap(this).getSearchAccount()

    override fun searchRegion(): String? = unwrap(this).getSearchRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MathExpressionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpressionOptions):
        MathExpressionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MathExpressionOptions):
        software.amazon.awscdk.services.cloudwatch.MathExpressionOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.MathExpressionOptions
  }
}
