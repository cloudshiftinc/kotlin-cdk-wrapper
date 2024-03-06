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

package io.cloudshiftdev.awscdkdsl.services.workspacesthinclient

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment
import software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps
import software.constructs.Construct

public object workspacesthinclient {
    /**
     * Describes an environment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesthinclient.*;
     * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
     * .desktopArn("desktopArn")
     * // the properties below are optional
     * .desiredSoftwareSetId("desiredSoftwareSetId")
     * .desktopEndpoint("desktopEndpoint")
     * .kmsKeyArn("kmsKeyArn")
     * .maintenanceWindow(MaintenanceWindowProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .applyTimeOf("applyTimeOf")
     * .daysOfTheWeek(List.of("daysOfTheWeek"))
     * .endTimeHour(123)
     * .endTimeMinute(123)
     * .startTimeHour(123)
     * .startTimeMinute(123)
     * .build())
     * .name("name")
     * .softwareSetUpdateMode("softwareSetUpdateMode")
     * .softwareSetUpdateSchedule("softwareSetUpdateSchedule")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html)
     */
    public inline fun cfnEnvironment(
        scope: Construct,
        id: String,
        block: CfnEnvironmentDsl.() -> Unit = {},
    ): CfnEnvironment {
        val builder = CfnEnvironmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes the maintenance window for a thin client device.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesthinclient.*;
     * MaintenanceWindowProperty maintenanceWindowProperty = MaintenanceWindowProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .applyTimeOf("applyTimeOf")
     * .daysOfTheWeek(List.of("daysOfTheWeek"))
     * .endTimeHour(123)
     * .endTimeMinute(123)
     * .startTimeHour(123)
     * .startTimeMinute(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesthinclient-environment-maintenancewindow.html)
     */
    public inline fun cfnEnvironmentMaintenanceWindowProperty(
        block: CfnEnvironmentMaintenanceWindowPropertyDsl.() -> Unit = {}
    ): CfnEnvironment.MaintenanceWindowProperty {
        val builder = CfnEnvironmentMaintenanceWindowPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnEnvironment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.workspacesthinclient.*;
     * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
     * .desktopArn("desktopArn")
     * // the properties below are optional
     * .desiredSoftwareSetId("desiredSoftwareSetId")
     * .desktopEndpoint("desktopEndpoint")
     * .kmsKeyArn("kmsKeyArn")
     * .maintenanceWindow(MaintenanceWindowProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .applyTimeOf("applyTimeOf")
     * .daysOfTheWeek(List.of("daysOfTheWeek"))
     * .endTimeHour(123)
     * .endTimeMinute(123)
     * .startTimeHour(123)
     * .startTimeMinute(123)
     * .build())
     * .name("name")
     * .softwareSetUpdateMode("softwareSetUpdateMode")
     * .softwareSetUpdateSchedule("softwareSetUpdateSchedule")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html)
     */
    public inline fun cfnEnvironmentProps(
        block: CfnEnvironmentPropsDsl.() -> Unit = {}
    ): CfnEnvironmentProps {
        val builder = CfnEnvironmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
