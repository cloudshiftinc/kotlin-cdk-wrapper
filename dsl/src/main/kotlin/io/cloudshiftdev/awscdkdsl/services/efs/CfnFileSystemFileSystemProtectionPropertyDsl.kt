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
 * Describes the protection on the file system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * FileSystemProtectionProperty fileSystemProtectionProperty =
 * FileSystemProtectionProperty.builder()
 * .replicationOverwriteProtection("replicationOverwriteProtection")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemprotection.html)
 */
@CdkDslMarker
public class CfnFileSystemFileSystemProtectionPropertyDsl {
    private val cdkBuilder: CfnFileSystem.FileSystemProtectionProperty.Builder =
        CfnFileSystem.FileSystemProtectionProperty.builder()

    /**
     * @param replicationOverwriteProtection The status of the file system's replication overwrite
     *   protection.
     * * `ENABLED` – The file system cannot be used as the destination file system in a replication
     *   configuration. The file system is writeable. Replication overwrite protection is `ENABLED`
     *   by default.
     * * `DISABLED` – The file system can be used as the destination file system in a replication
     *   configuration. The file system is read-only and can only be modified by EFS replication.
     * * `REPLICATING` – The file system is being used as the destination file system in a
     *   replication configuration. The file system is read-only and is only modified only by EFS
     *   replication.
     *
     * If the replication configuration is deleted, the file system's replication overwrite
     * protection is re-enabled, the file system becomes writeable.
     */
    public fun replicationOverwriteProtection(replicationOverwriteProtection: String) {
        cdkBuilder.replicationOverwriteProtection(replicationOverwriteProtection)
    }

    public fun build(): CfnFileSystem.FileSystemProtectionProperty = cdkBuilder.build()
}
