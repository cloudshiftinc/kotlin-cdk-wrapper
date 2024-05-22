@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String

/**
 * EFS Replication Configuration.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * // auto generate a regional replication destination file system
 * // auto generate a regional replication destination file system
 * FileSystem.Builder.create(this, "RegionalReplicationFileSystem")
 * .vpc(vpc)
 * .replicationConfiguration(ReplicationConfiguration.regionalFileSystem("us-west-2"))
 * .build();
 * // auto generate a one zone replication destination file system
 * // auto generate a one zone replication destination file system
 * FileSystem.Builder.create(this, "OneZoneReplicationFileSystem")
 * .vpc(vpc)
 * .replicationConfiguration(ReplicationConfiguration.oneZoneFileSystem("us-east-1", "us-east-1a"))
 * .build();
 * FileSystem destinationFileSystem = FileSystem.Builder.create(this, "DestinationFileSystem")
 * .vpc(vpc)
 * // set as the read-only file system for use as a replication destination
 * .replicationOverwriteProtection(ReplicationOverwriteProtection.DISABLED)
 * .build();
 * // specify the replication destination file system
 * // specify the replication destination file system
 * FileSystem.Builder.create(this, "ReplicationFileSystem")
 * .vpc(vpc)
 * .replicationConfiguration(ReplicationConfiguration.existingFileSystem(destinationFileSystem))
 * .build();
 * ```
 */
public abstract class ReplicationConfiguration(
  cdkObject: software.amazon.awscdk.services.efs.ReplicationConfiguration,
) : CdkObject(cdkObject) {
  /**
   * The availability zone name of the destination file system.
   *
   * One zone file system is used as the destination file system when this property is set.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The existing destination file system for the replication.
   */
  public open fun destinationFileSystem(): IFileSystem? =
      unwrap(this).getDestinationFileSystem()?.let(IFileSystem::wrap)

  /**
   * AWS KMS key used to protect the encrypted file system.
   */
  public open fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * The AWS Region in which the destination file system is located.
   */
  public open fun region(): String? = unwrap(this).getRegion()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.ReplicationConfiguration,
  ) : ReplicationConfiguration(cdkObject)

  public companion object {
    public fun existingFileSystem(destinationFileSystem: IFileSystem): ReplicationConfiguration =
        software.amazon.awscdk.services.efs.ReplicationConfiguration.existingFileSystem(destinationFileSystem.let(IFileSystem.Companion::unwrap)).let(ReplicationConfiguration::wrap)

    public fun oneZoneFileSystem(region: String, availabilityZone: String): ReplicationConfiguration
        = software.amazon.awscdk.services.efs.ReplicationConfiguration.oneZoneFileSystem(region,
        availabilityZone).let(ReplicationConfiguration::wrap)

    public fun oneZoneFileSystem(
      region: String,
      availabilityZone: String,
      kmsKey: IKey,
    ): ReplicationConfiguration =
        software.amazon.awscdk.services.efs.ReplicationConfiguration.oneZoneFileSystem(region,
        availabilityZone, kmsKey.let(IKey.Companion::unwrap)).let(ReplicationConfiguration::wrap)

    public fun regionalFileSystem(): ReplicationConfiguration =
        software.amazon.awscdk.services.efs.ReplicationConfiguration.regionalFileSystem().let(ReplicationConfiguration::wrap)

    public fun regionalFileSystem(region: String): ReplicationConfiguration =
        software.amazon.awscdk.services.efs.ReplicationConfiguration.regionalFileSystem(region).let(ReplicationConfiguration::wrap)

    public fun regionalFileSystem(region: String, kmsKey: IKey): ReplicationConfiguration =
        software.amazon.awscdk.services.efs.ReplicationConfiguration.regionalFileSystem(region,
        kmsKey.let(IKey.Companion::unwrap)).let(ReplicationConfiguration::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.ReplicationConfiguration):
        ReplicationConfiguration = CdkObjectWrappers.wrap(cdkObject) as? ReplicationConfiguration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReplicationConfiguration):
        software.amazon.awscdk.services.efs.ReplicationConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.efs.ReplicationConfiguration
  }
}
