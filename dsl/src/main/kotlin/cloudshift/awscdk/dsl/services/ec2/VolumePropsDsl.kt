@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.ec2.VolumeProps
import software.amazon.awscdk.services.kms.IKey

/**
 * Properties of an EBS Volume.
 *
 * Example:
 *
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
public class VolumePropsDsl {
  private val cdkBuilder: VolumeProps.Builder = VolumeProps.builder()

  /**
   * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations.
   * By default, Amazon EBS disables I/O to the volume from attached EC2
   * instances when it determines that a volume's data is potentially inconsistent. If the
   * consistency of the volume is not a concern, and
   * you prefer that the volume be made available immediately if it's impaired, you can configure
   * the volume to automatically enable I/O.
   */
  public fun autoEnableIo(autoEnableIo: Boolean) {
    cdkBuilder.autoEnableIo(autoEnableIo)
  }

  /**
   * @param availabilityZone The Availability Zone in which to create the volume. 
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param enableMultiAttach Indicates whether Amazon EBS Multi-Attach is enabled.
   * See [Considerations and
   * limitations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html#considerations)
   * for the constraints of multi-attach.
   */
  public fun enableMultiAttach(enableMultiAttach: Boolean) {
    cdkBuilder.enableMultiAttach(enableMultiAttach)
  }

  /**
   * @param encrypted Specifies whether the volume should be encrypted.
   * The effect of setting the encryption state to true depends on the volume origin
   * (new or from a snapshot), starting encryption state, ownership, and whether encryption by
   * default is enabled. For more information,
   * see [Encryption by
   * Default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
   * in the Amazon Elastic Compute Cloud User Guide.
   *
   * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption.
   * For more information, see
   * [Supported Instance
   * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances).
   */
  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  /**
   * @param encryptionKey The customer-managed encryption key that is used to encrypt the Volume.
   * The encrypted property must
   * be true if this is provided.
   *
   * Note: If using an `aws-kms.IKey` created from a `aws-kms.Key.fromKeyArn()` here,
   * then the KMS key **must** have the following in its Key policy; otherwise, the Volume
   * will fail to create.
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
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param iops The number of I/O operations per second (IOPS) to provision for the volume.
   * The maximum ratio is 50 IOPS/GiB for PROVISIONED_IOPS_SSD,
   * and 500 IOPS/GiB for both PROVISIONED_IOPS_SSD_IO2 and GENERAL_PURPOSE_SSD_GP3.
   * See
   * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html
   * for more information.
   *
   * This parameter is valid only for PROVISIONED_IOPS_SSD, PROVISIONED_IOPS_SSD_IO2 and
   * GENERAL_PURPOSE_SSD_GP3 volumes.
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param removalPolicy Policy to apply when the volume is removed from the stack.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param size The size of the volume, in GiBs.
   * You must specify either a snapshot ID or a volume size.
   * See
   * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html
   * for details on the allowable size for each type of volume.
   */
  public fun size(size: Size) {
    cdkBuilder.size(size)
  }

  /**
   * @param snapshotId The snapshot from which to create the volume.
   * You must specify either a snapshot ID or a volume size.
   */
  public fun snapshotId(snapshotId: String) {
    cdkBuilder.snapshotId(snapshotId)
  }

  /**
   * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of 125 and
   * maximum of 1000.
   */
  public fun throughput(throughput: Number) {
    cdkBuilder.throughput(throughput)
  }

  /**
   * @param volumeName The value of the physicalName property of this resource.
   */
  public fun volumeName(volumeName: String) {
    cdkBuilder.volumeName(volumeName)
  }

  /**
   * @param volumeType The type of the volume;.
   * what type of storage to use to form the EBS Volume.
   */
  public fun volumeType(volumeType: EbsDeviceVolumeType) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): VolumeProps = cdkBuilder.build()
}
