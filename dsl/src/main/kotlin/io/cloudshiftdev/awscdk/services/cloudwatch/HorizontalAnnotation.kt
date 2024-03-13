package io.cloudshiftdev.awscdk.services.cloudwatch

import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface HorizontalAnnotation {
  public fun color(): String? = unwrap(this).getColor()

  public fun fill(): Shading? = unwrap(this).getFill()?.let(Shading::wrap)

  public fun label(): String? = unwrap(this).getLabel()

  public fun `value`(): Number

  public fun visible(): Boolean? = unwrap(this).getVisible()

  public interface Builder {
    public fun color(color: String) {
    }

    public fun fill(fill: Shading) {
    }

    public fun label(label: String) {
    }

    public fun `value`(`value`: Number) {
    }

    public fun visible(visible: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder
        = software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.builder()

    public override fun color(color: String) {
      cdkBuilder.color(color)
    }

    public override fun fill(fill: Shading) {
      cdkBuilder.fill(fill.let(Shading::unwrap))
    }

    public override fun label(label: String) {
      cdkBuilder.label(label)
    }

    public override fun `value`(`value`: Number) {
      cdkBuilder.`value`(`value`)
    }

    public override fun visible(visible: Boolean) {
      cdkBuilder.visible(visible)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation,
  ) : HorizontalAnnotation {
    public override fun color(): String? = unwrap(this).getColor()

    public override fun fill(): Shading? = unwrap(this).getFill()?.let(Shading::wrap)

    public override fun label(): String? = unwrap(this).getLabel()

    public override fun `value`(): Number = unwrap(this).getValue()

    public override fun visible(): Boolean? = unwrap(this).getVisible()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HorizontalAnnotation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation):
        HorizontalAnnotation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HorizontalAnnotation):
        software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation = (wrapped as
        Wrapper).cdkObject
  }
}
