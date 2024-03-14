package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDisk internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun addOns(): Any? = unwrap(this).getAddOns()

  public open fun addOns(`value`: IResolvable) {
    unwrap(this).setAddOns(`value`.let(IResolvable::unwrap))
  }

  public open fun addOns(__idx_ac66f0: List<Any>) {
    unwrap(this).setAddOns(__idx_ac66f0)
  }

  public open fun attrAttachedTo(): String = unwrap(this).getAttrAttachedTo()

  public open fun attrAttachmentState(): String = unwrap(this).getAttrAttachmentState()

  public open fun attrDiskArn(): String = unwrap(this).getAttrDiskArn()

  public open fun attrIops(): Number = unwrap(this).getAttrIops()

  public open fun attrIsAttached(): IResolvable =
      unwrap(this).getAttrIsAttached().let(IResolvable::wrap)

  public open fun attrLocationAvailabilityZone(): String =
      unwrap(this).getAttrLocationAvailabilityZone()

  public open fun attrLocationRegionName(): String = unwrap(this).getAttrLocationRegionName()

  public open fun attrPath(): String = unwrap(this).getAttrPath()

  public open fun attrResourceType(): String = unwrap(this).getAttrResourceType()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrSupportCode(): String = unwrap(this).getAttrSupportCode()

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun diskName(): String = unwrap(this).getDiskName()

  public open fun diskName(`value`: String) {
    unwrap(this).setDiskName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun location(): Any? = unwrap(this).getLocation()

  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun location(`value`: LocationProperty) {
    unwrap(this).setLocation(`value`.let(LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6ea1ce60a7102130db8514b1dd1d4291dac2673f3f99f71bd4f4b4bd387abd2")
  public open fun location(`value`: LocationProperty.Builder.() -> Unit): Unit =
      location(LocationProperty(`value`))

  public open fun sizeInGb(): Number = unwrap(this).getSizeInGb()

  public open fun sizeInGb(`value`: Number) {
    unwrap(this).setSizeInGb(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun addOns(addOns: IResolvable) {
    }

    public fun addOns(addOns: List<Any>) {
    }

    public fun availabilityZone(availabilityZone: String) {
    }

    public fun diskName(diskName: String) {
    }

    public fun location(location: IResolvable) {
    }

    public fun location(location: LocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd31cd3aff101e415dd437d50ed0c47b200615363e5321b85bb126ab37e00fa9")
    public fun location(location: LocationProperty.Builder.() -> Unit) {
    }

    public fun sizeInGb(sizeInGb: Number) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDisk.Builder =
        software.amazon.awscdk.services.lightsail.CfnDisk.Builder.create(scope, id)

    public override fun addOns(addOns: IResolvable) {
      cdkBuilder.addOns(addOns.let(IResolvable::unwrap))
    }

    public override fun addOns(addOns: List<Any>) {
      cdkBuilder.addOns(addOns)
    }

    public override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    public override fun diskName(diskName: String) {
      cdkBuilder.diskName(diskName)
    }

    public override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    public override fun location(location: LocationProperty) {
      cdkBuilder.location(location.let(LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd31cd3aff101e415dd437d50ed0c47b200615363e5321b85bb126ab37e00fa9")
    public override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
        location(LocationProperty(location))

    public override fun sizeInGb(sizeInGb: Number) {
      cdkBuilder.sizeInGb(sizeInGb)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDisk = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDisk {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDisk(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk): CfnDisk =
        CfnDisk(cdkObject)

    internal fun unwrap(wrapped: CfnDisk): software.amazon.awscdk.services.lightsail.CfnDisk =
        wrapped.cdkObject
  }

  public interface AutoSnapshotAddOnProperty {
    public fun snapshotTimeOfDay(): String? = unwrap(this).getSnapshotTimeOfDay()

    public interface Builder {
      public fun snapshotTimeOfDay(snapshotTimeOfDay: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty.builder()

      public override fun snapshotTimeOfDay(snapshotTimeOfDay: String) {
        cdkBuilder.snapshotTimeOfDay(snapshotTimeOfDay)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty,
    ) : AutoSnapshotAddOnProperty {
      public override fun snapshotTimeOfDay(): String? = unwrap(this).getSnapshotTimeOfDay()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AutoSnapshotAddOnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty):
          AutoSnapshotAddOnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoSnapshotAddOnProperty):
          software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AddOnProperty {
    public fun addOnType(): String

    public fun autoSnapshotAddOnRequest(): Any? = unwrap(this).getAutoSnapshotAddOnRequest()

    public fun status(): String? = unwrap(this).getStatus()

    public interface Builder {
      public fun addOnType(addOnType: String) {
      }

      public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable) {
      }

      public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bfdcb74b866e98c57c2409486794c297fdaab9d014d1c05279a425875c2d9e3")
      public
          fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty.Builder.() -> Unit) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty.builder()

      public override fun addOnType(addOnType: String) {
        cdkBuilder.addOnType(addOnType)
      }

      public override fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable) {
        cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest.let(IResolvable::unwrap))
      }

      public override
          fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty) {
        cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest.let(AutoSnapshotAddOnProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6bfdcb74b866e98c57c2409486794c297fdaab9d014d1c05279a425875c2d9e3")
      public override
          fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: AutoSnapshotAddOnProperty.Builder.() -> Unit):
          Unit = autoSnapshotAddOnRequest(AutoSnapshotAddOnProperty(autoSnapshotAddOnRequest))

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty,
    ) : AddOnProperty {
      public override fun addOnType(): String = unwrap(this).getAddOnType()

      public override fun autoSnapshotAddOnRequest(): Any? =
          unwrap(this).getAutoSnapshotAddOnRequest()

      public override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AddOnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty):
          AddOnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddOnProperty):
          software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LocationProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun regionName(): String? = unwrap(this).getRegionName()

    public interface Builder {
      public fun availabilityZone(availabilityZone: String) {
      }

      public fun regionName(regionName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty.builder()

      public override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      public override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty,
    ) : LocationProperty {
      public override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      public override fun regionName(): String? = unwrap(this).getRegionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty):
          LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.lightsail.CfnDisk.LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
