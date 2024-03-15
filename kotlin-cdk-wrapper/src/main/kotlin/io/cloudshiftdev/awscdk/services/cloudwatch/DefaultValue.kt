@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any

/**
 * Default value for use in [DashboardVariableOptions].
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
 * .defaultInterval(Duration.days(7))
 * .variables(List.of(DashboardVariable.Builder.create()
 * .id("functionName")
 * .type(VariableType.PATTERN)
 * .label("Function")
 * .inputType(VariableInputType.RADIO)
 * .value("originalFuncNameInDashboard")
 * // equivalent to cw.Values.fromSearch('{AWS/Lambda,FunctionName} MetricName=\"Duration\"',
 * 'FunctionName')
 * .values(Values.fromSearchComponents(SearchComponents.builder()
 * .namespace("AWS/Lambda")
 * .dimensions(List.of("FunctionName"))
 * .metricName("Duration")
 * .populateFrom("FunctionName")
 * .build()))
 * .defaultValue(DefaultValue.FIRST)
 * .visible(true)
 * .build()))
 * .build();
 * ```
 */
public open class DefaultValue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.DefaultValue,
) : CdkObject(cdkObject) {
  /**
   *
   */
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
