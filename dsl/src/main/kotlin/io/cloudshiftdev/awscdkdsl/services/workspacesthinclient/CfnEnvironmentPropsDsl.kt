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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.workspacesthinclient.CfnEnvironment
import software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps

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
@CdkDslMarker
public class CfnEnvironmentPropsDsl {
    private val cdkBuilder: CfnEnvironmentProps.Builder = CfnEnvironmentProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param desiredSoftwareSetId The ID of the software set to apply. */
    public fun desiredSoftwareSetId(desiredSoftwareSetId: String) {
        cdkBuilder.desiredSoftwareSetId(desiredSoftwareSetId)
    }

    /**
     * @param desktopArn The Amazon Resource Name (ARN) of the desktop to stream from Amazon
     *   WorkSpaces , WorkSpaces Web, or AppStream 2.0 .
     */
    public fun desktopArn(desktopArn: String) {
        cdkBuilder.desktopArn(desktopArn)
    }

    /**
     * @param desktopEndpoint The URL for the identity provider login (only for environments that
     *   use AppStream 2.0 ).
     */
    public fun desktopEndpoint(desktopEndpoint: String) {
        cdkBuilder.desktopEndpoint(desktopEndpoint)
    }

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service key used to
     *   encrypt the environment.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /** @param maintenanceWindow A specification for a time window to apply software updates. */
    public fun maintenanceWindow(maintenanceWindow: IResolvable) {
        cdkBuilder.maintenanceWindow(maintenanceWindow)
    }

    /** @param maintenanceWindow A specification for a time window to apply software updates. */
    public fun maintenanceWindow(maintenanceWindow: CfnEnvironment.MaintenanceWindowProperty) {
        cdkBuilder.maintenanceWindow(maintenanceWindow)
    }

    /** @param name The name of the environment. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param softwareSetUpdateMode An option to define which software updates to apply. */
    public fun softwareSetUpdateMode(softwareSetUpdateMode: String) {
        cdkBuilder.softwareSetUpdateMode(softwareSetUpdateMode)
    }

    /**
     * @param softwareSetUpdateSchedule An option to define if software updates should be applied
     *   within a maintenance window.
     */
    public fun softwareSetUpdateSchedule(softwareSetUpdateSchedule: String) {
        cdkBuilder.softwareSetUpdateSchedule(softwareSetUpdateSchedule)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEnvironmentProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
