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

package io.cloudshiftdev.awscdkdsl.services.efs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.efs.CfnMountTargetProps

/**
 * Properties for defining a `CfnMountTarget`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * CfnMountTargetProps cfnMountTargetProps = CfnMountTargetProps.builder()
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
public class CfnMountTargetPropsDsl {
    private val cdkBuilder: CfnMountTargetProps.Builder = CfnMountTargetProps.builder()

    private val _securityGroups: MutableList<String> = mutableListOf()

    /** @param fileSystemId The ID of the file system for which to create the mount target. */
    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    /** @param ipAddress Valid IPv4 address within the address range of the specified subnet. */
    public fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . These
     *   must be for the same VPC as subnet specified.
     */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups Up to five VPC security group IDs, of the form `sg-xxxxxxxx` . These
     *   must be for the same VPC as subnet specified.
     */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param subnetId The ID of the subnet to add the mount target in. For One Zone file systems,
     *   use the subnet that is associated with the file system's Availability Zone.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnMountTargetProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
