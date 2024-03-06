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

import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPoint
import software.amazon.awscdk.services.efs.CfnAccessPoint
import software.amazon.awscdk.services.efs.CfnFileSystem
import software.amazon.awscdk.services.efs.FileSystem
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult

/**
 * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access
 * point that is used for all file operations by NFS clients using the access point.
 */
public inline fun CfnAccessPoint.setPosixUser(
    block: CfnAccessPointPosixUserPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAccessPointPosixUserPropertyDsl()
    builder.apply(block)
    return setPosixUser(builder.build())
}

/**
 * The directory on the EFS file system that the access point exposes as the root directory to NFS
 * clients using the access point.
 */
public inline fun CfnAccessPoint.setRootDirectory(
    block: CfnAccessPointRootDirectoryPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAccessPointRootDirectoryPropertyDsl()
    builder.apply(block)
    return setRootDirectory(builder.build())
}

/** Use the `BackupPolicy` to turn automatic backups on or off for the file system. */
public inline fun CfnFileSystem.setBackupPolicy(
    block: CfnFileSystemBackupPolicyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFileSystemBackupPolicyPropertyDsl()
    builder.apply(block)
    return setBackupPolicy(builder.build())
}

/** Describes the protection on the file system. */
public inline fun CfnFileSystem.setFileSystemProtection(
    block: CfnFileSystemFileSystemProtectionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFileSystemFileSystemProtectionPropertyDsl()
    builder.apply(block)
    return setFileSystemProtection(builder.build())
}

/** Describes the replication configuration for a specific file system. */
public inline fun CfnFileSystem.setReplicationConfiguration(
    block: CfnFileSystemReplicationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFileSystemReplicationConfigurationPropertyDsl()
    builder.apply(block)
    return setReplicationConfiguration(builder.build())
}

/**
 * create access point from this filesystem.
 *
 * @param id
 * @param accessPointOptions
 */
public inline fun FileSystem.addAccessPoint(
    id: String,
    block: AccessPointOptionsDsl.() -> Unit = {}
): AccessPoint {
    val builder = AccessPointOptionsDsl()
    builder.apply(block)
    return addAccessPoint(id, builder.build())
}

/**
 * Adds a statement to the resource policy associated with this file system.
 *
 * A resource policy will be automatically created upon the first call to `addToResourcePolicy`.
 *
 * Note that this does not work with imported file systems.
 *
 * @param statement The policy statement to add.
 */
public inline fun FileSystem.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}
