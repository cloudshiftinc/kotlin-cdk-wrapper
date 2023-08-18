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

package io.cloudshiftdev.awscdkdsl.services.ssm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

/**
 * The `Target` property type specifies targets (either instances or window target IDs).
 *
 * You specify instances by using `Key=InstanceIds,Values=&lt; *instanceid1* &gt;,&lt; *instanceid2*
 * &gt;` . You specify window target IDs using `Key=WindowTargetIds,Values=&lt; *window-target-id-1*
 * &gt;,&lt; *window-target-id-2* &gt;` for a maintenance window task in AWS Systems Manager .
 *
 * `Target` is a property of the
 * [AWS::SSM::MaintenanceWindowTask](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html)
 * property type.
 *
 * To use `resource-groups:Name` as the key for a maintenance window target, specify the resource
 * group as a `AWS::SSM::MaintenanceWindowTarget` type, and use the `Ref` function to specify the
 * target for `AWS::SSM::MaintenanceWindowTask` . For an example, see *Create a Run Command task
 * that targets instances using a resource group name* in
 * [AWS::SSM::MaintenanceWindowTask Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtask.html#aws-resource-ssm-maintenancewindowtask--examples)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * TargetProperty targetProperty = TargetProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-target.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTaskTargetPropertyDsl {
    private val cdkBuilder: CfnMaintenanceWindowTask.TargetProperty.Builder =
        CfnMaintenanceWindowTask.TargetProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param key User-defined criteria for sending commands that target instances that meet the
     *   criteria. `Key` can be `InstanceIds` or `WindowTargetIds` . For more information about how
     *   to target instances within a maintenance window task, see
     *   [About 'register-task-with-maintenance-window' Options and Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
     *   in the *AWS Systems Manager User Guide* .
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param values User-defined criteria that maps to `Key` . For example, if you specify
     *   `InstanceIds` , you can specify `i-1234567890abcdef0,i-9876543210abcdef0` to run a command
     *   on two EC2 instances. For more information about how to target instances within a
     *   maintenance window task, see
     *   [About 'register-task-with-maintenance-window' Options and Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
     *   in the *AWS Systems Manager User Guide* .
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values User-defined criteria that maps to `Key` . For example, if you specify
     *   `InstanceIds` , you can specify `i-1234567890abcdef0,i-9876543210abcdef0` to run a command
     *   on two EC2 instances. For more information about how to target instances within a
     *   maintenance window task, see
     *   [About 'register-task-with-maintenance-window' Options and Values](https://docs.aws.amazon.com/systems-manager/latest/userguide/register-tasks-options.html)
     *   in the *AWS Systems Manager User Guide* .
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnMaintenanceWindowTask.TargetProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
