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

package io.cloudshiftdev.awscdkdsl.services.inspectorv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration

/**
 * A daily schedule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * DailyScheduleProperty dailyScheduleProperty = DailyScheduleProperty.builder()
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-inspectorv2-cisscanconfiguration-dailyschedule.html)
 */
@CdkDslMarker
public class CfnCisScanConfigurationDailySchedulePropertyDsl {
    private val cdkBuilder: CfnCisScanConfiguration.DailyScheduleProperty.Builder =
        CfnCisScanConfiguration.DailyScheduleProperty.builder()

    /** @param startTime The schedule start time. */
    public fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime)
    }

    /** @param startTime The schedule start time. */
    public fun startTime(startTime: CfnCisScanConfiguration.TimeProperty) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnCisScanConfiguration.DailyScheduleProperty = cdkBuilder.build()
}
