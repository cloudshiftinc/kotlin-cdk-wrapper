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
import software.amazon.awscdk.services.efs.FileSystem
import software.amazon.awscdk.services.efs.LifecyclePolicy
import software.amazon.awscdk.services.efs.OutOfInfrequentAccessPolicy
import software.amazon.awscdk.services.efs.PerformanceMode
import software.amazon.awscdk.services.efs.ThroughputMode
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

/**
 * The Elastic File System implementation of IFileSystem.
 *
 * It creates a new, empty file system in Amazon Elastic File System (Amazon EFS). It also creates
 * mount target (AWS::EFS::MountTarget) implicitly to mount the EFS file system on an Amazon Elastic
 * Compute Cloud (Amazon EC2) instance or another resource.
 *
 * Example:
 * ```
 * FileSystem fileSystem = FileSystem.Builder.create(this, "MyEfsFileSystem")
 * .vpc(new Vpc(this, "VPC"))
 * .lifecyclePolicy(LifecyclePolicy.AFTER_14_DAYS) // files are not transitioned to infrequent
 * access (IA) storage by default
 * .performanceMode(PerformanceMode.GENERAL_PURPOSE) // default
 * .outOfInfrequentAccessPolicy(OutOfInfrequentAccessPolicy.AFTER_1_ACCESS)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html)
 */
@CdkDslMarker
public class FileSystemDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: FileSystem.Builder = FileSystem.Builder.create(scope, id)

    /**
     * Whether to enable automatic backups for the file system.
     *
     * Default: false
     *
     * @param enableAutomaticBackups Whether to enable automatic backups for the file system.
     */
    public fun enableAutomaticBackups(enableAutomaticBackups: Boolean) {
        cdkBuilder.enableAutomaticBackups(enableAutomaticBackups)
    }

    /**
     * Defines if the data at rest in the file system is encrypted or not.
     *
     * Default: - If your application has the '@aws-cdk/aws-efs:defaultEncryptionAtRest' feature
     * flag set, the default is true, otherwise, the default is false.
     *
     * @param encrypted Defines if the data at rest in the file system is encrypted or not.
     */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * The file system's name.
     *
     * Default: - CDK generated name
     *
     * @param fileSystemName The file system's name.
     */
    public fun fileSystemName(fileSystemName: String) {
        cdkBuilder.fileSystemName(fileSystemName)
    }

    /**
     * File system policy is an IAM resource policy used to control NFS access to an EFS file
     * system.
     *
     * Default: none
     *
     * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS
     *   access to an EFS file system.
     */
    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(fileSystemPolicy)
        cdkBuilder.fileSystemPolicy(builder.build())
    }

    /**
     * File system policy is an IAM resource policy used to control NFS access to an EFS file
     * system.
     *
     * Default: none
     *
     * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS
     *   access to an EFS file system.
     */
    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument) {
        cdkBuilder.fileSystemPolicy(fileSystemPolicy)
    }

    /**
     * The KMS key used for encryption.
     *
     * This is required to encrypt the data at rest if
     *
     * Default: - if 'encrypted' is true, the default key for EFS (/aws/elasticfilesystem) is used
     *
     * @param kmsKey The KMS key used for encryption.
     */
    public fun kmsKey(kmsKey: IKey) {
        cdkBuilder.kmsKey(kmsKey)
    }

    /**
     * A policy used by EFS lifecycle management to transition files to the Infrequent Access (IA)
     * storage class.
     *
     * Default: - None. EFS will not transition files to the IA storage class.
     *
     * @param lifecyclePolicy A policy used by EFS lifecycle management to transition files to the
     *   Infrequent Access (IA) storage class.
     */
    public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy) {
        cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    /**
     * A policy used by EFS lifecycle management to transition files from Infrequent Access (IA)
     * storage class to primary storage class.
     *
     * Default: - None. EFS will not transition files from IA storage to primary storage.
     *
     * @param outOfInfrequentAccessPolicy A policy used by EFS lifecycle management to transition
     *   files from Infrequent Access (IA) storage class to primary storage class.
     */
    public fun outOfInfrequentAccessPolicy(
        outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy
    ) {
        cdkBuilder.outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy)
    }

    /**
     * The performance mode that the file system will operate under.
     *
     * An Amazon EFS file system's performance mode can't be changed after the file system has been
     * created. Updating this property will replace the file system.
     *
     * Default: PerformanceMode.GENERAL_PURPOSE
     *
     * @param performanceMode The performance mode that the file system will operate under.
     */
    public fun performanceMode(performanceMode: PerformanceMode) {
        cdkBuilder.performanceMode(performanceMode)
    }

    /**
     * Provisioned throughput for the file system.
     *
     * This is a required property if the throughput mode is set to PROVISIONED. Must be at least
     * 1MiB/s.
     *
     * Default: - none, errors out
     *
     * @param provisionedThroughputPerSecond Provisioned throughput for the file system.
     */
    public fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size) {
        cdkBuilder.provisionedThroughputPerSecond(provisionedThroughputPerSecond)
    }

    /**
     * The removal policy to apply to the file system.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy to apply to the file system.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * Security Group to assign to this file system.
     *
     * Default: - creates new security group which allows all outbound traffic
     *
     * @param securityGroup Security Group to assign to this file system.
     */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /**
     * Enum to mention the throughput mode of the file system.
     *
     * Default: ThroughputMode.BURSTING
     *
     * @param throughputMode Enum to mention the throughput mode of the file system.
     */
    public fun throughputMode(throughputMode: ThroughputMode) {
        cdkBuilder.throughputMode(throughputMode)
    }

    /**
     * VPC to launch the file system in.
     *
     * @param vpc VPC to launch the file system in.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * Which subnets to place the mount target in the VPC.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets to place the mount target in the VPC.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /**
     * Which subnets to place the mount target in the VPC.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets to place the mount target in the VPC.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): FileSystem = cdkBuilder.build()
}
