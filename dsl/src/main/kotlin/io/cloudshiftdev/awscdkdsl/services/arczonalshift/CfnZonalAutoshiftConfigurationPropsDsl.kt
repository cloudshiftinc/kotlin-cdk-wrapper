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

package io.cloudshiftdev.awscdkdsl.services.arczonalshift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration
import software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps

/**
 * Properties for defining a `CfnZonalAutoshiftConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.arczonalshift.*;
 * CfnZonalAutoshiftConfigurationProps cfnZonalAutoshiftConfigurationProps =
 * CfnZonalAutoshiftConfigurationProps.builder()
 * .practiceRunConfiguration(PracticeRunConfigurationProperty.builder()
 * .outcomeAlarms(List.of(ControlConditionProperty.builder()
 * .alarmIdentifier("alarmIdentifier")
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .blockedDates(List.of("blockedDates"))
 * .blockedWindows(List.of("blockedWindows"))
 * .blockingAlarms(List.of(ControlConditionProperty.builder()
 * .alarmIdentifier("alarmIdentifier")
 * .type("type")
 * .build()))
 * .build())
 * .resourceIdentifier("resourceIdentifier")
 * .zonalAutoshiftStatus("zonalAutoshiftStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html)
 */
@CdkDslMarker
public class CfnZonalAutoshiftConfigurationPropsDsl {
    private val cdkBuilder: CfnZonalAutoshiftConfigurationProps.Builder =
        CfnZonalAutoshiftConfigurationProps.builder()

    /**
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     *   Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked
     *   dates or blocked windows for the practice run. When a resource has a practice run
     *   configuration, Route 53 ARC shifts traffic for the resource weekly for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that Route 53 ARC starts for
     * practice runs help you to ensure that shifting away traffic from an Availability Zone during
     * an autoshift is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run
     * configuration is required when zonal autoshift is enabled.
     */
    public fun practiceRunConfiguration(practiceRunConfiguration: IResolvable) {
        cdkBuilder.practiceRunConfiguration(practiceRunConfiguration)
    }

    /**
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     *   Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked
     *   dates or blocked windows for the practice run. When a resource has a practice run
     *   configuration, Route 53 ARC shifts traffic for the resource weekly for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that Route 53 ARC starts for
     * practice runs help you to ensure that shifting away traffic from an Availability Zone during
     * an autoshift is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run
     * configuration is required when zonal autoshift is enabled.
     */
    public fun practiceRunConfiguration(
        practiceRunConfiguration: CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty
    ) {
        cdkBuilder.practiceRunConfiguration(practiceRunConfiguration)
    }

    /**
     * @param resourceIdentifier The identifier for the resource that AWS shifts traffic for. The
     *   identifier is the Amazon Resource Name (ARN) for the resource.
     *
     * At this time, supported resources are Network Load Balancers and Application Load Balancers
     * with cross-zone load balancing turned off.
     */
    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * @param zonalAutoshiftStatus When zonal autoshift is `ENABLED` , you authorize AWS to shift
     *   away resource traffic for an application from an Availability Zone during events, on your
     *   behalf, to help reduce time to recovery. Traffic is also shifted away for the required
     *   weekly practice runs.
     */
    public fun zonalAutoshiftStatus(zonalAutoshiftStatus: String) {
        cdkBuilder.zonalAutoshiftStatus(zonalAutoshiftStatus)
    }

    public fun build(): CfnZonalAutoshiftConfigurationProps = cdkBuilder.build()
}
