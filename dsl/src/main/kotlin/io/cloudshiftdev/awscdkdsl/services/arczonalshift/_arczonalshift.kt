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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfiguration
import software.amazon.awscdk.services.arczonalshift.CfnZonalAutoshiftConfigurationProps
import software.constructs.Construct

public object arczonalshift {
    /**
     * The zonal autoshift configuration for a resource includes the practice run configuration and
     * the status for running autoshifts, zonal autoshift status.
     *
     * When a resource has a practice run configuation, Route 53 ARC starts weekly zonal shifts for
     * the resource, to shift traffic away from an Availability Zone. Weekly practice runs help you
     * to make sure that your application can continue to operate normally with the loss of one
     * Availability Zone.
     *
     * You can update the zonal autoshift autoshift status to enable or disable zonal autoshift.
     * When zonal autoshift is `ENABLED` , you authorize AWS to shift away resource traffic for an
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
    public inline fun cfnZonalAutoshiftConfiguration(
        scope: Construct,
        id: String,
        block: CfnZonalAutoshiftConfigurationDsl.() -> Unit = {},
    ): CfnZonalAutoshiftConfiguration {
        val builder = CfnZonalAutoshiftConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A control condition is an alarm that you specify for a practice run.
     *
     * When you configure practice runs with zonal autoshift for a resource, you specify Amazon
     * CloudWatch alarms, which you create in CloudWatch to use with the practice run. The alarms
     * that you specify are an *outcome alarm* , to monitor application health during practice runs
     * and, optionally, a *blocking alarm* , to block practice runs from starting or to interrupt a
     * practice run in progress.
     *
     * Control condition alarms do not apply for autoshifts.
     *
     * For more information, see
     * [Considerations when you configure zonal autoshift](https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.considerations.html)
     * in the Route 53 ARC Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.arczonalshift.*;
     * ControlConditionProperty controlConditionProperty = ControlConditionProperty.builder()
     * .alarmIdentifier("alarmIdentifier")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-controlcondition.html)
     */
    public inline fun cfnZonalAutoshiftConfigurationControlConditionProperty(
        block: CfnZonalAutoshiftConfigurationControlConditionPropertyDsl.() -> Unit = {}
    ): CfnZonalAutoshiftConfiguration.ControlConditionProperty {
        val builder = CfnZonalAutoshiftConfigurationControlConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A practice run configuration for a resource includes the Amazon CloudWatch alarms that you've
     * specified for a practice run, as well as any blocked dates or blocked windows for the
     * practice run.
     *
     * When a resource has a practice run configuation, Route 53 ARC starts weekly zonal shifts for
     * the resource, to shift traffic away from an Availability Zone. Weekly practice runs help you
     * to make sure that your application can continue to operate normally with the loss of one
     * Availability Zone.
     *
     * You can update or delete a practice run configuration. When you delete a practice run
     * configuration, zonal autoshift is disabled for the resource. A practice run configuration is
     * required when zonal autoshift is enabled.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.arczonalshift.*;
     * PracticeRunConfigurationProperty practiceRunConfigurationProperty =
     * PracticeRunConfigurationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-arczonalshift-zonalautoshiftconfiguration-practicerunconfiguration.html)
     */
    public inline fun cfnZonalAutoshiftConfigurationPracticeRunConfigurationProperty(
        block: CfnZonalAutoshiftConfigurationPracticeRunConfigurationPropertyDsl.() -> Unit = {}
    ): CfnZonalAutoshiftConfiguration.PracticeRunConfigurationProperty {
        val builder = CfnZonalAutoshiftConfigurationPracticeRunConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnZonalAutoshiftConfigurationProps(
        block: CfnZonalAutoshiftConfigurationPropsDsl.() -> Unit = {}
    ): CfnZonalAutoshiftConfigurationProps {
        val builder = CfnZonalAutoshiftConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
