@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.assertions

import software.amazon.awscdk.assertions.MatchResult
import kotlin.Unit

public inline fun MatchResult.recordCapture(block: MatchCaptureDsl.() -> Unit = {}) {
    val builder = MatchCaptureDsl()
    builder.apply(block)
    return recordCapture(builder.build())
}

public inline fun MatchResult.recordFailure(block: MatchFailureDsl.() -> Unit = {}): MatchResult {
    val builder = MatchFailureDsl()
    builder.apply(block)
    return recordFailure(builder.build())
}
