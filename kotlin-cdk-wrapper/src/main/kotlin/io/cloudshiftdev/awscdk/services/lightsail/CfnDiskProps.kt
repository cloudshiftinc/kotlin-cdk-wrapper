@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDiskProps {
  public fun addOns(): Any? = unwrap(this).getAddOns()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun diskName(): String

  public fun location(): Any? = unwrap(this).getLocation()

  public fun sizeInGb(): Number

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun addOns(addOns: IResolvable)

    public fun addOns(addOns: List<Any>)

    public fun addOns(vararg addOns: Any)

    public fun availabilityZone(availabilityZone: String)

    public fun diskName(diskName: String)

    public fun location(location: IResolvable)

    public fun location(location: CfnDisk.LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0b20ade57577ee270cb5f12b279c36144d8ae0e63b06368dac58a5319654637")
    public fun location(location: CfnDisk.LocationProperty.Builder.() -> Unit)

    public fun sizeInGb(sizeInGb: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDiskProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnDiskProps.builder()

    override fun addOns(addOns: IResolvable) {
      cdkBuilder.addOns(addOns.let(IResolvable::unwrap))
    }

    override fun addOns(addOns: List<Any>) {
      cdkBuilder.addOns(addOns)
    }

    override fun addOns(vararg addOns: Any): Unit = addOns(addOns.toList())

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun diskName(diskName: String) {
      cdkBuilder.diskName(diskName)
    }

    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    override fun location(location: CfnDisk.LocationProperty) {
      cdkBuilder.location(location.let(CfnDisk.LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0b20ade57577ee270cb5f12b279c36144d8ae0e63b06368dac58a5319654637")
    override fun location(location: CfnDisk.LocationProperty.Builder.() -> Unit): Unit =
        location(CfnDisk.LocationProperty(location))

    override fun sizeInGb(sizeInGb: Number) {
      cdkBuilder.sizeInGb(sizeInGb)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDiskProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnDiskProps,
  ) : CdkObject(cdkObject), CfnDiskProps {
    override fun addOns(): Any? = unwrap(this).getAddOns()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun diskName(): String = unwrap(this).getDiskName()

    override fun location(): Any? = unwrap(this).getLocation()

    override fun sizeInGb(): Number = unwrap(this).getSizeInGb()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDiskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDiskProps):
        CfnDiskProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDiskProps):
        software.amazon.awscdk.services.lightsail.CfnDiskProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lightsail.CfnDiskProps
  }
}
