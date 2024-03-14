package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Volume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.Volume,
) : Resource(cdkObject), IVolume {
  public override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public override fun grantAttachVolume(grantee: IGrantable): Grant =
      unwrap(this).grantAttachVolume(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantAttachVolume(grantee: IGrantable, instances: List<IInstance>): Grant =
      unwrap(this).grantAttachVolume(grantee.let(IGrantable::unwrap),
      instances.map(IInstance::unwrap)).let(Grant::wrap)

  public override fun grantAttachVolumeByResourceTag(grantee: IGrantable,
      constructs: List<CloudshiftdevConstructsConstruct>): Grant =
      unwrap(this).grantAttachVolumeByResourceTag(grantee.let(IGrantable::unwrap),
      constructs.map(CloudshiftdevConstructsConstruct::unwrap)).let(Grant::wrap)

  public override fun grantAttachVolumeByResourceTag(
    grantee: IGrantable,
    constructs: List<CloudshiftdevConstructsConstruct>,
    tagKeySuffix: String,
  ): Grant = unwrap(this).grantAttachVolumeByResourceTag(grantee.let(IGrantable::unwrap),
      constructs.map(CloudshiftdevConstructsConstruct::unwrap), tagKeySuffix).let(Grant::wrap)

  public override fun grantDetachVolume(grantee: IGrantable): Grant =
      unwrap(this).grantDetachVolume(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantDetachVolume(grantee: IGrantable, instances: List<IInstance>): Grant =
      unwrap(this).grantDetachVolume(grantee.let(IGrantable::unwrap),
      instances.map(IInstance::unwrap)).let(Grant::wrap)

  public override fun grantDetachVolumeByResourceTag(grantee: IGrantable,
      constructs: List<CloudshiftdevConstructsConstruct>): Grant =
      unwrap(this).grantDetachVolumeByResourceTag(grantee.let(IGrantable::unwrap),
      constructs.map(CloudshiftdevConstructsConstruct::unwrap)).let(Grant::wrap)

  public override fun grantDetachVolumeByResourceTag(
    grantee: IGrantable,
    constructs: List<CloudshiftdevConstructsConstruct>,
    tagKeySuffix: String,
  ): Grant = unwrap(this).grantDetachVolumeByResourceTag(grantee.let(IGrantable::unwrap),
      constructs.map(CloudshiftdevConstructsConstruct::unwrap), tagKeySuffix).let(Grant::wrap)

  public override fun volumeId(): String = unwrap(this).getVolumeId()

  public interface Builder {
    public fun autoEnableIo(autoEnableIo: Boolean) {
    }

    public fun availabilityZone(availabilityZone: String) {
    }

    public fun enableMultiAttach(enableMultiAttach: Boolean) {
    }

    public fun encrypted(encrypted: Boolean) {
    }

    public fun encryptionKey(encryptionKey: IKey) {
    }

    public fun iops(iops: Number) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public fun size(size: Size) {
    }

    public fun snapshotId(snapshotId: String) {
    }

    public fun throughput(throughput: Number) {
    }

    public fun volumeName(volumeName: String) {
    }

    public fun volumeType(volumeType: EbsDeviceVolumeType) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Volume.Builder =
        software.amazon.awscdk.services.ec2.Volume.Builder.create(scope, id)

    public override fun autoEnableIo(autoEnableIo: Boolean) {
      cdkBuilder.autoEnableIo(autoEnableIo)
    }

    public override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    public override fun enableMultiAttach(enableMultiAttach: Boolean) {
      cdkBuilder.enableMultiAttach(enableMultiAttach)
    }

    public override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    public override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    public override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun size(size: Size) {
      cdkBuilder.size(size.let(Size::unwrap))
    }

    public override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    public override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    public override fun volumeName(volumeName: String) {
      cdkBuilder.volumeName(volumeName)
    }

    public override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.Volume = cdkBuilder.build()
  }

  public companion object {
    public open fun fromVolumeAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VolumeAttributes,
    ): IVolume =
        software.amazon.awscdk.services.ec2.Volume.fromVolumeAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VolumeAttributes::unwrap)).let(IVolume::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46294edfafb5f5897a09cfc033d6dc1f7599f18b9a23511cbbf2feae5897f105")
    public open fun fromVolumeAttributes(
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
