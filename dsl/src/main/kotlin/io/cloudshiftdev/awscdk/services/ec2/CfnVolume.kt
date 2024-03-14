package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVolume,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrVolumeId(): String = unwrap(this).getAttrVolumeId()

  public open fun autoEnableIo(): Any? = unwrap(this).getAutoEnableIo()

  public open fun autoEnableIo(`value`: Boolean) {
    unwrap(this).setAutoEnableIo(`value`)
  }

  public open fun autoEnableIo(`value`: IResolvable) {
    unwrap(this).setAutoEnableIo(`value`.let(IResolvable::unwrap))
  }

  public open fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun encrypted(): Any? = unwrap(this).getEncrypted()

  public open fun encrypted(`value`: Boolean) {
    unwrap(this).setEncrypted(`value`)
  }

  public open fun encrypted(`value`: IResolvable) {
    unwrap(this).setEncrypted(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun iops(): Number? = unwrap(this).getIops()

  public open fun iops(`value`: Number) {
    unwrap(this).setIops(`value`)
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun multiAttachEnabled(): Any? = unwrap(this).getMultiAttachEnabled()

  public open fun multiAttachEnabled(`value`: Boolean) {
    unwrap(this).setMultiAttachEnabled(`value`)
  }

  public open fun multiAttachEnabled(`value`: IResolvable) {
    unwrap(this).setMultiAttachEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun outpostArn(): String? = unwrap(this).getOutpostArn()

  public open fun outpostArn(`value`: String) {
    unwrap(this).setOutpostArn(`value`)
  }

  public open fun size(): Number? = unwrap(this).getSize()

  public open fun size(`value`: Number) {
    unwrap(this).setSize(`value`)
  }

  public open fun snapshotId(): String? = unwrap(this).getSnapshotId()

  public open fun snapshotId(`value`: String) {
    unwrap(this).setSnapshotId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun throughput(): Number? = unwrap(this).getThroughput()

  public open fun throughput(`value`: Number) {
    unwrap(this).setThroughput(`value`)
  }

  public open fun volumeType(): String? = unwrap(this).getVolumeType()

  public open fun volumeType(`value`: String) {
    unwrap(this).setVolumeType(`value`)
  }

  public interface Builder {
    public fun autoEnableIo(autoEnableIo: Boolean)

    public fun autoEnableIo(autoEnableIo: IResolvable)

    public fun availabilityZone(availabilityZone: String)

    public fun encrypted(encrypted: Boolean)

    public fun encrypted(encrypted: IResolvable)

    public fun iops(iops: Number)

    public fun kmsKeyId(kmsKeyId: String)

    public fun multiAttachEnabled(multiAttachEnabled: Boolean)

    public fun multiAttachEnabled(multiAttachEnabled: IResolvable)

    public fun outpostArn(outpostArn: String)

    public fun size(size: Number)

    public fun snapshotId(snapshotId: String)

    public fun tags(tags: List<CfnTag>)

    public fun throughput(throughput: Number)

    public fun volumeType(volumeType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVolume.Builder =
        software.amazon.awscdk.services.ec2.CfnVolume.Builder.create(scope, id)

    override fun autoEnableIo(autoEnableIo: Boolean) {
      cdkBuilder.autoEnableIo(autoEnableIo)
    }

    override fun autoEnableIo(autoEnableIo: IResolvable) {
      cdkBuilder.autoEnableIo(autoEnableIo.let(IResolvable::unwrap))
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun multiAttachEnabled(multiAttachEnabled: Boolean) {
      cdkBuilder.multiAttachEnabled(multiAttachEnabled)
    }

    override fun multiAttachEnabled(multiAttachEnabled: IResolvable) {
      cdkBuilder.multiAttachEnabled(multiAttachEnabled.let(IResolvable::unwrap))
    }

    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    override fun size(size: Number) {
      cdkBuilder.size(size)
    }

    override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    override fun volumeType(volumeType: String) {
      cdkBuilder.volumeType(volumeType)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVolume = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVolume {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVolume): CfnVolume =
        CfnVolume(cdkObject)

    internal fun unwrap(wrapped: CfnVolume): software.amazon.awscdk.services.ec2.CfnVolume =
        wrapped.cdkObject
  }
}
