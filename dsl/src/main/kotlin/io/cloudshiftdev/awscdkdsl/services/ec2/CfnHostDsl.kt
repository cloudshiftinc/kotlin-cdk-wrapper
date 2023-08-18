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
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnHost
import software.constructs.Construct

/**
 * Allocates a fully dedicated physical server for launching EC2 instances.
 *
 * Because the host is fully dedicated for your use, it can help you address compliance requirements
 * and reduce costs by allowing you to use your existing server-bound software licenses. For more
 * information, see
 * [Dedicated Hosts](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html)
 * in the *Amazon EC2 User Guide for Linux Instances* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnHost cfnHost = CfnHost.Builder.create(this, "MyCfnHost")
 * .availabilityZone("availabilityZone")
 * // the properties below are optional
 * .assetId("assetId")
 * .autoPlacement("autoPlacement")
 * .hostMaintenance("hostMaintenance")
 * .hostRecovery("hostRecovery")
 * .instanceFamily("instanceFamily")
 * .instanceType("instanceType")
 * .outpostArn("outpostArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html)
 */
@CdkDslMarker
public class CfnHostDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnHost.Builder = CfnHost.Builder.create(scope, id)

    /**
     * The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-assetid)
     *
     * @param assetId The ID of the Outpost hardware asset on which the Dedicated Host is allocated.
     */
    public fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
    }

    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance
     * type configuration, or if it only accepts Host tenancy instance launches that specify its
     * unique host ID.
     *
     * For more information, see
     * [Understanding auto-placement and affinity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `on`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-autoplacement)
     *
     * @param autoPlacement Indicates whether the host accepts any untargeted instance launches that
     *   match its instance type configuration, or if it only accepts Host tenancy instance launches
     *   that specify its unique host ID.
     */
    public fun autoPlacement(autoPlacement: String) {
        cdkBuilder.autoPlacement(autoPlacement)
    }

    /**
     * The Availability Zone in which to allocate the Dedicated Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-availabilityzone)
     *
     * @param availabilityZone The Availability Zone in which to allocate the Dedicated Host.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * Indicates whether host maintenance is enabled or disabled for the Dedicated Host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-hostmaintenance)
     *
     * @param hostMaintenance Indicates whether host maintenance is enabled or disabled for the
     *   Dedicated Host.
     */
    public fun hostMaintenance(hostMaintenance: String) {
        cdkBuilder.hostMaintenance(hostMaintenance)
    }

    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host.
     *
     * Host recovery is disabled by default. For more information, see
     * [Host recovery](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html)
     * in the *Amazon EC2 User Guide* .
     *
     * Default: `off`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-hostrecovery)
     *
     * @param hostRecovery Indicates whether to enable or disable host recovery for the Dedicated
     *   Host.
     */
    public fun hostRecovery(hostRecovery: String) {
        cdkBuilder.hostRecovery(hostRecovery)
    }

    /**
     * The instance family supported by the Dedicated Host.
     *
     * For example, `m5` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancefamily)
     *
     * @param instanceFamily The instance family supported by the Dedicated Host.
     */
    public fun instanceFamily(instanceFamily: String) {
        cdkBuilder.instanceFamily(instanceFamily)
    }

    /**
     * Specifies the instance type to be supported by the Dedicated Hosts.
     *
     * If you specify an instance type, the Dedicated Hosts support instances of the specified
     * instance type only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-instancetype)
     *
     * @param instanceType Specifies the instance type to be supported by the Dedicated Hosts.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated Host is allocated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html#cfn-ec2-host-outpostarn)
     *
     * @param outpostArn The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated
     *   Host is allocated.
     */
    public fun outpostArn(outpostArn: String) {
        cdkBuilder.outpostArn(outpostArn)
    }

    public fun build(): CfnHost = cdkBuilder.build()
}
