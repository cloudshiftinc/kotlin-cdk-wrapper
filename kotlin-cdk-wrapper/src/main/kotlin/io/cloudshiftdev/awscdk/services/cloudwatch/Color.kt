@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * A set of standard colours that can be used in annotations in a GraphWidget.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(GraphWidget.Builder.create()
 * // ...
 * .leftAnnotations(List.of(HorizontalAnnotation.builder().value(1800).label(Duration.minutes(30).toHumanString()).color(Color.RED).build(),
 * HorizontalAnnotation.builder().value(3600).label("1 hour").color("#2ca02c").build()))
 * .verticalAnnotations(List.of(VerticalAnnotation.builder().date("2022-10-19T00:00:00Z").label("Deployment").color(Color.RED).build()))
 * .build());
 * ```
 */
public open class Color(
  cdkObject: software.amazon.awscdk.services.cloudwatch.Color,
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
        wrapped.cdkObject as software.amazon.awscdk.services.cloudwatch.Color
  }
}
