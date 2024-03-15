@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface VerticalAnnotation {
  public fun color(): String? = unwrap(this).getColor()

  public fun date(): String

  public fun fill(): VerticalShading? = unwrap(this).getFill()?.let(VerticalShading::wrap)

  public fun label(): String? = unwrap(this).getLabel()

  public fun visible(): Boolean? = unwrap(this).getVisible()

  @CdkDslMarker
  public interface Builder {
    public fun color(color: String)

    public fun date(date: String)

    public fun fill(fill: VerticalShading)

    public fun label(label: String)

    public fun visible(visible: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.VerticalAnnotation.Builder =
        software.amazon.awscdk.services.cloudwatch.VerticalAnnotation.builder()

    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    override fun date(date: String) {
      cdkBuilder.date(date)
    }

    override fun fill(fill: VerticalShading) {
      cdkBuilder.fill(fill.let(VerticalShading::unwrap))
    }

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    override fun visible(visible: Boolean) {
      cdkBuilder.visible(visible)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.VerticalAnnotation =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.VerticalAnnotation,
  ) : CdkObject(cdkObject), VerticalAnnotation {
    override fun color(): String? = unwrap(this).getColor()

    override fun date(): String = unwrap(this).getDate()

    override fun fill(): VerticalShading? = unwrap(this).getFill()?.let(VerticalShading::wrap)

    override fun label(): String? = unwrap(this).getLabel()

    override fun visible(): Boolean? = unwrap(this).getVisible()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VerticalAnnotation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.VerticalAnnotation):
        VerticalAnnotation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VerticalAnnotation):
        software.amazon.awscdk.services.cloudwatch.VerticalAnnotation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.VerticalAnnotation
  }
}
