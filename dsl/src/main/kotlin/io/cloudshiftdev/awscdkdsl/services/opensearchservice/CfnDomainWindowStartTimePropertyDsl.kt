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

package io.cloudshiftdev.awscdkdsl.services.opensearchservice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * A custom start time for the off-peak window, in Coordinated Universal Time (UTC).
 *
 * The window length will always be 10 hours, so you can't specify an end time. For example, if you
 * specify 11:00 P.M. UTC as a start time, the end time will automatically be set to 9:00 A.M.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * WindowStartTimeProperty windowStartTimeProperty = WindowStartTimeProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-windowstarttime.html)
 */
@CdkDslMarker
public class CfnDomainWindowStartTimePropertyDsl {
    private val cdkBuilder: CfnDomain.WindowStartTimeProperty.Builder =
        CfnDomain.WindowStartTimeProperty.builder()

    /**
     * @param hours The start hour of the window in Coordinated Universal Time (UTC), using 24-hour
     *   time. For example, 17 refers to 5:00 P.M. UTC. The minimum value is 0 and the maximum value
     *   is 23.
     */
    public fun hours(hours: Number) {
        cdkBuilder.hours(hours)
    }

    /**
     * @param minutes The start minute of the window, in UTC. The minimum value is 0 and the maximum
     *   value is 59.
     */
    public fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
    }

    public fun build(): CfnDomain.WindowStartTimeProperty = cdkBuilder.build()
}
