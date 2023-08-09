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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.opensearchservice.WindowStartTime

/**
 * Example:
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_3)
 * .offPeakWindowEnabled(true) // can be omitted if offPeakWindowStart is set
 * .offPeakWindowStart(WindowStartTime.builder()
 * .hours(20)
 * .minutes(0)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class WindowStartTimeDsl {
    private val cdkBuilder: WindowStartTime.Builder = WindowStartTime.builder()

    /**
     * @param hours The start hour of the window in Coordinated Universal Time (UTC), using 24-hour
     *   time. For example, 17 refers to 5:00 P.M. UTC.
     */
    public fun hours(hours: Number) {
        cdkBuilder.hours(hours)
    }

    /** @param minutes The start minute of the window, in UTC. */
    public fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
    }

    public fun build(): WindowStartTime = cdkBuilder.build()
}
