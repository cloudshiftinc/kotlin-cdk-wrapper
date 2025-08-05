@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Base class for patterns that only match JSON log events.
 *
 * Example:
 *
 * ```
 * MetricFilter.Builder.create(this, "MetricFilter")
 * .logGroup(logGroup)
 * .metricNamespace("MyApp")
 * .metricName("Latency")
 * .filterPattern(FilterPattern.all(FilterPattern.exists("$.latency"),
 * FilterPattern.regexValue("$.message", "=", "bind: address already in use")))
 * .metricValue("$.latency")
 * .build();
 * ```
 */
public abstract class JsonPattern(
  cdkObject: software.amazon.awscdk.services.logs.JsonPattern,
) : CdkObject(cdkObject),
    IFilterPattern {
  /**
   *
   */
  public open fun jsonPatternString(): String = unwrap(this).getJsonPatternString()

  /**
   *
   */
  public override fun logPatternString(): String = unwrap(this).getLogPatternString()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.JsonPattern,
  ) : JsonPattern(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.JsonPattern): JsonPattern =
        CdkObjectWrappers.wrap(cdkObject) as? JsonPattern ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonPattern): software.amazon.awscdk.services.logs.JsonPattern =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.JsonPattern
  }
}
