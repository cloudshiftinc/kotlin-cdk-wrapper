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
import software.constructs.Construct

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
@CdkDslMarker
public class CfnEnvironmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnvironment.Builder = CfnEnvironment.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of the software set to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desiredsoftwaresetid)
     *
     * @param desiredSoftwareSetId The ID of the software set to apply.
     */
    public fun desiredSoftwareSetId(desiredSoftwareSetId: String) {
        cdkBuilder.desiredSoftwareSetId(desiredSoftwareSetId)
    }

    /**
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces , WorkSpaces
     * Web, or AppStream 2.0 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desktoparn)
     *
     * @param desktopArn The Amazon Resource Name (ARN) of the desktop to stream from Amazon
     *   WorkSpaces , WorkSpaces Web, or AppStream 2.0 .
     */
    public fun desktopArn(desktopArn: String) {
        cdkBuilder.desktopArn(desktopArn)
    }

    /**
     * The URL for the identity provider login (only for environments that use AppStream 2.0 ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-desktopendpoint)
     *
     * @param desktopEndpoint The URL for the identity provider login (only for environments that
     *   use AppStream 2.0 ).
     */
    public fun desktopEndpoint(desktopEndpoint: String) {
        cdkBuilder.desktopEndpoint(desktopEndpoint)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service key used to encrypt the
     * environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-kmskeyarn)
     *
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the AWS Key Management Service key used to
     *   encrypt the environment.
     */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * A specification for a time window to apply software updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-maintenancewindow)
     *
     * @param maintenanceWindow A specification for a time window to apply software updates.
     */
    public fun maintenanceWindow(maintenanceWindow: IResolvable) {
        cdkBuilder.maintenanceWindow(maintenanceWindow)
    }

    /**
     * A specification for a time window to apply software updates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-maintenancewindow)
     *
     * @param maintenanceWindow A specification for a time window to apply software updates.
     */
    public fun maintenanceWindow(maintenanceWindow: CfnEnvironment.MaintenanceWindowProperty) {
        cdkBuilder.maintenanceWindow(maintenanceWindow)
    }

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-name)
     *
     * @param name The name of the environment.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An option to define which software updates to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-softwaresetupdatemode)
     *
     * @param softwareSetUpdateMode An option to define which software updates to apply.
     */
    public fun softwareSetUpdateMode(softwareSetUpdateMode: String) {
        cdkBuilder.softwareSetUpdateMode(softwareSetUpdateMode)
    }

    /**
     * An option to define if software updates should be applied within a maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-softwaresetupdateschedule)
     *
     * @param softwareSetUpdateSchedule An option to define if software updates should be applied
     *   within a maintenance window.
     */
    public fun softwareSetUpdateSchedule(softwareSetUpdateSchedule: String) {
        cdkBuilder.softwareSetUpdateSchedule(softwareSetUpdateSchedule)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesthinclient-environment.html#cfn-workspacesthinclient-environment-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEnvironment {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
