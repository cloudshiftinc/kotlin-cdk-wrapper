@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class Color internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.Color,
) : CdkObject(cdkObject) {
  public companion object {
    public val BLUE: String = software.amazon.awscdk.services.cloudwatch.Color.BLUE

    public val BROWN: String = software.amazon.awscdk.services.cloudwatch.Color.BROWN

    public val GREEN: String = software.amazon.awscdk.services.cloudwatch.Color.GREEN

    public val GREY: String = software.amazon.awscdk.services.cloudwatch.Color.GREY

    public val ORANGE: String = software.amazon.awscdk.services.cloudwatch.Color.ORANGE

    public val PINK: String = software.amazon.awscdk.services.cloudwatch.Color.PINK

    public val PURPLE: String = software.amazon.awscdk.services.cloudwatch.Color.PURPLE

    public val RED: String = software.amazon.awscdk.services.cloudwatch.Color.RED

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.Color): Color =
        Color(cdkObject)

    internal fun unwrap(wrapped: Color): software.amazon.awscdk.services.cloudwatch.Color =
        wrapped.cdkObject
  }
}
