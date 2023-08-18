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
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget

/**
 * The `Targets` property type specifies adding a target to a maintenance window target in AWS
 * Systems Manager .
 *
 * `Targets` is a property of the
 * [AWS::SSM::MaintenanceWindowTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * TargetsProperty targetsProperty = TargetsProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtarget-targets.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTargetTargetsPropertyDsl {
    private val cdkBuilder: CfnMaintenanceWindowTarget.TargetsProperty.Builder =
        CfnMaintenanceWindowTarget.TargetsProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param key User-defined criteria for sending commands that target managed nodes that meet the
     *   criteria.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param values User-defined criteria that maps to `Key` . For example, if you specified
     *   `tag:ServerRole` , you could specify `value:WebServer` to run a command on instances that
     *   include EC2 tags of `ServerRole,WebServer` .
     *
     * Depending on the type of target, the maximum number of values for a key might be lower than
     * the global maximum of 50.
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values User-defined criteria that maps to `Key` . For example, if you specified
     *   `tag:ServerRole` , you could specify `value:WebServer` to run a command on instances that
     *   include EC2 tags of `ServerRole,WebServer` .
     *
     * Depending on the type of target, the maximum number of values for a key might be lower than
     * the global maximum of 50.
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnMaintenanceWindowTarget.TargetsProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
