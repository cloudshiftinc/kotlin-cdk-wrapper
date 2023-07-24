@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The `AWS::SSM::MaintenanceWindowTarget` resource registers a target with a maintenance window for
 * AWS Systems Manager .
 *
 * For more information, see
 * [RegisterTargetWithMaintenanceWindow](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_RegisterTargetWithMaintenanceWindow.html)
 * in the *AWS Systems Manager API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * CfnMaintenanceWindowTarget cfnMaintenanceWindowTarget =
 * CfnMaintenanceWindowTarget.Builder.create(this, "MyCfnMaintenanceWindowTarget")
 * .resourceType("resourceType")
 * .targets(List.of(TargetsProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .windowId("windowId")
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .ownerInformation("ownerInformation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTargetDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnMaintenanceWindowTarget.Builder =
        CfnMaintenanceWindowTarget.Builder.create(scope, id)

    private val _targets: MutableList<Any> = mutableListOf()

    /**
     * A description for the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-description)
     * @param description A description for the target.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name for the maintenance window target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-name)
     * @param name The name for the maintenance window target.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A user-provided value that will be included in any Amazon CloudWatch Events events that are
     * raised while running tasks for these targets in this maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-ownerinformation)
     * @param ownerInformation A user-provided value that will be included in any Amazon CloudWatch
     * Events events that are raised while running tasks for these targets in this maintenance window.
     */
    public fun ownerInformation(ownerInformation: String) {
        cdkBuilder.ownerInformation(ownerInformation)
    }

    /**
     * The type of target that is being registered with the maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-resourcetype)
     * @param resourceType The type of target that is being registered with the maintenance window.
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * The targets to register with the maintenance window.
     *
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
     * @param targets The targets to register with the maintenance window.
     */
    public fun targets(vararg targets: Any) {
        _targets.addAll(listOf(*targets))
    }

    /**
     * The targets to register with the maintenance window.
     *
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
     * @param targets The targets to register with the maintenance window.
     */
    public fun targets(targets: Collection<Any>) {
        _targets.addAll(targets)
    }

    /**
     * The targets to register with the maintenance window.
     *
     * In other words, the instances to run commands on when the maintenance window runs.
     *
     * You must specify targets by using the `WindowTargetIds` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-targets)
     * @param targets The targets to register with the maintenance window.
     */
    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    /**
     * The ID of the maintenance window to register the target with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html#cfn-ssm-maintenancewindowtarget-windowid)
     * @param windowId The ID of the maintenance window to register the target with.
     */
    public fun windowId(windowId: String) {
        cdkBuilder.windowId(windowId)
    }

    public fun build(): CfnMaintenanceWindowTarget {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
