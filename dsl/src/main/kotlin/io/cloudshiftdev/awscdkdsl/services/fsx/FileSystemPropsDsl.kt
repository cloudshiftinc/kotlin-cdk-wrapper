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

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.fsx.FileSystemProps
import software.amazon.awscdk.services.kms.IKey

/**
 * Properties for the FSx file system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.fsx.*;
 * import software.amazon.awscdk.services.kms.*;
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
@CdkDslMarker
public class FileSystemPropsDsl {
    private val cdkBuilder: FileSystemProps.Builder = FileSystemProps.builder()

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

    public fun build(): FileSystemProps = cdkBuilder.build()
}
