@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.collections.List

/**
 * Space delimited text pattern.
 *
 * Example:
 *
 * ```
 * // Search for all events where the component is "HttpServer" and the
 * // result code is not equal to 200.
 * SpaceDelimitedTextPattern pattern = FilterPattern.spaceDelimited("time", "component", "...",
 * "result_code", "latency").whereString("component", "=", "HttpServer").whereNumber("result_code",
 * "!=", 200);
 * ```
 */
public open class SpaceDelimitedTextPattern(
  cdkObject: software.amazon.awscdk.services.logs.SpaceDelimitedTextPattern,
) : CdkObject(cdkObject), IFilterPattern {
  /**
   *
   */
  public override fun logPatternString(): String = unwrap(this).getLogPatternString()

  /**
   * Restrict where the pattern applies.
   *
   * @param columnName 
   * @param comparison 
   * @param value 
   */
  public open fun whereNumber(
    columnName: String,
    comparison: String,
    `value`: Number,
  ): SpaceDelimitedTextPattern = unwrap(this).whereNumber(columnName, comparison,
      `value`).let(SpaceDelimitedTextPattern::wrap)

  /**
   * Restrict where the pattern applies.
   *
   * @param columnName 
   * @param comparison 
   * @param value 
   */
  public open fun whereString(
    columnName: String,
    comparison: String,
    `value`: String,
  ): SpaceDelimitedTextPattern = unwrap(this).whereString(columnName, comparison,
      `value`).let(SpaceDelimitedTextPattern::wrap)

  public companion object {
    public fun construct(columns: List<String>): SpaceDelimitedTextPattern =
        software.amazon.awscdk.services.logs.SpaceDelimitedTextPattern.construct(columns).let(SpaceDelimitedTextPattern::wrap)

    public fun construct(vararg columns: String): SpaceDelimitedTextPattern =
        construct(columns.toList())

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.SpaceDelimitedTextPattern):
        SpaceDelimitedTextPattern = SpaceDelimitedTextPattern(cdkObject)

    internal fun unwrap(wrapped: SpaceDelimitedTextPattern):
        software.amazon.awscdk.services.logs.SpaceDelimitedTextPattern = wrapped.cdkObject as
        software.amazon.awscdk.services.logs.SpaceDelimitedTextPattern
  }
}
