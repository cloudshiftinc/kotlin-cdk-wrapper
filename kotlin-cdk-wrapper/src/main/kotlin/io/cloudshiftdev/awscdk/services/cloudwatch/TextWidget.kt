@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class TextWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.TextWidget,
) : ConcreteWidget(cdkObject) {
  public override fun position(x: Number, y: Number) {
    unwrap(this).position(x, y)
  }

  public override fun toJson(): List<Any> = unwrap(this).toJson()

  @CdkDslMarker
  public interface Builder {
    public fun background(background: TextWidgetBackground)

    public fun height(height: Number)

    public fun markdown(markdown: String)

    public fun width(width: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.TextWidget.Builder =
        software.amazon.awscdk.services.cloudwatch.TextWidget.Builder.create()

    override fun background(background: TextWidgetBackground) {
      cdkBuilder.background(background.let(TextWidgetBackground::unwrap))
    }

    override fun height(height: Number) {
      cdkBuilder.height(height)
    }

    override fun markdown(markdown: String) {
      cdkBuilder.markdown(markdown)
    }

    override fun width(width: Number) {
      cdkBuilder.width(width)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.TextWidget = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TextWidget {
      val builderImpl = BuilderImpl()
      return TextWidget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TextWidget): TextWidget
        = TextWidget(cdkObject)

    internal fun unwrap(wrapped: TextWidget): software.amazon.awscdk.services.cloudwatch.TextWidget
        = wrapped.cdkObject
  }
}
