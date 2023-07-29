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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.efs.CfnMountTarget
import software.constructs.Construct

/**
 * The `AWS::EFS::MountTarget` resource is an Amazon EFS resource that creates a mount target for an
 * EFS file system.
 *
 * You can then mount the file system on Amazon EC2 instances or other resources by using the mount
 * target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * CfnMountTarget cfnMountTarget = CfnMountTarget.Builder.create(this, "MyCfnMountTarget")
 * .fileSystemId("fileSystemId")
 * .securityGroups(List.of("securityGroups"))
 * .subnetId("subnetId")
 * // the properties below are optional
 * .ipAddress("ipAddress")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
 */
@CdkDslMarker
public class CfnMountTargetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMountTarget.Builder = CfnMountTarget.Builder.create(scope, id)

    private val _securityGroups: MutableList<String> = mutableListOf()

    /**
     * The ID of the file system for which to create the mount target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-filesystemid)
     *
     * @param fileSystemId The ID of the file system for which to create the mount target.
     */
    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * Valid IPv4 address within the address range of the specified subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-ipaddress)
     *
     * @param ipAddress Valid IPv4 address within the address range of the specified subnet.
     */
    public fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as subnet specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     *
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
     *
     * These must be for the same VPC as subnet specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-securitygroups)
     *
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` .
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * The ID of the subnet to add the mount target in.
     *
     * For file systems that use One Zone storage classes, use the subnet that is associated with
     * the file system's Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html#cfn-efs-mounttarget-subnetid)
     *
     * @param subnetId The ID of the subnet to add the mount target in.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnMountTarget {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
