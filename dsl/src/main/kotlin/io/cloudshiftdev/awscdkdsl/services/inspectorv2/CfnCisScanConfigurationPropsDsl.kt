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
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfigurationProps

/**
 * Properties for defining a `CfnCisScanConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * Object oneTime;
 * CfnCisScanConfigurationProps cfnCisScanConfigurationProps =
 * CfnCisScanConfigurationProps.builder()
 * .scanName("scanName")
 * .schedule(ScheduleProperty.builder()
 * .daily(DailyScheduleProperty.builder()
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build())
 * .monthly(MonthlyScheduleProperty.builder()
 * .day("day")
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build())
 * .oneTime(oneTime)
 * .weekly(WeeklyScheduleProperty.builder()
 * .days(List.of("days"))
 * .startTime(TimeProperty.builder()
 * .timeOfDay("timeOfDay")
 * .timeZone("timeZone")
 * .build())
 * .build())
 * .build())
 * .securityLevel("securityLevel")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .targets(CisTargetsProperty.builder()
 * .accountIds(List.of("accountIds"))
 * // the properties below are optional
 * .targetResourceTags(Map.of(
 * "targetResourceTagsKey", List.of("targetResourceTags")))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-cisscanconfiguration.html)
 */
@CdkDslMarker
public class CfnCisScanConfigurationPropsDsl {
    private val cdkBuilder: CfnCisScanConfigurationProps.Builder =
        CfnCisScanConfigurationProps.builder()

    /** @param scanName The name of the CIS scan configuration. */
    public fun scanName(scanName: String) {
        cdkBuilder.scanName(scanName)
    }

    /** @param schedule The CIS scan configuration's schedule. */
    public fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule)
    }

    /** @param schedule The CIS scan configuration's schedule. */
    public fun schedule(schedule: CfnCisScanConfiguration.ScheduleProperty) {
        cdkBuilder.schedule(schedule)
    }

    /** @param securityLevel The CIS scan configuration's CIS Benchmark level. */
    public fun securityLevel(securityLevel: String) {
        cdkBuilder.securityLevel(securityLevel)
    }

    /** @param tags The CIS scan configuration's tags. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /** @param targets The CIS scan configuration's targets. */
    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    /** @param targets The CIS scan configuration's targets. */
    public fun targets(targets: CfnCisScanConfiguration.CisTargetsProperty) {
        cdkBuilder.targets(targets)
    }

    public fun build(): CfnCisScanConfigurationProps = cdkBuilder.build()
}
