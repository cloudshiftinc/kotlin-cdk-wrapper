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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * A custom 10-hour, low-traffic window during which OpenSearch Service can perform mandatory
 * configuration changes on the domain.
 *
 * These actions can include scheduled service software updates and blue/green Auto-Tune
 * enhancements. OpenSearch Service will schedule these actions during the window that you specify.
 * If you don't specify a window start time, it defaults to 10:00 P.M. local time.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * OffPeakWindowProperty offPeakWindowProperty = OffPeakWindowProperty.builder()
 * .windowStartTime(WindowStartTimeProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindow.html)
 */
@CdkDslMarker
public class CfnDomainOffPeakWindowPropertyDsl {
    private val cdkBuilder: CfnDomain.OffPeakWindowProperty.Builder =
        CfnDomain.OffPeakWindowProperty.builder()

    /** @param windowStartTime The desired start time for an off-peak maintenance window. */
    public fun windowStartTime(windowStartTime: IResolvable) {
        cdkBuilder.windowStartTime(windowStartTime)
    }

    /** @param windowStartTime The desired start time for an off-peak maintenance window. */
    public fun windowStartTime(windowStartTime: CfnDomain.WindowStartTimeProperty) {
        cdkBuilder.windowStartTime(windowStartTime)
    }

    public fun build(): CfnDomain.OffPeakWindowProperty = cdkBuilder.build()
}
