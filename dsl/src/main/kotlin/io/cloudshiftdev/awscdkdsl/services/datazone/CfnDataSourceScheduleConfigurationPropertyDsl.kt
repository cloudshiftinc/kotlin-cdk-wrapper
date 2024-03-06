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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datazone.CfnDataSource

/**
 * The details of the schedule of the data source runs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * ScheduleConfigurationProperty scheduleConfigurationProperty =
 * ScheduleConfigurationProperty.builder()
 * .schedule("schedule")
 * .timezone("timezone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-scheduleconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceScheduleConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.ScheduleConfigurationProperty.Builder =
        CfnDataSource.ScheduleConfigurationProperty.builder()

    /** @param schedule The schedule of the data source runs. */
    public fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
    }

    /** @param timezone The timezone of the data source run. */
    public fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
    }

    public fun build(): CfnDataSource.ScheduleConfigurationProperty = cdkBuilder.build()
}
