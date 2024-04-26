@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.Unit

/**
 * Properties for the ReplicationConfiguration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * FileSystem fileSystem;
 * Key key;
 * ReplicationConfigurationProps replicationConfigurationProps =
 * ReplicationConfigurationProps.builder()
 * .availabilityZone("availabilityZone")
 * .destinationFileSystem(fileSystem)
 * .kmsKey(key)
 * .region("region")
 * .build();
 * ```
 */
public interface ReplicationConfigurationProps {
  /**
   * The availability zone name of the destination file system.
   *
   * One zone file system is used as the destination file system when this property is set.
   *
   * Default: - no availability zone is set
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The existing destination file system for the replication.
   *
   * Default: - None
   */
  public fun destinationFileSystem(): IFileSystem? =
      unwrap(this).getDestinationFileSystem()?.let(IFileSystem::wrap)

  /**
   * AWS KMS key used to protect the encrypted file system.
   *
   * Default: - use service-managed KMS key for Amazon EFS
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * The AWS Region in which the destination file system is located.
   *
   * Default: - the region of the stack
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * A builder for [ReplicationConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The availability zone name of the destination file system.
     * One zone file system is used as the destination file system when this property is set.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param destinationFileSystem The existing destination file system for the replication.
     */
    public fun destinationFileSystem(destinationFileSystem: IFileSystem)

    /**
     * @param kmsKey AWS KMS key used to protect the encrypted file system.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param region The AWS Region in which the destination file system is located.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.efs.ReplicationConfigurationProps.Builder =
        software.amazon.awscdk.services.efs.ReplicationConfigurationProps.builder()

    /**
     * @param availabilityZone The availability zone name of the destination file system.
     * One zone file system is used as the destination file system when this property is set.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param destinationFileSystem The existing destination file system for the replication.
     */
    override fun destinationFileSystem(destinationFileSystem: IFileSystem) {
      cdkBuilder.destinationFileSystem(destinationFileSystem.let(IFileSystem::unwrap))
    }

    /**
     * @param kmsKey AWS KMS key used to protect the encrypted file system.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    /**
     * @param region The AWS Region in which the destination file system is located.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.efs.ReplicationConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.ReplicationConfigurationProps,
  ) : CdkObject(cdkObject), ReplicationConfigurationProps {
    /**
     * The availability zone name of the destination file system.
     *
     * One zone file system is used as the destination file system when this property is set.
     *
     * Default: - no availability zone is set
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The existing destination file system for the replication.
     *
     * Default: - None
     */
    override fun destinationFileSystem(): IFileSystem? =
        unwrap(this).getDestinationFileSystem()?.let(IFileSystem::wrap)

    /**
     * AWS KMS key used to protect the encrypted file system.
     *
     * Default: - use service-managed KMS key for Amazon EFS
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * The AWS Region in which the destination file system is located.
     *
     * Default: - the region of the stack
     */
    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.ReplicationConfigurationProps):
        ReplicationConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        ReplicationConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReplicationConfigurationProps):
        software.amazon.awscdk.services.efs.ReplicationConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.efs.ReplicationConfigurationProps
  }
}
