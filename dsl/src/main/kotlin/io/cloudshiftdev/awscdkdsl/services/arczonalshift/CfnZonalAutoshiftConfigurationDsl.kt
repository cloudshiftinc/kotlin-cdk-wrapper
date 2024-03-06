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
import software.constructs.Construct

/**
 * The zonal autoshift configuration for a resource includes the practice run configuration and the
 * status for running autoshifts, zonal autoshift status.
 *
 * When a resource has a practice run configuation, Route 53 ARC starts weekly zonal shifts for the
 * resource, to shift traffic away from an Availability Zone. Weekly practice runs help you to make
 * sure that your application can continue to operate normally with the loss of one Availability
 * Zone.
 *
 * You can update the zonal autoshift autoshift status to enable or disable zonal autoshift. When
 * zonal autoshift is `ENABLED` , you authorize AWS to shift away resource traffic for an
 * application from an Availability Zone during events, on your behalf, to help reduce time to
 * recovery. Traffic is also shifted away for the required weekly practice runs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.arczonalshift.*;
 * CfnZonalAutoshiftConfiguration cfnZonalAutoshiftConfiguration =
 * CfnZonalAutoshiftConfiguration.Builder.create(this, "MyCfnZonalAutoshiftConfiguration")
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
public class CfnZonalAutoshiftConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnZonalAutoshiftConfiguration.Builder =
        CfnZonalAutoshiftConfiguration.Builder.create(scope, id)

    /**
     * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
     * specified for a practice run, as well as any blocked dates or blocked windows for the
     * practice run.
     *
     * When a resource has a practice run configuration, Route 53 ARC shifts traffic for the
     * resource weekly for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that Route 53 ARC starts for
     * practice runs help you to ensure that shifting away traffic from an Availability Zone during
     * an autoshift is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run
     * configuration is required when zonal autoshift is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration)
     *
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     *   Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked
     *   dates or blocked windows for the practice run.
     */
    public fun practiceRunConfiguration(practiceRunConfiguration: IResolvable) {
        cdkBuilder.practiceRunConfiguration(practiceRunConfiguration)
    }

    /**
     * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
     * specified for a practice run, as well as any blocked dates or blocked windows for the
     * practice run.
     *
     * When a resource has a practice run configuration, Route 53 ARC shifts traffic for the
     * resource weekly for practice runs.
     *
     * Practice runs are required for zonal autoshift. The zonal shifts that Route 53 ARC starts for
     * practice runs help you to ensure that shifting away traffic from an Availability Zone during
     * an autoshift is safe for your application.
     *
     * You can update or delete a practice run configuration. Before you delete a practice run
     * configuration, you must disable zonal autoshift for the resource. A practice run
     * configuration is required when zonal autoshift is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration)
     *
     * @param practiceRunConfiguration A practice run configuration for a resource includes the
     *   Amazon CloudWatch alarms that you've specified for a practice run, as well as any blocked
     *   dates or blocked windows for the practice run.
     */
    public fun practiceRunConfiguration(
        practiceRunConfiguration: CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty
    ) {
        cdkBuilder.practiceRunConfiguration(practiceRunConfiguration)
    }

    /**
     * The identifier for the resource that AWS shifts traffic for.
     *
     * The identifier is the Amazon Resource Name (ARN) for the resource.
     *
     * At this time, supported resources are Network Load Balancers and Application Load Balancers
     * with cross-zone load balancing turned off.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-resourceidentifier)
     *
     * @param resourceIdentifier The identifier for the resource that AWS shifts traffic for.
     */
    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    /**
     * When zonal autoshift is `ENABLED` , you authorize AWS to shift away resource traffic for an
     * application from an Availability Zone during events, on your behalf, to help reduce time to
     * recovery.
     *
     * Traffic is also shifted away for the required weekly practice runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-arczonalshift-zonalautoshiftconfiguration.html#cfn-arczonalshift-zonalautoshiftconfiguration-zonalautoshiftstatus)
     *
     * @param zonalAutoshiftStatus When zonal autoshift is `ENABLED` , you authorize AWS to shift
     *   away resource traffic for an application from an Availability Zone during events, on your
     *   behalf, to help reduce time to recovery.
     */
    public fun zonalAutoshiftStatus(zonalAutoshiftStatus: String) {
        cdkBuilder.zonalAutoshiftStatus(zonalAutoshiftStatus)
    }

    public fun build(): CfnZonalAutoshiftConfiguration = cdkBuilder.build()
}
