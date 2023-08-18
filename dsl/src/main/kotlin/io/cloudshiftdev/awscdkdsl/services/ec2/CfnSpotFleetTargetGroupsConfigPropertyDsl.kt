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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Describes the target groups to attach to a Spot Fleet.
 *
 * Spot Fleet registers the running Spot Instances with these target groups.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * TargetGroupsConfigProperty targetGroupsConfigProperty = TargetGroupsConfigProperty.builder()
 * .targetGroups(List.of(TargetGroupProperty.builder()
 * .arn("arn")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-targetgroupsconfig.html)
 */
@CdkDslMarker
public class CfnSpotFleetTargetGroupsConfigPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.TargetGroupsConfigProperty.Builder =
        CfnSpotFleet.TargetGroupsConfigProperty.builder()

    private val _targetGroups: MutableList<Any> = mutableListOf()

    /** @param targetGroups One or more target groups. */
    public fun targetGroups(vararg targetGroups: Any) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    /** @param targetGroups One or more target groups. */
    public fun targetGroups(targetGroups: Collection<Any>) {
        _targetGroups.addAll(targetGroups)
    }

    /** @param targetGroups One or more target groups. */
    public fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups)
    }

    public fun build(): CfnSpotFleet.TargetGroupsConfigProperty {
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
