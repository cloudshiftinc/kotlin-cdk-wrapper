@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.assertions

import kotlin.Unit
import software.amazon.awscdk.assertions.MatchResult

/**
 * Record a capture against in this match result.
 *
 * @param options 
 */
public inline fun MatchResult.recordCapture(block: MatchCaptureDsl.() -> Unit = {}) {
  val builder = MatchCaptureDsl()
  builder.apply(block)
  return recordCapture(builder.build())
}

/**
 * Record a new failure into this result at a specific path.
 *
 * @param failure 
 */
public inline fun MatchResult.recordFailure(block: MatchFailureDsl.() -> Unit = {}): MatchResult {
  val builder = MatchFailureDsl()
  builder.apply(block)
  return recordFailure(builder.build())
}
