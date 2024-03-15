@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.collections.List

public open class Column internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.Column,
) : CdkObject(cdkObject), IWidget {
  public open fun addWidget(w: IWidget) {
    unwrap(this).addWidget(w.let(IWidget::unwrap))
  }

  public override fun height(): Number = unwrap(this).getHeight()

  public override fun position(x: Number, y: Number) {
    unwrap(this).position(x, y)
  }

  public override fun toJson(): List<Any> = unwrap(this).toJson()

  public open fun widgets(): List<IWidget> = unwrap(this).getWidgets().map(IWidget::wrap)

  public override fun width(): Number = unwrap(this).getWidth()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Column): Column =
        Column(cdkObject)

    internal fun unwrap(wrapped: Column): software.amazon.awscdk.services.cloudwatch.Column =
        wrapped.cdkObject
  }
}
