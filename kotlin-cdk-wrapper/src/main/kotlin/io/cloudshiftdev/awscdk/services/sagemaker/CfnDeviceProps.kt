@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

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
  public fun device(): Any? = unwrap(this).getDevice()

  public fun deviceFleetName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun device(device: IResolvable)

    public fun device(device: CfnDevice.DeviceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77015af47b1a3894f4fc64c339039463fb44600eb3022079ffd4771281e17cc")
    public fun device(device: CfnDevice.DeviceProperty.Builder.() -> Unit)

    public fun deviceFleetName(deviceFleetName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnDeviceProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnDeviceProps.builder()

    override fun device(device: IResolvable) {
      cdkBuilder.device(device.let(IResolvable::unwrap))
    }

    override fun device(device: CfnDevice.DeviceProperty) {
      cdkBuilder.device(device.let(CfnDevice.DeviceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77015af47b1a3894f4fc64c339039463fb44600eb3022079ffd4771281e17cc")
    override fun device(device: CfnDevice.DeviceProperty.Builder.() -> Unit): Unit =
        device(CfnDevice.DeviceProperty(device))

    override fun deviceFleetName(deviceFleetName: String) {
      cdkBuilder.deviceFleetName(deviceFleetName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnDeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceProps,
  ) : CdkObject(cdkObject), CfnDeviceProps {
    override fun device(): Any? = unwrap(this).getDevice()

    override fun deviceFleetName(): String = unwrap(this).getDeviceFleetName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnDeviceProps):
        CfnDeviceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceProps):
        software.amazon.awscdk.services.sagemaker.CfnDeviceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnDeviceProps
  }
}
