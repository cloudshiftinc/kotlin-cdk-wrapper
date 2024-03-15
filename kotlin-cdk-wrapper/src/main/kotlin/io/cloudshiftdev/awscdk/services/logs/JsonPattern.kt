@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Base class for patterns that only match JSON log events.
 *
 * Example:
 *
 * ```
 * // Search for all events where the component field is equal to
 * // "HttpServer" and either error is true or the latency is higher
 * // than 1000.
 * JsonPattern pattern = FilterPattern.all(FilterPattern.stringValue("$.component", "=",
 * "HttpServer"), FilterPattern.any(FilterPattern.booleanValue("$.error", true),
 * FilterPattern.numberValue("$.latency", "&gt;", 1000)));
 * ```
 */
public abstract class JsonPattern internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.JsonPattern,
) : CdkObject(cdkObject), IFilterPattern {
  /**
   *
   */
  public open fun jsonPatternString(): String = unwrap(this).getJsonPatternString()

  /**
   *
   */
  public override fun logPatternString(): String = unwrap(this).getLogPatternString()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.JsonPattern,
  ) : JsonPattern(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.JsonPattern): JsonPattern =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonPattern): software.amazon.awscdk.services.logs.JsonPattern =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.JsonPattern
  }
}
