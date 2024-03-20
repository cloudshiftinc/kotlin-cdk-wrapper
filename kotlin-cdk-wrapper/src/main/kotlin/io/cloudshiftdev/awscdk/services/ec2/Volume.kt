@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new EBS Volume in AWS EC2.
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
public open class Volume internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.Volume,
) : Resource(cdkObject), IVolume {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VolumeProps,
  ) :
      this(software.amazon.awscdk.services.ec2.Volume(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(VolumeProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VolumeProps.Builder.() -> Unit,
  ) : this(scope, id, VolumeProps(props)
  )

  /**
   * The availability zone that the EBS Volume is contained within (ex: us-west-2a).
   */
  public override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

  /**
   * The customer-managed encryption key that is used to encrypt the Volume.
   */
  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Grants permission to attach this Volume to an instance.
   *
   * CAUTION: Granting an instance permission to attach to itself using this method will lead to
   * an unresolvable circular reference between the instance role and the instance.
   * Use `IVolume.grantAttachVolumeToSelf` to grant an instance permission to attach this
   * volume to itself.
   *
   * @param grantee 
   * @param instances
   */
  public override fun grantAttachVolume(grantee: IGrantable): Grant =
      unwrap(this).grantAttachVolume(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grants permission to attach this Volume to an instance.
   *
   * CAUTION: Granting an instance permission to attach to itself using this method will lead to
   * an unresolvable circular reference between the instance role and the instance.
   * Use `IVolume.grantAttachVolumeToSelf` to grant an instance permission to attach this
   * volume to itself.
   *
   * @param grantee 
   * @param instances
   */
  public override fun grantAttachVolume(grantee: IGrantable, instances: List<IInstance>): Grant =
      unwrap(this).grantAttachVolume(grantee.let(IGrantable::unwrap),
      instances.map(IInstance::unwrap)).let(Grant::wrap)

  /**
   * Grants permission to attach the Volume by a ResourceTag condition.
   *
   * If you are looking to
   * grant an Instance, AutoScalingGroup, EC2-Fleet, SpotFleet, ECS host, etc the ability to attach
   * this volume to **itself** then this is the method you want to use.
   *
   * This is implemented by adding a Tag with key `VolumeGrantAttach-&lt;suffix&gt;` to the given
   * constructs and this Volume, and then conditioning the Grant such that the grantee is only
   * given the ability to AttachVolume if both the Volume and the destination Instance have that
   * tag applied to them.
   *
   * @param grantee 
   * @param constructs 
   * @param tagKeySuffix
   */
  public override fun grantAttachVolumeByResourceTag(grantee: IGrantable,
      constructs: List<CloudshiftdevConstructsConstruct>): Grant =
      unwrap(this).grantAttachVolumeByResourceTag(grantee.let(IGrantable::unwrap),
      constructs.map(CloudshiftdevConstructsConstruct::unwrap)).let(Grant::wrap)

  /**
   * Grants permission to attach the Volume by a ResourceTag condition.
   *
   * If you are looking to
   * grant an Instance, AutoScalingGroup, EC2-Fleet, SpotFleet, ECS host, etc the ability to attach
   * this volume to **itself** then this is the method you want to use.
   *
   * This is implemented by adding a Tag with key `VolumeGrantAttach-&lt;suffix&gt;` to the given
   * constructs and this Volume, and then conditioning the Grant such that the grantee is only
   * given the ability to AttachVolume if both the Volume and the destination Instance have that
   * tag applied to them.
   *
   * @param grantee 
   * @param constructs 
   * @param tagKeySuffix
   */
  public override fun grantAttachVolumeByResourceTag(
    grantee: IGrantable,
    constructs: List<CloudshiftdevConstructsConstruct>,
    tagKeySuffix: String,
  ): Grant = unwrap(this).grantAttachVolumeByResourceTag(grantee.let(IGrantable::unwrap),
      constructs.map(CloudshiftdevConstructsConstruct::unwrap), tagKeySuffix).let(Grant::wrap)

  /**
   * Grants permission to detach this Volume from an instance CAUTION: Granting an instance
   * permission to detach from itself using this method will lead to an unresolvable circular reference
   * between the instance role and the instance.
   *
   * Use `IVolume.grantDetachVolumeFromSelf` to grant an instance permission to detach this
   * volume from itself.
   *
   * @param grantee 
   * @param instances
   */
  public override fun grantDetachVolume(grantee: IGrantable): Grant =
      unwrap(this).grantDetachVolume(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grants permission to detach this Volume from an instance CAUTION: Granting an instance
   * permission to detach from itself using this method will lead to an unresolvable circular reference
   * between the instance role and the instance.
   *
   * Use `IVolume.grantDetachVolumeFromSelf` to grant an instance permission to detach this
   * volume from itself.
   *
   * @param grantee 
   * @param instances
   */
  public override fun grantDetachVolume(grantee: IGrantable, instances: List<IInstance>): Grant =
      unwrap(this).grantDetachVolume(grantee.let(IGrantable::unwrap),
      instances.map(IInstance::unwrap)).let(Grant::wrap)

  /**
   * Grants permission to detach the Volume by a ResourceTag condition.
   *
   * This is implemented via the same mechanism as `IVolume.grantAttachVolumeByResourceTag`,
   * and is subject to the same conditions.
   *
   * @param grantee 
   * @param constructs 
   * @param tagKeySuffix
   */
  public override fun grantDetachVolumeByResourceTag(grantee: IGrantable,
      constructs: List<CloudshiftdevConstructsConstruct>): Grant =
      unwrap(this).grantDetachVolumeByResourceTag(grantee.let(IGrantable::unwrap),
      constructs.map(CloudshiftdevConstructsConstruct::unwrap)).let(Grant::wrap)

  /**
   * Grants permission to detach the Volume by a ResourceTag condition.
   *
   * This is implemented via the same mechanism as `IVolume.grantAttachVolumeByResourceTag`,
   * and is subject to the same conditions.
   *
   * @param grantee 
   * @param constructs 
   * @param tagKeySuffix
   */
  public override fun grantDetachVolumeByResourceTag(
    grantee: IGrantable,
    constructs: List<CloudshiftdevConstructsConstruct>,
    tagKeySuffix: String,
  ): Grant = unwrap(this).grantDetachVolumeByResourceTag(grantee.let(IGrantable::unwrap),
      constructs.map(CloudshiftdevConstructsConstruct::unwrap), tagKeySuffix).let(Grant::wrap)

  /**
   * The EBS Volume's ID.
   */
  public override fun volumeId(): String = unwrap(this).getVolumeId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.Volume].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether the volume is auto-enabled for I/O operations.
     *
     * By default, Amazon EBS disables I/O to the volume from attached EC2
     * instances when it determines that a volume's data is potentially inconsistent. If the
     * consistency of the volume is not a concern, and
     * you prefer that the volume be made available immediately if it's impaired, you can configure
     * the volume to automatically enable I/O.
     *
     * Default: false
     *
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations. 
     */
    public fun autoEnableIo(autoEnableIo: Boolean)

    /**
     * The Availability Zone in which to create the volume.
     *
     * @param availabilityZone The Availability Zone in which to create the volume. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     *
     * See [Considerations and
     * limitations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html#considerations)
     * for the constraints of multi-attach.
     *
     * Default: false
     *
     * @param enableMultiAttach Indicates whether Amazon EBS Multi-Attach is enabled. 
     */
    public fun enableMultiAttach(enableMultiAttach: Boolean)

    /**
     * Specifies whether the volume should be encrypted.
     *
     * The effect of setting the encryption state to true depends on the volume origin
     * (new or from a snapshot), starting encryption state, ownership, and whether encryption by
     * default is enabled. For more information,
     * see [Encryption by
     * Default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
     * in the Amazon Elastic Compute Cloud User Guide.
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see
     * [Supported Instance
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances).
     *
     * Default: false
     *
     * @param encrypted Specifies whether the volume should be encrypted. 
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * The customer-managed encryption key that is used to encrypt the Volume.
     *
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
     * "Principal": { "AWS": "&lt;arn for your account-user&gt; ex: arn:aws:iam::00000000000:root"
     * },
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
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * The number of I/O operations per second (IOPS) to provision for the volume.
     *
     * The maximum ratio is 50 IOPS/GiB for PROVISIONED_IOPS_SSD,
     * and 500 IOPS/GiB for both PROVISIONED_IOPS_SSD_IO2 and GENERAL_PURPOSE_SSD_GP3.
     * See
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
    public fun iops(iops: Number)

    /**
     * Policy to apply when the volume is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy Policy to apply when the volume is removed from the stack. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The size of the volume, in GiBs.
     *
     * You must specify either a snapshot ID or a volume size.
     * See
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
     * for details on the allowable size for each type of volume.
     *
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the
     * default is the snapshot size.
     *
     * @param size The size of the volume, in GiBs. 
     */
    public fun size(size: Size)

    /**
     * The snapshot from which to create the volume.
     *
     * You must specify either a snapshot ID or a volume size.
     *
     * Default: The EBS volume is not created from a snapshot.
     *
     * @param snapshotId The snapshot from which to create the volume. 
     */
    public fun snapshotId(snapshotId: String)

    /**
     * The throughput that the volume supports, in MiB/s Takes a minimum of 125 and maximum of 1000.
     *
     * Default: - 125 MiB/s. Only valid on gp3 volumes.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-throughput)
     * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of 125
     * and maximum of 1000. 
     */
    public fun throughput(throughput: Number)

    /**
     * The value of the physicalName property of this resource.
     *
     * Default: The physical name will be allocated by CloudFormation at deployment time
     *
     * @param volumeName The value of the physicalName property of this resource. 
     */
    public fun volumeName(volumeName: String)

    /**
     * The type of the volume;
     *
     * what type of storage to use to form the EBS Volume.
     *
     * Default: `EbsDeviceVolumeType.GENERAL_PURPOSE_SSD`
     *
     * @param volumeType The type of the volume;. 
     */
    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Volume.Builder =
        software.amazon.awscdk.services.ec2.Volume.Builder.create(scope, id)

    /**
     * Indicates whether the volume is auto-enabled for I/O operations.
     *
     * By default, Amazon EBS disables I/O to the volume from attached EC2
     * instances when it determines that a volume's data is potentially inconsistent. If the
     * consistency of the volume is not a concern, and
     * you prefer that the volume be made available immediately if it's impaired, you can configure
     * the volume to automatically enable I/O.
     *
     * Default: false
     *
     * @param autoEnableIo Indicates whether the volume is auto-enabled for I/O operations. 
     */
    override fun autoEnableIo(autoEnableIo: Boolean) {
      cdkBuilder.autoEnableIo(autoEnableIo)
    }

    /**
     * The Availability Zone in which to create the volume.
     *
     * @param availabilityZone The Availability Zone in which to create the volume. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * Indicates whether Amazon EBS Multi-Attach is enabled.
     *
     * See [Considerations and
     * limitations](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-volumes-multi.html#considerations)
     * for the constraints of multi-attach.
     *
     * Default: false
     *
     * @param enableMultiAttach Indicates whether Amazon EBS Multi-Attach is enabled. 
     */
    override fun enableMultiAttach(enableMultiAttach: Boolean) {
      cdkBuilder.enableMultiAttach(enableMultiAttach)
    }

    /**
     * Specifies whether the volume should be encrypted.
     *
     * The effect of setting the encryption state to true depends on the volume origin
     * (new or from a snapshot), starting encryption state, ownership, and whether encryption by
     * default is enabled. For more information,
     * see [Encryption by
     * Default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
     * in the Amazon Elastic Compute Cloud User Guide.
     *
     * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS
     * encryption. For more information, see
     * [Supported Instance
     * Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances).
     *
     * Default: false
     *
     * @param encrypted Specifies whether the volume should be encrypted. 
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * The customer-managed encryption key that is used to encrypt the Volume.
     *
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
     * "Principal": { "AWS": "&lt;arn for your account-user&gt; ex: arn:aws:iam::00000000000:root"
     * },
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
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * The number of I/O operations per second (IOPS) to provision for the volume.
     *
     * The maximum ratio is 50 IOPS/GiB for PROVISIONED_IOPS_SSD,
     * and 500 IOPS/GiB for both PROVISIONED_IOPS_SSD_IO2 and GENERAL_PURPOSE_SSD_GP3.
     * See
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
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * Policy to apply when the volume is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy Policy to apply when the volume is removed from the stack. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * The size of the volume, in GiBs.
     *
     * You must specify either a snapshot ID or a volume size.
     * See
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html
     * for details on the allowable size for each type of volume.
     *
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the
     * default is the snapshot size.
     *
     * @param size The size of the volume, in GiBs. 
     */
    override fun size(size: Size) {
      cdkBuilder.size(size.let(Size::unwrap))
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
    override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * The throughput that the volume supports, in MiB/s Takes a minimum of 125 and maximum of 1000.
     *
     * Default: - 125 MiB/s. Only valid on gp3 volumes.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volume.html#cfn-ec2-volume-throughput)
     * @param throughput The throughput that the volume supports, in MiB/s Takes a minimum of 125
     * and maximum of 1000. 
     */
    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    /**
     * The value of the physicalName property of this resource.
     *
     * Default: The physical name will be allocated by CloudFormation at deployment time
     *
     * @param volumeName The value of the physicalName property of this resource. 
     */
    override fun volumeName(volumeName: String) {
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
    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.Volume = cdkBuilder.build()
  }

  public companion object {
    public fun fromVolumeAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VolumeAttributes,
    ): IVolume =
        software.amazon.awscdk.services.ec2.Volume.fromVolumeAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VolumeAttributes::unwrap)).let(IVolume::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46294edfafb5f5897a09cfc033d6dc1f7599f18b9a23511cbbf2feae5897f105")
    public fun fromVolumeAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VolumeAttributes.Builder.() -> Unit,
    ): IVolume = fromVolumeAttributes(scope, id, VolumeAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Volume {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Volume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Volume): Volume =
        Volume(cdkObject)

    internal fun unwrap(wrapped: Volume): software.amazon.awscdk.services.ec2.Volume =
        wrapped.cdkObject
  }
}
