@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public abstract class ConcreteWidget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.ConcreteWidget,
) : CdkObject(cdkObject), IWidget {
  public override fun height(): Number = unwrap(this).getHeight()

  public override fun position(x: Number, y: Number) {
    unwrap(this).position(x, y)
  }

  public override fun toJson(): List<Any> = unwrap(this).toJson()

  public override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  public override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  public override fun width(): Number = unwrap(this).getWidth()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.ConcreteWidget,
  ) : ConcreteWidget(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.ConcreteWidget):
        ConcreteWidget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConcreteWidget):
        software.amazon.awscdk.services.cloudwatch.ConcreteWidget = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudwatch.ConcreteWidget
  }
}
