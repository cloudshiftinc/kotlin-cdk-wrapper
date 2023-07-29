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

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPoint
import software.amazon.awscdk.services.efs.CfnAccessPoint
import software.amazon.awscdk.services.efs.CfnFileSystem
import software.amazon.awscdk.services.efs.FileSystem
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult

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
 * The directory on the Amazon EFS file system that the access point exposes as the root directory
 * to NFS clients using the access point.
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
