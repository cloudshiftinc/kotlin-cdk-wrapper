@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.ISubnet
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.fsx.LustreConfiguration
import software.amazon.awscdk.services.fsx.LustreFileSystem
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

@CdkDslMarker
public class LustreFileSystemDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LustreFileSystem.Builder = LustreFileSystem.Builder.create(scope, id)

  /**
   * The ID of the backup.
   *
   * Specifies the backup to use if you're creating a file system from an existing backup.
   *
   * Default: - no backup will be used.
   *
   * @param backupId The ID of the backup. 
   */
  public fun backupId(backupId: String) {
    cdkBuilder.backupId(backupId)
  }

  /**
   * The KMS key used for encryption to protect your data at rest.
   *
   * Default: - the aws/fsx default KMS key for the AWS account being deployed into.
   *
   * @param kmsKey The KMS key used for encryption to protect your data at rest. 
   */
  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  /**
   * Additional configuration for FSx specific to Lustre.
   *
   * @param lustreConfiguration Additional configuration for FSx specific to Lustre. 
   */
  public fun lustreConfiguration(lustreConfiguration: LustreConfigurationDsl.() -> Unit = {}) {
    val builder = LustreConfigurationDsl()
    builder.apply(lustreConfiguration)
    cdkBuilder.lustreConfiguration(builder.build())
  }

  /**
   * Additional configuration for FSx specific to Lustre.
   *
   * @param lustreConfiguration Additional configuration for FSx specific to Lustre. 
   */
  public fun lustreConfiguration(lustreConfiguration: LustreConfiguration) {
    cdkBuilder.lustreConfiguration(lustreConfiguration)
  }

  /**
   * Policy to apply when the file system is removed from the stack.
   *
   * Default: RemovalPolicy.RETAIN
   *
   * @param removalPolicy Policy to apply when the file system is removed from the stack. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * Security Group to assign to this file system.
   *
   * Default: - creates new security group which allows all outbound traffic.
   *
   * @param securityGroup Security Group to assign to this file system. 
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  /**
   * The storage capacity of the file system being created.
   *
   * For Windows file systems, valid values are 32 GiB to 65,536 GiB.
   * For SCRATCH_1 deployment types, valid values are 1,200, 2,400, 3,600, then continuing in
   * increments of 3,600 GiB.
   * For SCRATCH_2 and PERSISTENT_1 types, valid values are 1,200, 2,400, then continuing in
   * increments of 2,400 GiB.
   *
   * @param storageCapacityGiB The storage capacity of the file system being created. 
   */
  public fun storageCapacityGiB(storageCapacityGiB: Number) {
    cdkBuilder.storageCapacityGiB(storageCapacityGiB)
  }

  /**
   * The VPC to launch the file system in.
   *
   * @param vpc The VPC to launch the file system in. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * The subnet that the file system will be accessible from.
   *
   * @param vpcSubnet The subnet that the file system will be accessible from. 
   */
  public fun vpcSubnet(vpcSubnet: ISubnet) {
    cdkBuilder.vpcSubnet(vpcSubnet)
  }

  public fun build(): LustreFileSystem = cdkBuilder.build()
}
