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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.ec2.Volume
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

/**
 * Creates a new EBS Volume in AWS EC2.
 *
 * Example:
 * ```
 * Instance instance;
 * Role role;
 * Volume volume = Volume.Builder.create(this, "Volume")
 * .availabilityZone("us-west-2a")
 * .size(Size.gibibytes(500))
 * .encrypted(true)
 * .build();
 * volume.grantAttachVolume(role, List.of(instance));
 * ```
 */
@CdkDslMarker
public class VolumeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Volume.Builder = Volume.Builder.create(scope, id)

    /**
     * Indicates whether the volume is auto-enabled for I/O operations.
     *
     * By default, Amazon EBS disables I/O to the volume from attached EC2 instances when it
     * determines that a volume's data is potentially inconsistent. If the consistency of the volume
     * is not a concern, and you prefer that the volume be made available immediately if it's
     * impaired, you can configure the volume to automatically enable I/O.
     *
     * Default: false
     *
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations.
     */
    public fun autoEnableIo(autoEnableIo: Boolean) {
        cdkBuilder.autoEnableIo(autoEnableIo)
    }

    /**
     * The Availability Zone in which to create the volume.
     *
     * @param availabilityZone The Availability Zone in which to create the volume.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     *
     * See
     * [Considerations and limitations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html#considerations)
     * for the constraints of multi-attach.
     *
     * Default: false
     *
     * @param enableMultiAttach Indicates whether Amazon EBS Multi-Attach is enabled.
     */
    public fun enableMultiAttach(enableMultiAttach: Boolean) {
        cdkBuilder.enableMultiAttach(enableMultiAttach)
    }

    /**
     * Specifies whether the volume should be encrypted.
     *
     * The effect of setting the encryption state to true depends on the volume origin (new or from
     * a snapshot), starting encryption state, ownership, and whether encryption by default is
     * enabled. For more information, see
     * [Encryption by Default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
     * in the Amazon Elastic Compute Cloud User Guide.
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see
     * [Supported Instance Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances).
     *
     * Default: false
     *
     * @param encrypted Specifies whether the volume should be encrypted.
     */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * The customer-managed encryption key that is used to encrypt the Volume.
     *
     * The encrypted property must be true if this is provided.
     *
     * Note: If using an `aws-kms.IKey` created from a `aws-kms.Key.fromKeyArn()` here, then the KMS
     * key **must** have the following in its Key policy; otherwise, the Volume will fail to create.
     *
     * ```
     * {
     * "Effect": "Allow",
     * "Principal": { "AWS": "&lt;arn for your account-user&gt; ex: arn:aws:iam::00000000000:root" },
     * "Resource": "*",
     * "Action": [
     * "kms:DescribeKey",
     * "kms:GenerateDataKeyWithoutPlainText",
     * ],
     * "Condition": {
     * "StringEquals": {
     * "kms:ViaService": "ec2.&lt;Region&gt;.amazonaws.com", (eg: ec2.us-east-1.amazonaws.com)
     * "kms:CallerAccount": "0000000000" (your account ID)
     * }
     * }
     * }
     * ```
     *
     * Default: The default KMS key for the account, region, and EC2 service is used.
     *
     * @param encryptionKey The customer-managed encryption key that is used to encrypt the Volume.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The number of I/O operations per second (IOPS) to provision for the volume.
     *
     * The maximum ratio is 50 IOPS/GiB for PROVISIONED_IOPS_SSD, and 500 IOPS/GiB for both
     * PROVISIONED_IOPS_SSD_IO2 and GENERAL_PURPOSE_SSD_GP3. See
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
     * for more information.
     *
     * This parameter is valid only for PROVISIONED_IOPS_SSD, PROVISIONED_IOPS_SSD_IO2 and
     * GENERAL_PURPOSE_SSD_GP3 volumes.
     *
     * Default: None -- Required for io1 and io2 volumes. The default for gp3 volumes is 3,000 IOPS
     * if omitted.
     *
     * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
     */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /**
     * Policy to apply when the volume is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy Policy to apply when the volume is removed from the stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * The size of the volume, in GiBs.
     *
     * You must specify either a snapshot ID or a volume size. See
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
     * for details on the allowable size for each type of volume.
     *
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the
     * default is the snapshot size.
     *
     * @param size The size of the volume, in GiBs.
     */
    public fun size(size: Size) {
        cdkBuilder.size(size)
    }

    /**
     * The snapshot from which to create the volume.
     *
     * You must specify either a snapshot ID or a volume size.
     *
     * Default: The EBS volume is not created from a snapshot.
     *
     * @param snapshotId The snapshot from which to create the volume.
     */
    public fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * The throughput that the volume supports, in MiB/s Takes a minimum of 125 and maximum of 1000.
     *
     * Default: - 125 MiB/s. Only valid on gp3 volumes.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-throughput)
     *
     * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of 125
     *   and maximum of 1000.
     */
    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    /**
     * The value of the physicalName property of this resource.
     *
     * Default: The physical name will be allocated by CloudFormation at deployment time
     *
     * @param volumeName The value of the physicalName property of this resource.
     */
    public fun volumeName(volumeName: String) {
        cdkBuilder.volumeName(volumeName)
    }

    /**
     * The type of the volume;
     *
     * what type of storage to use to form the EBS Volume.
     *
     * Default: `EbsDeviceVolumeType.GENERAL_PURPOSE_SSD`
     *
     * @param volumeType The type of the volume;.
     */
    public fun volumeType(volumeType: EbsDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): Volume = cdkBuilder.build()
}
