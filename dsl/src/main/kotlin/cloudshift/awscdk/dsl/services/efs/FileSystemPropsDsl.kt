@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.efs.FileSystemProps
import software.amazon.awscdk.services.efs.LifecyclePolicy
import software.amazon.awscdk.services.efs.OutOfInfrequentAccessPolicy
import software.amazon.awscdk.services.efs.PerformanceMode
import software.amazon.awscdk.services.efs.ThroughputMode
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.kms.IKey

/**
 * Properties of EFS FileSystem.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.iam.*;
 * PolicyDocument myFileSystemPolicy = PolicyDocument.Builder.create()
 * .statements(List.of(PolicyStatement.Builder.create()
 * .actions(List.of("elasticfilesystem:ClientWrite", "elasticfilesystem:ClientMount"))
 * .principals(List.of(new AccountRootPrincipal()))
 * .resources(List.of("*"))
 * .conditions(Map.of(
 * "Bool", Map.of(
 * "elasticfilesystem:AccessedViaMountTarget", "true")))
 * .build()))
 * .build();
 * FileSystem fileSystem = FileSystem.Builder.create(this, "MyEfsFileSystem")
 * .vpc(new Vpc(this, "VPC"))
 * .fileSystemPolicy(myFileSystemPolicy)
 * .build();
 * ```
 */
@CdkDslMarker
public class FileSystemPropsDsl {
  private val cdkBuilder: FileSystemProps.Builder = FileSystemProps.builder()

  /**
   * @param enableAutomaticBackups Whether to enable automatic backups for the file system.
   */
  public fun enableAutomaticBackups(enableAutomaticBackups: Boolean) {
    cdkBuilder.enableAutomaticBackups(enableAutomaticBackups)
  }

  /**
   * @param encrypted Defines if the data at rest in the file system is encrypted or not.
   */
  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  /**
   * @param fileSystemName The file system's name.
   */
  public fun fileSystemName(fileSystemName: String) {
    cdkBuilder.fileSystemName(fileSystemName)
  }

  /**
   * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS access
   * to an EFS file system.
   */
  public fun fileSystemPolicy(fileSystemPolicy: PolicyDocumentDsl.() -> Unit = {}) {
    val builder = PolicyDocumentDsl()
    builder.apply(fileSystemPolicy)
    cdkBuilder.fileSystemPolicy(builder.build())
  }

  /**
   * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS access
   * to an EFS file system.
   */
  public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument) {
    cdkBuilder.fileSystemPolicy(fileSystemPolicy)
  }

  /**
   * @param kmsKey The KMS key used for encryption.
   * This is required to encrypt the data at rest if
   */
  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  /**
   * @param lifecyclePolicy A policy used by EFS lifecycle management to transition files to the
   * Infrequent Access (IA) storage class.
   */
  public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy) {
    cdkBuilder.lifecyclePolicy(lifecyclePolicy)
  }

  /**
   * @param outOfInfrequentAccessPolicy A policy used by EFS lifecycle management to transition
   * files from Infrequent Access (IA) storage class to primary storage class.
   */
  public fun outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy) {
    cdkBuilder.outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy)
  }

  /**
   * @param performanceMode The performance mode that the file system will operate under.
   * An Amazon EFS file system's performance mode can't be changed after the file system has been
   * created.
   * Updating this property will replace the file system.
   */
  public fun performanceMode(performanceMode: PerformanceMode) {
    cdkBuilder.performanceMode(performanceMode)
  }

  /**
   * @param provisionedThroughputPerSecond Provisioned throughput for the file system.
   * This is a required property if the throughput mode is set to PROVISIONED.
   * Must be at least 1MiB/s.
   */
  public fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size) {
    cdkBuilder.provisionedThroughputPerSecond(provisionedThroughputPerSecond)
  }

  /**
   * @param removalPolicy The removal policy to apply to the file system.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param securityGroup Security Group to assign to this file system.
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  /**
   * @param throughputMode Enum to mention the throughput mode of the file system.
   */
  public fun throughputMode(throughputMode: ThroughputMode) {
    cdkBuilder.throughputMode(throughputMode)
  }

  /**
   * @param vpc VPC to launch the file system in. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * @param vpcSubnets Which subnets to place the mount target in the VPC.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * @param vpcSubnets Which subnets to place the mount target in the VPC.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): FileSystemProps = cdkBuilder.build()
}
