@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for the FSx file system.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Key key;
 * SecurityGroup securityGroup;
 * Vpc vpc;
 * FileSystemProps fileSystemProps = FileSystemProps.builder()
 * .storageCapacityGiB(123)
 * .vpc(vpc)
 * // the properties below are optional
 * .backupId("backupId")
 * .kmsKey(key)
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .securityGroup(securityGroup)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-filesystem.html)
 */
public interface FileSystemProps {
  /**
   * The ID of the backup.
   *
   * Specifies the backup to use if you're creating a file system from an existing backup.
   *
   * Default: - no backup will be used.
   */
  public fun backupId(): String? = unwrap(this).getBackupId()

  /**
   * The KMS key used for encryption to protect your data at rest.
   *
   * Default: - the aws/fsx default KMS key for the AWS account being deployed into.
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * Policy to apply when the file system is removed from the stack.
   *
   * Default: RemovalPolicy.RETAIN
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Security Group to assign to this file system.
   *
   * Default: - creates new security group which allows all outbound traffic.
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * The storage capacity of the file system being created.
   *
   * For Windows file systems, valid values are 32 GiB to 65,536 GiB.
   * For SCRATCH_1 deployment types, valid values are 1,200, 2,400, 3,600, then continuing in
   * increments of 3,600 GiB.
   * For SCRATCH_2 and PERSISTENT_1 types, valid values are 1,200, 2,400, then continuing in
   * increments of 2,400 GiB.
   */
  public fun storageCapacityGiB(): Number

  /**
   * The VPC to launch the file system in.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [FileSystemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backupId The ID of the backup.
     * Specifies the backup to use if you're creating a file system from an existing backup.
     */
    public fun backupId(backupId: String)

    /**
     * @param kmsKey The KMS key used for encryption to protect your data at rest.
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param removalPolicy Policy to apply when the file system is removed from the stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param securityGroup Security Group to assign to this file system.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param storageCapacityGiB The storage capacity of the file system being created. 
     * For Windows file systems, valid values are 32 GiB to 65,536 GiB.
     * For SCRATCH_1 deployment types, valid values are 1,200, 2,400, 3,600, then continuing in
     * increments of 3,600 GiB.
     * For SCRATCH_2 and PERSISTENT_1 types, valid values are 1,200, 2,400, then continuing in
     * increments of 2,400 GiB.
     */
    public fun storageCapacityGiB(storageCapacityGiB: Number)

    /**
     * @param vpc The VPC to launch the file system in. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.FileSystemProps.Builder =
        software.amazon.awscdk.services.fsx.FileSystemProps.builder()

    /**
     * @param backupId The ID of the backup.
     * Specifies the backup to use if you're creating a file system from an existing backup.
     */
    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    /**
     * @param kmsKey The KMS key used for encryption to protect your data at rest.
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    /**
     * @param removalPolicy Policy to apply when the file system is removed from the stack.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param securityGroup Security Group to assign to this file system.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param storageCapacityGiB The storage capacity of the file system being created. 
     * For Windows file systems, valid values are 32 GiB to 65,536 GiB.
     * For SCRATCH_1 deployment types, valid values are 1,200, 2,400, 3,600, then continuing in
     * increments of 3,600 GiB.
     * For SCRATCH_2 and PERSISTENT_1 types, valid values are 1,200, 2,400, then continuing in
     * increments of 2,400 GiB.
     */
    override fun storageCapacityGiB(storageCapacityGiB: Number) {
      cdkBuilder.storageCapacityGiB(storageCapacityGiB)
    }

    /**
     * @param vpc The VPC to launch the file system in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.fsx.FileSystemProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.FileSystemProps,
  ) : CdkObject(cdkObject), FileSystemProps {
    /**
     * The ID of the backup.
     *
     * Specifies the backup to use if you're creating a file system from an existing backup.
     *
     * Default: - no backup will be used.
     */
    override fun backupId(): String? = unwrap(this).getBackupId()

    /**
     * The KMS key used for encryption to protect your data at rest.
     *
     * Default: - the aws/fsx default KMS key for the AWS account being deployed into.
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * Policy to apply when the file system is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Security Group to assign to this file system.
     *
     * Default: - creates new security group which allows all outbound traffic.
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * The storage capacity of the file system being created.
     *
     * For Windows file systems, valid values are 32 GiB to 65,536 GiB.
     * For SCRATCH_1 deployment types, valid values are 1,200, 2,400, 3,600, then continuing in
     * increments of 3,600 GiB.
     * For SCRATCH_2 and PERSISTENT_1 types, valid values are 1,200, 2,400, then continuing in
     * increments of 2,400 GiB.
     */
    override fun storageCapacityGiB(): Number = unwrap(this).getStorageCapacityGiB()

    /**
     * The VPC to launch the file system in.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.FileSystemProps):
        FileSystemProps = CdkObjectWrappers.wrap(cdkObject) as? FileSystemProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemProps):
        software.amazon.awscdk.services.fsx.FileSystemProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.fsx.FileSystemProps
  }
}
