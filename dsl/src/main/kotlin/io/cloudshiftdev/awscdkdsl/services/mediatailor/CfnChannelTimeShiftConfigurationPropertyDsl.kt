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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.mediatailor.CfnChannel

/**
 * The configuration for time-shifted viewing.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * TimeShiftConfigurationProperty timeShiftConfigurationProperty =
 * TimeShiftConfigurationProperty.builder()
 * .maxTimeDelaySeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-timeshiftconfiguration.html)
 */
@CdkDslMarker
public class CfnChannelTimeShiftConfigurationPropertyDsl {
    private val cdkBuilder: CfnChannel.TimeShiftConfigurationProperty.Builder =
        CfnChannel.TimeShiftConfigurationProperty.builder()

    /**
     * @param maxTimeDelaySeconds The maximum time delay for time-shifted viewing. The minimum
     *   allowed maximum time delay is 0 seconds, and the maximum allowed maximum time delay is
     *   21600 seconds (6 hours).
     */
    public fun maxTimeDelaySeconds(maxTimeDelaySeconds: Number) {
        cdkBuilder.maxTimeDelaySeconds(maxTimeDelaySeconds)
    }

    public fun build(): CfnChannel.TimeShiftConfigurationProperty = cdkBuilder.build()
}
