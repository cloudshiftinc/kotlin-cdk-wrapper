@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.autoscaling.common

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.common.ArbitraryIntervals
import software.amazon.awscdk.services.autoscaling.common.ScalingInterval

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.common.*;
 * ArbitraryIntervals arbitraryIntervals = ArbitraryIntervals.builder()
 * .absolute(false)
 * .intervals(List.of(ScalingInterval.builder()
 * .change(123)
 * // the properties below are optional
 * .lower(123)
 * .upper(123)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ArbitraryIntervalsDsl {
    private val cdkBuilder: ArbitraryIntervals.Builder = ArbitraryIntervals.builder()

    private val _intervals: MutableList<ScalingInterval> = mutableListOf()

    /** @param absolute the value to be set. */
    public fun absolute(absolute: Boolean) {
        cdkBuilder.absolute(absolute)
    }

    /** @param intervals the value to be set. */
    public fun intervals(intervals: ScalingIntervalDsl.() -> Unit) {
        _intervals.add(ScalingIntervalDsl().apply(intervals).build())
    }

    /** @param intervals the value to be set. */
    public fun intervals(intervals: Collection<ScalingInterval>) {
        _intervals.addAll(intervals)
    }

    public fun build(): ArbitraryIntervals {
        if (_intervals.isNotEmpty()) cdkBuilder.intervals(_intervals)
        return cdkBuilder.build()
    }
}
