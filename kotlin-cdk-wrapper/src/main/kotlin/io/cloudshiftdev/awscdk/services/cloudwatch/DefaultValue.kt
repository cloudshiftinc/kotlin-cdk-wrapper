@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any

public open class DefaultValue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.DefaultValue,
) : CdkObject(cdkObject) {
  public open fun `val`(): Any = unwrap(this).getVal()

  public companion object {
    public val FIRST: DefaultValue =
        DefaultValue.wrap(software.amazon.awscdk.services.cloudwatch.DefaultValue.FIRST)

    public fun `value`(`value`: Any): DefaultValue =
        software.amazon.awscdk.services.cloudwatch.DefaultValue.`value`(`value`).let(DefaultValue::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.DefaultValue):
        DefaultValue = DefaultValue(cdkObject)

    internal fun unwrap(wrapped: DefaultValue):
        software.amazon.awscdk.services.cloudwatch.DefaultValue = wrapped.cdkObject
  }
}
