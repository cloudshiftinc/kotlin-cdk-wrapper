@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDeviceProps {
  public fun awsLocation(): Any? = unwrap(this).getAwsLocation()

  public fun description(): String? = unwrap(this).getDescription()

  public fun globalNetworkId(): String

  public fun location(): Any? = unwrap(this).getLocation()

  public fun model(): String? = unwrap(this).getModel()

  public fun serialNumber(): String? = unwrap(this).getSerialNumber()

  public fun siteId(): String? = unwrap(this).getSiteId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String? = unwrap(this).getType()

  public fun vendor(): String? = unwrap(this).getVendor()

  @CdkDslMarker
  public interface Builder {
    public fun awsLocation(awsLocation: IResolvable)

    public fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("627ca20406f6934109262f76be248505e5a0a7a400774ebc56a25157ccb424e1")
    public fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun globalNetworkId(globalNetworkId: String)

    public fun location(location: IResolvable)

    public fun location(location: CfnDevice.LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cebf7fdaed6de748ea24971e19a233f52e83b6d800b2196c8bd5f26dfc0befc")
    public fun location(location: CfnDevice.LocationProperty.Builder.() -> Unit)

    public fun model(model: String)

    public fun serialNumber(serialNumber: String)

    public fun siteId(siteId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)

    public fun vendor(vendor: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnDeviceProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnDeviceProps.builder()

    override fun awsLocation(awsLocation: IResolvable) {
      cdkBuilder.awsLocation(awsLocation.let(IResolvable::unwrap))
    }

    override fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty) {
      cdkBuilder.awsLocation(awsLocation.let(CfnDevice.AWSLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("627ca20406f6934109262f76be248505e5a0a7a400774ebc56a25157ccb424e1")
    override fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty.Builder.() -> Unit): Unit =
        awsLocation(CfnDevice.AWSLocationProperty(awsLocation))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    override fun location(location: CfnDevice.LocationProperty) {
      cdkBuilder.location(location.let(CfnDevice.LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8cebf7fdaed6de748ea24971e19a233f52e83b6d800b2196c8bd5f26dfc0befc")
    override fun location(location: CfnDevice.LocationProperty.Builder.() -> Unit): Unit =
        location(CfnDevice.LocationProperty(location))

    override fun model(model: String) {
      cdkBuilder.model(model)
    }

    override fun serialNumber(serialNumber: String) {
      cdkBuilder.serialNumber(serialNumber)
    }

    override fun siteId(siteId: String) {
      cdkBuilder.siteId(siteId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun vendor(vendor: String) {
      cdkBuilder.vendor(vendor)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnDeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnDeviceProps,
  ) : CdkObject(cdkObject), CfnDeviceProps {
    override fun awsLocation(): Any? = unwrap(this).getAwsLocation()

    override fun description(): String? = unwrap(this).getDescription()

    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    override fun location(): Any? = unwrap(this).getLocation()

    override fun model(): String? = unwrap(this).getModel()

    override fun serialNumber(): String? = unwrap(this).getSerialNumber()

    override fun siteId(): String? = unwrap(this).getSiteId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String? = unwrap(this).getType()

    override fun vendor(): String? = unwrap(this).getVendor()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDeviceProps):
        CfnDeviceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceProps):
        software.amazon.awscdk.services.networkmanager.CfnDeviceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnDeviceProps
  }
}
