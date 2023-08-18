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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies the placement of an instance.
 *
 * `Placement` is a property of
 * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PlacementProperty placementProperty = PlacementProperty.builder()
 * .affinity("affinity")
 * .availabilityZone("availabilityZone")
 * .groupId("groupId")
 * .groupName("groupName")
 * .hostId("hostId")
 * .hostResourceGroupArn("hostResourceGroupArn")
 * .partitionNumber(123)
 * .spreadDomain("spreadDomain")
 * .tenancy("tenancy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-placement.html)
 */
@CdkDslMarker
public class CfnLaunchTemplatePlacementPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.PlacementProperty.Builder =
        CfnLaunchTemplate.PlacementProperty.builder()

    /** @param affinity The affinity setting for an instance on a Dedicated Host. */
    public fun affinity(affinity: String) {
        cdkBuilder.affinity(affinity)
    }

    /** @param availabilityZone The Availability Zone for the instance. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param groupId The Group Id of a placement group. You must specify the Placement Group *Group
     *   Id* to launch an instance in a shared placement group.
     */
    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    /** @param groupName The name of the placement group for the instance. */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /** @param hostId The ID of the Dedicated Host for the instance. */
    public fun hostId(hostId: String) {
        cdkBuilder.hostId(hostId)
    }

    /**
     * @param hostResourceGroupArn The ARN of the host resource group in which to launch the
     *   instances. If you specify a host resource group ARN, omit the *Tenancy* parameter or set it
     *   to `host` .
     */
    public fun hostResourceGroupArn(hostResourceGroupArn: String) {
        cdkBuilder.hostResourceGroupArn(hostResourceGroupArn)
    }

    /**
     * @param partitionNumber The number of the partition the instance should launch in. Valid only
     *   if the placement group strategy is set to `partition` .
     */
    public fun partitionNumber(partitionNumber: Number) {
        cdkBuilder.partitionNumber(partitionNumber)
    }

    /** @param spreadDomain Reserved for future use. */
    public fun spreadDomain(spreadDomain: String) {
        cdkBuilder.spreadDomain(spreadDomain)
    }

    /**
     * @param tenancy The tenancy of the instance. An instance with a tenancy of dedicated runs on
     *   single-tenant hardware.
     */
    public fun tenancy(tenancy: String) {
        cdkBuilder.tenancy(tenancy)
    }

    public fun build(): CfnLaunchTemplate.PlacementProperty = cdkBuilder.build()
}
