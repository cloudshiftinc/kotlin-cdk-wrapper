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
import software.amazon.awscdk.services.fsx.LustreFileSystemProps
import software.amazon.awscdk.services.kms.IKey

/**
 * Properties specific to the Lustre version of the FSx file system.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.s3.*;
 * Vpc vpc;
 * Bucket bucket;
 * Map&lt;String, Object&gt; lustreConfiguration = Map.of(
 * "deploymentType", LustreDeploymentType.SCRATCH_2,
 * "exportPath", bucket.s3UrlForObject(),
 * "importPath", bucket.s3UrlForObject(),
 * "autoImportPolicy", LustreAutoImportPolicy.NEW_CHANGED_DELETED);
 * LustreFileSystem fs = LustreFileSystem.Builder.create(this, "FsxLustreFileSystem")
 * .vpc(vpc)
 * .vpcSubnet(vpc.getPrivateSubnets()[0])
 * .storageCapacityGiB(1200)
 * .lustreConfiguration(lustreConfiguration)
 * .build();
 * ```
 */
@CdkDslMarker
public class LustreFileSystemPropsDsl {
    private val cdkBuilder: LustreFileSystemProps.Builder = LustreFileSystemProps.builder()

    /**
     * @param backupId The ID of the backup. Specifies the backup to use if you're creating a file
     *   system from an existing backup.
     */
    public fun backupId(backupId: String) {
        cdkBuilder.backupId(backupId)
    }

    /** @param kmsKey The KMS key used for encryption to protect your data at rest. */
    public fun kmsKey(kmsKey: IKey) {
        cdkBuilder.kmsKey(kmsKey)
    }

    /** @param lustreConfiguration Additional configuration for FSx specific to Lustre. */
    public fun lustreConfiguration(lustreConfiguration: LustreConfigurationDsl.() -> Unit = {}) {
        val builder = LustreConfigurationDsl()
        builder.apply(lustreConfiguration)
        cdkBuilder.lustreConfiguration(builder.build())
    }

    /** @param lustreConfiguration Additional configuration for FSx specific to Lustre. */
    public fun lustreConfiguration(lustreConfiguration: LustreConfiguration) {
        cdkBuilder.lustreConfiguration(lustreConfiguration)
    }

    /** @param removalPolicy Policy to apply when the file system is removed from the stack. */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /** @param securityGroup Security Group to assign to this file system. */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /**
     * @param storageCapacityGiB The storage capacity of the file system being created. For Windows
     *   file systems, valid values are 32 GiB to 65,536 GiB. For SCRATCH_1 deployment types, valid
     *   values are 1,200, 2,400, 3,600, then continuing in increments of 3,600 GiB. For SCRATCH_2
     *   and PERSISTENT_1 types, valid values are 1,200, 2,400, then continuing in increments of
     *   2,400 GiB.
     */
    public fun storageCapacityGiB(storageCapacityGiB: Number) {
        cdkBuilder.storageCapacityGiB(storageCapacityGiB)
    }

    /** @param vpc The VPC to launch the file system in. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcSubnet The subnet that the file system will be accessible from. */
    public fun vpcSubnet(vpcSubnet: ISubnet) {
        cdkBuilder.vpcSubnet(vpcSubnet)
    }

    public fun build(): LustreFileSystemProps = cdkBuilder.build()
}
