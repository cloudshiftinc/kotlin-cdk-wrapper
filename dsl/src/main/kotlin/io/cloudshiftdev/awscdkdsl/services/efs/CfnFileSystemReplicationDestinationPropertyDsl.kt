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
import software.amazon.awscdk.services.efs.CfnFileSystem

/**
 * Describes the destination file system in the replication configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * ReplicationDestinationProperty replicationDestinationProperty =
 * ReplicationDestinationProperty.builder()
 * .availabilityZoneName("availabilityZoneName")
 * .fileSystemId("fileSystemId")
 * .kmsKeyId("kmsKeyId")
 * .region("region")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationdestination.html)
 */
@CdkDslMarker
public class CfnFileSystemReplicationDestinationPropertyDsl {
    private val cdkBuilder: CfnFileSystem.ReplicationDestinationProperty.Builder =
        CfnFileSystem.ReplicationDestinationProperty.builder()

    /**
     * @param availabilityZoneName The AWS For One Zone file systems, the replication configuration
     *   must specify the Availability Zone in which the destination file system is located. Use the
     *   format `us-east-1a` to specify the Availability Zone. For more information about One Zone
     *   file systems, see
     *   [EFS file system types](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) in
     *   the *Amazon EFS User Guide* .
     *
     * One Zone file system type is not available in all Availability Zones in AWS Regions where
     * Amazon EFS is available.
     */
    public fun availabilityZoneName(availabilityZoneName: String) {
        cdkBuilder.availabilityZoneName(availabilityZoneName)
    }

    /** @param fileSystemId The ID of the destination Amazon EFS file system. */
    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    /** @param kmsKeyId The ID of an AWS KMS key used to protect the encrypted file system. */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param region The AWS Region in which the destination file system is located.
     *
     * For One Zone file systems, the replication configuration must specify the AWS Region in which
     * the destination file system is located.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): CfnFileSystem.ReplicationDestinationProperty = cdkBuilder.build()
}
