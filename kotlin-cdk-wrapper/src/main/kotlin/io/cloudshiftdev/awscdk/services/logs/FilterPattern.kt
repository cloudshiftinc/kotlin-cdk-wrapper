@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List

/**
 * A collection of static methods to generate appropriate ILogPatterns.
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
public open class FilterPattern(
  cdkObject: software.amazon.awscdk.services.logs.FilterPattern,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.logs.FilterPattern()
  )

  public companion object {
    public fun all(patterns: JsonPattern): JsonPattern =
        software.amazon.awscdk.services.logs.FilterPattern.all(patterns.let(JsonPattern.Companion::unwrap)).let(JsonPattern::wrap)

    public fun allEvents(): IFilterPattern =
        software.amazon.awscdk.services.logs.FilterPattern.allEvents().let(IFilterPattern::wrap)

    public fun allTerms(terms: String): IFilterPattern =
        software.amazon.awscdk.services.logs.FilterPattern.allTerms(terms).let(IFilterPattern::wrap)

    public fun any(patterns: JsonPattern): JsonPattern =
        software.amazon.awscdk.services.logs.FilterPattern.any(patterns.let(JsonPattern.Companion::unwrap)).let(JsonPattern::wrap)

    public fun anyTerm(terms: String): IFilterPattern =
        software.amazon.awscdk.services.logs.FilterPattern.anyTerm(terms).let(IFilterPattern::wrap)

    public fun anyTermGroup(termGroups: List<String>): IFilterPattern =
        software.amazon.awscdk.services.logs.FilterPattern.anyTermGroup(termGroups).let(IFilterPattern::wrap)

    public fun anyTermGroup(vararg termGroups: String): IFilterPattern =
        anyTermGroup(termGroups.toList())

    public fun booleanValue(jsonField: String, `value`: Boolean): JsonPattern =
        software.amazon.awscdk.services.logs.FilterPattern.booleanValue(jsonField,
        `value`).let(JsonPattern::wrap)

    public fun exists(jsonField: String): JsonPattern =
        software.amazon.awscdk.services.logs.FilterPattern.exists(jsonField).let(JsonPattern::wrap)

    public fun isNull(jsonField: String): JsonPattern =
        software.amazon.awscdk.services.logs.FilterPattern.isNull(jsonField).let(JsonPattern::wrap)

    public fun literal(logPatternString: String): IFilterPattern =
        software.amazon.awscdk.services.logs.FilterPattern.literal(logPatternString).let(IFilterPattern::wrap)

    public fun notExists(jsonField: String): JsonPattern =
        software.amazon.awscdk.services.logs.FilterPattern.notExists(jsonField).let(JsonPattern::wrap)

    public fun numberValue(
      jsonField: String,
      comparison: String,
      `value`: Number,
    ): JsonPattern = software.amazon.awscdk.services.logs.FilterPattern.numberValue(jsonField,
        comparison, `value`).let(JsonPattern::wrap)

    public fun spaceDelimited(columns: String): SpaceDelimitedTextPattern =
        software.amazon.awscdk.services.logs.FilterPattern.spaceDelimited(columns).let(SpaceDelimitedTextPattern::wrap)

    public fun stringValue(
      jsonField: String,
      comparison: String,
      `value`: String,
    ): JsonPattern = software.amazon.awscdk.services.logs.FilterPattern.stringValue(jsonField,
        comparison, `value`).let(JsonPattern::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.FilterPattern): FilterPattern
        = FilterPattern(cdkObject)

    internal fun unwrap(wrapped: FilterPattern): software.amazon.awscdk.services.logs.FilterPattern
        = wrapped.cdkObject as software.amazon.awscdk.services.logs.FilterPattern
  }
}
